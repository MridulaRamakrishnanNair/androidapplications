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

public class HawaiianpizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hawaiianpizza);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.pizza_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent();
        switch(item.getItemId()){
            case R.id.canadianpizza:
                intent =  new Intent(HawaiianpizzaActivity.this,CanadianpizzaActivity.class);
                break;
            case R.id.chickenceaser:
                intent =  new Intent(HawaiianpizzaActivity.this,ChickenceaserActivity.class);
                break;
            case R.id.hawaiianpizza:
                intent =  new Intent(HawaiianpizzaActivity.this,HawaiianpizzaActivity.class);
                break;
            case R.id.smokeymaplebacon:
                intent =  new Intent(HawaiianpizzaActivity.this,SmokeymaplebaconActivity.class);
                break;
            case R.id.veggielovers:
                intent =  new Intent(HawaiianpizzaActivity.this,VeggieloversActivity.class);
                break;
        }
        startActivity(intent);
        return true;
    }

    public void proceedbutton(View view) {
        CheckBox chkBox = (CheckBox) findViewById(R.id.checkboxHawaiianpizza);
        if(chkBox.isChecked()){
            SharedPreferences sharedPref = getSharedPreferences("pizzaName",0);
            SharedPreferences.Editor preferencesEditor = sharedPref.edit();
            preferencesEditor.putString("name","Hawaiian Pizza");
            preferencesEditor.commit();
            Intent intent =  new Intent(HawaiianpizzaActivity.this,sizevaluesActivity.class);
            startActivity(intent);
        }
    }

    public void onHawaiianpizzaClick(View view) {

    }
}