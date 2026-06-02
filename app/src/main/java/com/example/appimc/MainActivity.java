package com.example.appimc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtPeso, edtAltura;
    TextView tvIMC, tvClassificacaoIMC;
    Button btnClassificarIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtPeso = (EditText) findViewById(R.id.txtPeso);
        edtAltura = (EditText) findViewById(R.id.txtAltura);
        tvIMC= (TextView) findViewById(R.id.ldlIMC);
        tvClassificacaoIMC = (TextView) findViewById(R.id.ldlClassificacao);
        btnClassificarIMC = (Button) findViewById(R.id.cmdClassificarIMC);
        btnClassificarIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double peso,altura,imc;
                String classificacaoIMC;
                peso = Double.parseDouble(edtPeso.getText().toString());
                altura = Double.parseDouble(edtAltura.getText().toString());
                imc = (peso / (altura * altura));
                if (imc < 18.5) {
                    classificacaoIMC = "Abaixo do peso";
                } else if ((imc > 18.5) && (imc <= 24.9)) {
                    classificacaoIMC = "Peso normal";
                } else if ((imc > 24.9) && (imc <= 29.9)) {
                    classificacaoIMC = "Sobrepeso";

                } else {
                    classificacaoIMC = "Obeso";
                }
                tvIMC.setText(String.valueOf(imc));
                tvClassificacaoIMC.setText(String.valueOf(classificacaoIMC));
            }

        });

    }
}