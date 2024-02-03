    package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0 = findViewById(R.id.btn0);
        Button num1 = findViewById(R.id.btn1);
        Button num2 = findViewById(R.id.btn2);
        Button num3 = findViewById(R.id.btn3);
        Button num4 = findViewById(R.id.btn4);
        Button num5 = findViewById(R.id.btn5);
        Button num6 = findViewById(R.id.btn6);
        Button num7 = findViewById(R.id.btn7);
        Button num8 = findViewById(R.id.btn8);
        Button num9 = findViewById(R.id.btn9);

        Button pls = findViewById(R.id.btnplus);
        Button min = findViewById(R.id.btnmin);
        Button calc = findViewById(R.id.btnequal);
        Button div = findViewById(R.id.buttonhel);
        Button mult = findViewById(R.id.btnx);
        Button dot = findViewById(R.id.btndot);
        Button ac = findViewById(R.id.btnac);

    }


}