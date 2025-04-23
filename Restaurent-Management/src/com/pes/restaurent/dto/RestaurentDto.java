package com.pes.restaurent.dto;

public class RestaurentDto {

    private String restaurentName;
    private String ownerName;
    private String specialFoodName;


    public RestaurentDto(){
    }

    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }

    public String getRestaurentName() {
        return restaurentName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setSpecialFoodName(String specialFoodName) {
        this.specialFoodName = specialFoodName;
    }

    public String getSpecialFoodName() {
        return specialFoodName;
    }
}
