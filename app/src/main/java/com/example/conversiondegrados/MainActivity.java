package com.example.conversiondegrados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button cel;
    private Button kel;
    private Button far;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cel = findViewById(R.id.celBTN);
        kel = findViewById(R.id.kelBTN);
        far = findViewById(R.id.farBTN);

        cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FromCelsius.class);
                startActivity(i);
            }
        });

        kel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FromKelvin.class);
                startActivity(i);
            }
        });

        far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FromFahrenheit.class);
                startActivity(i);
            }
        });
    }
}