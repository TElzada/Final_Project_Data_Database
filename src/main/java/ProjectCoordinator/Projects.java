package ProjectCoordinator;

public class Projects {
    private int id;
    private String name;
    private String start;
    private String deadline;

    public Projects(int id , String name , String start , String deadline) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start='" + start + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
