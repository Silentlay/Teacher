import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService {
    private final List<Teacher> teacherList = new ArrayList<>();

    // Добавление учителя
    public void addTeacher(String firstName, String lastName, String middleName, Long teacherId){
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teacher.setTeacherId(teacherId);
        teacherList.add(teacher);
    }

    // Удаление учителя по ФИО
    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        teacherList.removeIf(teacher -> teacher.getFirstName().equals(firstName) &&
                teacher.getLastName().equals(lastName) &&
                teacher.getMiddleName().equals(middleName));
    }

    // Редактирование учителя по ID
    public void editTeacher(Long teacherId, String newFirstName, String newLastName, String newMiddleName) {
        for (Teacher teacher : teacherList) {
            if(teacher.getTeacherId().equals(teacherId)) {
                teacher.setFirstName(newFirstName);
                teacher.setLastName(newLastName);
                teacher.setMiddleName(newMiddleName);
                break;
            }
        }
    }

// Получение отсортированного списка учителей
public List<Teacher> getSortedTeacherList() {
    List<Teacher> sortedList = new ArrayList<>(teacherList);
    Collections.sort(sortedList);
    return sortedList;
}

// Получение списка всех учителей
    public List<Teacher> getAllTeachers(){
        return new ArrayList<>(teacherList);
    }
}