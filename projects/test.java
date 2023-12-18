import java.util.logging.*;

class SomeClass {
      public void logIt(){
            Logger.getGlobal().warning("First message");
      }
}

public class test {
      public static void main(String[] args){
            SomeClass obj = new SomeClass();
            obj.logIt();
            Logger.getGlobal().log(Level.FINE, "second message");
            Logger.getGlobal().setLevel(Level.OFF);
            try {
                 throw new ArithmeticException();
            }
            catch(Exception e) {
                  Logger.getGlobal().log(Level.SEVERE, "third message");
            }
            assert 0 > 5: "0 > 5";
      }
}