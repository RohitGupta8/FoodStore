package com.bridgelabz.fooddeliverysystem.model;

public class ChilliPotato extends FoodItems {
    public ChilliPotato(){
        taste=Taste.SPICY;
        category=Category.STARTER;
        type=Type.Veg;
        name="ChilliPotato";
        quantity=Quantity.full_plate;
        price=90;
    }
}
