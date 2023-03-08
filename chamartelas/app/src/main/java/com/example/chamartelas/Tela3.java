package com.example.chamartelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela3 extends AppCompatActivity {

    private ImageView  valor;
    private ImageView retorne;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);


valor = findViewById(R.id.valor);
 retorne = findViewById(R.id.retorne);


 Bundle dados = getIntent().getExtras();
 int valores = dados.getInt("imagem");



try {
    if (valores== 1){
        valor.setImageResource(R.drawable.moeda_cara);
    }else  {
        valor.setImageResource(R.drawable.moeda_coroa);
    }
}catch (Exception erro){
    System.out.println("algo errado");
}


        retorne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                finish();
            }
        });


    }
}