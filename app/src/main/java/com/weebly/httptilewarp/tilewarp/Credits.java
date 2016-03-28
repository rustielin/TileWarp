package com.weebly.httptilewarp.tilewarp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class Credits extends Activity {

    ImageButton credits;
    ImageButton contactus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        credits = (ImageButton) findViewById(R.id.creditbutton);
        contactus = (ImageButton) findViewById(R.id.contactus);
        credits.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Credits.this, MainActivity.class));
                finish();
            }
        });
        contactus.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","support@tilewarp.com", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
                finish();
            }
        });

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

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Credits.this, MainActivity.class));
        finish();

    }

}
