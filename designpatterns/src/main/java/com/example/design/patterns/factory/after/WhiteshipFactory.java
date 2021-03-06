package com.example.design.patterns.factory.after;

public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
