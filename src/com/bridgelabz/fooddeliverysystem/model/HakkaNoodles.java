package com.bridgelabz.fooddeliverysystem.model;

import com.bridgelabz.fooddeliverysystem.model.FoodItems;

public class HakkaNoodles extends FoodItems {
    public HakkaNoodles (){
        taste=Taste.Salty_Spicey;
        category= Category.STARTER;
        type= Type.Veg;
        name="HakkaNoodles";
        quantity=Quantity.full_plate;
        price=120;
    }
}
