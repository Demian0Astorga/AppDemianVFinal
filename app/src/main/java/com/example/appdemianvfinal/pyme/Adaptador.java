package com.example.appdemianvfinal.pyme;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appdemianvfinal.R;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String [][] info;
    int[] datosImg;

    public Adaptador(Context contexto, String[][] info, int[] datosImg) {
        this.contexto = contexto;
        this.info = info;
        this.datosImg = datosImg;

        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE); //Lo que hace es instaciar el XML
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView nomP = (TextView) vista.findViewById(R.id.tvNombreP);
        TextView precioP = (TextView) vista.findViewById(R.id.tvPrecio);
        TextView nomPyme = (TextView) vista.findViewById(R.id.tvNomPyme);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imvProductos);

        nomP.setText(info[i][0]);
        precioP.setText(info[i][1]);
        imagen.setImageResource(datosImg[i]);
        nomPyme.setText("Emprendedor: " + info[i][2]);


        imagen.setTag(i); //Para cuando click en la imagen para poder mostrar la que fue seleccionada

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImgan = new Intent(contexto, VisorImagen.class);
                visorImgan.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivity(visorImgan);
            }
        });

        return vista;
    }

    @Override
    public int getCount() {
        return datosImg.length; //Es para obtener el Total de elementos que hay en ese arreglo
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
