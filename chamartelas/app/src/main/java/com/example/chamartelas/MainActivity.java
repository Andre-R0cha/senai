package com.example.chamartelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

private ImageView comecar;
private ImageView valor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comecar = findViewById(R.id.buton_jogar);


     comecar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent jogar = new Intent(getApplicationContext(), Tela3.class);

             int imagem = new Random().nextInt(2);

             jogar.putExtra("imagem", imagem );



                startActivity(jogar);

         }
     });


    }
}