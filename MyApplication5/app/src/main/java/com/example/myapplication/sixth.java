package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sixth extends AppCompatActivity {

    private EditText sub;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        // Initialize EditText and Button
        sub = findViewById(R.id.subs1);
        button = findViewById(R.id.button10);

        // Set OnClickListener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from EditText
                String subText = sub.getText().toString();

                // Check if the EditText is not empty
                if (!subText.isEmpty()) {
                    try {
                        int v1 = Integer.parseInt(subText);

                        // Update the global variable in MainActivity
                        MainActivity.global = MainActivity.global + v1;


                        // Navigate to the next activity
                        Intent intent = new Intent(sixth.this, seventh.class);
                        startActivity(intent);
                    } catch (NumberFormatException e) {
                        // Handle the exception if the input is not a valid number
                        Toast.makeText(sixth.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Show a message if the EditText is empty
                    Toast.makeText(sixth.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



