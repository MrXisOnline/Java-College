import java.util.*;
class ComplexNum<T extends Number>{
    T real;
    T imag;
    public ComplexNum(T r, T i){
        real = r;
        imag = i;
    }
    public String toString(){
        return real.doubleValue() + " + " + imag.doubleValue() + "i";
    }
    public ComplexNum<Double> add(ComplexNum<?> c){
        ComplexNum<Double> dc = new ComplexNum<Double>(0.0, 0.0);
        dc.real = real.doubleValue() + c.real.doubleValue();
        dc.imag = imag.doubleValue() + c.imag.doubleValue();
        return dc;
    }
}
class FClass{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}
