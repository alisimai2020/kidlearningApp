package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        // Set click listeners for each card
        findViewById(R.id.card1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GridViewActivity.this, SideBar.class);
                startActivity(intent);
                showToast("Watermelon clicked");
            }
        });

        findViewById(R.id.card2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GridViewActivity.this, SideBar.class);
                startActivity(intent);
                showToast("Watermelon clicked");
            }
        });

        // Add click listeners for the rest of the cards
        // ...

    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
