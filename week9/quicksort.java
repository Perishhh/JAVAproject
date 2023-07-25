public class quicksort {
    public static int[] qs(int[] array){
        if(array.length == 0||array.length ==1){
            return array;
        }else{
            int pivot = array[array.length-1];
            int[] front = new int[array.length-1];
            int[] behind = new int[array.length-1];
            int f = 0;
            int b = 0;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]<=pivot){
                    front[f] = array[i];
                    f++;
                }else{
                    behind[b] = array[i];
                    b++;
                }
            }
            int[] front_s = new int[f];
            int[] behind_s = new int[b];
            if(f>0){
                for (int i = 0; i < f; i++) {
                    front_s[i] = front[i];
                }
                for (int i = 0; i < f; i++) {
                    array[i] = qs(front_s)[i];
                }
            }
            
            array[f] = pivot;
            if(b>0){
                for (int i = 0; i < b; i++) {
                    behind_s[i] = behind[i];
                }
                for (int i = 0; i < b; i++) {
                    array[i+1+f] = qs(behind_s)[i];
                }    
            }
            
            return array;
        }

    }
    public static void main(String[] args) {
        int[] array = {10,3,2,8,5,21,13,14,1,4};
        int[] array_sorted = qs(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array_sorted[i]+", ");
        }
    }
}
