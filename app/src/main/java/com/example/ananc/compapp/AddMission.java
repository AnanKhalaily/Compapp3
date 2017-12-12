package com.example.ananc.compapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class AddMission extends AppCompatActivity implements View.OnClickListener {
    TextView tvmission,tvdate;
    EditText etmission,etdate;
    MissionClass details;
    Button btadd;
    DatabaseReference myRef;
    FirebaseDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mission);
        tvmission=(TextView)findViewById(R.id.tvmission);
        tvdate=(TextView)findViewById(R.id.tvdate);
        etmission=(EditText) findViewById(R.id.etmission);
        etdate=(EditText) findViewById(R.id.etdate);
        btadd=(Button) findViewById(R.id.addmission);
        btadd.setOnClickListener(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Missions");

    }

    @Override
    public void onClick(View view) {
        details=new MissionClass(etmission.getText().toString(),etdate.getText().toString());
        myRef.child("test mission").setValue(details);
    }
}
