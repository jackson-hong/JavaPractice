package com.example.design.patterns.factory.after;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
