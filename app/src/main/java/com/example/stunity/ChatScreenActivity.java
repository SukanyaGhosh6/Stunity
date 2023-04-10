package com.example.stunity;

import static com.example.stunity.R.*;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ChatScreenActivity extends AppCompatActivity {
    CardView cardchatandmore, cardfindafriend, awesome1, cardawesome;
    TextView txt1, txtfindafriend, txtawesome, txtawesome2;
    ImageView imageperson, imageperson1, imageperson2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_chat_screen);
        CardView cardchatandmore = findViewById(id.cardchatandmore);
        cardchatandmore.setOnClickListener(view -> {

        });
        CardView cardfindafriend = findViewById(id.cardfindafriend);
        cardfindafriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        CardView awesome1 = findViewById(id.awesome1);
        awesome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        CardView cardawesome = findViewById(id.cardawesome);
        cardawesome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        TextView txt1 = findViewById(id.txt1);
        txt1.setText(string.chatandmore);
        txt1.setTextColor(Color.BLACK);
        TextView txtfindafriend = findViewById(id.txtfindafriend);
        txtfindafriend.setText(string.findafriend);
        txtfindafriend.setTextColor(Color.BLACK);
        TextView txtawesome = findViewById(id.txtawesome);
        txtawesome.setText(string.great);
        txtawesome.setTextColor(Color.BLACK);
        TextView txtawesome2 = findViewById(id.txtawesome2);
        txtawesome2.setText(string.complements);
        ImageView imageperson = findViewById(id.imageperson);
        imageperson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ImageView imageperson1 = findViewById(id.imageperson1);
        imageperson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
       @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageperson2 = findViewById(id.imageperson2) ;
       imageperson2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });
    }
}