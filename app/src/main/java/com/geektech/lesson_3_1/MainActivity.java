package com.geektech.lesson_3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);


    button1.setOnClickListener (new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        String buttonText = button1.getText().toString();
            if (buttonText. equals("Button1")) {
                textView.setText("Click on Button 1");
                button1.setText("1");
            } else {
                textView.setText("Hello from Geektech!");
                button1. setText("Button 1");
            }
        }
    });
    }

    public void onbuttonclick (View v) {

        if (v==button2) {
            textView.setText("Clicked button 1");
        } else if (v == button3) {
            textView.setText("Clicked button 2");
        }
    }

}
