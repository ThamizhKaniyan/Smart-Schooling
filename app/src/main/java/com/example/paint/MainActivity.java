package com.example.paint;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.btn_notes);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_notes.class));
            }
        });

        Button b1 = (Button)findViewById(R.id.btn_books);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_books.class));
            }
        });

        Button b2 = (Button)findViewById(R.id.btn_sn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, speed_notes.class));
            }
        });

        Button b3 = (Button)findViewById(R.id.btn_er);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, easy_reader.class));
            }
        });

        /*Button b4 = (Button)findViewById(R.id.btn_tt);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_timetable.class));
            }
        });
        
         */

        Button b5 = (Button)findViewById(R.id.btn_fr);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_formula.class));
            }
        });

        Button b6 = (Button)findViewById(R.id.btn_tbls);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_tables.class));
            }
        });

        Button b7 = (Button)findViewById(R.id.btn_exam);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, examlogin.class));
            }
        });


    }
}