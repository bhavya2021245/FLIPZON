package A2;

import java.util.ArrayList;

public class Customer {

    private String name;

    public double wallet=1000;

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    ArrayList<Product> final_list=new ArrayList<>();
    public Customer(String name,String password) {
        this.name = name;
        this.password = password;
    }

    private String password;
    private String status="Normal";
    private double account_balance;
    private double checkout_balance;
    private double user_category_based_discount;
    private int shopping;
    private double additional_discount;
    private double coupon_discount;

    public double getCoupon_discount() {
        return coupon_discount;
    }

    public void setCoupon_discount(double coupon_discount) {
        this.coupon_discount = coupon_discount;
    }
   private double total_pay=0.0;
   private int coupons;

    public int getCoupons() {
        return coupons;
    }

    public void setCoupons(int coupons) {
        this.coupons = coupons;
    }

    public double getTotal_pay() {
        return total_pay;
    }

    public void setTotal_pay(double total_pay) {
        this.total_pay = total_pay;
    }

    private int delivery_period;

    public int getDelivery_period() {
        return delivery_period;
    }
    private double delivery_charges;

    public double getDelivery_charges() {
        return delivery_charges;
    }

    public void setDelivery_charges(double delivery_charges) {
        this.delivery_charges = delivery_charges;
    }

    public void setDelivery_period(int delivery_period) {
        this.delivery_period = delivery_period;
    }

    public double getAdditional_discount() {
        return additional_discount;
    }

    public void setAdditional_discount(double additional_discount) {
        this.additional_discount = additional_discount;
    }

    public int getShopping() {
        return shopping;
    }

    public void setShopping(int shopping) {
        this.shopping = shopping;
    }

    public double getUser_category_based_discount() {
        return user_category_based_discount;
    }

    public void setUser_category_based_discount(double user_category_based_discount) {
        this.user_category_based_discount = user_category_based_discount;
    }

    ArrayList<Product>cart=new ArrayList<>();
    ArrayList<Deals>cart1=new ArrayList<>();

    public double getCheckout_balance() {
        return checkout_balance;
    }

    public void setCheckout_balance(double checkout_balance) {
        this.checkout_balance = checkout_balance;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
