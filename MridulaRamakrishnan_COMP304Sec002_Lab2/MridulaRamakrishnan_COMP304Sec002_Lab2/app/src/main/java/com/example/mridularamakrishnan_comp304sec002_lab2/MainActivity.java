package com.example.mridularamakrishnan_comp304sec002_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//creating intent from home page to next page
    public void btnOrder(View view) {
        if (view.getId() == R.id.btnOrder) {
            Intent intent = new Intent(MainActivity.this, pizzaSelectionActivity.class);
            startActivity(intent);
        }
    }
}