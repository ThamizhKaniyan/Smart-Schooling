package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class standard_selection extends AppCompatActivity {

    private static String value;
    public static String getValue() {
        return value;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_selection);

        Button std6 = (Button)findViewById(R.id.s6);
        Button std7 = (Button)findViewById(R.id.s7);
        Button std8 = (Button)findViewById(R.id.s8);
        Button std9 = (Button)findViewById(R.id.s9);
        Button std10 = (Button)findViewById(R.id.s10);

        std6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "6";
                Intent intent = new Intent(standard_selection.this, english_book.class);
                startActivity(new Intent(standard_selection.this, MainActivity.class));
            }
        });

        std7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "7";
                Intent intent = new Intent(standard_selection.this, english_book.class);
                startActivity(new Intent(standard_selection.this, MainActivity.class));
            }
        });

        std8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "8";
                Intent intent = new Intent(standard_selection.this, english_book.class);
                startActivity(new Intent(standard_selection.this, MainActivity.class));
            }
        });

        std9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "9";
                Intent intent = new Intent(standard_selection.this, english_book.class);
                startActivity(new Intent(standard_selection.this, MainActivity.class));
            }
        });

        std10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "10";
                Intent intent = new Intent(standard_selection.this, english_book.class);
                startActivity(new Intent(standard_selection.this, MainActivity.class));
            }
        });




    }
}
