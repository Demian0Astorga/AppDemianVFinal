package com.example.appdemianvfinal.pyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appdemianvfinal.MainActivity;
import com.example.appdemianvfinal.R;

import java.util.ArrayList;

public class Ver_Productos_Pyme extends AppCompatActivity {
    private ListView lvProductosPy;

    //Matriz para almacenar los datos de los Productos de los clientes}

    String [][] info = {
            {"Nombre Producto", "Precio", "Nombre Pyme", "Descripcion del Producto"},
            {},
    };

    //Declaración de un vector entero para tomar las id de las imagenes directamente de la carpeta
    int [] datosImg = {R.drawable.cow, R.drawable.doctorplaga, R.drawable.hollow, R.drawable.serpiente};

    private TextView tvProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_productos);

        lvProductosPy = (ListView) findViewById(R.id.lvProductosPy);
        tvProductos = (TextView) findViewById(R.id.tvProductos);


        //
        lvProductosPy.setAdapter(new Adaptador(this, info, datosImg));

        lvProductosPy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetallesProducto.class);
                visorDetalles.putExtra("TIT", info[position][0]);
                visorDetalles.putExtra("DET", info[position][4]);
                startActivity(visorDetalles);
            }
        });
    }
}