package store;

/**
 * Created by Тино on 20.7.2017 г..
 */

public class Products {

    private int ID;
    private String Name;
    private String Description;
    private String ExpDate;
    private double Price;

    Products(int ID, String Name, String Description, String ExpDate, double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.ExpDate = ExpDate;
        this.Price = Price;
    }

    void PrintProducts() {
        System.out.println("Product ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("Description : " + this.Description);
        System.out.println("Expiration Date : " + this.ExpDate);
        System.out.println("Price : " + this.Price);
        System.out.println();
    }


    public static class Records {
        public static void main(String[] args) {

            Store records = new Store();
            records.addProductToStore(1, "Apples", "Green Apples form Bulgaria", "12.03.2017", 3.39);
            records.addProductToStore(2, "Oranges", "Oranges from Hungary", "11.05.2011", 2.83);
            records.addProductToStore(3,"Whiskey","Ballantines","Never",35.99);

            records.ProductsDetails();
            System.out.println();
        }
    }
}
