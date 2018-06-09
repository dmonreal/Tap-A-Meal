package com.designstudios.crazywithkids.tapameal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {

    Button proteinPopBtn, fatPopBtn, dairyPopBtn, veggiePopBtn, fruitPopBtn, startchPopBtn,
    treatPopBtn;
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        proteinPopBtn = findViewById(R.id.p8);
        proteinPopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(info.this, proteinPop.class));
            }
        });

        dairyPopBtn = findViewById(R.id.d);
        dairyPopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(info.this, dairyPop.class));
            }
        });

        fatPopBtn = findViewById(R.id.fat);
        fatPopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(info.this, fatPop.class));
            }
        });


        veggiePopBtn = findViewById(R.id.v);
        veggiePopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(info.this, veggiePop.class));
            }
        });

        fruitPopBtn = findViewById(R.id.f);
        fruitPopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(info.this, fruitPop.class));
            }
        });

        startchPopBtn = findViewById(R.id.s9);
        startchPopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(info.this, starchPop.class));
            }
        });

        treatPopBtn = findViewById(R.id.t);
        treatPopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(info.this, treatPop.class));
            }
        });

    }

    public void goBack(View view){
        super.finish();

    }

    public void home(View view) {
        Intent intent = new Intent(info.this, Home.class);
        startActivity(intent);
    }
}
