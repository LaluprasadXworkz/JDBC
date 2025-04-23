package com.pes.mobilemanagement;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        int a=25;
        int b=30;
        add(a,b);
        sub(a,b);
        Mul(a,b);
        div(a,b);
    }
    public static void add(int x,int b){
        int c=x+b;
        System.out.println("Sum :"+c);
    }
    public static void sub(int x,int b){
        int c=x-b;
        System.out.println("sub :"+c);
    }
    public static void Mul(int a,int b){
        int c=a*b;
        System.out.println("Multiplication:"+c);
    }
    public static void div(int a,int b){
        int c=b/a;
        System.out.println("div:"+c);
    }
}
