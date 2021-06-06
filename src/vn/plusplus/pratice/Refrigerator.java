package vn.plusplus.pratice;

import java.util.Scanner;

public class Refrigerator {
    public int eggNumber;
    public int litter;
    public String serialNumber;
    public String color;
    public int price;
    public Refrigerator(){
    }
    public Refrigerator(int eggNumber, int litter, String serialNumber, String color, int price){
        this.eggNumber = eggNumber;
        this.litter = litter;
        this.color = color;
        this.serialNumber = serialNumber;
        this.color = color;
        this.price = price;
    }
    // or public Refrigerator for typeData
    public void setEggNumber(int input) {
        if(input>0){
        this.eggNumber = input;
        }
    }
    public int getEggNumber() {
        return eggNumber;
    }
    public void setLitter(int input) {
        if(input>0){
            this.litter = input;
        }
    }
    public int getLitter() {
        return litter;
    }
    public void setSerialNumber(String input) {
        if(input != " " && input.length() == 16){
            this.serialNumber = input;
        }
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setColor(String input) {
        this.color = input;
    }
    public String getColor() {
        return color;
    }
    public void setPrice(int input) {
        this.price = input;
    }
    public int getPrice() {
        return price;
    }

    public void inputInformation(){
        Scanner inp = new Scanner(System.in);
        System.out.print("EggNumber: ");
        eggNumber = inp.nextInt();
        System.out.print("Litter: ");
        litter = inp.nextInt();
        System.out.print("SerialNum: ");
        serialNumber = inp.next();
        System.out.print("Color: ");
        color = inp.next();
        System.out.print("Price: ");
        price = inp.nextInt();
    }
    public void printInfo(){
        System.out.println("EggNumber:    "+eggNumber);
        System.out.println("Litter:       "+litter);
        System.out.println("Color:        "+color);
        System.out.println("SerialNumber: "+serialNumber);
        System.out.println("Price:        "+price);
    }
}
