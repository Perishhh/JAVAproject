public class InClassStudent {
    private String stuName,stuId;

    public void setName(String Name){
        stuName = Name;
    }
    public void setId(String Id){
        stuId = Id;
    }
    public String getName(){
        return stuName;
    }
    public String getId(){
        return stuId;
    }
    public void print(){
        System.out.println(
            "Student name: " + stuName + ", student id: " + stuId
        );
    }
    public void print(double gpa){
        System.out.println(
            "Gpa of " + stuName + "(" + stuId + ") is " + gpa
        );
    }
    public void print(int numEnrolledCourses){
        System.out.println(
            stuName + "(" + stuId + ") enrolled " +
            numEnrolledCourses + " Courses"
        );
    }
}
