package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("Model is " +porsche.getModel());

        porsche.setModel("Carrera");
        holden.setModel("KW-2");
        System.out.println("Model is " +porsche.getModel());
        System.out.println(holden.getModel());


    }
}
