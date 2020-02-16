package com.example.tugas2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button bKirim;
    private EditText etNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bKirim= findViewById(R.id.bKirim);
        etNama= findViewById(R.id.etNama);


        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNama =etNama.getText().toString();

                Intent moveIntent= new Intent(MainActivity.this, Halo.class);
                moveIntent.putExtra("nama",sNama);
                startActivity(moveIntent);
            }
        });


    }
}
