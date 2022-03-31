package com.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScreenResult extends AppCompatActivity {
    TextView valor1, valor2, valor3, media, resultFinal;
    Button share;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_result);

        valor1 = (TextView) findViewById(R.id.idP1Txt);
        valor2 = (TextView) findViewById(R.id.idP2Txt);
        valor3 = (TextView) findViewById(R.id.idP3Txt);
        media = (TextView) findViewById(R.id.idMediaFinal);
        resultFinal = (TextView) findViewById(R.id.idResultadoFinal);

        String valor = getIntent().getStringExtra("prova1");
        String valor1 = getIntent().getStringExtra("prova2");
        String valor2 = getIntent().getStringExtra("prova3");
        String valor3 = getIntent().getStringExtra("resultado");
        String valor4 = getIntent().getStringExtra("result");

      /*  P1.setText(valor);
        P2.setText(valor1);
        P3.setText(valor2);
        Media.setText(valor3);
        result1.setText(valor4);

    }*/
  }
}