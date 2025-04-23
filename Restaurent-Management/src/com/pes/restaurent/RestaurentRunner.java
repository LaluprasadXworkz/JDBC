package com.pes.restaurent;

import com.pes.restaurent.dto.RestaurentDto;
import com.pes.restaurent.repositry.RestaurentManagementRepo;

public class RestaurentRunner {
    public static void main(String[] args) {
        RestaurentDto firstRestaurentDto=new RestaurentDto();
        firstRestaurentDto.setRestaurentName("Malnad Gateway");
        firstRestaurentDto.setOwnerName("Sinchana");
        firstRestaurentDto.setSpecialFoodName("Dosa");
        RestaurentDto secondRestaurantDto=new RestaurentDto();
        secondRestaurantDto.setRestaurentName("Shubham");
        secondRestaurantDto.setOwnerName("Bhoomika");
        secondRestaurantDto.setSpecialFoodName("Chicken Biriyani");

        RestaurentDto thirdRestaurentDto=new RestaurentDto();
        thirdRestaurentDto.setRestaurentName("AFC");
        thirdRestaurentDto.setOwnerName("Uday p");
        thirdRestaurentDto.setSpecialFoodName("Mutton biriyani");
        RestaurentDto fourthRestaurentDto=new RestaurentDto();
        fourthRestaurentDto.setRestaurentName("XYZ");
        fourthRestaurentDto.setOwnerName("Dev");
        fourthRestaurentDto.setSpecialFoodName("Veg Biryani");
        RestaurentDto fifththRestaurentDto=new RestaurentDto();
        fifththRestaurentDto.setRestaurentName("isiri");
        fifththRestaurentDto.setOwnerName("srusti");
        fifththRestaurentDto.setSpecialFoodName("palak paneer");



       RestaurentManagementRepo repo= new RestaurentManagementRepo();
       repo.savingRestaurentDetails(firstRestaurentDto);
       repo.savingRestaurentDetails(secondRestaurantDto);
       repo.savingRestaurentDetails(thirdRestaurentDto);
       repo.savingRestaurentDetails(fourthRestaurentDto);
       repo.savingRestaurentDetails(fifththRestaurentDto);
//       repo.readRestaurent();
        repo.updateOldRestaurentNameToNewRestaurentName("qwertyuio","pes ");
        repo.readRestaurent();
        repo.deleteres("XYZ");
        repo.readRestaurent();

    }
}
