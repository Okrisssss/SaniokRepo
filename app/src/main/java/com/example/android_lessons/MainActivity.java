package com.example.android_lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textBox;
    Button passButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = findViewById(R.id.textBox);
        passButton = findViewById(R.id.passButton);

        passButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = textBox.getText().toString();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("message", str);

                startActivity(intent);
            }
        });
    }
}
