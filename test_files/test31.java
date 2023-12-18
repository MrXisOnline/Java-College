class PrlCls1 extends Thread{
     public void run(){
          for(int i = 1; i <= 10; i++){
               System.out.print(i + " ");
               try{
                    Thread.sleep(100);
               }
               catch(InterruptedException e){}
          }
     }
}
class PrlCls2 extends Thread{
     public void run(){
          for(int i = 11; i <= 20; i++){
               System.out.print(i + " ");
               try{
                    Thread.sleep(100);
               }
               catch(InterruptedException e){}
          } 
     }
}
public class test31{
     public static void main(String[] args){
          Thread t1 = new PrlCls1();
          Thread t2 = new PrlCls2();
          t1.run();
          t2.start();
     }
}