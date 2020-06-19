package EncapsPocket;

import EncapsDog.Dog;

public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(0);

        pocket.setMoney(100);
        System.out.println(pocket.toString());

        pocket.setMoney(5);
        System.out.println(pocket.toString());

        pocket.setMoney(5000);
        System.out.println(pocket.toString());
    }
}


