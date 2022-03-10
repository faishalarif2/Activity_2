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
    String nama, password;

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

                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "admin@mail.com";

                String pass = "123";

                if(email.isEmpty() && password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password wajib diisi!!!",Toast.LENGTH_LONG);
                    t.show();
                } else{

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                        i.putExtras(b);

                        startActivity(i);
                    }else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal",Toast.LENGTH_LONG);
                        t.show();

                    }

                }
            }
        });
    }
}