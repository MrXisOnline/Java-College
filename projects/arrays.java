import java.util.ArrayList;
import java.util.ListIterator;

public class arrays {
    public static void main(String[] args){
        ArrayList<String> sList = new ArrayList<String>();
        sList.add("A");
        sList.add("B");
        System.out.println(sList);
        ListIterator<String> iter = sList.listIterator();
        if(iter.hasNext()){
                iter.next();
                iter.add("C");
        }
        System.out.println(sList);
        if(iter.hasPrevious()){
                iter.previous();
                iter.add("D");
        }
        System.out.println(sList);
        sList.add("E");
        System.out.println(sList);
    }
}
