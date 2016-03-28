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


public class ChallengeMultiplesof3Backward extends Activity {

    public TextView countdowntimer;
    CountDownTimer cdt;
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
    ArrayList<String> list = new ArrayList<String>();
    int i = 0;
    ArrayList<Integer> newlist;
    String[] pickedArray;
    String[] romannumerals = {"I","II","III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI","XII","XIII","XIV", "XV", "XVI"};
    String[] alphabetforward = {"a","b","c","d", "e" , "f", "g", "h", "i" , "j" , "k", "l", "m", "n", "o", "p"};
    String[] romannumeralsback = {"XVI", "XV","XIV","XIII","XII", "XI", "X", "IX", "VIII", "VII", "VI", "V", "IV","III","II", "I"};
    String[] numberwords = {"one","two","three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven","twelve","thirteen","fourteen", "fifteen", "sixteen"};
    String[] wordsofalphabet = {"ape","boa","cat", "dog", "emu", "fox", "goat", "hare", "ibis", "joey", "kiwi","lynx","mule","newt", "owl", "pig"};
    String[] alphabetback = {"z","y","x","w", "v" , "u", "t", "s", "r" , "q" , "p", "o", "n", "m", "l", "k"};
    String[] multiples4back = {"64", "60", "56", "52", "48", "44", "40", "36", "32", "28", "24","20", "16", "12", "8", "4"};
    String[] multiples5 = {"5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55","60", "65", "70", "75", "80"};
    String[] multiples3back = {"48", "45", "42", "39", "36", "33", "30", "27", "24", "21", "18","15", "12", "9", "6", "3"};
    String[] numberwordsback = {"sixteen","fifteen","fourteen", "thirteen", "twelve", "eleven", "ten", "nine", "eight", "seven", "six","five","four","three", "two", "one"};
    String[] multiples2back = {"32", "30", "28", "26", "24", "22", "20", "18", "16", "14", "12","10", "8", "6", "4", "2"};
    String[] multiples2 = {"2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22","24", "26", "28", "30", "32"};
    String[] multiples3 = {"3", "6", "9", "12", "15", "18", "21", "24", "27", "30", "33","36", "39", "42", "45", "48"};
    String[] multiples4 = {"4", "8", "12", "16", "20", "24", "28", "32", "36", "40", "44","48", "52", "56", "60", "64"};
    String[] multiples5back = {"80", "75", "70", "65", "60", "55", "50", "45", "40", "35", "30","25", "20", "15", "10", "5"};


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
        setContentView(R.layout.activity_challenge_multiplesof3_backward);

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
        newlist = HowtoPlayBeginner5.list;

        switch(newlist.get(2)){
            case 1:
                list.add("I");
                list.add("II");
                list.add("III");
                list.add("IV");
                list.add("V");
                list.add("VI");
                list.add("VII");
                list.add("VIII");
                list.add("IX");
                list.add("X");
                list.add("XI");
                list.add("XII");
                list.add("XIII");
                list.add("XIV");
                list.add("XV");
                list.add("XVI");
                Collections.shuffle(list);
                break;
            case 2:
                list.add("5");
                list.add("10");
                list.add("15");
                list.add("20");
                list.add("25");
                list.add("30");
                list.add("35");
                list.add("40");
                list.add("45");
                list.add("50");
                list.add("55");
                list.add("60");
                list.add("65");
                list.add("70");
                list.add("75");
                list.add("80");
                Collections.shuffle(list);
                break;
            case 3:
                list.add("3");
                list.add("6");
                list.add("9");
                list.add("12");
                list.add("15");
                list.add("18");
                list.add("21");
                list.add("24");
                list.add("27");
                list.add("30");
                list.add("33");
                list.add("36");
                list.add("39");
                list.add("42");
                list.add("45");
                list.add("48");
                Collections.shuffle(list);
                break;
            case 4:
                list.add("z");
                list.add("y");
                list.add("x");
                list.add("w");
                list.add("v");
                list.add("u");
                list.add("t");
                list.add("s");
                list.add("r");
                list.add("q");
                list.add("p");
                list.add("o");
                list.add("n");
                list.add("m");
                list.add("l");
                list.add("k");
                Collections.shuffle(list);
                break;
            case 5:
                list.add("one");
                list.add("two");
                list.add("three");
                list.add("four");
                list.add("five");
                list.add("six");
                list.add("seven");
                list.add("eight");
                list.add("nine");
                list.add("ten");
                list.add("eleven");
                list.add("twelve");
                list.add("thirteen");
                list.add("fourteen");
                list.add("fifteen");
                list.add("sixteen");

                Collections.shuffle(list);
                break;
            case 6:
                list.add("2");
                list.add("4");
                list.add("6");
                list.add("8");
                list.add("10");
                list.add("12");
                list.add("14");
                list.add("16");
                list.add("18");
                list.add("20");
                list.add("22");
                list.add("24");
                list.add("26");
                list.add("28");
                list.add("30");
                list.add("32");
                Collections.shuffle(list);
                break;
            case 7:
                list.add("I");
                list.add("II");
                list.add("III");
                list.add("IV");
                list.add("V");
                list.add("VI");
                list.add("VII");
                list.add("VIII");
                list.add("IX");
                list.add("X");
                list.add("XI");
                list.add("XII");
                list.add("XIII");
                list.add("XIV");
                list.add("XV");
                list.add("XVI");

                Collections.shuffle(list);
                break;

            case 8:
                list.add("ape");
                list.add("boa");
                list.add("cat");
                list.add("dog");
                list.add("emu");
                list.add("fox");
                list.add("goat");
                list.add("hare");
                list.add("ibis");
                list.add("joey");
                list.add("kiwi");
                list.add("lynx");
                list.add("mule");
                list.add("newt");
                list.add("owl");
                list.add("pig");
                Collections.shuffle(list);
                break;
            case 9:
                list.add("3");
                list.add("6");
                list.add("9");
                list.add("12");
                list.add("15");
                list.add("18");
                list.add("21");
                list.add("24");
                list.add("27");
                list.add("30");
                list.add("33");
                list.add("36");
                list.add("39");
                list.add("42");
                list.add("45");
                list.add("48");
                Collections.shuffle(list);
                break;
            case 10:
                list.add("4");
                list.add("8");
                list.add("12");
                list.add("16");
                list.add("20");
                list.add("24");
                list.add("28");
                list.add("32");
                list.add("36");
                list.add("40");
                list.add("44");
                list.add("48");
                list.add("52");
                list.add("56");
                list.add("60");
                list.add("64");
                Collections.shuffle(list);
                break;
            case 11:
                list.add("2");
                list.add("4");
                list.add("6");
                list.add("8");
                list.add("10");
                list.add("12");
                list.add("14");
                list.add("16");
                list.add("18");
                list.add("20");
                list.add("22");
                list.add("24");
                list.add("26");
                list.add("28");
                list.add("30");
                list.add("32");
                Collections.shuffle(list);
                break;
            case 12:
                list.add("one");
                list.add("two");
                list.add("three");
                list.add("four");
                list.add("five");
                list.add("six");
                list.add("seven");
                list.add("eight");
                list.add("nine");
                list.add("ten");
                list.add("eleven");
                list.add("twelve");
                list.add("thirteen");
                list.add("fourteen");
                list.add("fifteen");
                list.add("sixteen");
                Collections.shuffle(list);
                break;
            case 13:
                list.add("5");
                list.add("10");
                list.add("15");
                list.add("20");
                list.add("25");
                list.add("30");
                list.add("35");
                list.add("40");
                list.add("45");
                list.add("50");
                list.add("55");
                list.add("60");
                list.add("65");
                list.add("70");
                list.add("75");
                list.add("80");
                Collections.shuffle(list);
                break;
            case 14:
                list.add("a");
                list.add("b");
                list.add("c");
                list.add("d");
                list.add("e");
                list.add("f");
                list.add("g");
                list.add("h");
                list.add("i");
                list.add("j");
                list.add("k");
                list.add("l");
                list.add("m");
                list.add("n");
                list.add("o");
                list.add("p");
                Collections.shuffle(list);
                break;
            case 15:
                list.add("4");
                list.add("8");
                list.add("12");
                list.add("16");
                list.add("20");
                list.add("24");
                list.add("28");
                list.add("32");
                list.add("36");
                list.add("40");
                list.add("44");
                list.add("48");
                list.add("52");
                list.add("56");
                list.add("60");
                list.add("64");
                Collections.shuffle(list);
                break;
        }


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
                String value = button1.getText().toString();
                checkOrder(value);
                button1.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button1.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button2.getText().toString();
                checkOrder(value);
                button2.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button2.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button3.getText().toString();
                checkOrder(value);
                button3.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button3.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button4.getText().toString();
                checkOrder(value);
                button4.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button4.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value= button5.getText().toString();
                checkOrder(value);
                button5.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button5.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button6.getText().toString();
                checkOrder(value);
                button6.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button6.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button7.getText().toString();
                checkOrder(value);
                button7.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button7.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button8.getText().toString();
                checkOrder(value);
                button8.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button8.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button9.getText().toString();
                checkOrder(value);
                button9.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button9.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button10.getText().toString();
                checkOrder(value);
                button10.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button10.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button11.getText().toString();
                checkOrder(value);
                button11.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button11.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button12.getText().toString();
                checkOrder(value);
                button12.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button12.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button13.getText().toString();
                checkOrder(value);
                button13.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button13.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button14.getText().toString();
                checkOrder(value);
                button14.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button14.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button15.getText().toString();
                checkOrder(value);
                button15.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button15.setBackgroundResource(R.drawable.bluebutton);
                    }
                }.start();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = button16.getText().toString();
                checkOrder(value);
                button16.setBackgroundResource(R.drawable.changecolor);
                new CountDownTimer(1000, 50) {

                    @Override
                    public void onTick(long arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onFinish() {
                        button16.setBackgroundResource(R.drawable.redbutton);
                    }
                }.start();
            }
        });

        countdowntimer = (TextView) findViewById(R.id.countdown_timer);

        cdt = new CountDownTimer(20000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                countdowntimer.setText("Time Left " + millisUntilFinished / 1000);
                remainingtime = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                if(isrunning) {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    finish();
                }
            }

        };
        cdt.start();

    }

    // have a function check order pressed
    private void checkOrder(String value) {
        // see if the button pressed is the right one
        switch(newlist.get(2)){
            case 1:
                if (value.equals(romannumerals[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 2:
                if (value.equals(multiples5[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 3:
                if (value.equals(multiples3back[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 4:
                if (value.equals(alphabetback[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 5:
                if (value.equals(numberwordsback[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 6:
                if (value.equals(multiples2back[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 7:
                if (value.equals(romannumeralsback[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 8:
                if (value.equals(wordsofalphabet[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 9:
                if (value.equals(multiples3[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 10:
                if (value.equals(multiples4[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 11:
                if (value.equals(multiples2[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 12:
                if (value.equals(numberwords[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 13:
                if (value.equals(multiples5back[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 14:
                if (value.equals(alphabetforward[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;
            case 15:
                if (value.equals(multiples4back[i])) {
                    if (i == 15) {
                        startActivity(new Intent(ChallengeMultiplesof3Backward.this, SplashScreen4Challenge.class));
                        cdt.cancel();
                        finish();
                    }
                    else{
                        i++;
                    }
                } else {
                    startActivity(new Intent(ChallengeMultiplesof3Backward.this, TileWarpGameOverActivity.class));
                    cdt.cancel();
                    finish();
                }
                break;

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
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(ChallengeMultiplesof3Backward.this, MainActivity.class));
        finish();

    }
}
