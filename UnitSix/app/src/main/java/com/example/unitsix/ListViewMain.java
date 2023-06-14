package com.example.unitsix;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewMain extends AppCompatActivity {
    ListView ListView;

    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);

        setContentView(R.layout.list_view_main);

        ListView = findViewById(R.id.list_view);

        String[] names = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5",
                "Person 1", "Person 2", "Person 3", "Person 4", "Person 5"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_view_item, R.id.list_view_text, names);

        ListView.setAdapter(adapter);



        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);

                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

