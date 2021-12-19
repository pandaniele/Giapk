package com.example.giap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnEsci;
//Adapter contiene array.
    //ListView ha un metodo che popola le righe.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//on start, on create, on destroi(activity distrutta)
        //la classe logger (statico, invocato senza invocare una classe) serve quando c'e' un problema e noi facciamo il debug per capire
        //dov'e' il problema.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //popolate da una fonte dati(database, xml,json,parsing HTML)

        btnEsci=(Button)findViewById(R.id.btnEsci);


   //oggetto in ascolto di un evento con le classi Listener, ascoltano cosa succede negli oggetti per poter
        //scatenare eventi.

        //evento scatenato al click del bottone.

                                      //classe della libreria View ed implementa l'interfaccia OnClickListener=costruttore di un oggetto
       btnEsci.setOnClickListener(new View.OnClickListener() {
           //definisco la funzione del Listener;
           @Override

           public void onClick(View v) {
              //new intent Listafilm
               Intent cioc=new Intent(getApplicationContext(), Listafilm.class);
               startActivity(cioc);
                         }

       });

       //




//View on item(definsico il click sugli elementi della ListView) click listener
    }
}