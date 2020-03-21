package com.example.janina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.getStarted);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent getstart = new Intent(MainActivity.this,abt.class);
        startActivity(getstart);

    }
}
