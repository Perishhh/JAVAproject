import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try {
            File file = new File("test1.txt");
            System.out.println("Line 1");
            Scanner fileReader = new Scanner(file);
            System.out.println("Line 2");
            fileReader.close();
            System.out.println("Line 3");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        } catch (IOException e) {
            System.out.println("IOException caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally clause");
        }
           
    }
}
