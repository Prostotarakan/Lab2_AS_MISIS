package com.example.lab2_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Q3 extends AppCompatActivity {

    public double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        result = getIntent().getExtras().getDouble("res");

    }

    public void OnClick(View view) {
        int bid = view.getId();
        switch (bid){
            case R.id.Q3A3:
                result=result+1;
                break;
            default:
                break;
        }
        Intent intent = new Intent(Q3.this, Q4.class);
        intent.putExtra("res", result);
        startActivity(intent);
    }
}