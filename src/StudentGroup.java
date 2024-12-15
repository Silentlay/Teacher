import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

    private List<Student> studentList;

    private String groupName;

    private int groupNumber;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentList.add(new Student(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}