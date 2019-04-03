package com.mambobryan.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Declaring the forfeit button
    Button forfeitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the forfeit button to the xml button
        forfeitButton = findViewById(R.id.forfeit_button);

        //Creating intent object to return to the landing activity on forfeit
        forfeitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,
                        LandingActivity.class);
                MainActivity.this.startActivity(mainIntent);
            }
        });
    }

}
