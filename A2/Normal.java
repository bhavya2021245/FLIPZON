package A2;

import java.util.Random;

public class Normal extends Customer implements Privileges{
    public Normal(String name, String password) {
        super(name, password);
    }

    @Override
    public double setDiscount() {
        System.out.println("Sorryyyy you will not receive any discount for that you have to upgrade your status ");
    return 0.0;}



    @Override
    public void setDelivery_period() {
        Random random = new Random();
        int min = 7;
        int max = 10;
        int x = random.nextInt((max-min)+1) + min;
        System.out.println("you will receive your order after 7-10 days");
        setDelivery_period(x);

    }

    @Override
    public double setDelivery_charges() {
        double a=100+(5*getTotal_pay())/100;
        return a;
    }


}
