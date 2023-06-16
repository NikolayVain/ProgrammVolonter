package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private Button applyButton;
    private Button detailsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Находим TextView элементы в макете по их идентификаторам
        TextView eventNameField = findViewById(R.id.eventNameFieldV);
        TextView dateField = findViewById(R.id.dateField1);
        TextView directionField = findViewById(R.id.directionField1);
        TextView organizerField = findViewById(R.id.organizerField1);
        TextView placeField = findViewById(R.id.placeField1);
        TextView idField = findViewById(R.id.idField1);

        // Устанавливаем значения в TextView элементы
        eventNameField.setText("Благотоворительный сбор денег на пересдачу английского языка (курсы)");
        dateField.setText("Дата: 10.08.2021");
        directionField.setText("Направление: Благотворительный сбор");
        organizerField.setText("Организатор: Шоткова Мафья Богдановна");
        placeField.setText("Место: кабинет 148");
        idField.setText("ID: 146088");

        // Находим кнопки в макете по их идентификаторам
        applyButton = findViewById(R.id.button_apply);
        detailsButton = findViewById(R.id.button_details);

        // Устанавливаем обработчики нажатия на кнопки
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onApplyButtonClick();
            }
        });

        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDetailsButtonClick();
            }
        });
    }

    public void onApplyButtonClick() {
        Toast.makeText(this, "Заявка отправлена Вожатому", Toast.LENGTH_SHORT).show();
    }

    public void onDetailsButtonClick() {
        Intent intent = new Intent(MainActivity3.this, EventDetailsActivity.class);
        startActivity(intent);
    }
}




