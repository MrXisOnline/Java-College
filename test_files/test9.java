class Employee
{
         int eid;
         String ename;

         public void display()
         {
              System.out.format("eid: %s", eid);
              System.out.println("ename: "+ename);
         }
}

class test9
{
         public static void main(String[] args)
         {
                Employee e1 = new Employee();
                e1.display();
          }
}