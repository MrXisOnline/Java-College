import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
 public Employee(String id, String name, String projects[]){
     this.eid = id;
     this.ename = name;
     this.eprojects = projects;
     
 }
 public Employee(Employee e){
     this.eid = e.eid;
     this.ename = e.ename;
     this.eprojects = e.eprojects;
 }
 public void display(){
     System.out.println(String.format("id:%s", this.eid));
     System.out.println(String.format("name:%s", this.ename));
     System.out.println("projects:");
     for (String x: this.eprojects){
         System.out.print(String.format("%s:", x));
     }
     System.out.print("\n");
 }
public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class test3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
        e1.display();

        e2.display();

        e1.mutator();
        
        e2.display();
    }
}