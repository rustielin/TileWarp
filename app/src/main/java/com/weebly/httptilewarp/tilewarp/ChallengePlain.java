package com.weebly.httptilewarp.tilewarp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ChallengePlain extends Activity {

    public TextView countdowntimer;
    long remainingtime;

    int currentNum = 0; // just a counter
    int numTiles = 16; // number of tiles on the screen. square numbers please!
    int btnNum;
    int[] integersInAscendingOrder = new int[numTiles];

    ArrayList<Integer> integersInRandomOrder = new ArrayList<Integer>();

    CountDownTimer cdt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_plain);

        for (int i = 1; i <= integersInAscendingOrder.length; i++) {
            integersInRandomOrder.add(i);
            integersInAscendingOrder[i-1] = i;
        }
        Collections.shuffle(integersInRandomOrder);

        setButtons();

        countdowntimer = (TextView) findViewById(R.id.countdown_timer);

        cdt = new CountDownTimer(26000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                countdowntimer.setText("Time Left " + millisUntilFinished / 1000);
                remainingtime = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                if(isrunning) {
                    startActivity(new Intent(ChallengePlain.this, TileWarpGameOverActivity.class));
                    finish();
                }
            }

        };
        cdt.start();
    }

    public void setButtons() {

        LinearLayout layout = new LinearLayout(getApplicationContext());
        layout.setOrientation(LinearLayout.VERTICAL);

        for (int i = 1; i <= Math.sqrt(numTiles); i++) {

            LinearLayout row = new LinearLayout(this);
            row.setLayoutParams(new android.support.v7.app.ActionBar.LayoutParams(android.support.v7.app.ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.WRAP_CONTENT));

            for (int j = 1; j <= Math.sqrt(numTiles); j++) {
                Button btnTag = new Button(this);
                btnTag.setLayoutParams(new android.support.v7.app.ActionBar.LayoutParams(android.support.v7.app.ActionBar.LayoutParams.WRAP_CONTENT, android.support.v7.app.ActionBar.LayoutParams.WRAP_CONTENT));
                btnNum = i*j;
                btnTag.setText(integersInRandomOrder.get(i*j-1));
                btnTag.setId(btnNum);

                if (i*j%2 == 0) {
                    btnTag.setBackgroundResource(R.drawable.redbutton);
                }
                else {
                    btnTag.setBackgroundResource(R.drawable.bluebutton);
                }

                // set listeners
                (findViewById(btnNum)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int value = Integer.parseInt(((Button) findViewById(btnNum)).getText().toString());
                        checkOrder(value);
                        (findViewById(btnNum)).setBackgroundResource(R.drawable.changecolor);
                    }
                });
            }

            layout.addView(row);
        }

    }

    // have a function check button order pressed
    private void checkOrder(int value) {
        // see if the button pressed is the right one
        if (value == integersInAscendingOrder[currentNum]) {
            if (currentNum == 15) {
                startActivity(new Intent(ChallengePlain.this, SplashScreen1Challenge.class));
                cdt.cancel();
                finish();
            }
            else{
                currentNum++;
            }
        }
        else {
            startActivity(new Intent(ChallengePlain.this, TileWarpGameOverActivity.class));
            cdt.cancel();
            finish();
        }
    }








    public boolean isrunning;

    @Override
    protected void onStart() {
        super.onStart();

        // Store our shared preference
        SharedPreferences sp = getSharedPreferences("OURINFO", MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putBoolean("active", true);
        ed.apply();
        isrunning = true;
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Store our shared preference
        SharedPreferences sp = getSharedPreferences("OURINFO", MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putBoolean("active", false);
        ed.apply();
        isrunning  = false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ChallengePlain.this, MainActivity.class));
        finish();
    }

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
}
