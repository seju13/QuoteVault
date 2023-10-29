package com.example.firebaseconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    EditText SignupName, SignupUsername,SignupPassword,SignUpEmail;
    TextView loginRedirectText;
    Button signupButton;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        SignupName=findViewById(R.id.signup_name);
        SignUpEmail=findViewById(R.id.signup_email);
        SignupUsername=findViewById(R.id.signup_username);
        SignupPassword=findViewById(R.id.signup_password);
        signupButton=findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.LoginRedirtectText);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database =FirebaseDatabase.getInstance();
                reference=database.getReference("users");

                String name=SignupName.getText().toString();
                String email=SignUpEmail.getText().toString();
                String username=SignupUsername.getText().toString();
                String password=SignupPassword.getText().toString();

                HelperClass helperClass =new HelperClass(name,email,password,username);
                reference.child(name).setValue(helperClass);

                Toast.makeText(SignUp.this, "Signup Successful", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });
    }
}