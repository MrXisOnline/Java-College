class Employee{
    private int id;
    private static double salary = 100;
    public Employee(int i){
        id = i;
    }
    public final double bonus(){
        return 0.1 * salary;
    }
}
class Manager extends Employee{
    public Manager(int i){
        super(i);
    }
    public final double bonus(){
        return 0.2 * salary;
    }
}

public class test44 {
    public static void main(String[] args) {
        Employee e1 = new Manager(001);
        Manager m1 = new Employee(005);
        e1.bonus();
        m1.bonus();
    }
}
