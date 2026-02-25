package com.example.androiduitesting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class showactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showactivity);

        // Get the city name from MainActivity
        String cityName = getIntent().getStringExtra("CITY_NAME");

        // Display the city name
        TextView cityTextView = findViewById(R.id.city_detail_text);
        cityTextView.setText(cityName);

        // Back button to return to MainActivity
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}