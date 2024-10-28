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
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    private TextInputEditText Music_layout;
    private TextInputEditText Person_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Music_layout = findViewById(R.id.Music_EditText);
        Person_layout = findViewById(R.id.Person_EditText);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void OnClick(View view)
    {
        String Music_S = Music_layout.getText().toString(),
        Person_S = Person_layout.getText().toString();
        Music music = new Music(Music_S, Person_S);
        Intent intent = new Intent(this, SecActiv.class);
        intent.putExtra("music", Music_S);
        intent.putExtra("person", Person_S);
        startActivity(intent);
    }
}