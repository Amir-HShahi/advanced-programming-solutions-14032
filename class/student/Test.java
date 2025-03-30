public class Test {
    public static void main(String[] args) {
        Student[] array = new Student[100];
        for (int i = 0; i < 100; i++) {
            Student student = new Student();
            student.setFirstName("Jesse");
            student.setLastName("Pinkman");
            student.setStudentNo("4030711300");
            array[i] = student;
        }
    }
}
