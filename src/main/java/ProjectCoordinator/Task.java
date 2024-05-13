package ProjectCoordinator;

public class Task {
    private int id;
    private String name;
    private String surname;
    private String role;
    private String responsibility;

    public Task(int id , String name , String surname ,String role , String responsibility) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.responsibility = responsibility;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role='" + role + '\'' +
                ", responsibility='" + responsibility + '\'' +
                '}';
    }
}
