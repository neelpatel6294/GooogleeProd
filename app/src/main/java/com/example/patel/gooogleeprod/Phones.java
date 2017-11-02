package com.example.patel.gooogleeprod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Phones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        ArrayList<CustomConts> goophones = new ArrayList<>();
        goophones.add(new CustomConts("Google Pixel XL","$900"));
        goophones.add(new CustomConts("Google Pixel","$800"));
        goophones.add(new CustomConts("Google 6P","$700"));
        goophones.add(new CustomConts("Google 6","$500"));



        PhoneAdapter adapter = new PhoneAdapter(this, goophones);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
