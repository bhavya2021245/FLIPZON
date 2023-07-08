package A2;

import java.util.ArrayList;

public class Category {
    private int category_id;
    private Product product;
    private String category_name;
    public Product getProduct() {
        return product;
    }
    ArrayList<Product>cgprt=new ArrayList<>();
    public void setProduct(Product product) {
        this.product = product;
    }
     Category(int category_id, String category_name,Product p){
        this.product=p;
        this.category_id=category_id;
        this.category_name=category_name;
        cgprt.add(p);
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }




}
