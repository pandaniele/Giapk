package com.example.giap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Filmselezionato extends AppCompatActivity {
TextView tt;
ImageView ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmselezionato);
        Intent cioc = getIntent();
        String messaggioricevuto = cioc.getStringExtra("messaggio");

        String immagine= cioc.getStringExtra("imma");
       String split[] =immagine.split(".");
       String invio= "R.drawable."+split[0];
        tt=(TextView)findViewById(R.id.textVie);
        ii=(ImageView)findViewById(R.id.imageView);
        ii.setImageResource(Integer.parseInt(invio));
        //
        //ii.setImageResource(R.drawable._211);
        //
        // vai su Resource Manager e aggiungi il drwable e seleziona la foto



        //passo degli attributi alla seconda activiti, come???



        tt.setText(messaggioricevuto);

        //tostring---->

        //
    }
}