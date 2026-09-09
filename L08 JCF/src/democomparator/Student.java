package democomparator;

public class Student implements Comparable<Student> {
    private final int studentNo;
    private String name; // not null

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Student(%s, %s)", studentNo, name);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.studentNo, o.studentNo);
    }
}
