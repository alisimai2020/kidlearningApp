package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextUsername = findViewById(R.id.editTextUsername);
                EditText editTextPassword = findViewById(R.id.editTextPassword);

                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Perform login authentication
                if (username.equals("dapry") && password.equals("dapry")) {
                    // Login successful, navigate to the grid view activity
                    Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Invalid credentials, show an error message
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
