package com.example.janina;

public class questionSet {
    public String qstn[] = {
            "What is COVID-19?",
            "Regarding the situation what's the first thing to do after returning home?",
            "What will you do to maintain your safety from someone affected?",

    };

    private String choices[][] ={
            {"a bacteria","a virus","infectious disease","genetic disease"},
            {"wash your hands","drink water","eat food","do nothing"},
            {"stay close","run away","shake hands","maintain distance"}

    };

    private String correct[]={ "infectious disease","wash your hands","maintain distance"};

    public String getQuestion (int a){
        String question = qstn[a];
        return question;
    }

    public String getChoice1 (int a){
        String choice =  choices [a][0];
        return  choice;

    }
    public String getChoice2 (int a){
        String choice =  choices [a][1];
        return  choice;

    }
    public String getChoice3 (int a){
        String choice =  choices [a][2];
        return  choice;

    }
    public String getChoice4 (int a){
        String choice =  choices [a][3];
        return  choice;

    }
    public String getCorrectAns (int a){
        String answer =  correct[a];
        return  answer;

    }
}
