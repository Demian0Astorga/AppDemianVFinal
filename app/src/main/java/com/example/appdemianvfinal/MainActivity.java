package com.example.appdemianvfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.appdemianvfinal.cliente.Inicio_o_Creacion_Cliente;
import com.example.appdemianvfinal.pyme.Inicio_o_Creacion_Pyme;

public class MainActivity extends AppCompatActivity {

    private Button btnCliente, btnEmprendedor;

    private static final String BROKER_URL = "mqtt://androidtestiqq.cloud.shiftr.io:1883";
    private static final String CLIENT_ID = "emprendamos";
    private MqttHandler mqttHandler;

    @Override
    protected void onDestroy() {
        mqttHandler.disconnect();
        super.onDestroy();

    }
    private void publishMessage(String topic, String message){
        Toast.makeText(this, "Publishing message: " + message, Toast.LENGTH_SHORT).show();
        mqttHandler.publish(topic,message);
    }
    private void subscribeToTopic(String topic){
        Toast.makeText(this, "Subscribing to topic "+ topic, Toast.LENGTH_SHORT).show();
        mqttHandler.subscribe(topic);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Antes del Handler", Toast.LENGTH_LONG).show();

        mqttHandler = new MqttHandler();
        mqttHandler.connect(BROKER_URL,CLIENT_ID,this);
        Toast.makeText(MainActivity.this, "Despues del Handler", Toast.LENGTH_LONG).show();

        btnCliente = (Button) findViewById(R.id.btnCliente);
        btnEmprendedor = (Button) findViewById(R.id.btnEmprendedor);



        subscribeToTopic("Tema1");
        publishMessage("Tema1", "hoña");

        Toast.makeText(MainActivity.this, "Información Enviada", Toast.LENGTH_LONG).show();

        btnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lc = new Intent(MainActivity.this, Inicio_o_Creacion_Cliente.class);
                startActivity(lc);
            }
        });

        btnEmprendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent le = new Intent(MainActivity.this, Inicio_o_Creacion_Pyme.class);
                startActivity(le);
            }
        });

    }
}