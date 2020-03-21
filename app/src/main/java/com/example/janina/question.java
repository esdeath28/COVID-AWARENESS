package com.example.janina;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class question extends AppCompatActivity {

    Button opt1,opt2,opt3,opt4;
    TextView question,score;

    private questionSet mq = new questionSet();
    private String mAnswer;
    private int mScore=0;
    private int mQuesLength = mq.qstn.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        r= new Random();

        opt1 = (Button) findViewById(R.id.opt1);
        opt2 = (Button) findViewById(R.id.opt2);
        opt3 = (Button) findViewById(R.id.opt3);
        opt4 = (Button) findViewById(R.id.opt4);


        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score : "+mScore);
        updateQstn (r.nextInt(mQuesLength));




        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+mScore);
                    updateQstn(r.nextInt(mQuesLength));
                }
                else gameOver();
            }
        });

        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opt2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+mScore);
                    updateQstn(r.nextInt(mQuesLength));
                }
                else gameOver();
            }
        });

        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opt3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+mScore);
                    updateQstn(r.nextInt(mQuesLength));
                }
                else gameOver();
            }
        });

        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opt4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+mScore);
                    updateQstn(r.nextInt(mQuesLength));
                }
                else gameOver();
            }
        });

    }

    private void updateQstn(int num){
        question.setText(mq.getQuestion(num));
        opt1.setText(mq.getChoice1(num));
        opt2.setText(mq.getChoice2(num));
        opt3.setText(mq.getChoice3(num));
        opt4.setText(mq.getChoice4(num));

        mAnswer = mq.getCorrectAns(num);

    }

    private void gameOver(){
        AlertDialog.Builder alertD = new AlertDialog.Builder(question.this);
        alertD.setMessage("your score : " + mScore).setCancelable(false)

                .setPositiveButton("Start again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        AlertDialog alertDialog = alertD.create();
        alertDialog.show();


    }
}
