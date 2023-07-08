package A2;
import java.util.*;
public class Elite extends Customer implements Privileges  {


    public Elite(String name, String password) {
        super(name,password);
    }

    @Override
    public double setDiscount() {
        setUser_category_based_discount(10.0);
        return 10.0;}



    @Override
    public void setDelivery_period() {
        Random random = new Random();
        int min = 2;
        int max = 3;
        int x = random.nextInt((max-min)+1) + min;
        System.out.println("you will receive your order after 2-3 days");
        setDelivery_period(x);

    }

    @Override
    public double setDelivery_charges() {
        System.out.println("you have to pay Rs100 on every order as delivery charges");
        return 100.0;
    }


}
