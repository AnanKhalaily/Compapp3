package com.example.ananc.compapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class Workersignup extends AppCompatActivity implements View.OnClickListener{
    EditText etname,etpass;
    Button btsignup;
    FirebaseAuth firebaseauth;
    String email,password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workersignup);
        firebaseauth= FirebaseAuth.getInstance();
        etname=(EditText)findViewById(R.id.etwokerusername);
        etpass=(EditText)findViewById(R.id.etworkerpass);
        btsignup=(Button)findViewById(R.id.btworkersignup);
        btsignup.setOnClickListener(this);

    }
    private void registerUser() {
        email = etname.getText().toString().trim();
        password = etpass.getText().toString().trim();


        firebaseauth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Workersignup.this, "Registered Successfuly, Go To Login screen", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Workersignup.this, "Registration failed please try again ", Toast.LENGTH_SHORT).show();

                        }

                    }

                });
    }

    public void onClick(View v) {
        if (v == btsignup) {
            registerUser();
        }
        if(v==btsignup){
            if (TextUtils.isEmpty(email)) {
                Toast.makeText(this, "Please insert your E-mail", Toast.LENGTH_SHORT).show();
            }
            if (TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Please insert your password", Toast.LENGTH_SHORT).show();
            }
        }

    }
}