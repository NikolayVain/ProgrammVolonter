package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class VojatiyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vojatiy);

        Button btnPlannedEvents = findViewById(R.id.btnPlannedEvents);
        btnPlannedEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VojatiyActivity.this, MainActivity3.class));
            }
        });

        Button btnMyRating = findViewById(R.id.btnPlannedEvents1);
        btnMyRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VojatiyActivity.this, MainActivity5.class));
            }
        });

        Button btnPlannedEvents2 = findViewById(R.id.btnPlannedEvents2);
        btnPlannedEvents2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VojatiyActivity.this, MainActivity6.class));
            }
        });

        Button btnPlannedEvents3 = findViewById(R.id.btnPlannedEvents3);
        btnPlannedEvents3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VojatiyActivity.this, EventDetailsActivity.class));
            }
        });

        ImageView userIcon = findViewById(R.id.userIcon);
        userIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VojatiyActivity.this, MainActivity10.class));
            }
        });
    }

    public void openSettingsActivity(View view) {
        startActivity(new Intent(VojatiyActivity.this, MainActivity8.class));
    }
}
