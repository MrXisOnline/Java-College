  class Point{
         private int x, y;
         public Point(int x, int y) {
                this.x = x;
                this.y = y;
         }
         public void setX(int x) {
                this.x = x;
         }
         public void setY(int y) {
                this.y = y;
         }
         public String toString() {
                return "(" + x + ", " + y + ")";
         }
         public Object clone() throws CloneNotSupportedException{
                return super.clone();
         }
  }

  public class test18{
         public static void main(String[] args) {
                try {
                     Point p1 = new Point(10, 20);
                     Point p2 = p1;
                     Point p3 = (Point)p1.clone();
                     p1.setX(100);
                     p1.setY(200);
                     System.out.println(p1 + " , " + p2 + ", " + p3);
                }
                catch(CloneNotSupportedException e) {
                       System.out.println("clone() not supported");
                 }
          }
  }
