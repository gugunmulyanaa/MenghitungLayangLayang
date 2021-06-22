package com.example.layanglayang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText d1;
    EditText d2;
    TextView luas;
    Button hitungluas;

    EditText sisi1;
    EditText sisi2;
    TextView keliling;
    Button hitungkeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = findViewById(R.id.input_dg1);
        d2 = findViewById(R.id.input_dg2);
        luas = findViewById(R.id.text_viewluas);
        hitungluas = findViewById(R.id.btn_hitung);

        sisi1 = findViewById(R.id.input_s1);
        sisi2 = findViewById(R.id.input_s2);
        keliling = findViewById(R.id.text_viewkeliling);
        hitungkeliling = findViewById(R.id.btn_hitungkeliling);

        hitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int diagonal1 = Integer.parseInt(d1.getText().toString());
                int diagonal2 = Integer.parseInt(d2.getText().toString());
                double hasilluas = 0.5 * diagonal1 * diagonal2;
                luas.setText("luasnya adalah: "+hasilluas + " Cm");
            }
        });

        hitungkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = Integer.parseInt(sisi1.getText().toString());
                int s2 = Integer.parseInt(sisi2.getText().toString());
                int hasilkeliling = 2 * (s1 + s2);
                keliling.setText("keliling adalah: "+hasilkeliling + " Cm");
            }
        });

    }
}