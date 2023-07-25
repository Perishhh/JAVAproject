public class Lab09Ex2_1 {
    public static double H_n(int n){
        if(n==1){
            return (double)1;
        }else{
            return H_n(n-1)+1/(double)(n);
        }
    }
    public static void main(String[] args) {
        System.out.println(H_n(10));
    }
}
