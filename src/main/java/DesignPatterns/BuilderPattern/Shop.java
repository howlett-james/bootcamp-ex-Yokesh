package DesignPatterns.BuilderPattern;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder()
                .setOs("android")
                .setProcessor("Qualcomm")
                .setRam(8)
                .setBattery(6000)
                .setScreenSize(6.5)
                .getPhone();
        System.out.println(p);
    }
}