import java.util.*;

class DivisionException extends Exception{
    public DivisionException(){
        super();
    }
    public String toString(){
        return "Division by 3 is not allowed";
    }
}
public class exp {
 
    //Define divide(int a, int b) here
    public static double divide(int a, int b) throws DivisionException{
        if (b != 3){
            return a/b;
        }
        else{
            throw new DivisionException();
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       
       //call divide method here
       try{
        System.out.print(divide(x, y));
       }
       catch (DivisionException e){
        System.out.print(e);
       }

   }
} 