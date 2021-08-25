package com.example.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> colorList = new ArrayList<>();
    ArrayList<Typeface> fontList = new ArrayList<Typeface>();

    Random rand = new Random();
   ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);
        colorList.add(Color.rgb(128,0,0));

        fontList.add(Typeface.SANS_SERIF);
        fontList.add(Typeface.MONOSPACE);
        fontList.add(Typeface.SERIF);


        TextView textView = findViewById(R.id.textView);
        TextInputEditText editText = findViewById(R.id.outlinedTextEdit);

        ImageButton sendButton = findViewById(R.id.button);
        ImageButton colorChange = findViewById(R.id.colorChange);
        ImageButton textChange = findViewById(R.id.textChange);


        sendButton.setOnClickListener(v -> {
            String text = editText.getText().toString();

            textView.setText(text);
            editText.setText("");
        });

        textChange.setOnClickListener(v -> {
            int x = rand.nextInt(3);
            textView.setTypeface(fontList.get(x));
        });

        colorChange.setOnClickListener(v -> {
            int x = rand.nextInt(3);
            textView.setTextColor(colorList.get(x));

        });


    }
}
