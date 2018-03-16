package com.example.dnafv.tadatabaseex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method that will open the Display Activity (with message) when User Clicks the button on Main Activity.
    public void onButtonClick(View v){ //Object of View Class
        //If the id of View matches the Button Id
        if(v.getId() == R.id.Bdisplay){
            //Create an Intent Object that says go from MainActivity to Display Activity
            Intent i = new Intent(MainActivity.this, Display.class);
            //Activate the method that will load the Display Activity when button is clicked.
            startActivity(i);
        }
    }
}
