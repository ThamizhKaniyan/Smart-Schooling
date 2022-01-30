package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
public class english_book extends AppCompatActivity {

    PDFView pdfView;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_book);

        a = standard_selection.getValue().toString();
        pdfView = findViewById(R.id.pdfView);


        switch (a){
            case "6":
                pdfView.fromAsset("english6.pdf").load();
                break;
            case "7":
                pdfView.fromAsset("english7.pdf").load();
                break;
            case "8":
                pdfView.fromAsset("english8.pdf").load();
                break;
            case "9":
                pdfView.fromAsset("english9.pdf").load();
                break;
            default:
                pdfView.fromAsset("english10.pdf").load();
        }

    }
}
