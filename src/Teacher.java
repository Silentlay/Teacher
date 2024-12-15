import java.util.List;

public class Teacher extends User implements Comparable<Teacher>{

    private List<Teacher> teacherList;

    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }


    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
 }
