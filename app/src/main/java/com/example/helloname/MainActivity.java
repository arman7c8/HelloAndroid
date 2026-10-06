package com.example.helloname;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameInput = findViewById(R.id.nameInput);
        Button helloButton = findViewById(R.id.helloButton);
        TextView resultText = findViewById(R.id.resultText);

        helloButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString().trim();
            if (name.isEmpty()) {
                resultText.setText("سلام!");
            } else {
                resultText.setText("سلام " + name + " 👋");
            }
        });
    }
}
