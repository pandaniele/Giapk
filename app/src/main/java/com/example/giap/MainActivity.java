package com.example.giap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //array di tipo stringa
    String film[]={"Spiderman", "Titanic", "DuLi"};
    ListView lwFilm;
    Button btnEsci;
//Adapter contiene array.
    //ListView ha un metodo che popola le righe.
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //popolate da una fonte dati(database, xml,json,parsing HTML)
        lwFilm=(ListView)findViewById(R.id.lwFilm);
        btnEsci=(Button)findViewById(R.id.btnEsci);
        // 1) Context2)Layout da prendere in consierazione per la ListView3)fonte dati-array di stringhe
        ArrayAdapter<String> aafilm= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
  //popolo la ListView con SetAdapter senza fare il ciclo...
   lwFilm.setAdapter(aafilm);

   //oggetto in ascolto di un evento con le classi Listener, ascoltano cosa succede negli oggetti per poter
        //scatenare eventi.

        //evento scatenato al click del bottone.

                                      //classe della libreria View ed implementa l'interfaccia OnClickListener=costruttore di un oggetto
       btnEsci.setOnClickListener(new View.OnClickListener() {
           //definisco la funzione del Listener;
           @Override

           public void onClick(View v) {
               Toast.makeText(getApplicationContext(), "stai pr uscire", Toast.LENGTH_LONG).show();
                         }

       });

       //ascoltatore sugli elementi Listener
        lwFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override                                                      // i=indice elemento dell'item della ListView selezionata
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String titolo= (String) lwFilm.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_LONG).show();
            }
        });

//View on item(definsico il click sugli elementi della ListView) click listener
    }
}