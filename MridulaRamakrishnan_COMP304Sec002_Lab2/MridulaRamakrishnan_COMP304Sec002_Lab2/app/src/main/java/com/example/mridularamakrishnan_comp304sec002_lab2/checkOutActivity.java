package com.example.mridularamakrishnan_comp304sec002_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class checkOutActivity extends AppCompatActivity {
    int total_amount =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        SharedPreferences pizzaType = getSharedPreferences("pizzaType",0);
        SharedPreferences pizzaName = getSharedPreferences("pizzaName",0);
        TextView textView = findViewById(R.id.infoMessage);
        textView.setText("");
        String infoMessage= "";
        int thincrustPrice = 1;
        int thickcrustPrice = 5;
        int price = 0;
        String pizzaNameValue = pizzaName.getString("name",null);
        //using if-else condition to determine price of pizza the user selects

        if("Canadian Pizza".equalsIgnoreCase(pizzaNameValue)){
            infoMessage =infoMessage + "Pizza: "+pizzaName.getString("name",null)+"\nSize:"+pizzaType.getString("size","")+
                    "\nCrust: "+pizzaType.getString("crust","")+"\nToppings: "+
                    "Bacon Crumble, Pepperoni, Sliced Mushrooms, Mozzarella"+"\nPrice: $";
            if(null!=pizzaType.getString("size",null)){
                String size = pizzaType.getString("size","");
                if(size.equalsIgnoreCase("Small")){
                    price = price + 5;
                }else if (size.equalsIgnoreCase("Medium")){
                    price = price + 10;
                }else if (size.equalsIgnoreCase("Large")){
                    price = price + 15;
                }else if (size.equalsIgnoreCase("Extra-Large")){
                    price = price + 20;
                }

                if("Thin".equalsIgnoreCase(pizzaType.getString("crust",""))){
                    price =thincrustPrice + price;
                }else{
                    price = thickcrustPrice + price;
                }
            }
            total_amount = total_amount + price;
            infoMessage = infoMessage+price+"\n";
        }else  if("Chicken Ceaser Pizza".equalsIgnoreCase(pizzaNameValue)){
            infoMessage =infoMessage+ "Pizza: "+pizzaName.getString("name",null)+"\nSize:"+pizzaType.getString("size","")+
                    "\nCrust: "+pizzaType.getString("crust","")+"\nToppings: "+
                    "Pineapple,Cheese,Ham,Bacon,Green Olives"+"\nPrice: $";
            if(null!=pizzaType.getString("size",null)){
                String size = pizzaType.getString("size","");
                price = 0;
                if(size.equalsIgnoreCase("Small")){
                    price = price + 8;
                }else if (size.equalsIgnoreCase("Medium")){
                    price = price + 12;
                }else if (size.equalsIgnoreCase("Large")){
                    price = price + 16;
                }else if (size.equalsIgnoreCase("Extra-Large")){
                    price = price + 20;
                }

                if("Thin".equalsIgnoreCase(pizzaType.getString("crust",""))){
                    price =thincrustPrice + price;
                }else{
                    price =thickcrustPrice + price;
                }
            }
            total_amount = total_amount + price;
            infoMessage = infoMessage+price+"\n";
        }else  if("Hawaiian Pizza".equalsIgnoreCase(pizzaNameValue)){
            infoMessage =infoMessage+ "Pizza: "+pizzaName.getString("name",null)+"\nSize:"+pizzaType.getString("size","")+
                    "\nCrust: "+pizzaType.getString("crust","")+"\nToppings: "+
                    "Jalapeno, Tomato,Onion,grilled chicken,Cheddar cheese"+"\nPrice: $";
            if(null!=pizzaType.getString("size",null)){
                String size = pizzaType.getString("size","");
                price = 0;
                if(size.equalsIgnoreCase("Small")){
                    price = price + 10;
                }else if (size.equalsIgnoreCase( "Medium")){
                    price = price + 15;
                }else if (size.equalsIgnoreCase("Large")){
                    price = price + 20;
                }else if (size.equalsIgnoreCase( "Extra-Large")){
                    price = price + 25;
                }

                if("Thin".equalsIgnoreCase(pizzaType.getString("crust",""))){
                    price =thincrustPrice + price;
                }else{
                    price = thickcrustPrice + price;
                }
            }
            total_amount = total_amount + price;
            infoMessage = infoMessage+price+"\n";
        }else  if("Smoky Maple Bacon Pizza".equalsIgnoreCase(pizzaNameValue)){
            infoMessage =infoMessage+ "Pizza: "+pizzaName.getString("name",null)+"\nSize:"+pizzaType.getString("size","")+
                    "\nCrust: "+pizzaType.getString("crust","")+"\nToppings: "+
                    "Bacon,Pizza Sauce,garlic,Black Olives"+"\nPrice: $";
            if(null!=pizzaType.getString("size",null)){
                String size = pizzaType.getString("size","");
                price = 0;
                if(size.equalsIgnoreCase("Small")){
                    price = price + 7;
                }else if (size.equalsIgnoreCase("Medium")){
                    price = price + 10;
                }else if (size.equalsIgnoreCase("Large")){
                    price = price + 13;
                }else if (size.equalsIgnoreCase( "Extra-Large")){
                    price = price + 16;
                }

                if("Thin".equalsIgnoreCase(pizzaType.getString("crust",""))){
                    price =thincrustPrice + price;
                }else{
                    price = thickcrustPrice;
                }
            }
            total_amount = total_amount + price;
            infoMessage = infoMessage+price+"\n";
        }else  if("Veggie Lover's Pizza".equalsIgnoreCase(pizzaNameValue)){
            infoMessage =infoMessage+ "Pizza: "+pizzaName.getString("name",null)+"\nSize:"+pizzaType.getString("size","")+
                    "\nCrust: "+pizzaType.getString("crust","")+"\nToppings: "+
                    "Broccoli,Mushrooms,Green Olives, Sweet corn, Banana peppers"+"\nPrice: $";
            if(null!=pizzaType.getString("size",null)){
                String size = pizzaType.getString("size","");
                price = 0;
                if(size.equalsIgnoreCase("Small")){
                    price = price + 4;
                }else if (size.equalsIgnoreCase( "Medium")){
                    price = price + 8;
                }else if (size.equalsIgnoreCase("Large")){
                    price = price + 12;
                }else if (size.equalsIgnoreCase( "Extra-Large")){
                    price = price + 16;
                }

                if("Thin".equalsIgnoreCase(pizzaType.getString("crust",""))){
                    price = thincrustPrice + price;
                }else{
                    price = thickcrustPrice + price;
                }
            }
            total_amount = total_amount + price;
            infoMessage = infoMessage+price+"\n";
        }
        infoMessage = infoMessage +"\n \nYour total amout is $"+total_amount;
        textView.setText(infoMessage);
        SharedPreferences sharedPreferences = getSharedPreferences("totalPrice",0);
        SharedPreferences.Editor prefEditor = sharedPreferences.edit();
        prefEditor.putString("totalPrice",total_amount+"");
        prefEditor.commit();
    }
//intent to next page
    public void continuebutton(View view) {

        Intent intent =  new Intent(checkOutActivity.this,PaymentActivity.class);
        startActivity(intent);

    }
    }
