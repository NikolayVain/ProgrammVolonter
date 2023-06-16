package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity9 extends AppCompatActivity {

    private ListView listViewApplications;
    private List<CustomApplication> applicationList;
    private ApplicationAdapter applicationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        listViewApplications = findViewById(R.id.listViewApplications);
        applicationList = new ArrayList<>();
        applicationAdapter = new ApplicationAdapter(this, applicationList);
        listViewApplications.setAdapter(applicationAdapter);

        // Обработка нажатия на отдельную заявку
        listViewApplications.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CustomApplication application = applicationList.get(position);
                Toast.makeText(MainActivity9.this, "Выбрана заявка: " + application.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        Button btnViewApplication = findViewById(R.id.btnViewApplication);
        btnViewApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedPosition = listViewApplications.getCheckedItemPosition();
                if (selectedPosition != ListView.INVALID_POSITION) {
                    CustomApplication selectedApplication = applicationList.get(selectedPosition);
                    Toast.makeText(MainActivity9.this, "Просмотр заявки: " + selectedApplication.getTitle(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity9.this, "Выберите заявку для просмотра", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btnApproveApplication = findViewById(R.id.btnApproveApplication);
        btnApproveApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedPosition = listViewApplications.getCheckedItemPosition();
                if (selectedPosition != ListView.INVALID_POSITION) {
                    CustomApplication selectedApplication = applicationList.get(selectedPosition);
                    Toast.makeText(MainActivity9.this, "Одобрение заявки: " + selectedApplication.getTitle(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity9.this, "Выберите заявку для одобрения", Toast.LENGTH_SHORT).show();
                }
            }
        });

        addSampleApplications();
    }

    private void addSampleApplications() {
        applicationList.add(new CustomApplication("Заявка Nikolay", "Подразделение FGIB", "Дата 10.08.2021", "Тип Благотоворительный сбор денег на пересдачу английского языка (курсы)"));
        applicationList.add(new CustomApplication("Заявка 2", "Подразделение 2", "Дата ", "Тип "));
        applicationList.add(new CustomApplication("Заявка 3", "Подразделение 3", "Дата ", "Тип "));
        applicationList.add(new CustomApplication("Заявка 4", "Подразделение 4", "Дата ", "Тип "));

        applicationAdapter.notifyDataSetChanged();
    }
}

