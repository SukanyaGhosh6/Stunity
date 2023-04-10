package com.example.stunity;

import static com.example.stunity.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TopicScreenActivity extends AppCompatActivity {
CardView cardview1,cardview2,cardview3,cardview4;
TextView textview1,textview2,textview3,textview4;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_topic_screen);
       @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardView1 = findViewById(id.cardview1);
       cardView1.setCardBackgroundColor(Color.WHITE);
       @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardView2 = findViewById(id.cardview2);
       cardView2.setCardBackgroundColor(Color.WHITE);
       @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardView3 = findViewById(id.cardview3);
       cardView3.setCardBackgroundColor(Color.WHITE);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardView4 = findViewById(id.cardview4);
        cardView4.setCardBackgroundColor(Color.WHITE);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textview1 = findViewById(id.textview1);
        textview1.setText(string.Topic1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textview2 = findViewById(id.textview2);
        textview2.setText(string.Topic2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textview3 = findViewById(id.textview3);
        textview3.setText(string.Topic3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView4 = findViewById(id.textview4);
        textview4.setText(string.Topic4);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView1 = findViewById(id.imageview);
        imageView1.setImageResource(R.drawable.baseline_create_24);



    }
}