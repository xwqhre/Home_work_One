package com.example.home_work_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private MaterialButton buttonMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initID();
        initListener();
    }
    
    private void initListener(){
        buttonMain.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, secondActivity.class);
            String name1 = ((EditText) findViewById(R.id.editText_name)).getText().toString();
            intent.putExtra("name", name1);
            startActivity(intent);
        });
    }

    private void initID() {
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editText_name);
        buttonMain = findViewById(R.id.button_main);
    }
}