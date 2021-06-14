package com.example.mridularamakrishnan_comp304sec002_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class sizevaluesActivity extends AppCompatActivity {
       String crust_thickness =null;
       String pizza_size = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sizevalues);


//handling radio buttons of types of crust
        RadioGroup radioGroup = findViewById(R.id.rbGrp);
        // method for radio button selection handling
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton thinBtn = findViewById(R.id.rbtnThin);
                RadioButton thickBtn  = findViewById(R.id.rbtnThin);

                if(thickBtn.isChecked()){
                    crust_thickness = "Thick";
                }else if(thinBtn.isChecked()){
                    crust_thickness = "Thin";
                }
            }
        });
    }

    public void btnCheckout(View view) {
        SharedPreferences sharedPref = getSharedPreferences("pizzaType",0);
        SharedPreferences.Editor prefEditor = sharedPref.edit();
        Spinner spinner = (Spinner)findViewById(R.id.pizzaSizespinner);
        pizza_size = spinner.getSelectedItem().toString();
        if(spinner!= null) {
            pizza_size = spinner.getSelectedItem().toString();
            if (pizza_size.equalsIgnoreCase("Choose your pizza size")) {
                pizza_size = null;
            }
        }
        prefEditor.putString("size",pizza_size);
        prefEditor.putString("crust",crust_thickness);
        prefEditor.commit();
        if(pizza_size!= null  && crust_thickness!=null){
            Intent intent =  new Intent(sizevaluesActivity.this,checkOutActivity.class);
            startActivity(intent);
        }
    }

}




