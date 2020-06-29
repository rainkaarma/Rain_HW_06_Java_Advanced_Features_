package EncapsPocket;
// learning Git 20200629_3
public class Pocket {
    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public void setMoney(double money) {
        if (money >= 0 && money <= 3000) {
            this.money = money;
        } else if (money > 3000) {
            System.out.println("I don’t have enough space in my pocket for as much money!");
            this.money = 0;
        } else if (money < 0){
            System.out.println("withdrawal not possible");
            this.money = 0;
        }
    }

    public double getMoney() {
        if (money <= 10){
           return 0;
        } else {
            return money;
        }
    }
    @Override
    public String toString(){
        return "Pocket {" +
                "money=" + getMoney() +
                '}';
    }
}
