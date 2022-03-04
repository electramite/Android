package com.example.firstmultiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String EXTRA_NAME = "com.example.firstmultiscreenapp.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View view){

        Intent intent = new Intent(this, MainActivity2.class);
        name = findViewById(R.id.name);
        Toast.makeText(this, "Surprise !!!", Toast.LENGTH_SHORT).show();
        String myName = name.getText().toString();
        intent.putExtra(EXTRA_NAME, myName);
        startActivity(intent);
    }
}