import java.io.*;
import java.util.*;

public class Lab10E2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numName=0;
        try{
            System.out.print("Input the file name: ");
            String filename = kb.nextLine(); 
            System.out.print("Input the number of student names to be read: ");
            int numNamesToBeRead = kb.nextInt();
            File file = new File(filename);
            Scanner infile = new Scanner(file);
            String[] ArrayList = new String[numNamesToBeRead];
            for (int i = 0; i < numNamesToBeRead; i++) {
                ArrayList[i] = infile.nextLine();
                numName++;
            }
            Arrays.sort(ArrayList);
            for (String name: ArrayList){
                System.out.print(name+' ');
            }
            System.out.print('\n');
            infile.close();
        }catch(FileNotFoundException e){
            System.out.println("The file doesn't exist.");
        }catch(InputMismatchException e){
            System.out.println("The number of student names to be read should be an integer.");
        }catch(NoSuchElementException e){
            System.out.printf("Cannot read more than %d student names.\n",numName);
        }finally{
            System.out.println("The end of the try-catch block.");
        }
        kb.close();
    }
}
