package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView licznik;
    private Button Polub, Dislike;
    private int likeCount = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        licznik = findViewById(R.id.licznik);
        Polub = findViewById(R.id.Polub);
        Dislike = findViewById(R.id.Dislike);

        Polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++;
                updatelicznik();
            }
        });

        Dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likeCount > 0) {
                    likeCount--;
                }
                updatelicznik();
            }
        });
    }

    private void updatelicznik() {
        licznik.setText(likeCount + " polubień");
    }
}