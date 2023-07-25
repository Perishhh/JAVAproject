import java.util.Random;
public class TestStuClass {
    public static void main(String[] args) {
        InClassStudent[] ICS = new InClassStudent[5];
        for (int i = 0; i < ICS.length; i++) {
            ICS[i] = new InClassStudent();
            ICS[i].setName("Student "+(i+1));
            ICS[i].setId(""+(i+1));
        }
        for (int i = 0; i < ICS.length; i++) {
            ICS[i].print();
        }
        Random r = new Random();
        for (int i = 0; i < ICS.length; i++) {
            ICS[i].print(r.nextDouble()*1.15+2.85);
        }
        for (int i = 0; i < ICS.length; i++) {
            ICS[i].print(r.nextInt(9)+1);
        }
    }
}
