package com.example.giap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainTwo extends AppCompatActivity {
TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        tt=(TextView)findViewById(R.id.textVie);



        //passo degli attributi alla seconda activiti, come???
        Intent coc = getIntent();
        String messaggioricevuto = coc.getStringExtra("messaggio");
        tt.setText("ciaoooooooooooool");
        Toast.makeText(getApplicationContext(), "titolo", Toast.LENGTH_LONG).show();
        //tostring---->
    }
}