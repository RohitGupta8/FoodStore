package com.bridgelabz.fooddeliverysystem.model;

import com.bridgelabz.fooddeliverysystem.model.FoodItems;

public class Momos extends FoodItems {
    public Momos(){
        taste=Taste.TANGY_BUTTER_SPICY;
        category=Category.STARTER;
        type=Type.Veg;
        name="Momos";
        quantity=Quantity.full_plate;
        price=90;
    }
}
