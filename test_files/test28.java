import java.io.*;
public class test28 {
      public static void main(String[] args) {
          try {
               var out=new FileOutputStream("C:\\Users\\Suraj\\Java\\test_files\\tree.txt");
               var dout=new DataOutputStream(out);
               String data="Trees give us fresh air.";
               dout.writeBytes(data);
               System.out.println("Data written to file successfully");
          }
          catch (FileNotFoundException e) {
               e.printStackTrace();
          }
          catch (IOException e) {
                e.printStackTrace();
          }
          finally {
                System.out.println("Program execution finished.");
          }
      }
}