public class inheritance {
    public static void main(String[] args){
        Employee e = new Employee("Suraj", 200000);
        e.display();
        Employee m = new Manager("Prem", 300000, "Suraj");
        m.display();
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s){
        this.name = n;
        this.salary = s;
    }
    //setters
    public void setName(String n){
        this.name = n;
    }
    public void setSalary(double s){
        this.salary = s;
    }
    //getters
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void display(){
        System.out.println(String.format("name : %s\nsalary : %,.2f", this.name, this.salary));
    }
}

class Manager extends Employee{
    private String secretary;

    public Manager(String n, double s, String sn){
        super(n, s);
        this.secretary = sn;
    }
    
    @Override
    public void display(){
        System.out.println(String.format("name : %s\nsalary : %,.2f\nsecretary : %s", this.getName(), this.getSalary(), this.secretary));
    }
}