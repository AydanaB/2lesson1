package com.company;

public class Lenovo extends Laptop{

    private int guarantee;
    private int price;
    private Color color;
    private Store store;

    public Lenovo(String name, int year, int guarantee, int price, Store store, Color color) {
        super(name, year);
        this.guarantee = guarantee;
        this.price = price;
        this.store = store;
        this.color = color;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public int getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public Store getStore() {
        return store;
    }

    final void keyboardBacklight(){
        if (price < 450){
            System.out.println("With blue keyboard backlight");
        }else {
            System.out.println("With multicolored keyboard backlight");
        }
    }

    public String getInfo(){
        return "Name: " + getName() +
                "\nYear: " + getYear() +
                "\nGuarantee: " + guarantee + " year" +
                "\nPrice: " + price + "$" +
                "\nCountry: " + store.getCountry() +
                "\nStore name: " + store.getName() +
                "\nColor: " + color;
    }
}
