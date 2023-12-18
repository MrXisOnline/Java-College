   import java.util.stream.Stream;
     public class test23 {
            public static void main(String[] args) {
                  var random = Stream.generate(Math::random)
                                                           .map(i -> Math.round(i * 100))
                                                           .filter(j -> j > 50).limit(5);

                   random.forEach(s -> System.out.println(s));
            }
     }