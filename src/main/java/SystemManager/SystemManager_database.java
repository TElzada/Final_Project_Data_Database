package SystemManager;

import ProjectCoordinator.Task;

import java.util.List;
import java.util.Scanner;

public class SystemManager_database {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Welcome back The Expert!\n" +
            "Please select a number to continue working with this program , if you want to finish select 6";
    public void showOptions() {
        System.out.println("1. Show all profiles\n" +
                "2. Show all roles and responsibilities\n" +
                "3. Create profiles\n" +
                "4. Update profiles\n" +
                "5. Delete profiles\n" +
                "6. Exit");
    }
    public String selectOption() {
        SystemManager_CRUDUtils systemManagerCrudUtils = new SystemManager_CRUDUtils();
        String option = null;
        String selectOption = scanner.next();

        if (selectOption.equals("1")) {
            List<Profiles> profiles = SystemManager_CRUDUtils.getProfilesData("SELECT * FROM profiles");
            option = profiles.toString();
        } else if (selectOption.equals("2")) {
            List<Task> tasks = SystemManager_CRUDUtils.getTaskData("SELECT * FROM tasks");
            option = tasks.toString();
        } else if (selectOption.equals("3")) {
            List<Profiles> profiles = SystemManager_CRUDUtils.createProfiles("Jensen" , "Ackles" , "jackles@gmail.com" , 40 , "Sponsor");
            option = profiles.toString();
        } else if (selectOption.equals("4")) {
            System.out.println("1. Update email\n" +
                    "2. Update position");
            System.out.println("Choose one of the categories");
            String category = scanner.next();
            if(category.equals("1")){
                List<Profiles> profiles = SystemManager_CRUDUtils.updateEmail("novak12@gmail.com", 5);
                option = profiles.toString();
            }else if(category.equals("2")){
                List<Profiles> profiles = SystemManager_CRUDUtils.updatePosition("The Expert", 3);
                option = profiles.toString();
            }
        } else if (selectOption.equals("5")) {
            List<Profiles> profiles = SystemManager_CRUDUtils.deleteProfiles(1);
            option = profiles.toString();
        } else if (selectOption.equals("6")) {
            option = "Thank you for your hard work! The program is over.";
        }
        return option;
    }
}
