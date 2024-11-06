package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecActiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_sec);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        TextView textView = new TextView(this);
        textView.setText("This a Second Wind");
        textView.setTextSize(20);
        textView.setPadding(16,16,16,16);
        Bundle arguments = getIntent().getExtras();
        if(arguments != null)
        {
            String PrinterName = arguments.get("PrinterName").toString(),
                    Company = arguments.get("Company").toString(),
                    Serial_Number = arguments.get("Serial_Number").toString();
            textView.setText("Printer: " + PrinterName + "\n" + "Company: "+ Company + "\n" + "Serial_Number: "+ Serial_Number);
        }
        setContentView(textView);
    }
}