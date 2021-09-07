package com.bridgelabz.fooddeliverysystem.model;

public class FoodItems {
    enum Taste {SWEET, SOUR, SPICY, BITTER,Tangy,SALTY,TANGY_BUTTER_SPICY,Butterly_Creamy_Tangy,Butter_Spicey,Salty_Spicey};
    enum Category {STARTER, JUICES, MainCourse,DESERT,BREAD,Juicy_Tangy_Salty};
    enum Type {Veg, NonVeg};
    enum Quantity{ full_plate,Half_plate,one,two,three,full_glass,half_glass};
    protected String name;
    protected Taste taste;
    protected Category category;
    protected Type type;
    protected Quantity quantity;
    protected int price;

    public int getPrice(){
        return price;
    }
    public void setPrice ( int price){
        this.price=price;
    }

    @Override
    public String toString () {
        return "------------------------\n" +
                " Name: '" + name + '\'' +
                "\n Taste: " + taste +
                "\n Category: " + category +
                "\n Type: " + type +
                "\n Quantity: " + quantity +
                "\n price: Rs." + price +
                "\n -------------------------";
    }
}
