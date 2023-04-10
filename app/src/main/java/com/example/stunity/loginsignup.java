package com.example.stunity;

import static com.example.stunity.R.*;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class loginsignup extends AppCompatActivity {
    EditText enternumber;
    Button getotpbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.loginsignup);
        final EditText inputmobile = findViewById(id.input_mobile_number);
        Button buttonGetOTP = findViewById(id.btngetOTP);
        final ProgressBar progressBar;
        progressBar = findViewById(id.progressBar);
        buttonGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputmobile.getText().toString().trim().isEmpty()){
                    Toast.makeText(loginsignup.this, "Enter mobile", Toast.LENGTH_SHORT).show();
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                buttonGetOTP.setVisibility(View.INVISIBLE);
                PhoneAuthProvider.getInstance().verifyPhoneNumber(
                        "+91" + inputmobile.getText().toString(),
                        60,
                        TimeUnit.SECONDS,
                        loginsignup.this,
                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks(){
                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential){
                                progressBar.setVisibility(View.GONE);
                                buttonGetOTP.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                               progressBar.setVisibility(View.GONE);
                               buttonGetOTP.setVisibility(View.VISIBLE);
                               Toast.makeText(loginsignup.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCodeSent(@NonNull String verificationId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                               progressBar.setVisibility(View.GONE);
                               buttonGetOTP.setVisibility(View.VISIBLE);
                                Intent intent = new Intent(getApplicationContext(),Enter_OTP_Activity.class);
                                intent.putExtra("mobile",inputmobile.getText().toString());
                                intent.putExtra("verification",verificationId);
                                startActivity(intent);
                            }
                        }
                );

            }
        });
    }
}