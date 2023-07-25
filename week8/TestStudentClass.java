public class TestStudentClass {
    public static void main(String[] args) {
        Person p = new Person("Yuxiao","123456","jx");
        Student s = new Student("Yuki","123457","hk","345","345@cityu.com");
        p.print();
        System.out.print("\n");
        s.print();
    }
}
