package com.example.appdemianvfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appdemianvfinal.cliente.Inicio_o_Creacion_Cliente;
import com.example.appdemianvfinal.pyme.Inicio_o_Creacion_Pyme;

public class MainActivity extends AppCompatActivity {

    private Button btnCliente, btnEmprendedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCliente = (Button) findViewById(R.id.btnCliente);
        btnEmprendedor = (Button) findViewById(R.id.btnEmprendedor);

        btnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lc = new Intent(MainActivity.this, Inicio_o_Creacion_Cliente.class);
            }
        });

        btnEmprendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent le = new Intent(MainActivity.this, Inicio_o_Creacion_Pyme.class);
            }
        });

    }
}