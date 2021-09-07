package com.bridgelabz.fooddeliverysystem.model;

public class AppleJuice extends FoodItems {
    public AppleJuice(){
        taste=Taste.SWEET;
        category=Category.STARTER;
        type=Type.Veg;
        name="AppleJuice";
        quantity=Quantity.full_glass;
        price=75;
    }
}
