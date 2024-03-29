public class Employee extends Person{
    double salary;
    String position;


    public Employee(String name, String dob, String address, double salary, String position) {
        super(name, dob, address);  //connect with parent class variable
        this.salary = salary;
        this.position = position;

    }
    public void setRoughIncome(double roughIncome){
        this.roughIncome = roughIncome + (double) 20 /100;
    }

}
