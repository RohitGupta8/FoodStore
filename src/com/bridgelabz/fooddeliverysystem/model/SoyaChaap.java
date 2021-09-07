package com.bridgelabz.fooddeliverysystem.model;

import com.bridgelabz.fooddeliverysystem.model.FoodItems;

public class SoyaChaap extends FoodItems {
    public SoyaChaap (){
        taste=Taste.TANGY_BUTTER_SPICY;
        category=Category.STARTER;
        type=Type.Veg;
        name="SoyaChaap";
        quantity=Quantity.full_plate;
        price=80;
    }
}
