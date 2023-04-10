package com.example.stunity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ThisisTopic1Activity extends AppCompatActivity {
        CardView cardview1,cardview2,cardview3,cardview4;
        TextView textview1,textview2,textview3,textview4;
        ImageView image1,image2,image3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thisis_topic1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textview1 = findViewById(R.id.textview1);
        textview1.setText(R.string.write_yours);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textview2 = findViewById(R.id.textview2);
        textview2.setText(R.string.thisistopic1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textview3 = findViewById(R.id.textview3);
        textview3.setText(R.string.greatdiscussion);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textview4 = findViewById(R.id.textview4);
        textview4.setText(R.string.goodtopic);
             @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardview1 = findViewById(R.id.cardview1);
             cardview1.setCardBackgroundColor(Color.WHITE);
               cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardview2 = findViewById(R.id.cardview1);
        cardview2.setCardBackgroundColor(Color.WHITE);
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardview3 = findViewById(R.id.cardview3);
        cardview3.setCardBackgroundColor(Color.WHITE);
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardview4 = findViewById(R.id.cardview4);
        cardview4.setCardBackgroundColor(Color.WHITE);
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
      image1 = findViewById(R.id.image1);
      image1.setImageResource(R.drawable.baseline_create_24);

        image2 = findViewById(R.id.image2);
        image2.setImageResource(R.drawable.baseline_person_24);

        image3 = findViewById(R.id.image3);
        image3.setImageResource(R.drawable.baseline_person_24);
    }
}