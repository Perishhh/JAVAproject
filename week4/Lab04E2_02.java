import java.util.Scanner;
import java.io.*;
public class Lab04E2_02 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("in-class-ex2.txt");
        Scanner inputfile = new Scanner(file);
        int totalOfLine = 0;
        while(inputfile.hasNext()){
            totalOfLine++;
            String line = inputfile.nextLine();
            System.out.println(line);
        }
        System.out.printf("%d lines in total.", totalOfLine);
        inputfile.close();
    }
}