package com.example.unitsix;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewMain extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);

        setContentView(R.layout.grid_view_main);

        gridView = findViewById(R.id.grid_view_list);

        String[] names = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.grid_view_item, R.id.grid_view_text, names);

        gridView.setAdapter(adapter);


    }
}

