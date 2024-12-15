import java.util.List;

public class TeacherController {


    private  final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    // Cоздание нового учителя
    public void createTeacher(String firstName, String lastName, String middleName, Long teacherId){
        teacherService.addTeacher(firstName, lastName, middleName, teacherId);
    }

    // Удаление учителя по ФИО
    public void removeTeacherByFIO(String firstName, String lastName, String middleName){
        teacherService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    // Редактирование учителя по ID
    public void editTeacher(Long teacherId, String newFirstName, String newLastName, String newMiddleName){
        teacherService.editTeacher(teacherId, newFirstName, newLastName, newMiddleName);
    }

    // Получение и вывод списка учителей
    public void getAllTeacher(){
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teachers);
    }

    // Получение и вывод отсортированного списка учителей
    public void getSortedTeachers() {
        List<Teacher> sortedTeachers = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(sortedTeachers);
    }
}