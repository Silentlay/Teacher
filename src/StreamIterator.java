import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int currentIndex = 0;
    private final List<StudentGroup> groups;

    public StreamIterator(Stream stream) {
        this.groups = stream.getGroups();
    }

    @Override
    public boolean hasNext() {
        return currentIndex <groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(currentIndex++);
    }
}
