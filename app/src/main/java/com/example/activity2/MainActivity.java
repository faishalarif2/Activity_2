package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btLogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btLogin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.etEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email = edemail.getText().toString();
                password = edpassword.getText().toString();

                if(email.isEmpty() && password.isEmpty()){
                    edemail.setError("Email Diperlukan");
                    edpassword.setError("Password Diperlukan");
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email anda: " + email + " dan password anda: " + password + "", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                    edemail.getText().clear();
                }

                if(edemail.getText().toString().equals("admin") && edpassword.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Login Sukses",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(), "Email dan Password Anda Salah",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}