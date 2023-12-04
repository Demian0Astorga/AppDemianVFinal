package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import com.example.appdemianvfinal.R;

public class Configuracion_Pyme extends AppCompatActivity {

    private EditText edNombreAE, edTipoTAE, edCorreoAE, edPasswordAE;

    private ToggleButton tbEditar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion_pyme);

        edNombreAE = (EditText) findViewById(R.id.edNombreAE);
        edTipoTAE = (EditText) findViewById(R.id.edTipoTAE);
        edCorreoAE = (EditText) findViewById(R.id.edCorreoAE);
        edPasswordAE = (EditText) findViewById(R.id.edPasswordAE);

        tbEditar = (ToggleButton) findViewById(R.id.tbEditar);

        //Instanciar Metodos
        DeshabilitarEditText();

    /* ========================================================================================== */


    }

    //Habilitar y Deshabilitar EditText
    public void DeshabilitarEditText(){
        edNombreAE.setEnabled(false);
        edTipoTAE.setEnabled(false);
        edCorreoAE.setEnabled(false);
        edPasswordAE.setEnabled(false);

        tbEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbEditar.isChecked()) {
                    edNombreAE.setEnabled(true);
                    edTipoTAE.setEnabled(true);
                    edCorreoAE.setEnabled(true);
                    edPasswordAE.setEnabled(true);

                } else {
                    edNombreAE.setEnabled(false);
                    edTipoTAE.setEnabled(false);
                    edCorreoAE.setEnabled(false);
                    edPasswordAE.setEnabled(false);
                }

            }
        });
    }

}