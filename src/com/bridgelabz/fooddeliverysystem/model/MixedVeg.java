package com.bridgelabz.fooddeliverysystem.model;

import com.bridgelabz.fooddeliverysystem.model.FoodItems;

public class MixedVeg extends FoodItems {
    public MixedVeg(){
        taste=Taste.TANGY_BUTTER_SPICY;
        category=Category.MainCourse;
        type=Type.Veg;
        name="MixedVeg";
        quantity=Quantity.full_plate;
        price=120;
    }
}
