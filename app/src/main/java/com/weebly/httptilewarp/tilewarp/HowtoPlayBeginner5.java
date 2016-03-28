package com.weebly.httptilewarp.tilewarp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class HowtoPlayBeginner5 extends Activity{

    ImageButton continued;
    TextView text;
    public static ArrayList<Integer> list = new ArrayList<Integer>();


    public void onPause() {
        super.onPause();
        DJ.iAmLeaving();
    }

    public void onResume(){
        super.onResume();
        DJ.iAmIn(this);
    }

    public void buttonOnClick(View view){
        DJ.keepMusicOn();
        Intent intent = new Intent(this, DJ.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howto_play_beginner5);

        continued = (ImageButton) findViewById(R.id.continued);

        continued.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HowtoPlayBeginner5.this, ChallengeRomanNumerals1to16.class));

                finish();
            }
        });

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        Collections.shuffle(list);

        text = (TextView) findViewById(R.id.oneto16);
        switch(list.get(0)){
            case 1:
                text.setTextSize(25.0f);
                text.setText("Press the squares from I to XVI before time runs out.");
                break;
            case 2:
                text.setTextSize(25.0f);
                text.setText("Press the squares from 5 to 80 by multiples of 5 before time runs out.");
                break;
            case 3:
                text.setTextSize(25.0f);
                text.setText("Press the squares backwards from 48 to 3 by multiples of 3 before time runs out.");
                break;
            case 4:
                text.setTextSize(25.0f);
                text.setText("Press the squares backwards from \"z\" to \"k\" before time runs out.");
                break;
            case 5:
                text.setTextSize(25.0f);
                text.setText("Press the squares backwards from \"sixteen\" to \"one\" before time runs out.");
                break;
            case 6:
                text.setTextSize(25.0f);
                text.setText("Press the squares backwards from 32 to 2 by multiples of 2 before time runs out.");
                break;
            case 7:
                text.setTextSize(25.0f);
                text.setText("Press the squares backwards from XVI to I before time runs out.");
                break;
            case 8:
                text.setTextSize(25.0f);
                text.setTextSize(25.0f);
                text.setText("Press the squares from word starting with \"a\" to word starting with \"p\" before time runs out");
                break;
            case 9:
                text.setTextSize(25.0f);
                text.setText("Press the squares from 3 to 48 by multiples of 3 before time runs out.");
                break;
            case 10:
                text.setTextSize(25.0f);
                text.setText("Press the squares from 4 to 64 by multiples of 4 before time runs out.");
                break;
            case 11:
                text.setTextSize(25.0f);
                text.setText("Press the squares from 2 to 32 by multiples of 2 before time runs out.");
                break;
            case 12:
                text.setTextSize(25.0f);
                text.setText("Press the squares from \"one\" to \"sixteen\" before time runs out.");
                break;
            case 13:
                text.setTextSize(25.0f);
                text.setText("Press the squares backwards from 80 to 5 by multiples of 5 before time runs out.");
                break;
            case 14:
                text.setTextSize(25.0f);
                text.setText("Press the squares from \"a\" to \"p\" before time runs out.");
                break;
            case 15:
                text.setTextSize(25.0f);
                text.setText("Press the squares backwards from 64 to 4 by multiples of 4 before time runs out.");
                break;
        }
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(HowtoPlayBeginner5.this, MainActivity.class));
        finish();

    }




}
