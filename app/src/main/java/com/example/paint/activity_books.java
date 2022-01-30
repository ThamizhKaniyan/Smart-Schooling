package com.example.paint;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class activity_books extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        Button b00 = (Button)findViewById(R.id.bk1);
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_books.this, english_book.class));
            }
        });

        Button b11 = (Button)findViewById(R.id.bk2);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_books.this, tamil_book.class));
            }
        });

        Button b12 = (Button)findViewById(R.id.bk3);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_books.this, maths_book.class));
            }
        });

        Button b13 = (Button)findViewById(R.id.bk4);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_books.this, science_book.class));
            }
        });

        Button b14 = (Button)findViewById(R.id.bk5);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_books.this, social_book.class));
            }
        });
    }
}
