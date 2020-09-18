package com.example.runtimeproperties;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(
                        R.id.textView)).setText("Changed at runtime!");
                LinearLayout.LayoutParams=(LinearLayout.
                        LayoutParams)view.getLayoutParams();
                params.leftMargin +=5;
            }
        });
    }
}