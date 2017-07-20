package store;

/**
 * Created by Тино on 20.7.2017 г..
 */
public class Store {

    private Staff[] StoreStaff;
    private int sizeS;
    private Products[] StoreProducts;
    private int sizeP;

    Store() {
        this.StoreStaff = new Staff[10];
        this.sizeS = 0;
        this.StoreProducts=new Products[100];
        this.sizeP=0;
    }

    void addEmployee(String Name, String Gender, String Email, String Duty, double Salary) {
        this.StoreStaff[sizeS] = new Staff(Name, Gender, Email, Duty, Salary);
        this.sizeS++;
    }
    void addProductToStore(int ID, String Name, String Description, String ExpDate, double Price) {
        this.StoreProducts[sizeP] = new Products(ID, Name, Description, ExpDate, Price);
        this.sizeP++;
    }
    void EmployeeDetails() {
        for (int i = 0; i < this.sizeS; i++) {
            this.StoreStaff[i].PrintStaff();
        }
        System.out.println("Current number of Employees : " + this.sizeS);
    }
    void StoreDetails() {
        System.out.println("Store Name : Tino's Grocery Shop");
        System.out.println("Owner : Valentino Paskov");
        System.out.println("Phone number : 0896799474");
        System.out.println("Work Time : Monday - Friday from 08:00 to 22:00");
        System.out.println("            Saturday and Sunday we are closed :) ");
        System.out.println();
    }
    void ProductsDetails(){
        for(int i=0; i<this.sizeP; i++){
            this.StoreProducts[i].PrintProducts();
        }
        System.out.println("Current products in the store : " + this.sizeP);
    }
    public static class Records {
        public static void main(String[] args) {
            Store records = new Store();
            records.StoreDetails();
            records.ProductsDetails();
            records.EmployeeDetails();
        }
    }
}
