import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;

    public Stream(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<StudentGroup> iterator(){
        return new StreamIterator(this);
    }
}
