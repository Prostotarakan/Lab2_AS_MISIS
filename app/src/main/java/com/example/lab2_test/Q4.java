package com.example.lab2_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class Q4 extends AppCompatActivity {

    public double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        result = getIntent().getExtras().getDouble("res");

    }

    public void OnClick(View view) {
        int bid = view.getId();
        switch (bid){
            case R.id.Q4A1:
                break;

            default:
                return;
        }




        Intent intent = new Intent(Q4.this, Fin.class);



        intent.putExtra("res", result);
        result=0;
        Switch sw = (Switch) findViewById(R.id.switch1);
        if (sw.isChecked()) { result=result+1;}
        sw = (Switch) findViewById(R.id.switch2);
        if (sw.isChecked()) { result=result+1;}
        sw = (Switch) findViewById(R.id.switch3);
        if (sw.isChecked()) { result=result+1;}

        intent.putExtra("prop",result);
        startActivity(intent);
    }
}