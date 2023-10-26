public class Student extends Person{

    private String major;


    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {

        return major;
    }

    public void setMajor(String major) {

        this.major = major;
    }

    public void introduce() {
        System.out.println("Hello I am " + getName()  + getAge() + " years old " + "my major is :"+ major );
    }
}
