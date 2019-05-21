package com.example.ariel.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "TESTANDO 1",
                "TESTANDO 2",
                "TESTANDO 3",
                "TESTANDO 4",
                "TESTANDO 5"
        };

        int numero = new Random().nextInt(frases.length);

        TextView texto = (TextView) findViewById(R.id.text_resultado);

        texto.setText(frases[numero]);

    }
}
