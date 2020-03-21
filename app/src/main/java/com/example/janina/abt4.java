package com.example.janina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abt4 extends AppCompatActivity implements View.OnClickListener {

    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt4);


        b5 = (Button) findViewById(R.id.fourb);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent getstart = new Intent(abt4.this,question.class);
        startActivity(getstart);
    }
}
