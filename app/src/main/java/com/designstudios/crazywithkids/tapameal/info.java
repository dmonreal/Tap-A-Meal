package com.designstudios.crazywithkids.tapameal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {

    Button proteinPopBtn,fatPopBtn,dairyPopBtn, veggiePopBtn, fruitPopBtn, startchPopBtn,
            treatPopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        proteinPopBtn = findViewById(R.id.p8);
        Intent intent = new Intent(this, proteinPop.class);
        startActivity(intent);

        dairyPopBtn = findViewById(R.id.d);
        Intent dintent = new Intent(this, proteinPop.class);
        startActivity(dintent);

        fatPopBtn = findViewById(R.id.fat);
        Intent fatintent = new Intent(this, proteinPop.class);
        startActivity(fatintent);

        veggiePopBtn = findViewById(R.id.v);
        Intent vintent = new Intent(this, proteinPop.class);
        startActivity(vintent);

        fruitPopBtn = findViewById(R.id.f);
        Intent fintent = new Intent(this, proteinPop.class);
        startActivity(fintent);

        startchPopBtn = findViewById(R.id.s9);
        Intent sintent = new Intent(this, proteinPop.class);
        startActivity(sintent);

        treatPopBtn = findViewById(R.id.t);
        Intent tintent = new Intent(this, proteinPop.class);
        startActivity(tintent);

    }
    public void home(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
