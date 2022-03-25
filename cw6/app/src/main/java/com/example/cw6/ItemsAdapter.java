package com.example.cw6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items>itemsListAdapter;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsListAdapter = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent ,false);
        Items currentItems = itemsListAdapter.get(position);
        ImageView itemImage = view.findViewById(R.id.imageView);
        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemprice);
        itemImage.setImageResource(currentItems.getItemImage());
        itemName.setText(currentItems.getItemName());
        itemPrice.setText(currentItems.getItemPrice() + "");
        return view;
    }
}
