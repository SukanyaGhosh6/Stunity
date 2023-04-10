package com.example.stunity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FindFriendScreenActivity extends AppCompatActivity {
    CardView card1,card2,card3,card4;
    ImageView imagep1,imagep2,imagep3,imagep4;
    TextView txtMrXYZ,txtcse,txtcivil,txtmech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_friend_screen);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imagep1 = findViewById(R.id.imagep1);
        imagep1.setOnClickListener(view -> {

        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imagep2 = findViewById(R.id.imagep2);
        imagep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imagep3 = findViewById(R.id.imagep3);
        imagep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imagep4 = findViewById(R.id.imagep4);
        imagep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMrXYZ = findViewById(R.id.txtMrXYZ);
        txtMrXYZ.setText(R.string.mrxyz);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtcse = findViewById(R.id.txtcse);
        txtcse.setText(R.string.mrxyzcse);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtcivil = findViewById(R.id.txtcivil);
        txtcivil.setText(R.string.civil);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtmech = findViewById(R.id.txtmech);
        txtmech.setText(R.string.mechanical);

    }
}