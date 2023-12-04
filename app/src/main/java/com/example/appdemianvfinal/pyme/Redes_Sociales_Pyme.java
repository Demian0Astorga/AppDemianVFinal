package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import com.example.appdemianvfinal.R;

public class Redes_Sociales_Pyme extends AppCompatActivity {

    private EditText edWhatsapp, edInstagram, edFacebook;
    private ToggleButton tgEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes_sociales_pyme);

        edWhatsapp = (EditText) findViewById(R.id.edWhatsapp);
        edInstagram = (EditText) findViewById(R.id.edInstagram);
        edFacebook = (EditText) findViewById(R.id.edFacebook);

        tgEditar = (ToggleButton) findViewById(R.id.tgEditar);

    /* ========================================================================================== */

       /*tgEditar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (tgEditar.isChecked()){
                   edWhatsapp.
               }
           }
       });*/

    }
}