package com.example.unitsix;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewMainCustom extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle b){
       super.onCreate(b);

       setContentView(R.layout.list_view_main);

       listView = findViewById(R.id.list_view);

       String[] title = {"Title 1", "Title 1","Title 1", "Title 1","Title 1", "Title 1",
                "Title 1","Title 1", "Title 1","Title 1", "Title 1"};

       String[] description = {"This is a description 1.", "This is a description 1.",
               "This is a description 1.", "This is a description 1.","This is a description 1.",
               "This is a description 1.", "This is a description 1.", "This is a description 1.",
               "This is a description 1.", "This is a description 1.", "This is a description 1.",};

       int[] image = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
               R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
               R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
               R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
               R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
               R.drawable.ic_launcher_background};

       ListViewCustomItem adapter = new ListViewCustomItem(this, title, description, image);

       listView.setAdapter(adapter);

    }
}
