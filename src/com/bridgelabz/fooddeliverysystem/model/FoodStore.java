package com.bridgelabz.fooddeliverysystem.model;

import com.bridgelabz.fooddeliverysystem.model.FoodItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// this is data layer/model layer
public class FoodStore {
   private final List<FoodItems> foodList = new ArrayList<> ();

    public void add ( FoodItems foodItems ) {
        foodList.add ( foodItems );
    }

    public List<FoodItems> getList () {
        return foodList;
    }

    public void remove ( String foodName ) {
        for (int i = 0; i < foodList.size(); i++) {
            if (Objects.equals(foodName, foodList.get(i).name))
            {
                foodList.remove(foodList.get(i));
            }
            else System.out.println("The name entered is incorrect.");
        }
    }
}
