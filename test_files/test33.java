class PrlSequence extends Thread{
    int init;
    public PrlSequence(int i) {        
         init = i;
    }
    public void run(){
           for(int i = init; i <= init + 5; i++) {
                 System.out.print(i + " ");
                  try {
                       sleep(500);
                       }
                      catch(InterruptedException e) {}
            }
      }
}
class test33{
    public static void main(String[] args) throws InterruptedException{
          Thread th1 = new PrlSequence(10);
          Thread th2 = new PrlSequence(20);
          Thread th3 = new PrlSequence(30);
           th1.start();
           th2.start();
           th1.join();
           th2.join();
           th3.start();
 }
}