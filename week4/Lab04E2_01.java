import java.util.Scanner;
public class Lab04E2_01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a multiple of 3:");
        int s = kb.nextInt();
        kb.nextLine();
        System.out.println("Input a bigger one");
        int e = kb.nextInt();
        kb.nextLine();
        if(s < e && s%3 ==0 && e%3 ==0){
            for(int i = s; i<=e; i++){
                if(i%3 == 0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Invalid input.");
        }
        kb.close();
    }
}