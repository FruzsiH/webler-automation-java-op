package hu.webler;

import hu.webler.model.Car;

import java.sql.SQLOutput;
import java.util.Scanner;

public class opApp {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        Car opel = new Car("Opel");
        System.out.println(opel);

        String brand = opel.getBrand();
        System.out.println(brand);
        String newBrand = "BMW";
        opel.setBrand(newBrand);
        System.out.println(opel);
        opel.setSpeed(160);
        System.out.println(opel);
        opel.setSpeed(0);
        System.out.println(opel);
        int increasedSpeed = opel.accelerate(123);
        System.out.println("Gyorsulás! A sebesség: " + increasedSpeed);
        System.out.println(opel);
        System.out.println("Elindultunk kirándulni, x km után a benzin fogy.");
        double amount = 50;
        double decreaseFuel = opel.consumeFuel(amount);
        System.out.println("ELfogyott benzin mértéke: " + amount + "maradék benzin: " + decreaseFuel);
        System.out.println(opel);
        System.out.println(car);
        amount = 22.5;
        double increasedCarFuel = car.refillGasoline(amount);
        System.out.println("Tankolunk ennyi litert: " + amount + "és a tank itt állt: " + increasedCarFuel);
        amount = 11.32;
        double increasedOpelFuel = opel.refillGasoline(amount);
        System.out.println("Töltöttünk benzint a BMW típusú Opelünkbe :) mennyisége: " + amount + "és a tank itt állt: " + increasedOpelFuel);
        System.out.println(car);
        System.out.println(opel);
    }
}
