   class Product implements Cloneable{
           private String prodname;
           private double prodprice;
           public Product(String prodname, double prodprice) {
                  this.prodname = prodname;
                  this.prodprice = prodprice;
           }
           public Product(Product p) {
                  this.prodname = p.prodname;
                  this.prodprice = p.prodprice;
           }
           public void setProdname(String prodname) {
                  this.prodname = prodname;
           }
           public void setProdprice(double prodprice) {
                  this.prodprice = prodprice;
           }
           public String toString() {
                  return prodname + " : " + prodprice;
           }
           protected Product clone() throws CloneNotSupportedException{
                  return (Product)super.clone();
           }
   }
   public class test19{
          public static void main(String[] args) {
                 try {
                      Product p1 = new Product("Pen", 100.0);
                      Product p2 = new Product(p1);
                      Product p3 = p1;
                      Product p4 = p1.clone();
                      p1.setProdname("Pencil");
                      p1.setProdprice(30.0);
                      System.out.print(p1 + ", " + p2 + ", " + p3 + ", " + p4);
                  }
                  catch(CloneNotSupportedException e) {
                        System.out.println("clone() not supported");
                   }
            }
     }