public class test5 {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(arr1 == arr2);
        int[] arr3 = {1, 2, 3};
        int[] arr4 = arr3;
        System.out.println(arr3 == arr4);
    }
}
