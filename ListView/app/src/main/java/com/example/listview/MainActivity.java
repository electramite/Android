package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String names[] = {"Shashwat Patel", "Monu Patel", "Neha Patel", "Priyanshi Patel", "Mansha Devi", "Kiran Sachan", "Mukesh Singh", "Saurabh Yadav"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        // custom Adapter
        MyCustomAdapter ad = new MyCustomAdapter(this, R.layout.my_layout, names);
        listView.setAdapter(ad);

    }
}