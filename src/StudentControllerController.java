import java.util.List;


public class StudentControllerController implements UserController<Student>{

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StreamService streamService = new StreamService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentListByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentListByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}