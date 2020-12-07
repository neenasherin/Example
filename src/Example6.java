final class Employee3{
final String name;
final int age;
public Employee3(String name,int age){
    this.name=name;
    this.age=age;
}

    public String getName()
    {
        return name;
    }

}
public class Example6 {

    public static void main(String[] args) {
        Employee3 emp=new Employee3("io",33);
        Employee3 emp1=new Employee3("sddcd",33);
       System.out.println(emp1.getName());



    }
}
