class Point{
       private int x;
       private int y;
       public Point(int x, int z) {
              this.x = x;
              this.y = z;
        }
        public void printPoint() {
              System.out.println("(" + x + ", " + y + ")");
        }
 }
class test7{
        public static void main(String[] args) {
              Point p = new Point(10, 20);
              p.printPoint();
              System.out.println("IITM"+10+20);
        }
 }
