package com.example.patel.gooogleeprod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        ArrayList<CustomConts> goophones = new ArrayList<>();
        goophones.add(new CustomConts("Google Search","$900"));
        goophones.add(new CustomConts("Google Cloud","$800"));
        goophones.add(new CustomConts("Google FireBase","$700"));
        goophones.add(new CustomConts("Google Android","$500"));



        PhoneAdapter adapter = new PhoneAdapter(this, goophones);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
