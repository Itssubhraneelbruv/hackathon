package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class third extends AppCompatActivity {
    private Button buttonYes, buttonNo, button;
    private EditText set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        buttonYes = findViewById(R.id.button4);
        buttonNo = findViewById(R.id.button5);

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.a3r);
                set = findViewById(R.id.sa2);

                button = findViewById(R.id.be2);
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

                                // Navigate to the fourth activity
                                Intent intent = new Intent(third.this, fourth.class);
                                startActivity(intent);
                            } catch (NumberFormatException e) {
                                // Handle the exception if the input is not a valid number
                                Toast.makeText(third.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            // Show a message if the EditText is empty
                            Toast.makeText(third.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle actions when "No" button is clicked
                Intent intent = new Intent(third.this, fourth.class);
                startActivity(intent);
            }
        });
    }
}

