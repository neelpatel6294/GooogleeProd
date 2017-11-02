package com.example.patel.gooogleeprod;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView phones;
    TextView services;
    TextView employee;
    TextView software;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phones = findViewById(R.id.phones);

        phones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Phones.class);
                startActivity(i);
            }
        });
        employee = findViewById(R.id.employees);

        employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Employee.class);
                startActivity(i);
            }
        });
        services = findViewById(R.id.services);

        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Services.class);
                startActivity(i);
            }
        });
        software = findViewById(R.id.software);

        software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Software.class);
                startActivity(i);
            }
        });
    }
}
