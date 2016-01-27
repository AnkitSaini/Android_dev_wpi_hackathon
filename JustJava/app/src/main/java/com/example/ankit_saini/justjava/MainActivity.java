package com.example.ankit_saini.justjava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int numberOfCoffee = 2;
    int pricePerCup = 5;
    public void submitOrder(View view) {
        int price = calculatePrice();
        createOrderSummary(price);
       /** display(numberOfCoffee);
        displayPrice(numberOfCoffee*5);
        */
    }

    public int calculatePrice(){
        return numberOfCoffee*pricePerCup;
    }

    public void createOrderSummary(int price){
        String priceMessage = "Name: Ankit" +"\nQuantity: "+ numberOfCoffee + "\nYou owe me $" + price + " bro " + "for " + numberOfCoffee + " cups of coffee";
        displayMessage(priceMessage);
    }

    public void increment(View view){
        numberOfCoffee = numberOfCoffee + 1;
        displayQuantity(numberOfCoffee);
    }

    public void decrement(View view){
        numberOfCoffee = numberOfCoffee - 1;
        displayQuantity(numberOfCoffee);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int incomingNumber) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + incomingNumber);
    }

    /**
     * This method displays the given text on the screen.
    */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}