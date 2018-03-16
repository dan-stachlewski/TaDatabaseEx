package com.example.dnafv.tadatabaseex;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by dnafv on 16/03/2018.
 * Must always EXTEND Custom activities so the inherit all the values of that activity.
 *
 */

public class Display extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
    }

}
