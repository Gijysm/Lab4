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
            String Music_S = arguments.get("music").toString(),
                    Person_S = arguments.get("person").toString();
            textView.setText("Music: " + Music_S + "\n" + "Person: "+ Person_S);
        }
        setContentView(textView);
    }
}