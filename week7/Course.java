public class Course {
    private static int numCourses;
    private int numEnrollments;
    private String courseCode;
    public Course(String _courseCode){
        courseCode = _courseCode;
        numCourses++;
    }
    public int getNumEnrollments(){return numEnrollments;}
    public String getCourseCode(){return courseCode;}
    public void setCourseCode(String _courseCode){
        courseCode = _courseCode;
    }
    public void add(){
        numEnrollments++;
    }
    public static int getNumCourses(){return numCourses;}
}
