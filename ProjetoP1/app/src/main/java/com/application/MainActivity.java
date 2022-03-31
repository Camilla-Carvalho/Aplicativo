package com.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText p1, p2, p3;
    private TextView media;
    private TextView result, result2;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        media = (TextView) findViewById(R.id.idResult);
        p1 = (EditText) findViewById(R.id.idP1Txt);
        p2 = (EditText) findViewById(R.id.idP2Txt);
        p3 = (EditText) findViewById(R.id.idP3Txt);
        result2 = findViewById(R.id.idResult2);
        result = findViewById(R.id.idResult);

        Button calcular = findViewById(R.id.idBtnCalcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular(view);
            }
        });

        p1 = (EditText) findViewById(R.id.idP1Txt);
        p2 = (EditText)findViewById(R.id.idP2Txt);
        p3 = (EditText)findViewById(R.id.idP3Txt);
        result2 = (TextView)findViewById(R.id.idResult2);
        result = (TextView)findViewById(R.id.idResult);
        btnAvancar = (Button)findViewById(R.id.idBtnAvancar);

        btnAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScreenResult.class);
                intent.putExtra("prova1", p1.getText().toString());
                intent.putExtra("prova2", p2.getText().toString());
                intent.putExtra("prova3", p3.getText().toString());
                intent.putExtra("resultado", result2.getText().toString());
                intent.putExtra("result", result.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }


    public void calcular(View view){
        float valorP1 = Integer.parseInt(p1.getText().toString());
        float valorP2 = Integer.parseInt(p2.getText().toString());
        float valorP3 = Integer.parseInt(p3.getText().toString());
        float media = (valorP1 * 2 + valorP2 * 3) / 5;


        result.setText(String.valueOf(media));
        if(media >= 6){
            result2.setText(String.valueOf(media));
            result.setText(String.valueOf("Aprovado"));
        } else {
            media = ((valorP1 * 2) + (valorP2*3))/ 5;

            if(media >= 6){
                result2.setText(String.valueOf(media));
                result.setText(String.valueOf("Aprovado"));
            } else {
                media = ((valorP1 * 2) + (valorP2 * 3))/5;
                if(media>=6) {
                    result2.setText(String.valueOf(media));
                    result.setText(String.valueOf("Aprovado"));
                } else {
                    result2.setText(String.valueOf(media));
                    result.setText(String.valueOf("Reprovado"));
                }
            }

        }

    }
    public void limpar(View view){
        p1.setText("");
        p2.setText("");
        p3.setText("");
        result2.setText("");
        result.setText("");
    }



    }

