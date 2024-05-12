package ProjectCoordinator;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ProjectCoordinator_database {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Welcome back Project Coordinator!\n" +
            "Please select a number to continue working with this program , if you want to finish select 5";
    public void showOptions(){
        System.out.println("1. Create a new project\n" +
                "2. Assign a role\n" +
                "3. Assign a responsibility" +
                "4. Show the progress of the projects\n" +
                "5. Show the deadlines of the projects\n" +
                "6. Show the approximate end date of the project\n" +
                "7. Show the date of the start of the project\n" +
                "8. Show all roles and responsibilities\n" +
                "9. Exit");;
    }
    public String selectOption(){
        ProjectCoordinator_CRUDUtils projectCoordinatorCrudUtils = new ProjectCoordinator_CRUDUtils();
        String option = null;
        String selectOption = scanner.next();

        if(selectOption.equals("1")){

        }else if(selectOption.equals("2")){

        }else if(selectOption.equals("3")){

        }else if(selectOption.equals("4")){

        }else if(selectOption.equals("5")){

        }else if(selectOption.equals("6")){

        }else if(selectOption.equals("7")){

        }else if(selectOption.equals("8")){

        }else if(selectOption.equals("9")){
            option = "Thank you for your hard work! The program is over.";
        }
        return option;
    }

}
