package com.example.tugas2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Perkalian extends AppCompatActivity {
    private EditText etAngka1,etAngka2;
    private Button bHasil;
    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        etAngka1= findViewById(R.id.etAngka1);
        etAngka2= findViewById(R.id.etAngka2);
        bHasil=findViewById(R.id.bHasil);
        tvHasil= findViewById(R.id.tvHasil);

        bHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAngka1=etAngka1.getText().toString();
                String sAngka2=etAngka2.getText().toString();
                double a= Double.parseDouble(sAngka1);
                double b=Double.parseDouble(sAngka2);
                double hasil= a*b;
                String sHasil= String.valueOf(hasil);
                tvHasil.setText(sHasil);
            }
        });
    }
}
