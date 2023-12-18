import java.util.Optional;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args){
        // var stm = Stream.generate(Math::random).takeWhile(e -> e>0.05).map(e -> e * 10);
        // stm.forEach(e -> System.out.println(e));
        // var stm2 = Stream.generate(Math::random).dropWhile(e -> e<0.05);
        // stm2.forEach(e -> System.out.println(e));
        Optional<Double> stm = Stream.generate(Math::random).takeWhile(e -> e>0.05).map(e -> e * 10).filter(e -> e>9).max(Double::compareTo);
        // if (stm.isPresent()){
        //     System.out.println(stm.get());
        // }
        System.out.println(stm.orElse(9.0));
        // System.out.println(stm.orElseGet(() -> Math.random()));
        
    }
}
