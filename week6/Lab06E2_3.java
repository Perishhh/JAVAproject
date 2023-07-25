import java.util.Random;

public class Lab06E2_3 {
    public static void main(String[] args) {
        int[] Array1 = randomIntArray(30, 1, 10);
        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i]);
            if(i<Array1.length-1){
                System.out.print(",");
            }
        }
    }
    public static int[] randomIntArray(int k, int min, int max){
        int[] ArrayR = new int[k];
        Random r = new Random();
        for (int i = 0; i < ArrayR.length; i++) {
            ArrayR[i] = r.nextInt(max-min+1)+min;
        }
        return ArrayR;
    }
}
