package com.weebly.httptilewarp.tilewarp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ChallengePlain extends Activity {

    public TextView countdowntimer;
    long remainingtime;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    int i = 0;
    int[] integersInAscendingOrder =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    CountDownTimer cdt;
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_plain);


        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 17; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        setButtons(list);

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

    // have a function check order pressed
    private void checkOrder(int value) {
        // see if the button pressed is the right one
        if (value == integersInAscendingOrder[i]) {
            if (i == 15) {
                startActivity(new Intent(ChallengePlain.this, SplashScreen1Challenge.class));
                cdt.cancel();
                finish();
            }
            else{
                i++;
            }
        } else {
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

    public void setButtons(ArrayList<Integer> list) {
        button1 = (Button) findViewById(R.id.Button1);
        button2 = (Button) findViewById(R.id.Button2);
        button3 = (Button) findViewById(R.id.Button3);
        button4 = (Button) findViewById(R.id.Button4);
        button5 = (Button) findViewById(R.id.Button5);
        button6 = (Button) findViewById(R.id.Button6);
        button7 = (Button) findViewById(R.id.Button7);
        button8 = (Button) findViewById(R.id.Button8);
        button9 = (Button) findViewById(R.id.Button9);
        button10 = (Button) findViewById(R.id.Button10);
        button11 = (Button) findViewById(R.id.Button11);
        button12 = (Button) findViewById(R.id.Button12);
        button13 = (Button) findViewById(R.id.Button13);
        button14 = (Button) findViewById(R.id.Button14);
        button15 = (Button) findViewById(R.id.Button15);
        button16 = (Button) findViewById(R.id.Button16);

        button1.setText(String.valueOf(list.get(0)));
        button2.setText(String.valueOf(list.get(1)));
        button3.setText(String.valueOf(list.get(2)));
        button4.setText(String.valueOf(list.get(3)));
        button5.setText(String.valueOf(list.get(4)));
        button6.setText(String.valueOf(list.get(5)));
        button7.setText(String.valueOf(list.get(6)));
        button8.setText(String.valueOf(list.get(7)));
        button9.setText(String.valueOf(list.get(8)));
        button10.setText(String.valueOf(list.get(9)));
        button11.setText(String.valueOf(list.get(10)));
        button12.setText(String.valueOf(list.get(11)));
        button13.setText(String.valueOf(list.get(12)));
        button14.setText(String.valueOf(list.get(13)));
        button15.setText(String.valueOf(list.get(14)));
        button16.setText(String.valueOf(list.get(15)));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button1.getText().toString());
                checkOrder(value);
                button1.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button2.getText().toString());
                checkOrder(value);
                button2.setBackgroundResource(R.drawable.changecolor);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button3.getText().toString());
                checkOrder(value);
                button3.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button4.getText().toString());
                checkOrder(value);
                button4.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button5.getText().toString());
                checkOrder(value);
                button5.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button6.getText().toString());
                checkOrder(value);
                button6.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button7.getText().toString());
                checkOrder(value);
                button7.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button8.getText().toString());
                checkOrder(value);
                button8.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button9.getText().toString());
                checkOrder(value);
                button9.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button10.getText().toString());
                checkOrder(value);
                button10.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button11.getText().toString());
                checkOrder(value);
                button11.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button12.getText().toString());
                checkOrder(value);
                button12.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button13.getText().toString());
                checkOrder(value);
                button13.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button14.getText().toString());
                checkOrder(value);
                button14.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button15.getText().toString());
                checkOrder(value);
                button15.setBackgroundResource(R.drawable.changecolor);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.parseInt(button16.getText().toString());
                checkOrder(value);
                button16.setBackgroundResource(R.drawable.changecolor);
            }
        });

    }
}
