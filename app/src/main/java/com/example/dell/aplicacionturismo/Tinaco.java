package com.example.dell.aplicacionturismo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Tinaco extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView titulo;
        TextView descripción;
        ImageView imagen;
        titulo = (TextView) findViewById(R.id.lbTitulo);
        descripción = (TextView) findViewById(R.id.lbDescripcion);
        imagen = (ImageView) findViewById(R.id.imgPrincipal);
        imagen.setImageResource(R.drawable.ruido);
        titulo.setText("Plaza de la Independencia (Plaza del Tinaco)");
        descripción.setText("Es la plaza principal de la ciudad de Empalme, Sonora.");

    }

}
