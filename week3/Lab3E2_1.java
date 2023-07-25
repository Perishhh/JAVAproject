import java.util.Random;
public class Lab3E2_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100) +1;
        if(n <= 50){
            System.out.println("A small random number is generated");
        }else if(n >= 50){
            System.out.println("A large random number is generated");
        }
    }
}
