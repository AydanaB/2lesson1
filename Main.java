package com.company;

public class Main {

    public static void main(String[] args) {

        Store store = new Store("Coco", "Berlin");
        Lenovo lenovo = new Lenovo("Lenovo", 2018, 1, 300, store, Color.BLACK);
        System.out.println(lenovo.getInfo());
        lenovo.keyboardBacklight();
        System.out.println("-----------------------");

        ideapadGaming3 ideapadGaming3 = new ideapadGaming3("Ideapad Gaming3", 2017,
                1, 450, store, Color.WHITE, "Core i3");
        System.out.println(ideapadGaming3.getInfo());
        ideapadGaming3.keyboardBacklight();
        System.out.println("-------------------------");

        ideapadGaming3 ideapadGaming31 =new ideapadGaming3("Lenovo Gaming5", 2020,
                1, 500, store, Color.GOLDEN, "Core i7");
        System.out.println(ideapadGaming31.getInfo());
        ideapadGaming31.keyboardBacklight();
    }
}

