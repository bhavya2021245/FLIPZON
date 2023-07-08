package A2;

public class Product {
    private String Product_name;
    private String product_id;
    private String description;
    private double price;
    private int quantity;
    private double ediscount;
    private double pdiscount;
    private double ndiscount;


    public double getEdiscount() {
        return ediscount;
    }

    public void setEdiscount(double ediscount) {
        this.ediscount = ediscount;
    }

    public double getPdiscount() {
        return pdiscount;
    }

    public void setPdiscount(double pdiscount) {
        this.pdiscount = pdiscount;
    }

    public double getNdiscount() {
        return ndiscount;
    }

    public void setNdiscount(double ndiscount) {
        this.ndiscount = ndiscount;
    }

    public Product(String Product_name, String product_id, String description, double price,int quantity) {
        this.Product_name = Product_name;
        this.product_id = product_id;
        this.description=description;
        this.price = price;
        this.quantity=quantity;
    }


    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "Product_name='" + Product_name + '\'' +
                ", product_id='" + product_id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
