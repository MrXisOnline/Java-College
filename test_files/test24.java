import java.util.*;
import java.util.stream.*;
//define class Employee
class Employee{
    String name;
    String dept;
    double salary;
    public Employee(String n, String d, double s){
        name=n;
        dept=d;
        salary=s;
    }
    public String toString(){
        return name + " : " + dept + " : " + salary;
    }
}
class test24{
    //define method query
    public static Stream<Employee> query(ArrayList<Employee> elist, String d, double s){
        return elist.stream().filter(e -> e.dept == d).filter(e -> e.salary >= s);
    }
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));
        String d = sc.next();       //read department
        double s = sc.nextInt();    //read salary
		
        var st = query(eList, d, s);
        st.forEach(n -> System.out.println(n + " "));
    }
}