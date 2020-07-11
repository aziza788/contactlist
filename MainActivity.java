package com.example.mam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private static string TAG = MainActivity.class.getSimpleName();
private EditText nmed1;
private EditText nmed2;
private EditText em;
private  EditText phn;
button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nmed1 =findViewById(R.id.name1);
        nmed2 = findViewById(R.id.nmed2);
        em = findViewById(R.id.email1);
        phn = findViewById(R.id.phone1);
        btn = findViewById(R.id.button4);

        btn.setOnClickListener((view){
            String name = nmed1.getText().toString();
            String  lname = nmed2.getText().toString();
            String  name = em.getText().toString();
            String Phone = phn.getText().toString();
        );
        }
    }
}