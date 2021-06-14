package com.example.mridularamakrishnan_comp304sec002_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
    //initialising null values
    RadioButton creditRbtn = null;
    RadioButton debitRbtn = null;
    RadioButton cashRbtn = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //Radio button handling events
        RadioGroup radioGroup = findViewById(R.id.paymentRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                debitRbtn = findViewById(R.id.rbtnDebit);
                creditRbtn = findViewById(R.id.rbtnCredit);
                cashRbtn = findViewById(R.id.rbtnCash);


            }
        });
    }

    public void continuetoCustomerinfo(View view) {

        if ((debitRbtn.isChecked() && debitRbtn != null) || ((creditRbtn.isChecked() && creditRbtn != null))) {

            Intent intent = new Intent(PaymentActivity.this, CustomerActivity.class);
            startActivity(intent);
        }
    }
}




