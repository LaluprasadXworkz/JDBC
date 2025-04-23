package com.pes.mobilemanagement;

public class StudentNames {
    public static void main(String[] args) {
        String []studentsNames={"Akash","Anusha","akshay","Nandini","suraj","kruthika","Nithin A B","Shreya","Tushar","Manu","srushti"};
//        System.out.println(studentsNames[0]);
//        System.out.println(studentsNames[1]);
//        System.out.println(studentsNames[2]);
//        System.out.println(studentsNames[3]);
//        System.out.println(studentsNames[4]);
//        System.out.println(studentsNames[5]);

        for (int i=0;i<studentsNames.length;i++){
            System.out.println(studentsNames[i]);
        }
        System.out.println("\n");
        System.out.println("reverse");
        for (int i = studentsNames.length-1; i >0 ; i--) {
            System.out.print(studentsNames[i]+" ");

        }


        String[] names=new String[11];




    }
}
