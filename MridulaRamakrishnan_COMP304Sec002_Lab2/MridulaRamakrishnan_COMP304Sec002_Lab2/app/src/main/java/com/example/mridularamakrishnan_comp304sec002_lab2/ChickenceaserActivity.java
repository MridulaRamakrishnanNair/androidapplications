package com.example.mridularamakrishnan_comp304sec002_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ChickenceaserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chickenceaser);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pizza_menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent();
        switch(item.getItemId()){
            case R.id.canadianpizza:
                intent =  new Intent(ChickenceaserActivity.this,CanadianpizzaActivity.class);
                break;
            case R.id.chickenceaser:
                intent =  new Intent(ChickenceaserActivity.this,ChickenceaserActivity.class);
                break;
            case R.id.hawaiianpizza:
                intent =  new Intent(ChickenceaserActivity.this,HawaiianpizzaActivity.class);
                break;
            case R.id.smokeymaplebacon:
                intent =  new Intent(ChickenceaserActivity.this,SmokeymaplebaconActivity.class);
                break;
            case R.id.veggielovers:
                intent =  new Intent(ChickenceaserActivity.this,VeggieloversActivity.class);
                break;
        }
        startActivity(intent);
        return true;
    }
    public void proceedbutton(View view) {
        CheckBox chkBox = (CheckBox) findViewById(R.id.checkboxCeaserpizza);
        if(chkBox.isChecked()){
            SharedPreferences sharedPref = getSharedPreferences("CeaserPizza",0);
            SharedPreferences.Editor preferencesEditor = sharedPref.edit();
            preferencesEditor.putString("name","Chicken Ceaser Pizza");
            preferencesEditor.commit();
            Intent intent =  new Intent(ChickenceaserActivity.this,sizevaluesActivity.class);
            startActivity(intent);
        }

    }

    public void onCeaserpizzaClick(View view) {

    }
}