package store;

/**
 * Created by Тино on 20.7.2017 г..
 */

public class Staff {

    private String Name;
    private String Gender;
    private String Email;
    private String Duty;
    private double Salary;

    Staff(String Name, String Gender, String Email, String Duty, double Salary) {
        this.Name = Name;
        this.Gender = Gender;
        this.Email = Email;
        this.Duty = Duty;
        this.Salary = Salary;
    }

    void PrintStaff() {
        System.out.println("Employee Name : " + this.Name);
        System.out.println("Gender : " + this.Gender);
        System.out.println("Email : " + this.Email);
        System.out.println("Duty : " + this.Duty);
        System.out.println("Salary: " + this.Salary);
        System.out.println();
    }

    public static class Records {
        public static void main(String[] args) {
            Store records = new Store();
            records.addEmployee("Tino", "Male", "t.tino@mail.bg", "Cashier", 750.30);
            records.addEmployee("Darina", "Female", "darina@mail.bg", "Manager", 890.69);
            records.EmployeeDetails();
            System.out.println();
        }
    }
}