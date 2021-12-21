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

public class Listafilm extends AppCompatActivity {

    //array di tipo stringa
    String film[]={"Spiderman", "Titanic", "DuLi"};
    //array di tipo stringa che contiene il nome delle immagini...
    String immagine[]={"apple.png", "kong.png", "netflix.png"};
    //
    ListView lwFilm;

    //Adapter contiene array.
    //ListView ha un metodo che popola le righe.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//on start, on create, on destroi(activity distrutta)
        //la classe logger (statico, invocato senza invocare una classe) serve quando c'e' un problema e noi facciamo il debug per capire
        //dov'e' il problema.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listafilm);
        Intent aa = getIntent();
        //popolate da una fonte dati(database, xml,json,parsing HTML)
        lwFilm=(ListView)findViewById(R.id.lwFilm);

        // 1) Context2)Layout da prendere in consierazione per la ListView3)fonte dati-array di stringhe
        ArrayAdapter<String> aafilm= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
        //popolo la ListView con SetAdapter senza fare il ciclo...
        lwFilm.setAdapter(aafilm);

        //oggetto in ascolto di un evento con le classi Listener, ascoltano cosa succede negli oggetti per poter
        //scatenare eventi.

        //evento scatenato al click del bottone.

        //classe della libreria View ed implementa l'interfaccia OnClickListener=costruttore di un oggetto


        //


        //ascoltatore sugli elementi Listener
        lwFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override                                                      // i=indice elemento dell'item della ListView selezionata
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String titolo= (String) lwFilm.getItemAtPosition(i);
                // ESERCIZIO DI PROVA Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_LONG).show();
                //Ese secondo: //POSTER & TITOLO.
                //fai la classe Log.d(tag, img);

                Intent cioc=new Intent(getApplicationContext(), Filmselezionato.class);
                //acrtivity da far partire
                cioc.putExtra("messaggio",titolo); //?


                cioc.putExtra("imma",immagine[i]); //?
                //pacchetto aggiuntivo: CHIAVE VALORE
                startActivity(cioc);
                //
//indicce valoore---- chiave-valore=array eterogeneo di dati
                // 0 100 int       numero 1000
                //                 an ciao

            }
        });

//View on item(definsico il click sugli elementi della ListView) click listener
    }
}