package com.example.lab2_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fin extends AppCompatActivity {

    public double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);
        result = getIntent().getExtras().getDouble("res");
        Button button = (Button) findViewById(R.id.button_end);
        String res=String.valueOf (result);
        res=res.substring(0, res.length() - 2);
        button.setText(res.concat("/3"));

        result = getIntent().getExtras().getDouble("prop");

        TextView tex = (TextView) findViewById(R.id.fin_text);
        res="It's your end. You were sure as ";
        result=result*100/3;
        res=res.concat(String.valueOf(result).substring(0, 4));

        tex.setText(res.concat("%"));

    }

    public void OnClick(View view) {
        Intent intent = new Intent(Fin.this, MainActivity.class);
        startActivity(intent);
    }
}