package com.example.activity2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityKedua  extends AppCompatActivity{
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);

    }
}
