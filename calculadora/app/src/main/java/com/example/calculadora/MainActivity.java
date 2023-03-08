package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView valorDigitado;
    private TextView result;

    public Button b1;

    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button b0;
    public Button b11;
    public Button b12;
    public Button b13;
    public Button b14;
    public Button b15;

//    Button btnSend = (Button) findViewById(R.id.btnSend);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valorDigitado = findViewById(R.id.valorDigitado);

//        String calculo = "54 + 4 + 5";
//        String[] calculos = calculo.split(" ");
//        ArrayList<Double> valores = new ArrayList<Double>();
//        ArrayList<String> sinais = new ArrayList<String>();
//
//        for (int i = 0; i < calculos.length ; i++) {
//            try {
//                double valor = Double.parseDouble(calculos[i]);
//               valor.add(valor);
//
//            }catch (Exception erro){
//                sinais.add(calculos[i]);
//            }
//        }

//
//        } else {
////            String[] calculos = valorDigitado.split(" ");
//            String calculo = valorDigitado;
//            String[] calculos = valorDigitado.split(" ");
//            ArrayList<Double> valores = new ArrayList<Double>();
//            ArrayList<String> sinais = new ArrayList<String>();
//
//            for (int i = 0; i < calculos.length; i++) {
//                try {
//                    double valor = Double.parseDouble(calculos[i]);
//                    valores.add(valor);
//
//                } catch (Exception erro) {
//                    sinais.add(calculos[i]);
//                }
//                for (int a = 0; a < calculos.length; a++) {
//                    if (calculos.toString().equals("+")) {
//                        resultado += calculos[a + 1];
//                    } else if (calculos.toString().equals("-")) {
//                        resultado -= calculos[a + 1];
//                    } else if (calculos.toString().equals("*")) {
//                        resultado *= calculos[a + 1];
//
//                    } else {
//                        resultado /= calculos[a + 1];
//                    }
//                    result.setText(resultado);
//                }
//
//            }
//        }



        if (valorDigitado.getText().toString().equals("")) {

            Toast.makeText(getApplicationContext(), " Bota o valor pta calcular porra", Toast.LENGTH_LONG).show();
        }

            result.setText(""+1);

public void  b1 (View view){
    
        }
    }

}