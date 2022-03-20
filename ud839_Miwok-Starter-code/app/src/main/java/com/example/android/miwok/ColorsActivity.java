package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red", "weṭeṭṭi"));
        colors.add(new Word("green", "chokokki")); //


        colors.add(new Word("three", "tolookosu"));
        colors.add(new Word("four", "oyyisa"));
        colors.add(new Word("five", "massokka"));
        colors.add(new Word("six", "temmokka"));
        colors.add(new Word("seven", "kenekaku"));
        colors.add(new Word("eight", "kawinta"));
        colors.add(new Word("nine", "wo’e"));
        colors.add(new Word("ten", "na’aacha"));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}