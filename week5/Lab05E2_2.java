import java.util.Scanner;

public class Lab05E2_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Plz input the size of the array you want:");
        int size = kb.nextInt();
        kb.nextLine();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2*(i+1);
        }
        for (int i = array.length/2; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        kb.close();
    }
}
