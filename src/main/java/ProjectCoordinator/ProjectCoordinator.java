package ProjectCoordinator;
import java.util.List;
import java.util.Scanner;
public class ProjectCoordinator {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Welcome back Project Coordinator!\n" +
            "Please select a number to continue working with this program , if you want to finish select 8";
    public void showOptions(){
        System.out.println("1. Create a new project\n" +
                "2. Assign a role\n" +
                "3. Assign a responsibility" +
                "4. Show the progress of the projects\n" +
                "5. Show the deadlines of the projects\n" +
                "6. Show the date of the start of the project\n" +
                "7. Show all roles and responsibilities\n" +
                "8. Exit");;
    }
    public String selectOption(){
        ProjectCoordinator_CRUDUtils projectCoordinatorCrudUtils = new ProjectCoordinator_CRUDUtils();
        String option = null;
        String selectOption = scanner.next();

        if(selectOption.equals("1")){
            List<Projects> projects = ProjectCoordinator_CRUDUtils.saveProjects("Web map of the city", "23.04.24" , "30.05.24");
            option = projects.toString();
        }else if(selectOption.equals("2")){
            List<Task> tasks = ProjectCoordinator_CRUDUtils.updateRoles("Manager", 2);
            option = tasks.toString();
        }else if(selectOption.equals("3")){
            List<Task> responsibilities = ProjectCoordinator_CRUDUtils.updateResponsibility("Manage the system" , 2);
            option = responsibilities.toString();
        }else if(selectOption.equals("4")){
            List<Progress>progressData = ProjectCoordinator_CRUDUtils.getProgressData("SELECT * FROM progress");
            option = progressData.toString();
        }else if(selectOption.equals("5")){
            List<Projects>projects = ProjectCoordinator_CRUDUtils.getProjectsData("SELECT deadline FROM projects");
            option = projects.toString();
        }else if(selectOption.equals("6")){
            List<Projects>projects = ProjectCoordinator_CRUDUtils.getProjectsData("SELECT start FROM projects");
            option = projects.toString();
        }else if(selectOption.equals("7")){
            List<Task> data = ProjectCoordinator_CRUDUtils.getTaskData("SELECT * FROM tasks");
            option = data.toString();
        }else if(selectOption.equals("8")){
            option = "Thank you for your hard work! The program is over.";
        }
        return option;
    }

}
