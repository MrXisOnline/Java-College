class Polygon {
        public void perimeter( ){
            System.out.print("In Polygon perimeter");
        }
        public void angleSum( ) {
            System.out.println("In Polygon angleSum");
        }        
    }
    public class test10 extends Polygon{
        public void perimeter( ){
            System.out.println("In Pentagon perimeter");
        }
        public void angleSum(int x) {
            System.out.println("In Pentagon angleSum");
        }
        public static void main(String[] arg){
            test10 t = new test10();
            t.perimeter();
        }
    }