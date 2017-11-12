package com.example.ananc.compapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.ananc.compapp.R.id.lvassignments;
import static com.example.ananc.compapp.R.id.parent;

/**
 * Created by ananc on 12/11/2017.
 */

public class CustomAdapter extends ArrayAdapter<lvmissions> {

    private int resource;

    public CustomAdapter(Context context, int resource, ArrayList<lvmissions> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View cuView = imageInflater.inflate(resource, parent, false );

        lvmissions item = getItem(position);
        TextView title = (TextView) cuView.findViewById(R.id.tvtask);
        TextView date = (TextView) cuView.findViewById(R.id.tvtaskdate);

        title.setText(item.getTitle());
        date.setText(item.getDate());




        return cuView;
    }
}




