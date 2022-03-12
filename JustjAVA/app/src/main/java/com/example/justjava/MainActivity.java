package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int q =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
    /*    if(q==0){
            Toast.makeText(this, "Add More Coffee", Toast.LENGTH_SHORT).show();
            displayPrice(0);
        }
        else{
            displayPrice(q*5);
            Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        } */
        String price = "Toatal: $"+ q*5;
        displayMessage(price);
    }

    public void increment(View view){
        q++;
        display(q);
    }
    public void decrement(View view){
        if(q>0) q--;
        display(q);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}