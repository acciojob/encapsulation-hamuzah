package com.driver;

public class Main {

    public static void main(String [] args){
        RWOnly obj = new RWOnly();
        //obj.name = "hamzah";
        //if i try to access the name variable directly it will throw an error since it is accessed by everyone
        System.out.println("Error variable is not accessed by the public since its a private member variable");

        obj.setName("hamzah");
       System.out.println(obj.getName());
    }
  
}