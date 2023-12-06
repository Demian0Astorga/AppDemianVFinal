package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.appdemianvfinal.R;

public class DetallesProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_producto);

        TextView nomProducto = (TextView) findViewById(R.id.tvNombreProducto);
        TextView desProducto = (TextView) findViewById(R.id.tvDescripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b!=null){
            nomProducto.setText(b.getString("TIT"));
            desProducto.setText(b.getString("DET"));

        }
    }
}