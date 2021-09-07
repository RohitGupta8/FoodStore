package com.bridgelabz.fooddeliverysystem.model;

import com.bridgelabz.fooddeliverysystem.model.FoodItems;

public class Manchurian extends FoodItems {
    public  Manchurian(){
        taste= Taste.Tangy;
        category=Category.STARTER;
        type= Type.Veg;
        name="Manchurian";
        quantity=Quantity.full_plate;
        price=90;
    }
}
