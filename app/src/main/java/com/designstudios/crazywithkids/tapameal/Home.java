package com.designstudios.crazywithkids.tapameal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Home extends AppCompatActivity {

    RadioButton rbM, rbF, weight1, weight2, weight3, weight4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rbM = findViewById(R.id.rbM);
        rbF = findViewById(R.id.rbF);
        weight1 = findViewById(R.id.plan1);//less than 150
        weight2 = findViewById(R.id.plan2);//150 - 200
        weight3 = findViewById(R.id.plan3);//201-250
        weight4 = findViewById(R.id.plan4);//250+

    }

    public void selection (View view){

        if(rbF.isChecked()){
            if(weight1.isChecked()){
                Intent intent = new Intent(this, Plan1.class);
                startActivity(intent);
            }
            else if(weight2.isChecked()){
                Intent intent1 = new Intent(this, Plan2.class);
                startActivity(intent1);
            }
            else if(weight3.isChecked()){
                Intent intent2 = new Intent(this, Plan3.class);
                startActivity(intent2);
            }
            else if(weight4.isChecked()){
                Intent intent3 = new Intent(this, Plan4.class);
                startActivity(intent3);
            }

        }
        else if(rbM.isChecked()){
            if(weight1.isChecked()){
                Intent intent4 = new Intent(this, Plan2.class);
                startActivity(intent4);
            }
            else if(weight2.isChecked()){
                Intent intent5 = new Intent(this, Plan3.class);
                startActivity(intent5);
            }
            else if(weight3.isChecked()){
                Intent intent6 = new Intent(this, Plan4.class);
                startActivity(intent6);
            }
            else if(weight4.isChecked()){
                Intent intent7 = new Intent(this, Plan5.class);
                startActivity(intent7);
            }

        }
    }

    public void info(View view) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

}
