public class Student{
    private static int numStudents;
    private String stuName,stuId;
    private boolean nameV=false,idV=false;
    private boolean change= false;
    public Student(){}
    public Student(String _stuName){
        setStuName(_stuName);
    }
    public Student(String _stuName, String _stuId){
        setStuName(_stuName);
        setStuId(_stuId);

    }
    public static int getNumStudents(){return numStudents;}
    public void setStuName(String _stuName){
        if (_stuName != "" && _stuName.length()>=3){
            stuName = _stuName;
            nameV = true;
            stuValid();
        }else{
            System.out.println("Invalid student name");
            return;
        }
    }
    public void setStuId(String _stuId){
        if (_stuId != "" && _stuId.length()==8){
            stuId = _stuId; 
            idV =true;
            stuValid();
        }else{
            System.out.println("Invalid student id");
            return;
        }
    }
    public String getStuName(){
        if (nameV && stuName.length()>=3){
            return stuName;
        }else{
            return "**Invalid name**";
        }
    }
    public String getStuId(){
        if (idV && stuId.length()==8){
            return stuId;
        }else{
            return "**Invalid id**";
        }
    }
    public void enroll(Course course){
        if(course != null && nameV && idV &&
           stuName.length()>=3 && stuId.length()==8){
            course.add();
        }else{
            System.out.println("Student information is invalid, cannot enroll the course");
            return;
        }
    }
    private void stuValid(){
        if(idV && stuId.length()==8 &&
           nameV && stuName.length()>=3 && change == false){
            numStudents++;
            change = true;
        }else return;
        
    }
}
