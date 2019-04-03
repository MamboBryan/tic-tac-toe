package com.mambobryan.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity {

    //Declaring the playButton variable
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        //Initializing the play button variable to the xml button
        playButton = findViewById(R.id.play_button);

        //Setting an onClick listener for the button to got to mainActivity
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating an intent object
                Intent landingIntent = new Intent(LandingActivity.this,
                        MainActivity.class);
                LandingActivity.this.startActivity(landingIntent);
            }
        });
    }
}
