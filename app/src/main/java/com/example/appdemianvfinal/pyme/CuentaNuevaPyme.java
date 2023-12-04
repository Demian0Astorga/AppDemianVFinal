package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appdemianvfinal.R;

public class CuentaNuevaPyme extends AppCompatActivity {

    private EditText edNombreNE, edTipoTiendaNE, edCorreoNE, edPasswordNE;
    private Button btnLoginCNE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_nueva_emprendedor);

        edNombreNE = (EditText) findViewById(R.id.edNombreNE);
        edTipoTiendaNE = (EditText) findViewById(R.id.edTipoTiendaNE);
        edCorreoNE = (EditText) findViewById(R.id.edCorreoNE);
        edPasswordNE = (EditText) findViewById(R.id.edPasswordNE);

        btnLoginCNE = (Button) findViewById(R.id.btnLoginCNE);

    /* ========================================================================================== */

        btnLoginCNE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ie = new Intent(CuentaNuevaPyme.this, Inicio_Pyme.class);
                startActivity(ie);
            }
        });

    }
}