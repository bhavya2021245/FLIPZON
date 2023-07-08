package A2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        while(true){
            System.out.println("WELCOME TO FLIPZON");
            System.out.println("1) Enter as Admin");
            System.out.println("2) Explore the Product Catalog");
            System.out.println("3) Show Available Deals");
            System.out.println("4) Enter as Customer");
            System.out.println("5) Exit the Application");
            ArrayList<Admin>adm=new ArrayList<>();
            Scanner sc=new Scanner(System.in);
            int option=sc.nextInt();
            if(option==1) {
                System.out.println("Dear Admin,");
                System.out.println("Please enter your username and password");
                Scanner st = new Scanner(System.in);
                String name = st.nextLine();
                String passwd = st.nextLine();

                Admin admin=new Admin(name,passwd);
                adm.add(admin);
                while (true) {
                    System.out.println("Welcome" + name + "!!!!");
                    System.out.println("Please choose any one of the following actions:");
                    System.out.println("1) Add category");
                    System.out.println("2) Delete category");
                    System.out.println("3) Add Product");
                    System.out.println("4) Delete Product");
                    System.out.println("5) Set Discount on Product");
                    System.out.println("6) Add giveaway deal");
                    System.out.println("7) Back");
                    int option2 = sc.nextInt();


                    if(option2==1){
                        for(int j=0;j<adm.size();j++){

                           Admin am=adm.get(j);
                            if(name==am.getName()){
                                int category_id=0;
                                while(true){
                                    System.out.println("Add category ID");
                                    category_id=st.nextInt();
                                    int flag=1;
                                    for(int i=0;i< am.cgry.size();i++){
                                        if(category_id==(am.cgry.get(i)).getCategory_id()){
                                            System.out.println("Dear Admin, the category ID is already used!!! PLease set a different and a unique category ID");
                                            flag=0;
                                        }

                                    }
                                    if(flag==1){
                                        break;
                                    }

                                }
                                System.out.println("Add name of the category");
                                Scanner s0=new Scanner(System.in);
                                String category_name=s0.nextLine();
                                am.add_category(category_id,category_name);
                            }
                            }
                        }

                    else if (option2 == 2) {
                        for(int j=0;j<adm.size();j++){

                            Admin am=adm.get(j);
                            Scanner s9=new Scanner(System.in);
                            Scanner s8=new Scanner(System.in);

                            if(name==am.getName()){
                                System.out.println("Delete category ID");
                                int category_id=s9.nextInt();
                                System.out.println("Delete name of the category");
                                String category_name=s8.nextLine();
                                admin.delete_category(category_id,category_name);
                            }
                        }

                    }
                    else if (option2 == 3) {
                        for(int j=0;j<adm.size();j++){

                            Admin am=adm.get(j);
                            if(name==am.getName()){
                                System.out.println("input the category ID");
                                int category_id=st.nextInt();
                                admin.Add_Product(category_id);
                            }
                        }


                    } else if (option2 == 4) {
                        for(int j=0;j<adm.size();j++){

                           Admin am=adm.get(j);
                           Scanner s7=new Scanner(System.in);
                            if(name==am.getName()){
                                System.out.println("input the category name");
                                String category_name=s7.nextLine();
                                for(int k=0;k<am.cgry.size();k++){
                                    Category cy=am.cgry.get(k);
                                    if(category_name==cy.getCategory_name()){
                                        for(int m=0;m<cy.cgprt.size();m++){
                                            Product pt=cy.cgprt.get(m);
                                            System.out.println("Enter the product id");
                                            String product_id= st.next();
                                            if(product_id==pt.getProduct_id()){
                                                am.Delete_Product(category_name,product_id);
                                            }
                                        }
                                    }
                                }

                            }

                    }}
                    else if (option2 == 5) {

                        for(int j=0;j<adm.size();j++){

                            Admin am=adm.get(j);

                            if(name==am.getName()){
                                System.out.println("Dear Admin give the Product ID you want to add discount for");
                                System.out.println("Enter the product id");
                                Scanner s3=new Scanner(System.in);
                                String pro_id=s3.next();
                                am.Discount_product(pro_id);
                            }




                    } }
                    else if (option2 == 6) {
                        for(int j=0;j<adm.size();j++){
                            Admin am=adm.get(j);

                            if(name==am.getName()){
                                System.out.println("Dear Admin give the Product IDs you want to combine and giveaway a deal for");
                                System.out.println("Enter the first Product ID :");
                                Scanner s2=new Scanner(System.in);
                                String first_id=s2.next();
                                System.out.println("Enter the second Product ID:");
                                String second_id=s2.next();
                                am.giveaway_deals(first_id,second_id);
                            }
                        }


                    } else if (option2 == 7) {
                        break;
                    }

                }
            }
            else if(option==2){
                if(Admin.prdt.isEmpty()){
                    System.out.println("pPlease add some products");
                }
                else{
                for(int y=0;y<Admin.prdt.size();y++){
                    Product pt=Admin.prdt.get(y);
                    System.out.println(pt);
                }}

            }
            else if(option==3){

                    if(Admin.edeal.isEmpty()&& Admin.pdeal.isEmpty()&& Admin.ndeal.isEmpty()){
                        System.out.println("Dear User, there are no deals for now!!! Please check regularly for exciting deals.");
                    }
                    else{
                        System.out.println("deals which are available for elite customers");
                        for(int k=0;k<Admin.edeal.size();k++){
                            System.out.println(Admin.edeal.get(k));
                        }
                        System.out.println("deals which are available for premium customers");
                        for(int k=0;k<Admin.pdeal.size();k++){
                            System.out.println(Admin.pdeal.get(k));
                        }
                        System.out.println("deals which are available for normal customers");
                        for(int k=0;k<Admin.ndeal.size();k++){
                            System.out.println(Admin.ndeal.get(k));
                        }

                    }


            }
            else if(option==4){
                ArrayList<Customer>arrcustomer=new ArrayList<>();
                while(true) {
                    System.out.println("1) Sign up");
                    System.out.println("2) Log in");
                    System.out.println("3) Back");

                    int option3= sc.nextInt();
                    if(option3==1){
                        Scanner sp=new Scanner(System.in);
                        Scanner sb=new Scanner(System.in);
                        System.out.println("Enter name");
                        String name=sp.nextLine();

                        System.out.println("Enter password");
                        String passwd=sp.nextLine();
                        Customer cmr=new Customer(name,passwd);
                        arrcustomer.add(cmr);
                        System.out.println("customer successfully registered");
                    }
                    else if(option3==2) {
                        Scanner sq = new Scanner(System.in);
                        System.out.println("Enter name");
                        String name = sq.nextLine();
                        System.out.println("Enter password");
                        String passwd = sq.nextLine();
                        for (int i = 0; i < arrcustomer.size(); i++) {
                            Customer cmtr=arrcustomer.get(i);
                            if (name.equals(cmtr.getName()) && passwd.equals(cmtr.getPassword())) {
                                Customer cmr=arrcustomer.get(i);
                                System.out.println("Welcome" + name + "!!!");
                                while (true) {
                                    System.out.println("1) browse products");
                                    System.out.println("2) browse deals");
                                                        System.out.println("3) add a product to cart");
                                    System.out.println("4) add products in deal to cart");
                                    System.out.println("5) view coupons");
                                    System.out.println("6) check account balance");
                                    System.out.println("7) view cart");
                                    System.out.println("8) empty cart");
                                    System.out.println("9) checkout cart");
                                    System.out.println("10) upgrade customer status");
                                    System.out.println("11) Add amount to wallet");
                                    System.out.println("12) back");
                                    int option4 = sc.nextInt();
                                    if (option4 == 1) {
                                        for(int g=0;g<Admin.prdt.size();g++){
                                            Product pt=Admin.prdt.get(g);
                                            System.out.println(pt);
                                        }

                                    } else if (option4 == 2) {
                                        if(cmr.getStatus()=="ELITE"){
                                            for(int h=0;h<Admin.edeal.size();h++){
                                                System.out.println(Admin.edeal.get(h));
                                            }
                                        }
                                        else if(cmr.getStatus()=="Premium"){
                                            for(int h=0;h<Admin.pdeal.size();h++){
                                                System.out.println(Admin.pdeal.get(h));
                                            }
                                        }
                                        else{
                                            for(int h=0;h<Admin.ndeal.size();h++){
                                                Deals d=Admin.ndeal.get(h);
                                                System.out.println(d);
                                            }
                                        }


                                    } else if (option4 == 3) {
                                        Scanner si=new Scanner(System.in);
                                        Scanner so=new Scanner(System.in);
                                        System.out.println("enter the product id");
                                        String product_id= si.next();
                                        System.out.println("enter the quantity to be added");
                                        int quantity=so.nextInt();
                                        for(int y=0;y<Admin.prdt.size();y++){
                                            Product pr=Admin.prdt.get(y);
                                            if(pr.getProduct_id().equals(product_id) && pr.getQuantity()<quantity){
                                                System.out.println("The quantity demanded is less than the available quantity");
                                            }
                                            else if(pr.getProduct_id().equals(product_id) && pr.getQuantity()>=quantity){

                                                for(int j=0;j<quantity;j++){
                                                    cmr.cart.add(pr);
                                                }
                                                System.out.println("Item successfully added to cart");
                                                pr.setQuantity(pr.getQuantity()-quantity);
                                            }

                                        }


                                    } else if (option4 == 4) {
                                        if(cmr.getStatus()=="Elite"){
                                            Scanner sd=new Scanner(System.in);
                                            System.out.println("enter the product id1 ");
                                            String product_id1=sd.next();
                                            System.out.println("enter the product id2 ");
                                            String product_id2=sd.next();
                                            for(int b=0;b<Admin.edeal.size();b++){
                                                Deals d=Admin.edeal.get(b);
                                                if(d.getProduct_id1().equals(product_id1) && d.getProduct_id2().equals(product_id2)){
                                                    cmr.cart1.add(d);
                                                }
                                            }
                                        }
                                        else if(cmr.getStatus()=="Prime"){
                                            Scanner sd=new Scanner(System.in);
                                            System.out.println("enter the product id1 ");
                                            String product_id1=sd.next();
                                            System.out.println("enter the product id2 ");
                                            String product_id2=sd.next();
                                            for(int b=0;b<Admin.pdeal.size();b++){
                                                Deals d=Admin.pdeal.get(b);
                                                if(d.getProduct_id1().equals(product_id1) && d.getProduct_id2().equals(product_id2)){
                                                    cmr.cart1.add(d);
                                                }
                                            }
                                        }
                                        else{
                                            Scanner sd=new Scanner(System.in);
                                            System.out.println("enter the product id1 ");
                                            String product_id1=sd.next();
                                            System.out.println("enter the product id2 ");
                                            String product_id2=sd.next();
                                            for(int b=0;b<Admin.ndeal.size();b++){
                                                Deals d=Admin.ndeal.get(b);
                                                if(d.getProduct_id1().equals(product_id1) && d.getProduct_id2().equals(product_id2)){
                                                    cmr.cart1.add(d);
                                                }
                                            }


                                        }


                                    } else if (option4 == 5) {
                                        System.out.println(cmr.getCoupons());

                                    } else if (option4 == 6) {
                                        System.out.println("your current balance is");
                                        System.out.println(cmr.getWallet());

                                    } else if (option4 == 7) {
                                        if(cmr.cart.isEmpty() && cmr.cart1.isEmpty()){
                                            System.out.println("Please add items in your cart");
                                        }
                                        if(!cmr.cart.isEmpty()){
                                            System.out.println("The products placed in your cart are:");
                                            for(int h=0;h<cmr.cart.size();h++){
                                                Product po=cmr.cart.get(h);
                                                System.out.println(po);
                                            }
                                        }
                                        if(!cmr.cart1.isEmpty()){
                                            System.out.println("The deals placed in your cart");
                                        for(int j=0;j<cmr.cart1.size();j++){
                                            Deals df=cmr.cart1.get(j);
                                            System.out.println(df);
                                        }
                                        }


                                    } else if (option4 == 8) {
                                        cmr.cart.clear();
                                        System.out.println("Cart successfully emptied");

                                    } else if (option4 == 9) {
                                        int l= cmr.getShopping()+1;
                                        cmr.setShopping(l);

                                        for(int k=0;k<cmr.cart.size();k++){
                                            cmr.final_list.add(cmr.cart.get(k));
                                        }
                                        if(cmr.getStatus().equals(("Elite"))){
                                            Elite e=new Elite(name,passwd);

                                            for(int a=0;a<cmr.final_list.size();a++) {
                                                Product py = cmr.final_list.get(a);
                                                double[] arr = new double[3];
                                                arr[0] = py.getPrice();
                                                double q = e.setDiscount();
                                                double p2 = py.getPrice() - ((q * py.getPrice()) / 100);
                                                arr[1] = p2;

                                                double w = py.getEdiscount();
                                                double p3 = py.getPrice() - ((w * py.getPrice()) / 100);
                                                arr[2] = p3;

                                                double min = arr[0];
                                                for (int kl = 1; kl < 3; kl++){
                                                    min = Math.min(min, arr[kl]);
                                            }


                                                cmr.setTotal_pay(cmr.getTotal_pay()+min);



                                            }
                                            double sum=0.0;
                                            if(!e.cart1.isEmpty()){
                                                for(int k=0;k<e.cart1.size();k++){
                                                    Deals de=e.cart1.get(k);
                                                    sum=sum+de.getCombined_price();
                                                }
                                            }
                                            cmr.setTotal_pay(cmr.getTotal_pay()+sum);

                                            if(cmr.getTotal_pay()>5000){
                                                System.out.println("YAYYYY!!! You will receive 3-4 coupons");
                                                Random random = new Random();
                                                int min = 3;
                                                int max = 4;
                                                int x = random.nextInt((max-min)+1) + min;
                                                cmr.setCoupons(cmr.getCoupons()+x);
                                                Random rand = new Random();
                                                int minimum = 5;
                                                int maximum = 15;
                                                int y = random.nextInt((maximum-minimum)+1) + minimum;
                                                cmr.setTotal_pay(cmr.getTotal_pay()-((y* cmr.getTotal_pay())/100));
                                                cmr.setCoupons(cmr.getCoupons()-1);
                                                double final_pay=cmr.getTotal_pay()+100;
                                                if(cmr.getTotal_pay()> cmr.wallet){
                                                    System.out.println("There is not a sufficient balance in your account");
                                                }
                                                else{
                                                    System.out.println("The amount you have to pay");
                                                    System.out.println(final_pay);
                                                    cmr.setWallet(cmr.getWallet()-final_pay);
                                                    e.setDelivery_charges();
                                                    e.setDiscount();
                                                    e.setDelivery_period();}
                                            }
                                            else{
                                                double final_pay=cmr.getTotal_pay()+100;
                                                if(cmr.getTotal_pay()> cmr.wallet){
                                                    System.out.println("There is not a sufficient balance in your account");
                                                }
                                                else{
                                                    System.out.println("The amount you have to pay");
                                                    System.out.println(final_pay);
                                                    cmr.setWallet(cmr.getWallet()-final_pay);
                                                    e.setDelivery_charges();
                                                    e.setDiscount();
                                                    e.setDelivery_period();}
                                            }
                                            if(cmr.getShopping()%2==0){
                                                System.out.println("You will receive a surprise");
                                                cmr.setCoupons(cmr.getCoupons()+1);
                                                }
                                            else {
                                                System.out.println("You will not receive any surprise this time better luck next time");
                                            }

                                            }

                                        else if(cmr.getStatus().equals("Prime")){
                                            Prime p=new Prime(name,passwd);

                                            for(int a=0;a<cmr.final_list.size();a++) {
                                                Product py = cmr.final_list.get(a);
                                                double[] arr = new double[3];
                                                arr[0] = py.getPrice();
                                                double q = p.setDiscount();
                                                double p2 = py.getPrice() - ((q * py.getPrice()) / 100);
                                                arr[1] = p2;

                                                double w = py.getEdiscount();
                                                double p3 = py.getPrice() - ((w * py.getPrice()) / 100);
                                                arr[2] = p3;

                                                double min = arr[0];
                                                for (int kl = 1; kl < 3; kl++){
                                                    min = Math.min(min, arr[kl]);
                                                }


                                                cmr.setTotal_pay(cmr.getTotal_pay()+min);



                                            }
                                            double sum=0.0;
                                            if(!p.cart1.isEmpty()){
                                                for(int k=0;k<p.cart1.size();k++){
                                                    Deals de=p.cart1.get(k);
                                                    sum=sum+de.getCombined_price();
                                                }
                                            }
                                            cmr.setTotal_pay(cmr.getTotal_pay()+sum);

                                            if(cmr.getTotal_pay()>5000){
                                                System.out.println("YAYYYY!!! You will receive 1-2 coupons");
                                                Random random = new Random();
                                                int min = 1;
                                                int max = 2;
                                                int x = random.nextInt((max-min)+1) + min;
                                                cmr.setCoupons(cmr.getCoupons()+x);
                                                Random rand = new Random();
                                                int minimum = 5;
                                                int maximum = 15;
                                                int y = random.nextInt((maximum-minimum)+1) + minimum;
                                                cmr.setTotal_pay(cmr.getTotal_pay()-((y* cmr.getTotal_pay())/100));
                                                cmr.setCoupons(cmr.getCoupons()-1);
                                                double final_pay=cmr.getTotal_pay()+100;
                                                final_pay=final_pay+(2*final_pay)/100;
                                                if(cmr.getTotal_pay()> cmr.wallet){
                                                    System.out.println("There is not a sufficient balance in your account");
                                                }
                                                else{
                                                    System.out.println("The amount you have to pay");
                                                    System.out.println(final_pay);
                                                    cmr.setWallet(cmr.getWallet()-final_pay);
                                                    p.setDelivery_charges();
                                                    p.setDiscount();
                                                    p.setDelivery_period();}
                                            }
                                            else{
                                                double final_pay=cmr.getTotal_pay()+100;
                                                final_pay=final_pay+(2*final_pay)/100;
                                                if(cmr.getTotal_pay()> cmr.wallet){
                                                    System.out.println("There is not a sufficient balance in your account");
                                                }
                                                else{
                                                    System.out.println("The amount you have to pay");
                                                    System.out.println(final_pay);
                                                    cmr.setWallet(cmr.getWallet()-final_pay);
                                                    p.setDelivery_charges();
                                                    p.setDiscount();
                                                    p.setDelivery_period();}
                                            }


                                        }
                                        else{
                                            Normal n =new Normal(name,passwd);

                                            for(int a=0;a<cmr.final_list.size();a++){
                                                Product py=cmr.final_list.get(a);
                                                double w=py.getNdiscount();
                                                double p3=py.getPrice()-((w* py.getPrice())/100);
                                                cmr.setTotal_pay(cmr.getTotal_pay()+p3);



                                            }
                                            double sum=0.0;
                                            if(!n.cart1.isEmpty()){
                                                for(int k=0;k<n.cart1.size();k++){
                                                    Deals de=n.cart1.get(k);
                                                    sum=sum+de.getCombined_price();
                                                }
                                            }
                                            cmr.setTotal_pay(cmr.getTotal_pay()+sum);
                                            if(cmr.getTotal_pay()> cmr.wallet){
                                                System.out.println("There is not a sufficient balance in your account");
                                            }
                                            else{
                                                System.out.println("The amount you have to pay");
                                                double final_pay=cmr.getTotal_pay()+100+((5* cmr.getTotal_pay())/100);
                                                System.out.println(final_pay);
                                                cmr.setWallet(cmr.getWallet()-final_pay);
                                                n.setDelivery_charges();
                                                n.setDiscount();
                                                n.setDelivery_period();
                                            }
                                        }
                                    }
                                    else if (option4 == 10) {
                                        System.out.println("Your current status is");
                                        System.out.println(cmr.getStatus());
                                        Scanner sy=new Scanner(System.in);
                                        System.out.println("Enter the updated status(Elite/Prime)");
                                        String status=sy.next();

                                        cmr.setStatus(status);
                                        System.out.println("your updated status is");
                                        System.out.println(status);
                                        if(status.equals("Elite")){
                                            double r= cmr.wallet-300;
                                            cmr.setWallet(r);
                                        }
                                        else{
                                            double y= cmr.wallet-200;
                                            cmr.setWallet(y);

                                        }


                                    } else if (option4 == 11) {
                                        System.out.println("the amount in your wallet");
                                        Scanner sh=new Scanner(System.in);
                                        double amount=sh.nextDouble();
                                        cmr.setWallet(amount+cmr.getWallet());


                                    } else {
                                        System.out.println("Bye "+name+"!!!");
                                        break;
                                    }

                                }
                            }
                        }
                    }


                    else{
                        break;
                    }
                }

            }
            else{
                System.out.println("Thanks for using FLIPZON");
                break;
            }



        }
    }

}
