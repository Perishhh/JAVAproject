import java.util.Scanner;
import java.io.*;
public class Lab04E2_03 {
    public static void main(String[] args) throws IOException {
        File myfile = new File("user-input.txt");
        FileWriter outputFile = new FileWriter(myfile);
        Scanner kb = new Scanner(System.in);
        String line;
        System.out.println("Input a line, enter \"end\" to end the input."); 
        do{
            line = kb.nextLine();
            outputFile.write(line+"\n");
        }while(!line.equalsIgnoreCase("end"));
        kb.close();outputFile.close();
    }
}