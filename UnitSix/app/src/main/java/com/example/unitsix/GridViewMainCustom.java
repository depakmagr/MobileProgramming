package com.example.unitsix;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewMainCustom extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);

        setContentView(R.layout.grid_view_main);

        gridView = findViewById(R.id.grid_view_list);

        String[] title = {"Title 1", "Title 1","Title 1", "Title 1", "Title 1","Title 1"};

        String[] description = {"This is a description 1.", "This is a description 1.", "This is a description 1.",
                "This is a description 1.", "This is a description 1.", "This is a description 1."};

        int[] image = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

        GridViewCustomItem adapter = new GridViewCustomItem(this, title, description, image);

        gridView.setAdapter(adapter);

    }
}
