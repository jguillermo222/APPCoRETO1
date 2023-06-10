package com.example.appcoursera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pagina2 extends AppCompatActivity {

    Button backButton;
    TextView receiver_name;

    TextView receiver_phone;
    TextView receiver_email;
    TextView receiver_descripcion;
    TextView receiver_date;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pagina2);

        backButton = findViewById(R.id.button3);
        receiver_name = findViewById(R.id.dato21);
        receiver_phone = findViewById(R.id.dato23);
        receiver_email = findViewById(R.id.dato24);
        receiver_descripcion = findViewById(R.id.dato25);
        receiver_date= findViewById(R.id.dato22);
        Intent intent = getIntent();
        String str = intent.getStringExtra("NOMBRE");
        String str3 = intent.getStringExtra("TELEFONO");
        String str2 = intent.getStringExtra("EMAIL");
        String str4 = intent.getStringExtra("DESCRIPCION");
        String str5 = intent.getStringExtra("FECHA");

        receiver_name.setText(str);
        receiver_email.setText(str2);
        receiver_phone.setText(str3);
        receiver_descripcion.setText(str4);
        receiver_date.setText(str5);





        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}