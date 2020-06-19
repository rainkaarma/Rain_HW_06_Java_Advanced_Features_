package EncapsDog;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("male", "bulterjer");
        dog.setAge(-1);
        dog.setWeight(-2);
        System.out.println(dog.toString());

    }
}
