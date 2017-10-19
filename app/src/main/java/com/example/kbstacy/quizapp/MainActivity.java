package com.example.kbstacy.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.awt.*;
import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void correctOne(){
        TextView txtvw = (TextView)findViewById(R.id.qst_One);
        txtvw.setTextColor(Color.parseColor("#00FF00"));
    }

    public void incorrectOne(){

    }

    public void correctTwo(){

    }

    public void incorrectTwo(){

    }
    public void correctThree(){

    }

    public void incorrectThree(){

    }
    public void correctFour(){

    }


}
