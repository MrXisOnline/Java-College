import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class maps {
    public static void main(String[] args){
        Map<Integer, String> names = new LinkedHashMap<>();
        names.put(40, "four");
        names.put(10, "one");
        names.put(30, "three");
        names.put(20, "two");
        System.out.println(names);
        Map<Integer, String> names2 = new TreeMap<>();
        names2.put(40, "four");
        names2.put(10, "one");
        names2.put(30, "three");
        names2.put(20, "two");
        System.out.println(names2);
        Map<Integer, String> names3 = new HashMap<>();
        names3.put(40, "four");
        names3.put(10, "one");
        names3.put(30, "three");
        names3.put(20, "two");
        System.out.println(names3);

        Map<Character, Integer> frequencyTab
                                        = new LinkedHashMap<Character, Integer>();            
        String str = "incomprehensibilities";
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            frequencyTab.put(c, frequencyTab.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> e: frequencyTab.entrySet()) {
                System.out.print("[" + e.getKey() + ", " + e.getValue() + "] ");
        }
        System.out.println();
        
        Map<Integer, Character> entries = new TreeMap<Integer, Character>();
        entries.put(30, 'b');
        entries.put(40, 'a');
        entries.put(20, 'd');
        entries.put(10, 'c');
        TreeSet<Character> values = new TreeSet<Character>(entries.values());

        for(Character c : values)
                System.out.print(c + " ");
        System.out.println();

        var exmap = new TreeMap<Integer, String>();
        exmap.put(1, "Suraj");
        exmap.put(2, "Prem");
        exmap.put(3, "Kapil");
        
        for (Map.Entry<Integer, String> e: exmap.entrySet()){
            System.out.println("(" + e.getKey() + ", " + e.getValue() + ")");
        }
        for (var e: exmap.entrySet()){
            System.out.println("[" + e.getKey() + ", " + e.getValue() + "]");
        }
    }
}
