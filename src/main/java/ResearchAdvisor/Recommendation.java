package ResearchAdvisor;

public class Recommendation {
    private int id;
    private String name;
    private String recommendations;

    public Recommendation(int id , String name , String recommendations) {
        this.id =id;
        this.name = name;
        this.recommendations = recommendations;
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

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", recommendations='" + recommendations + '\'' +
                '}';
    }
}
