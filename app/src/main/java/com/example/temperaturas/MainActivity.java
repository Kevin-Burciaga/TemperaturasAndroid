package com.example.temperaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Et1 = findViewById(R.id.Et1);
                TextView Tv5, Tv6, Tv7;

                String n = Et1.getText().toString();
                if (!n.isEmpty()) {
                    int v = Integer.parseInt(n);

                    Tv5 = findViewById(R.id.Et5);
                    Tv6 = findViewById(R.id.Et6);
                    Tv7 = findViewById(R.id.Et7);

                    Tv5.setText(String.valueOf(v));
                    double fa = (v * 9.0 / 5.0) + 32;
                    double ke = v + 273.15;
                    String far = String.valueOf(fa);
                    Tv6.setText(far);
                    String kel = String.valueOf(ke);
                    Tv7.setText(kel);
                }

            }
        });

    }
}