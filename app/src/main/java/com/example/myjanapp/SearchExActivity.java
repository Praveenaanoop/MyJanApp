package com.example.myjanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchExActivity extends AppCompatActivity {
    ListView listView;
    SearchView searchView;

    ArrayList <String> list;
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_ex);
        searchView=(SearchView) findViewById(R.id.list_search);
        listView=(ListView) findViewById(R.id.searchlist);
        list=new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Lychee");
        list.add("guvave");
        list.add("Watermelon");
        list.add("Pappaya");
        list.add("Melon");
        list.add("Dragonfruit");
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "No items found!!!", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

    }
}