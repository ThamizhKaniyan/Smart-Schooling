package com.example.paint;

import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_tables extends AppCompatActivity {

    int i;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        TextView t1 = findViewById(R.id.tb1);
        t1.setText("\n    1 times table    \n\n" +
                "   1 x 1 = 1\n" +
                "   1 x 2 = 2\n" +
                "   1 x 3 = 3\n" +
                "   1 x 4 = 4\n" +
                "   1 x 5 = 5\n" +
                "   1 x 6 = 6\n" +
                "   1 x 7 = 7\n" +
                "   1 x 8 = 8\n" +
                "   1 x 9 = 9\n" +
                "   1 x 10 = 10\n" +
                "   1 x 11 = 11\n" +
                "   1 x 12 = 12\n");


        TextView t2 = findViewById(R.id.tb2);
        t2.setText("\n    2 times table    \n\n" +
                "   2 x 1 = 2\n" +
                "   2 x 2 = 4\n" +
                "   2 x 3 = 6\n" +
                "   2 x 4 = 8\n" +
                "   2 x 5 = 10\n" +
                "   2 x 6 = 12\n" +
                "   2 x 7 = 14\n" +
                "   2 x 8 = 16\n" +
                "   2 x 9 = 18\n" +
                "   2 x 10 = 20\n" +
                "   2 x 11 = 22\n" +
                "   2 x 12 = 24\n");


        TextView t3 = findViewById(R.id.tb3);
        t3.setText("\n    3 times table    \n\n" +
                "   3 x 1 = 3\n" +
                "   3 x 2 = 6\n" +
                "   3 x 3 = 9\n" +
                "   3 x 4 = 12\n" +
                "   3 x 5 = 15\n" +
                "   3 x 6 = 18\n" +
                "   3 x 7 = 21\n" +
                "   3 x 8 = 24\n" +
                "   3 x 9 = 27\n" +
                "   3 x 10 = 30\n" +
                "   3 x 11 = 33\n" +
                "   3 x 12 = 36\n");
        TextView t4 = findViewById(R.id.tb4);
        t4.setText("\n    4 times table    \n\n" +
                "   4 x 1 = 4\n" +
                "   4 x 2 = 8\n" +
                "   4 x 3 = 12\n" +
                "   4 x 4 = 16\n" +
                "   4 x 5 = 20\n" +
                "   4 x 6 = 24\n" +
                "   4 x 7 = 28\n" +
                "   4 x 8 = 32\n" +
                "   4 x 9 = 36\n" +
                "   4 x 10 = 40\n" +
                "   4 x 11 = 44\n" +
                "   4 x 12 = 48\n");

        TextView t5 = findViewById(R.id.tb5);
        t5.setText("\n    5 times table    \n\n" +
                "   5 x 1 = 5\n" +
                "   5 x 2 = 10\n" +
                "   5 x 3 = 15\n" +
                "   5 x 4 = 20\n" +
                "   5 x 5 = 25\n" +
                "   5 x 6 = 30\n" +
                "   5 x 7 = 35\n" +
                "   5 x 8 = 40\n" +
                "   5 x 9 = 45\n" +
                "   5 x 10 = 50\n" +
                "   5 x 11 = 55\n" +
                "   5 x 12 = 60\n");

        TextView t6 = findViewById(R.id.tb6);
        t6.setText("\n    6 times table    \n\n" +
                "   6 x 1 = 6\n" +
                "   6 x 2 = 12\n" +
                "   6 x 3 = 18\n" +
                "   6 x 4 = 24\n" +
                "   6 x 5 = 30\n" +
                "   6 x 6 = 36\n" +
                "   6 x 7 = 42\n" +
                "   6 x 8 = 48\n" +
                "   6 x 9 = 54\n" +
                "   6 x 10 = 60\n" +
                "   6 x 11 = 66\n" +
                "   6 x 12 = 72\n");

        TextView t7 = findViewById(R.id.tb7);
        t7.setText("\n    7 times table    \n\n" +
                "   7 x 1 = 7\n" +
                "   7 x 2 = 14\n" +
                "   7 x 3 = 21\n" +
                "   7 x 4 = 28\n" +
                "   7 x 5 = 35\n" +
                "   7 x 6 = 42\n" +
                "   7 x 7 = 49\n" +
                "   7 x 8 = 56\n" +
                "   7 x 9 = 63\n" +
                "   7 x 10 = 70\n" +
                "   7 x 11 = 77\n" +
                "   7 x 12 = 84\n");

        TextView t8 = findViewById(R.id.tb8);
        t8.setText("\n    8 times table    \n\n" +
                "   8 x 1 = 8\n" +
                "   8 x 2 = 16\n" +
                "   8 x 3 = 24\n" +
                "   8 x 4 = 32\n" +
                "   8 x 5 = 40\n" +
                "   8 x 6 = 48\n" +
                "   8 x 7 = 56\n" +
                "   8 x 8 = 64\n" +
                "   8 x 9 = 72\n" +
                "   8 x 10 = 80\n" +
                "   8 x 11 = 88\n" +
                "   8 x 12 = 96\n");

        TextView t9 = findViewById(R.id.tb9);
        t9.setText("\n    9 times table    \n\n" +
                "   9 x 1 = 9\n" +
                "   9 x 2 = 18\n" +
                "   9 x 3 = 27\n" +
                "   9 x 4 = 36\n" +
                "   9 x 5 = 45\n" +
                "   9 x 6 = 54\n" +
                "   9 x 7 = 63\n" +
                "   9 x 8 = 72\n" +
                "   9 x 9 = 81\n" +
                "   9 x 10 = 90\n" +
                "   9 x 11 = 99\n" +
                "   9 x 12 = 108\n");

        TextView t10 = findViewById(R.id.tb10);
        t10.setText("\n    10 times table    \n\n" +
                "   10 x 1 = 10\n" +
                "   10 x 2 = 20\n" +
                "   10 x 3 = 30\n" +
                "   10 x 4 = 40\n" +
                "   10 x 5 = 50\n" +
                "   10 x 6 = 60\n" +
                "   10 x 7 = 70\n" +
                "   10 x 8 = 80\n" +
                "   10 x 9 = 90\n" +
                "   10 x 10 = 100\n" +
                "   10 x 11 = 110\n" +
                "   10 x 12 = 120\n");

        TextView t11 = findViewById(R.id.tb11);
        t11.setText("\n    11 times table    \n\n" +
                "   11 x 1 = 11\n" +
                "   11 x 2 = 22\n" +
                "   11 x 3 = 33\n" +
                "   11 x 4 = 44\n" +
                "   11 x 5 = 55\n" +
                "   11 x 6 = 66\n" +
                "   11 x 7 = 77\n" +
                "   11 x 8 = 88\n" +
                "   11 x 9 = 99\n" +
                "   11 x 10 = 110\n" +
                "   11 x 11 = 121\n" +
                "   11 x 12 = 132\n");

        TextView t12 = findViewById(R.id.tb12);
        t12.setText("\n    12 times table    \n\n" +
                "   12 x 1 = 12\n" +
                "   12 x 2 = 24\n" +
                "   12 x 3 = 36\n" +
                "   12 x 4 = 48\n" +
                "   12 x 5 = 60\n" +
                "   12 x 6 = 72\n" +
                "   12 x 7 = 84\n" +
                "   12 x 8 = 96\n" +
                "   12 x 9 = 108\n" +
                "   12 x 10 = 120\n" +
                "   12 x 11 = 132\n" +
                "   12 x 12 = 144\n");

        TextView t13 = findViewById(R.id.tb13);
        t13.setText("\n    13 times table    \n\n" +
                "   13 x 1 = 13\n" +
                "   13 x 2 = 26\n" +
                "   13 x 3 = 39\n" +
                "   13 x 4 = 52\n" +
                "   13 x 5 = 65\n" +
                "   13 x 6 = 78\n" +
                "   13 x 7 = 91\n" +
                "   13 x 8 = 104\n" +
                "   13 x 9 = 117\n" +
                "   13 x 10= 130\n" +
                "   13 x 11 = 143\n" +
                "   13 x 12 = 156\n");

        TextView t14 = findViewById(R.id.tb14);
        t14.setText("\n    14 times table    \n\n" +
                "   14 x 1 = 14\n" +
                "   14 x 2 = 28\n" +
                "   14 x 3 = 42\n" +
                "   14 x 4 = 56\n" +
                "   14 x 5 = 70\n" +
                "   14 x 6 = 84\n" +
                "   14 x 7 = 98\n" +
                "   14 x 8 = 112\n" +
                "   14 x 9 = 126\n" +
                "   14 x 10= 140\n" +
                "   14 x 11 = 154\n" +
                "   13 x 12 = 168\n");

        TextView t15 = findViewById(R.id.tb15);
        t15.setText("\n    15 times table    \n\n" +
                "   15 x 1 = 15\n" +
                "   15 x 2 = 30\n" +
                "   15 x 3 = 45\n" +
                "   15 x 4 = 60\n" +
                "   15 x 5 = 45\n" +
                "   15 x 6 = 90\n" +
                "   15 x 7 = 105\n" +
                "   15 x 8 = 120\n" +
                "   15 x 9 = 135\n" +
                "   15 x 10= 150\n" +
                "   15 x 11 = 165\n" +
                "   15 x 12 = 180\n");

        TextView t16 = findViewById(R.id.tb16);
        t16.setText("\n    16 times table    \n\n" +
                "   16 x 1 = 16\n" +
                "   16 x 2 = 32\n" +
                "   16 x 3 = 48\n" +
                "   16 x 4 = 64\n" +
                "   16 x 5 = 80\n" +
                "   16 x 6 = 96\n" +
                "   16 x 7 = 112\n" +
                "   16 x 8 = 128\n" +
                "   16 x 9 = 144\n" +
                "   16 x 10= 160\n" +
                "   16 x 11 = 176\n" +
                "   16 x 12 = 192\n");

        TextView t17 = findViewById(R.id.tb17);
        t17.setText("\n    17 times table    \n\n" +
                "   17 x 1 = 17\n" +
                "   17 x 2 = 34\n" +
                "   17 x 3 = 51\n" +
                "   17 x 4 = 68\n" +
                "   17 x 5 = 85\n" +
                "   17 x 6 = 102\n" +
                "   17 x 7 = 119\n" +
                "   17 x 8 = 136\n" +
                "   17 x 9 = 153\n" +
                "   17 x 10= 170\n" +
                "   17 x 11 = 187\n" +
                "   17 x 12 = 204\n");

        TextView t18 = findViewById(R.id.tb18);
        t18.setText("\n    18 times table    \n\n" +
                "   18 x 1 = 18\n" +
                "   18 x 2 = 36\n" +
                "   18 x 3 = 54\n" +
                "   18 x 4 = 72\n" +
                "   18 x 5 = 90\n" +
                "   18 x 6 = 108\n" +
                "   18 x 7 = 126\n" +
                "   18 x 8 = 144\n" +
                "   18 x 9 = 162\n" +
                "   18 x 10= 180\n" +
                "   18 x 11 = 198\n" +
                "   18 x 12 = 216\n");

        TextView t19 = findViewById(R.id.tb19);
        t19.setText("\n    19 times table    \n\n" +
                "   19 x 1 = 19\n" +
                "   19 x 2 = 38\n" +
                "   19 x 3 = 57\n" +
                "   19 x 4 = 76\n" +
                "   19 x 5 = 95\n" +
                "   19 x 6 = 114\n" +
                "   19 x 7 = 133\n" +
                "   19 x 8 = 152\n" +
                "   19 x 9 = 171\n" +
                "   19 x 10= 190\n" +
                "   19 x 11 = 209\n" +
                "   19 x 12 = 228\n");


        TextView t20 = findViewById(R.id.tb20);
        t20.setText("\n    20 times table    \n\n" +
                "   20 x 1 = 20\n" +
                "   20 x 2 = 40\n" +
                "   20 x 3 = 60\n" +
                "   20 x 4 = 80\n" +
                "   20 x 5 = 100\n" +
                "   20 x 6 = 120\n" +
                "   20 x 7 = 140\n" +
                "   20 x 8 = 160\n" +
                "   20 x 9 = 180\n" +
                "   20 x 10= 200\n" +
                "   20 x 11 = 220\n" +
                "   20 x 12 = 240\n");
    }
}