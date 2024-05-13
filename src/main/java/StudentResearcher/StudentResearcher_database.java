package StudentResearcher;
import ProjectCoordinator.Progress;
import ProjectCoordinator.ProjectCoordinator_CRUDUtils;
import ProjectCoordinator.Projects;
import ProjectCoordinator.Task;

import java.util.List;
import java.util.Scanner;

public class StudentResearcher_database {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Welcome back Student-Researcher!\n" +
            "Please select a number to continue working with this program , if you want to finish select 5";
    public void showOptions(){
        System.out.println("1. Show all projects\n" +
                "2. Show the progress of the projects\n " +
                "3. Update the progress of the projects\n" +
                "4. Show the deadlines of the projects\n" +
                "5. Show the date of the start of the project\n" +
                "6. Exit");
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
        } else if (selectOption.equals("4")) {
            List<Projects> projects = StudentResearcher_CRUDUtils.getProjectsData("SELECT deadline FROM projects");
            option = projects.toString();
        }else if (selectOption.equals("5")) {
            List<Projects>projects = StudentResearcher_CRUDUtils.getProjectsData("SELECT start FROM projects");
            option = projects.toString();
        } else if (selectOption.equals("6")) {
            option = "Thank you for your hard work! The program is over.";
        }
        return option;
    }


}
