package com.example.a10119267;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button  halmatkul,halprofil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        halmatkul = findViewById(R.id.matkul);
        halprofil = findViewById(R.id.profil);

        halmatkul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Matkul.class);
                startActivity(i);
            }
        });
        halprofil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Profil.class);
                startActivity(i);
            }
        });
    }
}

