package com.example.lab2_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Q1_1 extends AppCompatActivity {

    public double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        result = getIntent().getExtras().getDouble("res");

    }

    public void OnClick(View view) {
        int bid = view.getId();
        if (bid ==  R.id.Q1A2) {
            result=result+1;
        }
        Intent intent = new Intent(Q1_1.this, Q2.class);
        intent.putExtra("res", result);
        startActivity(intent);
    }
}