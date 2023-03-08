 package com.example.testedechekbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

 public class MainActivity extends AppCompatActivity {

    private SeekBar barra;
    private TextInputEditText valorCompra;
    private TextView porCento;
    private TextView gorjeta;
    private TextView valorTotal;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra =  findViewById(R.id.barra);
        valorCompra = findViewById(R.id.valorCompra);
        valorTotal = findViewById(R.id.valorTotal);
        porCento = findViewById(R.id.porCento);
        gorjeta = findViewById(R.id.gorjeta);


        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if (valorCompra.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext()," Bota o valor da compra porra", Toast.LENGTH_LONG).show();

                }else {
                    double progresso = (double) progress;
                    double conta = Double.parseDouble(valorCompra.getText().toString());
                    double resultado = conta + conta*(progresso/100);


                    valorTotal.setText( "R$ "+resultado);
                    gorjeta.setText("R$ "+conta*(progresso/100));
                    porCento.setText(progress + "%");
                }



//

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });










    }



//    public void abrirDialog (View view){
//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle("titulo do dialogo");
//        dialog.setMessage("mensagem da dialog");
//        dialog.setCancelable(false);
//        dialog.setIcon();
//
//    }





}