package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appdemianvfinal.R;

public class Inicio_Pyme extends AppCompatActivity {

    private Button btnVerProducto, btnSociales, btnUbicacion, btnConfig, btnCerrarS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_pyme);

        btnVerProducto = (Button) findViewById(R.id.btnVerProducto);
        btnSociales = (Button) findViewById(R.id.btnSociales);
        btnUbicacion = (Button) findViewById(R.id.btnUbicacion);
        btnConfig = (Button) findViewById(R.id.btnConfig);
        btnCerrarS = (Button) findViewById(R.id.btnCerrarS);

    /* ========================================================================================== */

        btnVerProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ivp = new Intent(Inicio_Pyme.this, Ver_Productos_Pyme.class);
                startActivity(ivp);
            }
        });

        btnSociales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(Inicio_Pyme.this, Redes_Sociales_Pyme.class);
                startActivity(is);
            }
        });

        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iu = new Intent(Inicio_Pyme.this, Ubicacion_Pyme.class);
                startActivity(iu);
            }
        });

        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ic = new Intent(Inicio_Pyme.this, Configuracion_Pyme.class);
                startActivity(ic);
            }
        });

        btnCerrarS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Ver como shota cerrar sesión con un Boton */
            }
        });


    }

}