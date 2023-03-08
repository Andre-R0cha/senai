package com.example.componentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // preco do alcool = precoAlcool
    // preco da gasolina = precoGasolina
    // resultado final = resultadoFinal
    // butoon = verificar

public void calcular() {

    TextInputEditText alcool = findViewById(R.id.precoAlcool);
    TextInputEditText gasolina = findViewById(R.id.precoGasolina);
    TextView result = findViewById(R.id.resultadoFinal);


    double alc = Double.parseDouble(alcool.getText().toString());
    double gas = Double.parseDouble(gasolina.getText().toString());

    if(alcool.getText().toString().equals("") || gasolina.getText().toString().equals("")){
        result.setText("erro");
    }else{
        if(alc/gas>=0.7){
            result.setText("gas");
        }else{
            result.setText("alcool");
        }
    }
}

}