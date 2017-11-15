package com.example.ananc.compapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HowActivity extends AppCompatActivity implements View.OnClickListener {
TextView tvmanagerlogin,tvworkerlogin,tvregisternow;
    Button btmanagerlogin,btworkerlogin,btregisternow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how);
        tvmanagerlogin=(TextView)findViewById(R.id.tvmanagerlogin);
        tvworkerlogin=(TextView)findViewById(R.id.tvworkerlogin);
        tvregisternow=(TextView)findViewById(R.id.tvworkerreg);
        btmanagerlogin=(Button)findViewById(R.id.btmanagerlogin);
        btworkerlogin=(Button)findViewById(R.id.btworkerlogin);
        btregisternow=(Button)findViewById(R.id.btregisternow);
        btmanagerlogin.setOnClickListener(this);
        btworkerlogin.setOnClickListener(this);
        btregisternow.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view==btworkerlogin){
            Intent i=new Intent(this,Employlogin.class);
            startActivity(i);
        }
        if(view==btmanagerlogin){
            Intent i1=new Intent(this,Managerlogin.class);
            startActivity(i1);
        }
        if(view==btregisternow){
            Intent i2=new Intent(this,Workersignup.class);
            startActivity(i2);
        }

    }
}
