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
    private TextInputEditText Country_layout;
    private TextInputEditText Money_layout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Tour_layout = findViewById(R.id.Tour_EditText);
        Country_layout = findViewById(R.id.Country_EditText);
        Money_layout = findViewById(R.id.Money_EditText);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void OnClick(View view)
    {
        String PrinterName = Tour_layout.getText().toString(),
        Company = Country_layout.getText().toString(),
        Serial_Number = Money_layout.getText().toString();
        Tour printer = new Tour(PrinterName, Company, Serial_Number);
        Intent intent = new Intent(this, SecActiv.class);
        intent.putExtra("PrinterName", PrinterName);
        intent.putExtra("Company", Company);
        intent.putExtra("Serial_Number", Serial_Number);
        startActivity(intent);
    }
}