package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText employeeIdEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeIdEditText = findViewById(R.id.edit_text_employee_id);
    }

    public void onClickSignIn(View view) {
        String employeeId = employeeIdEditText.getText().toString();

        // Проверяем идентификатор сотрудника
        if (isValidEmployeeId(employeeId)) {
            Intent intent = new Intent(MainActivity.this, VojatiyActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Неверный идентификатор сотрудника", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidEmployeeId(String employeeId) {
        // Здесь можно добавить логику проверки идентификатора сотрудника
        // Возвращаем true, если идентификатор действителен, иначе false
        return employeeId.length() == 8;
    }
}
