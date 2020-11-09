package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        Toast.makeText(this, "Welcome Ganesh", Toast.LENGTH_SHORT).show();
        EditText editTextView;
        editTextView=findViewById(R.id.editTextName);
        String input=editTextView.getText().toString();
        TextView welcomeTextView;
        welcomeTextView = findViewById(R.id.textViewWelcome);
        welcomeTextView.setText(input);
    }
}