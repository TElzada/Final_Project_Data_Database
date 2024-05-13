package ResearchAdvisor;

import ProjectCoordinator.Progress;
import ProjectCoordinator.ProjectCoordinator_CRUDUtils;
import ProjectCoordinator.Projects;
import ProjectCoordinator.Task;
import StudentResearcher.StudentResearcher_CRUDUtils;

import java.util.List;
import java.util.Scanner;

public class ResearchAdvisor_database {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Welcome back Research Manager!\n" +
            "Please select a number to continue working with this program , if you want to finish select 9";
    public void showOptions() {
        System.out.println("1. Show all projects\n" +
                "2. Show the progress of the projects\n" +
                "3. Show the deadlines of the projects\n" +
                "4. Show the date of the start of the projects\n" +
                "5. Show the recommendations\n" +
                "6. Show the evaluation of the projects\n" +
                "7. Add a recommendation to the project\n" +
                "8. Evaluate the project\n" +
                "9. Exit");
    }
    public String selectOption() {
        ResearchAdvisor_CRUDUtils researchAdvisor_crudUtils = new ResearchAdvisor_CRUDUtils();
        String option = null;
        String selectOption = scanner.next();

        if (selectOption.equals("1")) {
            List<Projects> projects = ResearchAdvisor_CRUDUtils.getProjectsData("SELECT * FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("2")) {
            List<Progress>progressData = ResearchAdvisor_CRUDUtils.getProgressData("SELECT * FROM progress");
            option = progressData.toString();
        } else if (selectOption.equals("3")) {
            List<Projects> projects = ResearchAdvisor_CRUDUtils.getProjectsData("SELECT deadline FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("4")) {
            List<Projects> projects = ResearchAdvisor_CRUDUtils.getProjectsData("SELECT start FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("5")) {
            List<Recommendation> recommendations = ResearchAdvisor_CRUDUtils.getRecommendationData("SELECT * FROM recommendations");
            option = recommendations.toString();
        } else if (selectOption.equals("6")) {
            List<Evaluation> evaluations = ResearchAdvisor_CRUDUtils.getEvaluationData("SELECT * FROM projectEvaluation");
            option = evaluations.toString();
        } else if (selectOption.equals("7")) {
            List<Recommendation> recommendations = ResearchAdvisor_CRUDUtils.updateRecommendations("Make the code more readable" , 1);
            option = recommendations.toString();
        } else if (selectOption.equals("8")) {
            List<Evaluation> grades = ResearchAdvisor_CRUDUtils.updateEvaluation(String.valueOf(50), 5);
            option = grades.toString();
        } else if (selectOption.equals("9")) {
            option = "Thank you for your hard work! The program is over.";
        }
        return option;
    }
}
