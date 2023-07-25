public class Student extends Person{
    private String stuId,email;
    public Student(String _name,String _mobile,String _address,String _stuId,String _email){
        super(_name,_mobile,_address);
        stuId = _stuId;
        email = _email;
    }
    @Override
    public void print(){
        super.print();
        System.out.print(", "+stuId+", "+email);
    }
}
