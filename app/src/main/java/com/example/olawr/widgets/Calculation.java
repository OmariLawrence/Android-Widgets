package com.example.olawr.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Calculation extends AppCompatActivity {
    double price, size, type, crust;
    int drinks;
    TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
        size = getIntent().getExtras().getDouble("size");
        type = getIntent().getExtras().getDouble("type");
        crust = getIntent().getExtras().getDouble("crust");
        drinks = getIntent().getExtras().getInt("drinks");
        price = size + type + crust + (drinks*6);
        total = (TextView)findViewById(R.id.total);
        total.setText("Total: "+price);
    }
    public void order(View view){
        Toast.makeText(getApplicationContext(), "Pizza Ordered", Toast.LENGTH_SHORT).show();
    }
}
