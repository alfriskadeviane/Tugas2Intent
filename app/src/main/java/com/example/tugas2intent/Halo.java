package com.example.tugas2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Halo extends AppCompatActivity {
    private TextView tvNama;
    private Button bPerkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halo);

        tvNama= findViewById(R.id.tvNama);
        bPerkalian= findViewById(R.id.bPerkalian);

        String nama= getIntent().getStringExtra("nama");
        tvNama.setText("Hi "+ nama +"!");

        bPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent= new Intent(Halo.this, Perkalian.class);
                startActivity(moveIntent);
            }
        });
    }
}
