package com.example.olawr.widgets;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    protected ImageButton IB;
    protected ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IB = (ImageButton) findViewById(R.id.imageButton1);
        im = (ImageView) findViewById((R.id.imageView));
        im.setVisibility(View.INVISIBLE);

        IB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setVisibility(View.VISIBLE);
            }
        });
    }
}
