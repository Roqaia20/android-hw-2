package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> items = new ArrayList<>();
        Items coffee = new Items("coffee",R.drawable.coffee,3.0);
        Items donut = new Items("donut",R.drawable.donut,2.5);
        Items chocolate = new Items("chocolate",R.drawable.chocolate,0.5);
        Items cheese = new Items("",R.drawable.cheese,4.0);
        Items frise = new Items("frise",R.drawable.fries,2.0);
        Items honey = new Items("honey",R.drawable.honey,10.0);
        items.add(coffee);
        items.add(honey);
        items.add(donut);
        items.add(chocolate);
        items.add(cheese);
        items.add(frise);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this , 0 , items);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);






    }
}