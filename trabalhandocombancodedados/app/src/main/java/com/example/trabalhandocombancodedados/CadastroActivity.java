package com.example.trabalhandocombancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class CadastroActivity extends AppCompatActivity {

    private TextInputLayout nome_cadastro;
    private TextInputLayout senha_cadastro;
    private Button salvar_cadastro;
    private Button voltar_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        senha_cadastro = findViewById(R.id.senha_cadastro);
        nome_cadastro = findViewById(R.id.nome_cadastro);
        salvar_cadastro = findViewById(R.id.salvar_cadastro);
        voltar_cadastro = findViewById(R.id.bt1);

    }
        public void Voltar_cadastro(View view){
            Intent voltar= new Intent(this, MainActivity.class);
            startActivity(voltar);
        }
        public void salvar_cadastro(View view){



            String nome_digitado = nome_cadastro.getEditText().toString();
            String senha_digitada = senha_cadastro.getEditText().toString();



            try {
                String consultaNova = "INSERT INTO alunos VALUES (?,?)" ;
                bancoDados2.execSQL(consultaNova, new String[] {nome_digitado, senha_digitada});

                Cursor cursor = bancoDados2.rawQuery("SELECT * FROM alunos",null);

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

    }
