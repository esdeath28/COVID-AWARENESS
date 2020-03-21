package com.example.janina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abt extends AppCompatActivity implements View.OnClickListener{

    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt);

        b2 = (Button) findViewById(R.id.strt);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent getstart = new Intent(abt.this,abt2.class);
        startActivity(getstart);

    }
}
