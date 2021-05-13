package com.example.lab2_test;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q1 extends AppCompatActivity {

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
        Intent intent = new Intent(Q1.this, Q2.class);
        intent.putExtra("res", result);
        startActivity(intent);
    }
}