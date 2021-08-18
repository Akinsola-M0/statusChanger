package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        Button blueButton = findViewById(R.id.bluebutton);
        Button greenButton = findViewById(R.id.greenbutton);
        Button maroonButton = findViewById(R.id.maroonbutton);


        button.setOnClickListener(v -> {
            String text = editText.getText().toString();

            textView.setText(text);
            editText.setText("");
        });

        blueButton.setOnClickListener(v -> textView.setTextColor(Color.BLUE));


        greenButton.setOnClickListener(v -> textView.setTextColor(Color.GREEN));

        maroonButton.setOnClickListener(v -> textView.setTextColor(Color.rgb(128,0,0)));
    }
}
