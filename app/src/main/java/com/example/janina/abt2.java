package com.example.janina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abt2 extends AppCompatActivity implements View.OnClickListener {

    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt2);


        b3 = (Button) findViewById(R.id.twob);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent getstart = new Intent(abt2.this,abt3.class);
        startActivity(getstart);
    }
}
