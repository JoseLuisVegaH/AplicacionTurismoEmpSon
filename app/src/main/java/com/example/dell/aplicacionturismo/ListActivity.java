package com.example.dell.aplicacionturismo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity  extends AppCompatActivity {
    android.widget.ListView ListView;
    String[] datos = new String[]{"Plaza de la Independencia (El Tinaco)", "Monumento Centenario (Locomotora de Vapor", "Museo Ferrocarrilero","Playa el Cochorit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView = (android.widget.ListView) findViewById(R.id.lista);

        ArrayAdapter<String> arraydp = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, datos);
        ListView.setAdapter(arraydp);
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent tinaco=new Intent(ListActivity.this,Tinaco.class);
                    startActivity(tinaco);
                }
            }




        });




    }


    public void llamar(View ver) {
        Intent intent1 = new Intent(ListActivity.this, ListActivity.class);
        startActivity(intent1);
    }


}