package com.example.stunity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class NewTopicScreenActivity extends AppCompatActivity {
        CardView cardwritenewtopic,cardnewtopics,carddepartment;
        TextView txtnewtopic1,txtnewtopic2;
        EditText edtDepartment;
        Spinner spinner3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_topic_screen);
        Button btnsubmit1 = findViewById(R.id.btnSubmit);
        btnsubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        CardView cardwritenewtopic = findViewById(R.id.cardwritenewtopic);
        cardwritenewtopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        CardView cardnewtopics = findViewById(R.id.cardnewtopics);
        cardnewtopics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        CardView carddepartment = findViewById(R.id.carddepartment);
        carddepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        TextView txtnewtopic1 = findViewById(R.id.txtnewtopic1);
        txtnewtopic1.setText(R.string.writenewtopic);

        TextView txtnewtopic2 = findViewById(R.id.txtnewtopic2);
        txtnewtopic2.setText(R.string.writenewtopic);



        EditText edtDepartment = findViewById(R.id.edtDepartment);
        edtDepartment.setText(R.string.Department);
        edtDepartment.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(NewTopicScreenActivity.this, "select your dpartment", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        Spinner spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);



    }
            }

