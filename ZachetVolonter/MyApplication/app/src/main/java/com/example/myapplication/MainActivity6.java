package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    private EditText etName;
    private EditText etDepartment;
    private EditText etEmployeeId;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        etName = findViewById(R.id.etName);
        etDepartment = findViewById(R.id.etDepartment);
        etEmployeeId = findViewById(R.id.etEmployeeId);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String department = etDepartment.getText().toString();
                String employeeId = etEmployeeId.getText().toString();

                // Здесь можно добавить логику сохранения профиля

                Toast.makeText(MainActivity6.this, "Профиль отправлен на модерацию", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
