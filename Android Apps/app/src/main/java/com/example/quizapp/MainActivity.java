package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button falseButton;
    private Button trueButton;
    private TextView question;
    private ImageButton nextButton;
    private int qId = 0;

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
        nextButton = findViewById(R.id.next_text);
        falseButton = findViewById(R.id.false_button);
        trueButton = findViewById(R.id.true_button);
        question = findViewById(R.id.answer_text_view);
        falseButton.setOnClickListener(this);
        trueButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.false_button:
                checkAnswer(false);
                break;
            case R.id.true_button:
                checkAnswer(true);
                break;
            case R.id.next_text:
                //Go on next question
                qId = (qId+1)%questionBank.length;
                question.setText(questionBank[qId].getAnswerResId());
                
        }

    }
    public void checkAnswer(boolean userChoise){
        boolean correctAnswer = questionBank[qId].isAnswerTrue();
        if(correctAnswer == userChoise){
            Toast.makeText(this, R.string.correct_ans, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, R.string.incorrect_ans, Toast.LENGTH_SHORT).show();
        }
    }
}