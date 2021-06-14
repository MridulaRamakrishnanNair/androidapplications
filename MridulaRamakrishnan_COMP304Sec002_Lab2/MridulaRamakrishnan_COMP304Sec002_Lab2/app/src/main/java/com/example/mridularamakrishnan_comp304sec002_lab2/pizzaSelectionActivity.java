package com.example.mridularamakrishnan_comp304sec002_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class pizzaSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_selection);
        TextView textView = (TextView) findViewById(R.id.pizzaitemSelection);
        //for context view
        registerForContextMenu(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pizza_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent();
        switch(item.getItemId()){
            case R.id.canadianpizza:
                intent =  new Intent(pizzaSelectionActivity.this,CanadianpizzaActivity.class);
                break;
            case R.id.chickenceaser:
                intent =  new Intent(pizzaSelectionActivity.this,ChickenceaserActivity.class);
                break;
            case R.id.hawaiianpizza:
                intent =  new Intent(pizzaSelectionActivity.this,HawaiianpizzaActivity.class);
                break;
            case R.id.smokeymaplebacon:
                intent =  new Intent(pizzaSelectionActivity.this,SmokeymaplebaconActivity.class);
                break;
            case R.id.veggielovers:
                intent =  new Intent(pizzaSelectionActivity.this,VeggieloversActivity.class);
                break;
        }
        startActivity(intent);
        return true;
    }



    }
