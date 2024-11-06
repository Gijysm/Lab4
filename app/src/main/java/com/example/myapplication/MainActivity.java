package com.example.myapplication;

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


    private TextInputEditText Printer_layout;
    private TextInputEditText Company_layout;
    private TextInputEditText Serial_Number_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Printer_layout = findViewById(R.id.Printers_EditText);
        Company_layout = findViewById(R.id.Company_EditText);
        Serial_Number_layout = findViewById(R.id.SerialNumber_EditText);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void OnClick(View view)
    {
        String PrinterName = Printer_layout.getText().toString(),
        Company = Company_layout.getText().toString(),
        Serial_Number = Serial_Number_layout.getText().toString();
        Printer printer = new Printer(PrinterName, Company, Serial_Number);
        Intent intent = new Intent(this, SecActiv.class);
        intent.putExtra("PrinterName", PrinterName);
        intent.putExtra("Company", Company);
        intent.putExtra("Serial_Number", Serial_Number);
        startActivity(intent);
    }
}