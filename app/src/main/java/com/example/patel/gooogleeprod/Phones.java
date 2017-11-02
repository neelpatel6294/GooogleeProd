package com.example.patel.gooogleeprod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Phones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        String[] goophones = new String[10];
        goophones[1] = "Google Pixel XL";
        goophones[2] = "Google Pixel ";
        goophones[3] = "Google 6P";
        goophones[4] = "Google 6";

        Log.v("Phones","Word at 1: " +goophones[1]);
        Log.v("Phones","Word at 1: " +goophones[3]);

    }
}
