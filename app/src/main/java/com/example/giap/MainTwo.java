package com.example.giap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainTwo extends AppCompatActivity {
TextView tt;
ImageView ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        tt=(TextView)findViewById(R.id.textVie);
        ii=(ImageView)findViewById(R.id.imageView);



        //passo degli attributi alla seconda activiti, come???
        Intent cioc = getIntent();
        String messaggioricevuto = cioc.getStringExtra("messaggio");
        tt.setText(messaggioricevuto);
        Toast.makeText(getApplicationContext(), messaggioricevuto, Toast.LENGTH_LONG).show();
        //tostring---->
    }
}