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

public class SmokeymaplebaconActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smokeymaplebacon);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.pizza_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent();
        switch(item.getItemId()){
            case R.id.canadianpizza:
                intent =  new Intent(SmokeymaplebaconActivity.this,CanadianpizzaActivity.class);
                break;
            case R.id.chickenceaser:
                intent =  new Intent(SmokeymaplebaconActivity.this,ChickenceaserActivity.class);
                break;
            case R.id.hawaiianpizza:
                intent =  new Intent(SmokeymaplebaconActivity.this,HawaiianpizzaActivity.class);
                break;
            case R.id.smokeymaplebacon:
                intent =  new Intent(SmokeymaplebaconActivity.this,SmokeymaplebaconActivity.class);
                break;
            case R.id.veggielovers:
                intent =  new Intent(SmokeymaplebaconActivity.this,VeggieloversActivity.class);
                break;
        }
        startActivity(intent);
        return true;
    }

    public void proceedbutton(View view) {
        CheckBox chkBox = (CheckBox) findViewById(R.id.checkboxSmokeymaplepizza);
        if(chkBox.isChecked()){
            SharedPreferences sharedPreferences = getSharedPreferences("pizzaName",0);
            SharedPreferences.Editor prefEditor = sharedPreferences.edit();
            prefEditor.putString("name","Smoky Maple Bacon Pizza");
            prefEditor.commit();
            Intent intent =  new Intent(SmokeymaplebaconActivity.this,sizevaluesActivity.class);
            startActivity(intent);
        }
    }

    public void onSmokeymaplepizzaClick(View view) {

    }
}