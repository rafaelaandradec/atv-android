package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v){
        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if(resultado < 18.5){
            //magreza
            lblResultado.setText("Você está abaixo do peso!");
        }
        else if(resultado < 25){
            //normal
            lblResultado.setText("Seu peso está normal!");
        }
        else if(resultado < 30){
            //sobrepeso
            lblResultado.setText("Atenção: você está acima do peso!");
        }
        else if(resultado < 35){
            //obesidade grau I
            lblResultado.setText("Cuidado: Obesidade grau I");
        }
        else{
            //obesidade grau II
            lblResultado.setText("Alerta: Obesidade grau II");
        }
    }
}