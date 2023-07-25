import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random R = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.print(R.nextInt(10-3+1)+3);//3-10
        }
        
    }
}
