package com.example.appdemianvfinal.cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appdemianvfinal.R;

public class Inicio_o_Creacion_Cliente extends AppCompatActivity {

    private EditText edCorreoC, edPasswordC;
    private Button btnNuevaC, btnLoginC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_o_creacion_cliente);

        edCorreoC = (EditText) findViewById(R.id.edCorreoC);
        edPasswordC = (EditText) findViewById(R.id.edPasswordC);

        btnNuevaC = (Button) findViewById(R.id.btnNuevaC);
        btnLoginC = (Button) findViewById(R.id.btnLoginC);

    /* ========================================================================================== */

       btnLoginC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(Inicio_o_Creacion_Cliente.this, Inicio_Cliente.class);
           }
       });

       btnNuevaC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent nc = new Intent(Inicio_o_Creacion_Cliente.this, CuentaNuevaCliente.class);
           }
       });

    }
}