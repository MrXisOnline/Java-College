import java.util.*;

interface Iterator{
    public boolean has_next();
    public Object get_next();
}

class Sequence{
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr; 
    int size;
    int last;
    public Sequence(int s){
        iArr = new int[s];
        size = s;
        last = 0;
    }
    public void addTo(int elem){
        if (last != size){
            iArr[last] = elem;
            last++;
        }
    }
    public Iterator get_Iterator(){
        Iterator iter = new SeqIterator(iArr);
        for (int x: iArr){
            System.out.println(x);
        }
        return iter;
    }
 
    private class SeqIterator implements Iterator{
        int[] arr;
        int indx;
        public SeqIterator(int[] ar){
            arr = ar;
            indx = -1;
        }
        public boolean has_next(){
            indx++;
            if (indx == arr.length){
                return false;
            }
            if (arr[indx] == 0){
                return false;
            }
            return true;
        }
        public Object get_next(){
            return arr[indx];
        }
    }
}

class test13{
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while(i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}