package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView tvRating = findViewById(R.id.tvRating);
        TextView tvStatus = findViewById(R.id.tvStatus);

        // Получение рейтинга и установка значения
        int rating = 1200;
        tvRating.setText("Ваш рейтинг: " + rating + " баллов");

        // Установка статуса в зависимости от рейтинга
        String status;
        if (rating < 1000) {
            status = "Медный";
        } else if (rating < 2000) {
            status = "Бронзовый";
        } else if (rating < 3000) {
            status = "Серебряный";
        } else if (rating < 4000) {
            status = "Золотой";
        } else {
            status = "Бриллиантовый";
        }
        tvStatus.setText("Статус: " + status);
    }
}
