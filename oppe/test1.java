import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class someclass{
    int someint;
    String somestr;
    double somedouble;

    public someclass(int i, String s, double d){
        someint = i; 
        somestr = s;
        somedouble = d;
    }
    public void somemethod1(){
        System.out.println(0);
    }
    public int somemethod2(int i){
        someint += i;
        return someint;
    }
}

public class test1 {
    public static void main(String[] args){
        var obj = someclass.class;
        System.out.println(obj.getName());
        System.out.println(obj.getSimpleName());
        Method[] m = obj.getDeclaredMethods();
        for (Method sm: m){
            System.out.println(sm.getName());
            
            System.out.println(sm.getParameterTypes().getClass().getSimpleName());
        }
        Constructor[] c = obj.getConstructors();
        for (Constructor cm: c){
            System.out.println(cm.getName());
            
            System.out.println(cm.getParameterTypes().getClass().getSimpleName());
        }
    }
}
