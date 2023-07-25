public class Lab05E2_1 {
    public static void main(String[] args) {
        //new keyword
        Double[] array1 = new Double[4];
        array1[0] = 13.5;
        array1[1] = 24.8;
        array1[2] = 31.4;
        array1[3] = 24.8;
        System.out.println("The second entry of the array1 is: "+array1[1]);

        //initialization
        Double[] array2 = {13.5,24.8,31.4,24.8};
        System.out.println("The second entry of the array2 is: "+array2[1]);
    }
}
