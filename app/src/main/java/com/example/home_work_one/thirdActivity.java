package com.example.home_work_one;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class thirdActivity extends AppCompatActivity {

    private MaterialButton thirdButton;
    private TextView thirdSurname;
    private TextView thirdName;
    private EditText thirdAge = findViewById(R.id.third_age);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setContentView(R.layout.activity_third);
        thirdButton = findViewById(R.id.button_third);
        thirdSurname = findViewById(R.id.third_surName);
        thirdName = findViewById(R.id.third_name);
        thirdAge = findViewById(R.id.third_age);
        thirdSurname.setText(getIntent().getStringExtra("surName"));
        thirdName.setText(getIntent().getStringExtra("name"));

        Intent intent = new Intent(thirdActivity.this, Activity_fourth.class);
            String age = ((EditText) findViewById(R.id.third_age)).getText().toString();
            String ageSecond = ((TextView) findViewById(R.id.third_surName)).getText().toString();
            String ageThird = ((TextView) findViewById(R.id.third_name)).getText().toString();
            intent.putExtra("age", age);
            intent.putExtra("third", ageSecond);
            intent.putExtra("third2", ageThird);
            startActivity(intent);
    }
}