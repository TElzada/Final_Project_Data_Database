package StudentResearcher;
import ProjectCoordinator.Progress;
import ProjectCoordinator.ProjectCoordinator_CRUDUtils;
import ProjectCoordinator.Projects;
import ProjectCoordinator.Task;
import ResearchAdvisor.Evaluation;
import ResearchAdvisor.Recommendation;
import ResearchAdvisor.ResearchAdvisor_CRUDUtils;

import java.util.List;
import java.util.Scanner;

public class StudentResearcher_database {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Welcome back Student-Researcher!\n" +
            "Please select a number to continue working with this program , if you want to finish select 8";
    public void showOptions(){
        System.out.println("1. Show all projects\n" +
                "2. Show the progress of the projects\n " +
                "3. Update the progress of the projects\n" +
                "4. Show the recommendations\n"+
                "5. Show evaluation of the projects\n"+
                "6. Show the deadlines of the projects\n" +
                "7. Show the date of the start of the project\n" +
                "8. Exit");
    }
    public String selectOption() {
        StudentResearcher_CRUDUtils studentResearcherCrudUtils = new StudentResearcher_CRUDUtils();
        String option = null;
        String selectOption = scanner.next();

        if (selectOption.equals("1")) {
            List<Projects>projects = StudentResearcher_CRUDUtils.getProjectsData("SELECT * FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("2")) {
            List<Progress>progressData = StudentResearcher_CRUDUtils.getProgressData("SELECT * FROM progress");
            option = progressData.toString();
        } else if (selectOption.equals("3")) {
            List<Progress> progressUpdate = StudentResearcher_CRUDUtils.updateProgress("Finished" , 2);
            option = progressUpdate.toString();
        }else if(selectOption.equals("4")){
            List<Recommendation> recommendations = StudentResearcher_CRUDUtils.getRecommendationData("SELECT * FROM recommendations");
            option = recommendations.toString();
        }else if(selectOption.equals("5")){
            List<Evaluation> evaluations = StudentResearcher_CRUDUtils.getEvaluationData("SELECT * FROM projectEvaluation");
            option = evaluations.toString();
        }else if (selectOption.equals("6")) {
            List<Projects> projects = StudentResearcher_CRUDUtils.getProjectsData("SELECT deadline FROM projects");
            option = projects.toString();
        }else if (selectOption.equals("7")) {
            List<Projects>projects = StudentResearcher_CRUDUtils.getProjectsData("SELECT start FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("8")) {
            option = "Thank you for your hard work! The program is over.";
        }
        return option;
    }


}
