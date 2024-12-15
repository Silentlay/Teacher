import java.util.List;

public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> list) {

        // Прохожусь циклом по студентам
        for (Student student : list) {
            System.out.println(student.getStudentId());
        }
    }
}
