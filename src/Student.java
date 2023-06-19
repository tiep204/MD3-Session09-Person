public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    @Override
    public void displayInfo() {
        System.out.println("Student:\n Tên:"+ this.getName()+ "  Tuổi: "+this.getAge());
    }
}
