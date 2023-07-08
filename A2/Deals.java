package A2;

public class Deals {
    private String product_id1;
    private String product_id2;
    private double combined_price;


    @Override
    public String toString() {
        return "Deals{" +
                "product_id1='" + product_id1 + '\'' +
                ", product_id2='" + product_id2 + '\'' +
                ", combined_price=" + combined_price +
                '}';
    }



    public String getProduct_id1() {
        return product_id1;
    }

    public void setProduct_id1(String product_id1) {
        this.product_id1 = product_id1;
    }

    public String getProduct_id2() {
        return product_id2;
    }

    public void setProduct_id2(String product_id2) {
        this.product_id2 = product_id2;
    }

    public double getCombined_price() {
        return combined_price;
    }

    public void setCombined_price(double combined_price) {
        this.combined_price = combined_price;
    }

    public Deals(String product_id1, String product_id2, double combined_price) {
        this.product_id1 = product_id1;
        this.product_id2 = product_id2;
        this.combined_price = combined_price;
    }
}
