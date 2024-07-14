package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class eight extends AppCompatActivity {
    private Button buttonYes, buttonNo, button;
    private EditText set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8th);

        buttonYes = findViewById(R.id.button13);
        buttonNo = findViewById(R.id.button14);

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.a2r);
                set = findViewById(R.id.sa);

                button = findViewById(R.id.be);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Get the text from EditText
                        String set1 = set.getText().toString();

                        // Check if the EditText is not empty
                        if (!set1.isEmpty()) {
                            try {
                                int v1 = Integer.parseInt(set1);

                                // Update the global variable in MainActivity
                                MainActivity.global = MainActivity.global + v1;


                                // Navigate to the MainActivity
                                Intent intent = new Intent(eight.this, result.class);
                                startActivity(intent);
                            } catch (NumberFormatException e) {
                                // Handle the exception if the input is not a valid number
                                Toast.makeText(eight.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            // Show a message if the EditText is empty
                            Toast.makeText(eight.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle actions when "No" button is clicked
                Intent intent = new Intent(eight.this, result.class);
                startActivity(intent);
            }
        });
    }
}