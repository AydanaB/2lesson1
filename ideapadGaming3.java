package com.company;

public final class ideapadGaming3 extends Lenovo {

    private String processor;

    public ideapadGaming3(String name, int year, int guarantee, int price, Store store, Color color, String processor) {
        super(name, year, guarantee, price, store, color);
        this.processor = processor;
    }


    @Override
    public String getInfo() {
        if (getYear() >= 2019){
            return super.getInfo() +
                    "\nProcessor: " + processor + " 11300H";
        }else {
            return super.getInfo() +
                    "\nProcessor: " + processor;
        }
    }

    public String getProcessor() {
        return processor;
    }
}
