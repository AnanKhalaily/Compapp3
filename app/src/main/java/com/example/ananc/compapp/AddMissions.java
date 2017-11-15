package com.example.ananc.compapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class AddMissions extends AppCompatActivity {
    ListView lvassignments;
    ArrayList<lvmissions> missions=new ArrayList<lvmissions>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_missions);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");
        lvassignments=(ListView)findViewById(R.id.lvassignments);

        missions.add(new lvmissions("More About us","fuck Off"));

        Customadapter custom=new Customadapter(this,R.layout.custom_row,missions);
        lvassignments.setAdapter(custom);
    }
}
