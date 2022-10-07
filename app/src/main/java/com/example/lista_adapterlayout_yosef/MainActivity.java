package com.example.lista_adapterlayout_yosef;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Yosef Cecil Flores Martinez

    private ListView lvNombres;
    private ArrayList<Datos> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvNombres= (ListView) findViewById(R.id.lvNombres);

        datos = new ArrayList<Datos>();
        datos.add(new Datos("Yosef","Flores","Martinez"));
        datos.add(new Datos("Yonathan","Pastrana","Tepectzin"));
        datos.add(new Datos("Amado","Perez","Cochine"));
        datos.add(new Datos("Kevin","Garcia","Camacho"));
        datos.add(new Datos("Victor","Bautista","Nieves"));
        datos.add(new Datos("Susano","Moras","Gatica"));
        datos.add(new Datos("Elias","Sanchez","Garcia"));
        datos.add(new Datos("Adrian","Nava","Guitierrez"));

        AdaptadorNombres mi_adaptador=new AdaptadorNombres(this, R.layout.lista_nombres,datos);
        lvNombres.setAdapter(mi_adaptador);


        lvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "Tocaste ha: "+ datos.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}