package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button falseButton;
    private Button trueButton;
    private TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        falseButton = findViewById(R.id.false_button);
        trueButton = findViewById(R.id.true_button);
        question = findViewById(R.id.answer_text_view);
        falseButton.setOnClickListener(this);
        trueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.false_button:
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
                break;
            case R.id.true_button:
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}