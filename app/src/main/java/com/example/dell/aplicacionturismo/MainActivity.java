package com.example.dell.aplicacionturismo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_mapa,btn_sitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_mapa = (ImageButton) findViewById(R.id.btnMapa);
        btn_sitios = (ImageButton) findViewById(R.id.btnPunto);

        btn_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(i1);
            }
        });

        btn_sitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(i1);
            }
        });
    }
}
