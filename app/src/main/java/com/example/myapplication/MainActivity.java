package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText Tour_layout;
    private static final String CORRECT_KEYWORD = "Вища математика"; // Expected keyword

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Tour_layout = findViewById(R.id.Tour_EditText);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void OnClick(View view) {
        String userInput = Tour_layout.getText().toString().trim();

        // Check if the input matches the expected keyword
        String result = userInput.equals(CORRECT_KEYWORD) ? "Вірно" : "Не вірно";

        // Start the second activity and pass the result
        Intent intent = new Intent(this, SecActiv.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
