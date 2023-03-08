package com.example.minhaaplicacaoemapp;

import androidx.appcompat.app.AppCompatActivity;

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
//    public void alterar_texto(View view){
//        TextView texto = findViewById(R.id.texto_exibicao);// primeiro nome
//        TextView texto2 = findViewById(R.id.apresentar);// onde aparece o numero apos o clic no botao
//        int gerador = new Random().nextInt(11);//gerador do numero class random
//        texto2.setText("N"+" " + gerador ); // print dos numeros
//        }
//int x= 0 ;
//    public void adicionar(View view){
//        TextView texto2 = findViewById(R.id.apresentar);
//        x =  x + 1 ;
//        String valor = Integer.toString(x);
//        texto2.setText(valor);
//    }
//
//    public void limpar(View view){
//        TextView texto2 = findViewById(R.id.apresentar);
//
//       x = 0 ;
//        String valor2 = Integer.toString(x);
//
//        texto2.setText( valor2);
//    }

}
