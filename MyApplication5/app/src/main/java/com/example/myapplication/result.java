package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class result extends AppCompatActivity {

    private TextView percentageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res);

        percentageTextView = findViewById(R.id.percentageTextView);

        double total = MainActivity.total;
        double global = MainActivity.global;
        double percentage = (global / total) * 100;

        String message = "";
        String reward = "";
        String advice = "";

        if (percentage >= 0 && percentage <= 10) {
            reward = "You get a ₹500 voucher from Zomato.";
            advice = "Keep up the excellent savings habits!";
        } else if (percentage > 10 && percentage <= 20) {
            reward = "Enjoy a ₹100 Amazon gift card.";
            advice = "Consider saving more for future goals.";
        } else if (percentage > 20 && percentage <= 50) {
            reward = "Get a prepaid SIM on your first purchase!";
            advice = "Track your expenses to optimize your budget.";
        } else if (percentage > 50 && percentage <= 75) {
            reward = "Enjoy a ₹50 chai from Chai Point.";
            advice = "Review your expenses and cut unnecessary costs.";
        } else {
            advice = "Your spending is very high. It's important to review your expenses.";
        }

        message = "You have spent " + String.format("%.2f", percentage) + "% of your income. "
                + reward + " " + advice;

        percentageTextView.setText(message);

        if (!reward.isEmpty()) {
            Toast.makeText(this, "Congratulations! You've earned: " + reward, Toast.LENGTH_LONG).show();
        }

        Toast.makeText(this, "Financial Advice: " + advice, Toast.LENGTH_LONG).show();
    }
}
