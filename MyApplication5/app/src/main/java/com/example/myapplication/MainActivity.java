package com.example.myapplication;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static int global;
    public static int total;
    public EditText editTextIncome, editTextRent, editTextGroc;
    public Button buttonConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText and Button
        editTextIncome = findViewById(R.id.editTextIncome);
        editTextRent = findViewById(R.id.editTextRent);
        editTextGroc = findViewById(R.id.editTextGroc);
        buttonConfirm = findViewById(R.id.button);



        // Set OnClickListener for the button
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click here

                String income = editTextIncome.getText().toString();
                String rent = editTextRent.getText().toString();
                String groceries = editTextGroc.getText().toString();
                int v1 = Integer.parseInt(income);
                int v2 = Integer.parseInt(rent);
                int v3 = Integer.parseInt(groceries);
                total = v1-v2-v3;
                // Example: Display a toast with the entered values
//                String message = "Income: " + income + "\nRent: " + rent + "\nGroceries: " + groceries;
//                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                // Navigate to the second activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}

