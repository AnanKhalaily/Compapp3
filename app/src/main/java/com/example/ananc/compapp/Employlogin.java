package com.example.ananc.compapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class Employlogin extends AppCompatActivity implements View.OnClickListener {
    TextView tvworkerlogin;
    EditText etworkeremail,etworkerpass;
    Button btworkerlogin;
    FirebaseAuth firebaseAuth;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employlogin);

        tvworkerlogin=(TextView)findViewById(R.id.tvemployeelogin);
        etworkeremail=(EditText) findViewById(R.id.etwokerusername);
        etworkerpass=(EditText) findViewById(R.id.etworkerpass);

        btworkerlogin=(Button) findViewById(R.id.btworkerlogin);
        btworkerlogin.setOnClickListener(this);

        firebaseAuth=FirebaseAuth.getInstance();


    }

    @Override
    public void onClick(View view) {
        email = etworkeremail.getText().toString();
        password = etworkerpass.getText().toString();
                if(email != null && password != null ) {
                    firebaseAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {


                                    // If sign in fails, display a message to the user. If sign in succeeds
                                    // the auth state listener will be notified and logic to handle the
                                    // signed in user can be handled in the listener.
                                    if (!task.isSuccessful()) {

                                        Toast.makeText(Employlogin.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                    if (task.isSuccessful()) {
                                        Intent i3=new Intent(getBaseContext(),WorkerPage.class);
                                        startActivity(i3);
                                        // ...
                                    }
                                }
                            });
                }


    }
    }

