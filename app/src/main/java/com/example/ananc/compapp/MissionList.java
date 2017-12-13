package com.example.ananc.compapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MissionList extends AppCompatActivity {
    ListView lvassignments;
    ArrayList<MissionClass> missions=new ArrayList<MissionClass>();
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_list);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");
        lvassignments=(ListView)findViewById(R.id.lvassignments);

        missions.add(new MissionClass("More About us","fuck Off"));

        final Customadapter custom=new Customadapter(this,R.layout.custom_row,missions);
        lvassignments.setAdapter(custom);
        databaseReference=FirebaseDatabase.getInstance().getReference("Missions");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                    MissionClass missionClass=dataSnapshot1.getValue(MissionClass.class);
                    missions.add(missionClass);
                }
                custom.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
