public class test1 {
    public static void main(String[] args){
        int sum = 0;
        int n = 3;
        for (int i=1; i<n+1; i++){
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}