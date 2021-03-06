package com.designstudios.crazywithkids.tapameal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plan1 extends AppCompatActivity {

    Button p1, p2, p3, p4, s1, s2, s3, s4, d1, d2, v1, v2, v3, f1, f2, f3, fat1, fat2, fat3, t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan1);

        //protein buttons
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);

        //starch buttons
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);

        //dairy buttons
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);

        //veggie buttons
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        v3 = findViewById(R.id.v3);

        //fruit buttons
        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);

        //fat buttons
        fat1 = findViewById(R.id.fat1);
        fat2 = findViewById(R.id.fat2);
        fat3 = findViewById(R.id.fat3);

        //treat buttons
        t1 = findViewById(R.id.t1);


        //protein buttons

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setText("X");
            }

        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setText("X");
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p3.setText("X");
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p4.setText("X");
            }
        });

        //starch buttons

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1.setText("X");
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2.setText("X");
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3.setText("X");
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s4.setText("X");
            }
        });

        //dairy buttons

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setText("X");
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d2.setText("X");
            }
        });
        //veggie buttons

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setText("X");
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2.setText("X");
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v3.setText("X");
            }
        });
        //fruit buttons

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1.setText("X");
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2.setText("X");
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f3.setText("X");
            }
        });


        //fat buttons

        fat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fat1.setText("X");
            }
        });
        fat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fat2.setText("X");
            }
        });
        fat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fat3.setText("X");
            }
        });

        //treat buttons
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("X");

            }
        });


    }

    public void info(View view) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void reset(View view) {
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        s1.setText("");
        s2.setText("");
        s3.setText("");
        s4.setText("");
        d1.setText("");
        d2.setText("");
        v1.setText("");
        v2.setText("");
        v3.setText("");
        f1.setText("");
        f2.setText("");
        f3.setText("");
        fat1.setText("");
        fat2.setText("");
        fat3.setText("");
        t1.setText("");

    }
}
