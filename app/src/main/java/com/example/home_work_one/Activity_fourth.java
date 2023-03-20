package com.example.home_work_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Activity_fourth extends AppCompatActivity {

    private MaterialButton fourthButton;
    private TextView fourthName;
    private TextView fourthSurname;
    private TextView fourthAge;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        fourthButton = findViewById(R.id.button_fourth);
        fourthName = findViewById(R.id.textview_fourth_name);
        fourthSurname = findViewById(R.id.textview_fourthCenter);
        fourthAge = findViewById(R.id.textview_fourth_age);

    }

    @Override
    protected void onStart() {
        super.onStart();
        fourthName.setText(getIntent().getStringExtra("third"));
        fourthSurname.setText(getIntent().getStringExtra("third2"));
        fourthAge.setText(getIntent().getStringExtra("age"));
    }
}