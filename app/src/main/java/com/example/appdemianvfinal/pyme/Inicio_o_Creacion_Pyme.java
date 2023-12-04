package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appdemianvfinal.R;

public class Inicio_o_Creacion_Pyme extends AppCompatActivity {

    private EditText edCorreoE, edPasswordE;
    private Button btnNuevoE, btnLoginE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_ocreacion_emprendedor);

        edCorreoE = (EditText) findViewById(R.id.edCorreoE);
        edPasswordE = (EditText) findViewById(R.id.edPasswordE);

        btnNuevoE = (Button) findViewById(R.id.btnNuveoE);
        btnLoginE = (Button) findViewById(R.id.btnLoginE);

    /* ============================================================================== */

    btnLoginE.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Inicio_o_Creacion_Pyme.this, Inicio_Pyme.class);
        }
    });

    btnNuevoE.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ne = new Intent(Inicio_o_Creacion_Pyme.this, CuentaNuevaPyme.class);
        }
    });

    }
}