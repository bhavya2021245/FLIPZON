package A2;
import java.util.*;
public class Prime extends Customer implements Privileges{
    public Prime(String name, String password) {
        super(name, password);
    }

    @Override
    public double setDiscount() {
        setUser_category_based_discount(5.0);

    return 5.0;}



    @Override
    public void setDelivery_period() {
        Random random = new Random();
        int min = 3;
        int max = 6;
        int x = random.nextInt((max-min)+1) + min;
        System.out.println("you will receive your order after 3-6 days");
        setDelivery_period(x);
    }

    @Override
    public double setDelivery_charges() {
       double a=100+(2*getTotal_pay())/100;
       return a;
    }


}
