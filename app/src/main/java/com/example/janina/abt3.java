package com.example.janina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abt3 extends AppCompatActivity implements View.OnClickListener{

    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt3);

        b4 = (Button) findViewById(R.id.threeb);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent getstart = new Intent(abt3.this,abt4.class);
        startActivity(getstart);
    }
}
