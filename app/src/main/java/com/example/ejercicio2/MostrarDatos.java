package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MostrarDatos extends AppCompatActivity {


    static ListView vista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        vista = (ListView) findViewById(R.id.lista);
    }

    public ListView getVista(){
        return this.vista;
    }

    public void setVista(ListView vista){
        this.vista = vista;
    }
}
