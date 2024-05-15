package SystemManager;

public class Profiles {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String positions;

    public Profiles(int id , String name , String surname , String email , int age , String positions) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.positions = positions;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return positions;
    }
    public void setPosition(String positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Profiles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", positions='" + positions + '\'' +
                '}';
    }
}
