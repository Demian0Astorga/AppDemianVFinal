package com.example.appdemianvfinal.cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.appdemianvfinal.R;
import com.example.appdemianvfinal.pyme.ProductoPyme;

import java.util.ArrayList;

public class Inicio_Cliente extends AppCompatActivity {

    private ListView lvProductos;
    private ArrayList<ProductoPyme> mostrarProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_cliente);

        lvProductos = (ListView) findViewById(R.id.lvProductos);

    }
}