package com.example.home_work_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class secondActivity extends AppCompatActivity {

    private MaterialButton secondButton;
    private EditText secondSurname;
    private TextView secondName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secoond);
        secondID();
        secondListener();
    }

    private void secondID(){
        setContentView(R.layout.activity_secoond);
        secondSurname = findViewById(R.id.second_surname);
        secondButton = findViewById(R.id.button_second);
        secondName = findViewById(R.id.textview_second);
        secondName.setText(getIntent().getStringExtra("name"));
    }

    private void secondListener() {
        secondButton.setOnClickListener(view -> {
            Intent intent = new Intent(secondActivity.this, thirdActivity.class);
            String surName = ((EditText) findViewById(R.id.second_surname)).getText().toString();
            String surnameSecond = ((TextView) findViewById(R.id.textview_second)).getText().toString();
            intent.putExtra("name", surnameSecond);
            intent.putExtra("surName", surName);
            startActivity(intent);
        });
    }
}