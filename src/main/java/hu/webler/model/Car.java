package hu.webler.model;

public class Car {

    //adattagok (Fields)

    private String brand; // autó márkája
    private int speed; //autó sebessége
    private  double fuel; //autó üzemanyagszintje

    //ha van paraméteres konstruktor a default üres megszűnik létezni, nekünk kell manuálisan megadni

    public Car() {

    }

    //konstruktor
    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
        this.fuel = 100;
    }

    //gyorsítás metódus
    public int accelerate(int amount) {
        this.speed += amount;
        return this.speed;
    }

    //üzemanyagfogyasztás metódus
    public double consumeFuel(double amount) {
        this.fuel -= amount;
        return this.fuel;
    }

    public double refillGasoline(double amount) {
        this.fuel += amount;
        return this.fuel;
    }

    //Getter metódus az adattagoj elérése
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuel;
    }

    //Setter metódus az adattag
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                " brand: " + this.brand  +
                ", speed: " + this.speed  +
                ", fuel: " + this.fuel + "}";
    }
}
