package com.example.stunity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;

public class onboarding extends AppCompatActivity {

     EditText edtname;
    EditText edtDepartment;
    EditText edtEmailId;
    EditText submitbtn;
     Spinner spinner1,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
     EditText editText = findViewById(R.id.edtname);
        edtname.setText(R.string.enteryourname);
        EditText editText1 = findViewById(R.id.edtDepartment);
        edtDepartment.setText(R.string.department);
        EditText editText2 = findViewById(R.id.edtCollegeName);
        edtDepartment.setText(R.string.collegename);
        EditText editText3 = findViewById(R.id.edtEmailId);
        edtDepartment.setText(R.string.EmailId);

        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String selectedOption = parent.getItemAtPosition(position).toString();
            }


            public void onNothingSelected() {
                onNothingSelected(null);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

            }

    }

