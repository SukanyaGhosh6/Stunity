package com.example.stunity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FeedbackActivity extends AppCompatActivity {
        CardView cardopinion,cardfeedback;
        TextView txtopinion;
        EditText editfeedback;
        Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardopinion = findViewById(R.id.cardopinion);
        cardopinion.setOnClickListener(view -> {

        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardfeedback = findViewById(R.id.cardfeedback);
        cardfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtopinion = findViewById(R.id.txtopinion);
        txtopinion.setText(R.string.writeopinion);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText editfeedback = (EditText) findViewById(R.id.editfeedback);
        String text = editfeedback.getText().toString();
        editfeedback.setText(R.string.feedback);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}