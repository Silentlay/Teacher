import java.util.List;


public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {

        // Прохожусь циклом по учителям
        for (Teacher teacher : list) {
            System.out.println("Id: " + teacher.getTeacherId() + ", ФИО: "  + teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getMiddleName());
        }
    }
}


