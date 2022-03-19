package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.dbText);
        editText = findViewById(R.id.edText);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String contact = editText.getText().toString();
                SharedPreferences data = getSharedPreferences("contacts", MODE_PRIVATE);
                SharedPreferences.Editor editor = data.edit();
               // editor.putString("key", "value");
                editor.putString("key", contact);
                editor.apply();
                textView.setText(contact);
            }
        });
        // when app will restart
        SharedPreferences storeddata = getSharedPreferences("contacts", MODE_PRIVATE);
        String saved_contact = storeddata.getString("key", "if key is not found");
        textView.setText(saved_contact);
    }
}