package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecActiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve the result from MainActivity
        String result = getIntent().getStringExtra("result");

        TextView textView = new TextView(this);
        textView.setText(result); // Display either "Вірно" or "Не вірно"
        textView.setTextSize(24);
        textView.setPadding(16, 16, 16, 16);

        setContentView(textView);
    }
}
