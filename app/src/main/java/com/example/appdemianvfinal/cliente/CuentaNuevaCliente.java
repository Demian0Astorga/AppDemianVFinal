package com.example.appdemianvfinal.cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appdemianvfinal.R;

public class CuentaNuevaCliente extends AppCompatActivity {

    private EditText edNombreCN, edCorreoCN, edPasswordCN;
    private Button btnLoginCN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_nueva_cliente);

        edNombreCN = (EditText) findViewById(R.id.edNombreCN);
        edCorreoCN = (EditText) findViewById(R.id.edCorreoCN);
        edPasswordCN = (EditText) findViewById(R.id.edPasswordCN);

        btnLoginCN = (Button) findViewById(R.id.btnLoginCN);

    /* ========================================================================================== */

        btnLoginCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ic = new Intent(CuentaNuevaCliente.this, Inicio_Cliente.class);
                startActivity(ic);
            }
        });
    }
}