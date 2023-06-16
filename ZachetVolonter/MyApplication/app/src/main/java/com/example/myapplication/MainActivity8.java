package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        EditText editTextCode = findViewById(R.id.editTextCode);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredCode = editTextCode.getText().toString();

                // Проверка введенного кода
                if (enteredCode.equals("33")) {
                    // Открытие MainActivity9
                    Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
                    startActivity(intent);
                } else {
                    // Вывод сообщения об ошибке
                    Toast.makeText(MainActivity8.this, "Неправильный код вожатого", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

