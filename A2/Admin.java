package A2;

import java.util.*;

public class Admin {
    private String name;

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

    private String password;
    Admin(String name,String password){
        this.name=name;
        this.password=password;
    }
    static ArrayList<Category>cgry=new ArrayList<>();
    static ArrayList<Product>prdt=new ArrayList<>();
    static ArrayList<Deals>edeal=new ArrayList<>();
    static ArrayList<Deals>pdeal=new ArrayList<>();
    static ArrayList<Deals>ndeal=new ArrayList<>();

    public void add_category(int category_id, String category_name){

        Scanner sc=new Scanner(System.in);
        Scanner st=new Scanner(System.in);

        System.out.println("Add a product:");
        System.out.println("Product name");
        String product_name=sc.nextLine();
        System.out.println("Product ID");
        String product_id= sc.nextLine();
        System.out.println("enter the description of the product");
        String description= sc.nextLine();
        System.out.println("price");
        int price= st.nextInt();
        System.out.println("enter the quantity to be added");
        int quantity=st.nextInt();
        Product pr=new Product(product_name,product_id,description,price,quantity);
        Category cgy=new Category(category_id,category_name,pr);
        prdt.add(pr);
        cgry.add(cgy);
     }
     public void delete_category(int category_id, String category_name){
        for(int i=0;i< cgry.size();i++){
            if(category_id==cgry.get(i).getCategory_id()&& category_name==cgry.get(i).getCategory_name()){
                cgry.remove(Integer.valueOf(i));
            }
        }

     }
     public void Add_Product(int category_id){
        Scanner sc=new Scanner(System.in);
         Scanner st=new Scanner(System.in);

        int flag=0;
        for(int j=0;j< cgry.size();j++){
            if(category_id==cgry.get(j).getCategory_id()){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("This category id does not exist");
            System.out.println("Adding the category first....");
            System.out.println("enter the category name");
            String category_name=st.next();
            add_category(category_id,category_name);
        }
        else{
            Scanner sd=new Scanner(System.in);
            Scanner df=new Scanner(System.in);
            System.out.println("Add a product:");
            System.out.println("Product name");
            String product_name=sd.nextLine();
            System.out.println("Product ID");
            String product_id= sd.nextLine();
            System.out.println("enter the description of the product");
            String description= sd.nextLine();
            System.out.println("price");
            int price= df.nextInt();
            System.out.println("enter the quantity to be added");
            int quantity=df.nextInt();
            Product pr=new Product(product_name,product_id,description,price,quantity);
            prdt.add(pr);



        }
     }
     public void Delete_Product(String category_name, String product_id){
        for(int i=0;i< cgry.size();i++){
            Category cy=cgry.get(i);
            if(category_name==cy.getCategory_name()){
                for(int j=0;j<cy.cgprt.size();j++){
                    Product p=cy.cgprt.get(j);
                    if(p.getProduct_id()==product_id){
                        cy.cgprt.remove(Integer.valueOf(j));
                    }
                }
            }
        }
     }
     public void Discount_product(String pro_id){
        Scanner se=new Scanner(System.in);
        for(int i=0;i<prdt.size();i++){
            Product pt=prdt.get(i);
            if(pt.getProduct_id().equals(pro_id)){
                System.out.println("Enter the discount for elite customers");
                double ediscount=se.nextDouble();
                pt.setEdiscount(ediscount);
                System.out.println("Enter the discount for premium customers");
                double pdiscount=se.nextDouble();
                pt.setPdiscount(pdiscount);
                System.out.println("Enter the discount for normal customers");
                double ndiscount=se.nextDouble();
                pt.setNdiscount(ndiscount);

            }
        }


     }
     public void giveaway_deals(String first_id, String second_id){
        Scanner sq=new Scanner(System.in);
        System.out.println("Enter the combined price(Should be less than their combined price):");
        System.out.println("for elite customers");
        double eprice=sq.nextDouble();
        System.out.println("for prime customers");
        double pprice= sq.nextDouble();
        System.out.println("for normal customers");
        double nprice= sq.nextDouble();
        edeal.add(new Deals(first_id,second_id,eprice));
        pdeal.add(new Deals(first_id,second_id,pprice));
        ndeal.add(new Deals(first_id,second_id,nprice));



     }

}
