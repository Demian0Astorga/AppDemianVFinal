package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;

import com.example.appdemianvfinal.R;

public class VisorImagen extends AppCompatActivity {

    private ImageView imagenCompleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);

        imagenCompleta = (ImageView) findViewById(R.id.imagenCompleta);

        Intent intent = getIntent();
        Bundle b = intent.getExtras(); //Nos va apermitir obtener los datos la información que se a mandado

        //Aquí nos aseguramos de que no esté nulo la información que se mande
        if(b!=null){
            imagenCompleta.setImageResource(b.getInt("IMG"));
        }
    }
}