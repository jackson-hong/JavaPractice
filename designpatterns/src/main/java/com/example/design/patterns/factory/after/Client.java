package com.example.design.patterns.factory.after;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "jackson@gmail.com");
        client.print(new BlackshipFactory(), "blackship", "jackson@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name,email));
    }

}
