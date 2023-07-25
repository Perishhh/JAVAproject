public class Lab06E2_1 {
    public static void main(String[] args) {
        Double Area1 = computeArea(5.0, 7.0);
        Double Area2 = computeArea(10.0, 20.0);
        System.out.println("The sum of two area is: "+(Area1+Area2));
    }
    public static Double computeArea(Double width, Double length){
        return width*length;
    }
}
