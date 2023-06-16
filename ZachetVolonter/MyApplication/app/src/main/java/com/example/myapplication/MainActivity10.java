package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity {

    private Spinner spinnerVolunteer;
    private Spinner spinnerEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        spinnerVolunteer = findViewById(R.id.spinnerVolunteer);
        spinnerEvent = findViewById(R.id.spinnerEvent);

        // Инициализация списков для спиннеров
        ArrayAdapter<String> volunteerAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                new String[]{"Волонтер 1", "Волонтер 2", "Волонтер 3"});
        ArrayAdapter<String> eventAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                new String[]{"Мероприятие 1", "Мероприятие 2", "Мероприятие 3"});

        // Установка адаптеров для спиннеров
        spinnerVolunteer.setAdapter(volunteerAdapter);
        spinnerEvent.setAdapter(eventAdapter);

        Button buttonViewReport = findViewById(R.id.buttonViewReport);
        Button buttonGenerateReport = findViewById(R.id.buttonGenerateReport);

        buttonViewReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedVolunteer = spinnerVolunteer.getSelectedItem().toString();
                String selectedEvent = spinnerEvent.getSelectedItem().toString();
                String report = generateReport(selectedVolunteer, selectedEvent);
                // Отображение отчета (здесь можно добавить соответствующую логику)
                Toast.makeText(MainActivity10.this, report, Toast.LENGTH_SHORT).show();
            }
        });

        buttonGenerateReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Логика для генерации и экспорта отчетов (здесь можно добавить соответствующую логику)
                Toast.makeText(MainActivity10.this, "Генерация и экспорт отчетов", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String generateReport(String volunteer, String event) {
        // Логика для генерации отчета (здесь можно добавить соответствующую логику)
        return "Отчет для волонтера: " + volunteer + ", мероприятие: " + event;
    }
}
