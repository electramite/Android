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

    private Questions[] questionBank = new Questions[] {
            new Questions(R.string.test_question1, false),
            new Questions(R.string.test_question2, true),
            new Questions(R.string.test_question3, false),
            new Questions(R.string.test_question4, false),
            new Questions(R.string.test_question5, true),
            new Questions(R.string.test_question6, false),
            new Questions(R.string.test_question7, false),
            new Questions(R.string.test_question8, true),
            new Questions(R.string.test_question9, true),
            new Questions(R.string.test_question10, false)
    };

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