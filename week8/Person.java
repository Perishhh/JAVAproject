public class Person {
    private String name,mobile,address;

    public Person(String _name,String _mobile,String _address){
        name = _name;
        mobile = _mobile;
        address = _address;
    }
    public void print(){
        System.out.print(name+", "+mobile+", "+address);
    }
}   
