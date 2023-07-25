
public class InClassCourse {
    private static int numCourses = 0;
    public InClassCourse(){
        numCourses++;
    }
    public int getter(){
        return numCourses;
    }
}