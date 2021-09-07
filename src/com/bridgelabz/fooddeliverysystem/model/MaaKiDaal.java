package com.bridgelabz.fooddeliverysystem.model;

import com.bridgelabz.fooddeliverysystem.model.FoodItems;

public class MaaKiDaal extends FoodItems {
    public MaaKiDaal (){
        taste=Taste.Butter_Spicey;
        category=Category.MainCourse;
        type=Type.Veg;
        name="Maa ki Daal";
        quantity=Quantity.full_plate;
        price=150;
    }
}
