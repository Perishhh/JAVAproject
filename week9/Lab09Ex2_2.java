public class Lab09Ex2_2 {
    public static void reverse(String word){
        if(word.length()==1){
            System.out.print(word);
        }else{
            reverse(word.substring(1,word.length()));
            System.out.print(word.charAt(0));
        }
    }
    public static void main(String[] args) {
        reverse("Hello!"); 
    }
}
