package com.example.appcoursera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button sendButton;
    EditText name;
    EditText phone;
    EditText email;
    EditText descripcion;

    DatePicker date;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = findViewById(R.id.button);
        name = findViewById(R.id.dato1);
        phone = findViewById(R.id.dato3);
        email = findViewById(R.id.dato4);
        descripcion = findViewById(R.id.dato5);
        date = findViewById(R.id.dato2);

        //Para las fechas


        sendButton.setOnClickListener(v -> {

            String str = name.getText().toString();
            String str2 = email.getText().toString();
            String str3 = phone.getText().toString();
            String str4 = descripcion.getText().toString();
            String str5 = date.getDayOfMonth()+"/"+ (date.getMonth()+1) +"/"+ date.getYear();
            Intent intent = new Intent(getApplicationContext(), Pagina2.class);
            intent.putExtra("NOMBRE", str);
            intent.putExtra("TELEFONO", str3);
            intent.putExtra("EMAIL", str2);
            intent.putExtra("DESCRIPCION", str4);
            intent.putExtra("FECHA", str5);
            startActivity(intent);
        });

    }

    /*public void sendParam(View view){

    }*/

}