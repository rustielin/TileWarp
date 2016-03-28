package com.weebly.httptilewarp.tilewarp;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class TileWarpCongratulationsActivity extends Activity {

    ImageButton menubutton;
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
        setContentView(R.layout.activity_tile_warp_congratulations);

        menubutton = (ImageButton) findViewById(R.id.menubutton3);
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TileWarpCongratulationsActivity.this, MainActivity.class));
                finish();

            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(TileWarpCongratulationsActivity.this, MainActivity.class));
        finish();

    }

}




