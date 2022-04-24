package com.example.design.patterns.factory.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

//        Ship blackship = WhiteshipFactory.orderShip("Blackship", "keesun@mail.com");
//        System.out.println(blackship);
    }

}
