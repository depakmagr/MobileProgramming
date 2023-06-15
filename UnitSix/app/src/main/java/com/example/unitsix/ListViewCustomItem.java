package com.example.unitsix;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewCustomItem extends ArrayAdapter<String>{
    Activity context;
    String[] title;
    String[] description;
    int[] image;

    public ListViewCustomItem(Activity context, String[] title, String[] description, int[] image){
        super(context, R.layout.custom_list_view, title);

        this.context = context;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.custom_list_view, null, true);

        TextView titleText = rowView.findViewById(R.id.custom_list_item_title);
        ImageView imageView = rowView.findViewById(R.id.android_image);
        TextView descriptionText = rowView.findViewById(R.id.custom_list_item_description);

        titleText.setText(title[position]);
        imageView.setImageResource(image[position]);
        descriptionText.setText(description[position]);


        return  rowView;
    }

}
