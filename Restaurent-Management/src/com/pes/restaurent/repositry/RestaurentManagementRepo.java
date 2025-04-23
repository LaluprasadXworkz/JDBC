package com.pes.restaurent.repositry;

import com.pes.restaurent.dto.RestaurentDto;

public class RestaurentManagementRepo {

    RestaurentDto listOfrestaurentDto[]=new RestaurentDto[5];
    int i=0;
    public void savingRestaurentDetails(RestaurentDto dto){
    listOfrestaurentDto[i]=dto;

//        System.out.println("Restaurent Data saved :"+listOfrestaurentDto[i].getRestaurentName());

    i++;
    }

    public void readRestaurent(){
        for (int i=0;i<listOfrestaurentDto.length;i++) {
            System.out.println(" Restaurent Name :" + listOfrestaurentDto[i].getRestaurentName());
            System.out.println(" Name :" + listOfrestaurentDto[i].getOwnerName());
            System.out.println("special Food :"+listOfrestaurentDto[i].getSpecialFoodName());
            System.out.println("-------------------");
        }
    }


    public void updateOldRestaurentNameToNewRestaurentName(
            String oldRestaurenName,String newRestaurentName){

        for (int i=0;i<listOfrestaurentDto.length;i++){
            if (listOfrestaurentDto[i].getRestaurentName().equals(oldRestaurenName)){
                listOfrestaurentDto[i].setRestaurentName(newRestaurentName);
                System.out.println("Restaurent Name is updated ");
            }else {
                System.out.println("restaurent Name is Not available ");
            }
        }


    }
    public void deleteres(String resname){
        for(int i=0;i< listOfrestaurentDto.length;i++){
            if(listOfrestaurentDto[i].getRestaurentName().equals(resname)){
                listOfrestaurentDto[i]=null;
                System.out.println("restorant deleted");
            }
            else{
                System.out.println("restorant details not found");
            }
        }
    }

}
