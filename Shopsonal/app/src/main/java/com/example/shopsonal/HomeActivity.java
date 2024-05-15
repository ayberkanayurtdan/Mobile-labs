package com.example.shopsonal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shopsonal.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set click listeners for category buttons
        Button btnWomen = findViewById(R.id.btnWomen);
        Button btnMen = findViewById(R.id.btnMen);
        Button btnUnisex = findViewById(R.id.btnUnisex);
        Button btnBaby = findViewById(R.id.btnBaby);

        btnWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Women category clicked");
                // Add your logic for Women category click
            }
        });

        btnMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Men category clicked");
                // Add your logic for Men category click
            }
        });

        btnUnisex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Unisex category clicked");
                // Add your logic for Unisex category click
            }
        });

        btnBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Baby category clicked");
                // Add your logic for Baby category click
            }
        });

        // Set click listeners for image buttons
        ImageButton btnCampaign = findViewById(R.id.btncampaign);
        ImageButton btnTest = findViewById(R.id.btnTest);

        btnCampaign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Campaign button clicked");
                // Add your logic for Campaign button click
            }
        });

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Test button clicked");
                // Add your logic for Test button click
            }
        });

        // Set click listeners for discount image buttons
        ImageButton btnDiscount1 = findViewById(R.id.btnDiscount1);
        ImageButton btnDiscount2 = findViewById(R.id.btnDiscount2);

        btnDiscount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Discount 1 clicked");
                // Add your logic for Discount 1 click
            }
        });

        btnDiscount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Discount 2 clicked");
                // Add your logic for Discount 2 click
            }
        });

        // Set up the search functionality
        SearchView searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                showToast("Search submitted: " + query);
                // Add your logic for search submission
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Add your logic for search text change
                return true;
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
