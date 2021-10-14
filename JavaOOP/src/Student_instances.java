import model.Student;

public class Student_instances {

    public static void main(String[] args) {
        Student Peter = new Student();
        Peter.setName("Peter");
        Peter.setAge(23);
        Peter.setGender("male");
        Peter.setID_NO("1234");
        System.out.println(Peter.getName());
        System.out.println(Peter.getAge());
        System.out.println(Peter.getGender());
        System.out.println(Peter.getID_NO());
    }

}
