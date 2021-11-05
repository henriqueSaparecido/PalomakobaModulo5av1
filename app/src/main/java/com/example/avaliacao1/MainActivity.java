package com.example.avaliacao1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
private EditText editentrada;
private Button btnconverter;
private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editentrada = findViewById(R.id.idtextoentrada);
        btnconverter = findViewById(R.id.botaoconversor);
        output = findViewById(R.id.idsaida);

        btnconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double centimetro = Double.parseDouble(editentrada.getText().toString());
                double jardas = centimetro/91.44;
                DecimalFormat df = new DecimalFormat("0.00000");
                output.setText("valor em jardas:\n"+df.format(jardas));
            }
        });
    }
}