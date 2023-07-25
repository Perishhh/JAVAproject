public class Lab06E2_2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("The third entry of array is: "+array[2]);
        modifyArray(3, 99, array);
        System.out.println("The third entry of array is: "+array[2]);
    }
    public static void modifyArray(int k, int v, int[] array){
        array[k-1] = v;
    }
}
