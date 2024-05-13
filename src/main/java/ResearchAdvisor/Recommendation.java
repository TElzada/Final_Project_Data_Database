package ResearchAdvisor;

public class Recommendation {
    private int id;
    private String name;
    private String recommendation;

    public Recommendation(int id , String name , String recommendation) {
        this.id =id;
        this.name = name;
        this.recommendation = recommendation;
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

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", recommendation='" + recommendation + '\'' +
                '}';
    }
}
