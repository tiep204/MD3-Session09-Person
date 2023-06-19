public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: \n Tên : "+getName() + "  Tuổi : "+getAge());
    }
}
