public class Main {
    public static void main(String[] args) {
        Student student = new Student("Đặng Trần Tiệp",19);
        Teacher teacher = new Teacher("Nguyễn văn Thầy",20);
        teacher.displayInfo();
        student.displayInfo();
    }
}