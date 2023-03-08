 package com.example.trabalhandocombancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

 public class MainActivity extends AppCompatActivity {

     private TextInputEditText name;
     private Button saveButton;
     private TextView respName;
     private SQLiteDatabase bancoDados2;
     private TextInputEditText senha;
     private Button logar;

     private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         name = findViewById(R.id.name);
         senha = findViewById(R.id.senha);
         respName = findViewById(R.id.respName);
         saveButton = findViewById(R.id.saveButton);
         logar = findViewById(R.id.logarteste);


         try {
         // cria o banco de dados
         bancoDados2 = openOrCreateDatabase("bancoDados2", MODE_PRIVATE, null);
         // criar uma tabela
         String consulta1 = "CREATE TABLE IF NOT EXISTS alunos (nome VARCHAR UNIQUE, senha int(10))";
         bancoDados2.execSQL(consulta1);
          //Inserir dados na tabela
//            String consulta2 = "INSERT INTO alunos VALUES ('Andre', 35)";
//            String consulta3 = "INSERT INTO alunos VALUES ('Bruno', 35)";
//            bancoDados2.execSQL(consulta2);
//            bancoDados2.execSQL(consulta3);


         // Consulta de dados
//         Cursor cursor = bancoDados2.rawQuery("SELECT * FROM alunos", null);
//         int indiceNome = cursor.getColumnIndex("nome");
//         int indiceIdade = cursor.getColumnIndex("idade");
//         cursor.moveToFirst();
//         while (cursor != null) {
//             String nome = cursor.getString(indiceNome);
//             String idade = cursor.getString(indiceIdade);
//             Log.i("RESULTADO - nome: ", nome + "/ idade: " + idade);
//             cursor.moveToNext();
//         }

     } catch (Exception e) {
         e.printStackTrace();
     }}
     public void salvando(View view) {
         String nomeFront = name.getText().toString();
         String senha1 = senha.getText().toString();

        try {
            String consultaNova = "INSERT INTO alunos VALUES (?,?)" ;
            bancoDados2.execSQL(consultaNova, new String[] {nomeFront, senha1});

            Cursor  cursor = bancoDados2.rawQuery("SELECT * FROM alunos",null);

            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();

            while(cursor!=null){
                    String nome = cursor.getString(indiceNome);
                    String idade = cursor.getString(indiceIdade);
                    Log.i("resultado = "+ nome,"/idade = "+ idade);
                    respName.setText(nome + "/ idade = "+ idade);
                    cursor.moveToNext();
                }
        }catch (Exception e){
            e.printStackTrace();
        }
     }



            public void logar(View view){
         if (name.getText().toString().equals("")) {
             Toast.makeText(this, "Digita o Login", Toast.LENGTH_SHORT).show();
         } else {


             try {
                 Cursor  cursor = bancoDados2.rawQuery("SELECT * FROM alunos",null);
                 int indiceNome = cursor.getColumnIndex("nome");
                 int indiceIdade = cursor.getColumnIndex("idade");

                 cursor.moveToFirst();


                 while(cursor!=null){
                     String nome = cursor.getString(indiceNome);
                     String idade = cursor.getString(indiceIdade);
                     Log.i("resultado = "+ nome,"/idade = "+ idade);
                     if ( name.getText().toString().equals(nome)  ){
                         if (senha.getText().toString().equals(senha)){
                             // chamar outra tela
                         }else{
                             //senha errada
                         }
                     }else{
                         cursor.moveToNext();
                     }
                     respName.setText(nome + "/ idade = "+ idade);

                 }

             }catch  (Exception e) {
                 e.printStackTrace();
             }




         }

     }
 }