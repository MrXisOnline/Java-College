import java.util.ArrayList;

class Employee implements Cloneable{
    String name;
    Integer age;
    Integer salary;
    String[] working_days;
    Employee(){}
    Employee(String n, Integer a, Integer s, String[] w){
        name = n;
        age = a;
        salary = s;
        working_days = w;
    }
    Employee(Employee e){
        name = e.name;
        age = e.age;
        salary = e.salary;
        working_days = new String[e.working_days.length];
        for(int i=0; i<e.working_days.length; i++){
            working_days[i] = e.working_days[i];
        }
    }
    public Employee clone() throws CloneNotSupportedException{
        var e = new Employee();
        e.name = name;
        e.age = age;
        e.salary = salary;
        e.working_days = new String[working_days.length];
        for(int i=0; i<working_days.length; i++){
            e.working_days[i] = working_days[i];
        }
        return e;
    }
    public String toString(){
        String work = "";
        for (String s: working_days) work += s + ", ";
        return "Name: " + name + "\nAge: " + age + "\nWorking days: " + work ;
    }
}
public class test32 {
    public static void main(String[] args){
        var arr = new ArrayList<Employee>();
        String[] days1 = {"Mon", "Tue", "Wed"};
        String[] days2 = {"Thu", "Fri", "Sat"};
        // String[] days3 = {"Wed", "Thu", "Fri"};
        var e1 = new Employee("Suraj", 19, 90000, days1);
        var e2 = new Employee("Prem", 23, 100000, days2);
        arr.add(e1);
        arr.add(e2);
        try{
            var e3 = e2.clone();
            e3.name = "Kapil";
            e3.age = 17;
            e3.working_days[2] = "Wed";
            arr.add(e3);
        }
        catch (CloneNotSupportedException e){}
        
        arr.stream().sorted((em1, em2) -> em1.age.compareTo(em2.age)).forEach(e -> System.out.println(e));
        
    }
}
