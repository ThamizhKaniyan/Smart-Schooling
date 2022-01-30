package com.example.paint;

import android.content.Intent;
import android.speech.RecognizerIntent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class speed_notes extends AppCompatActivity {
    ImageView speachButton;
    EditText speachText;
    Button btClear;

    private static final int RECOGNIZER_RESULT = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_notes);

        speachButton = findViewById(R.id.imageView);
        speachText = findViewById(R.id.editText);
        btClear = findViewById(R.id.bt_clear);

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clear EditText
                speachText.setText("");
            }
        });

        speachButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent speachIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                speachIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                speachIntent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Speech to Text");
                startActivityForResult(speachIntent,RECOGNIZER_RESULT);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == RECOGNIZER_RESULT && resultCode == RESULT_OK){
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            speachText.setText(matches.get(0).toString());
        }
        super.onActivityResult(requestCode, resultCode, data);


    }
}
