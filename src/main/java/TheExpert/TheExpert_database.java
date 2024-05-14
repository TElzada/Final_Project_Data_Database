package TheExpert;

import ProjectCoordinator.Progress;
import ProjectCoordinator.Projects;
import ResearchAdvisor.Evaluation;
import ResearchAdvisor.Recommendation;

import java.util.List;
import java.util.Scanner;

public class TheExpert_database {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Welcome back Project Coordinator!\n" +
            "Please select a number to continue working with this program , if you want to finish select 8";
    public void showOptions() {
        System.out.println("1. Show all projects\n" +
                "2. Show the progress of the projects\n" +
                "3. Show the date of the start of the projects\n" +
                "4. Show the recommendations\n" +
                "5. Show the evaluation of the projects\n" +
                "6. Evaluate the project\n"+
                "7. Exit");
    }
    public String selectOption() {
        TheExpert_CRUDUtils theExpertCrudUtils = new TheExpert_CRUDUtils();
        String option = null;
        String selectOption = scanner.next();

        if (selectOption.equals("1")) {
            List<Projects> projects = TheExpert_CRUDUtils.getProjectsData("SELECT * FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("2")) {
            List<Progress>progressData = TheExpert_CRUDUtils.getProgressData("SELECT * FROM progress");
            option = progressData.toString();
        } else if (selectOption.equals("3")) {
            List<Projects> projects = TheExpert_CRUDUtils.getProjectsData("SELECT start FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("4")) {
            List<Recommendation> recommendations = TheExpert_CRUDUtils.getRecommendationData("SELECT * FROM recommendations");
            option = recommendations.toString();
        } else if (selectOption.equals("5")) {
            List<Evaluation> evaluations = TheExpert_CRUDUtils.getEvaluationData("SELECT * FROM projectEvaluation");
            option = evaluations.toString();
        } else if (selectOption.equals("6")) {
            List<Evaluation> grades =TheExpert_CRUDUtils.updateEvaluation(String.valueOf(50), 5);
            option = grades.toString();
        } else if (selectOption.equals("7")) {
            option = "Thank you for your hard work! The program is over.";
        }
        return option;
    }
}
