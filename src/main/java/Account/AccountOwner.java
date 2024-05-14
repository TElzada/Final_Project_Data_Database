package Account;

import Login_Password.Login_and_Password;
import ProjectCoordinator.ProjectCoordinator;
import ResearchAdvisor.ResearchAdvisor;
import StudentResearcher.StudentResearcher;
import TheExpert.TheExpert;
import SystemManager.SystemManager;

import java.util.Scanner;

public class AccountOwner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login_and_Password login = new Login_and_Password();

        System.out.print("Log into your own account:");
        String logIn = scanner.next();
        if (logIn.equals(login.ProjectCoordinatorLogin)) {
            ProjectCoordinator projectCoordinator = new ProjectCoordinator();
            System.out.print("Enter your password:");
            String passwordPC = scanner.next();
            if (passwordPC.equals(login.ProjectCoordinatorPassword)) {
                System.out.println(projectCoordinator.greetings);
                projectCoordinator.showOptions();
                String option = projectCoordinator.selectOption();
                System.out.println(option);
            }else{
                System.out.println("Password entered incorrectly , please try again!");
            }
        }else if(logIn.equals(login.StudentResearcherLogin)){
            StudentResearcher studentResearcher = new StudentResearcher();
            System.out.println("Enter your password:");
            String passwordSR = scanner.next();
            if (passwordSR.equals(login.StudentResearcherPassword)) {
                System.out.println(studentResearcher.greetings);
                studentResearcher.showOptions();
                String option = studentResearcher.selectOption();
                System.out.println(option);
            }else{
                System.out.println("Password entered incorrectly , please try again!");
            }
        }else if(logIn.equals(login.ResearchAdvisorLogin)){
            ResearchAdvisor researchAdvisor = new ResearchAdvisor();
            System.out.println("Enter your password:");
            String passwordRA = scanner.next();
            if (passwordRA.equals(login.ResearchAdvisorPassword)) {
                System.out.println(researchAdvisor.greetings);
                researchAdvisor.showOptions();
                String option = researchAdvisor.selectOption();
                System.out.println(option);
            }else{
                System.out.println("Password entered incorrectly , please try again!");
            }
        }else if(logIn.equals(login.TheExpertLogin)){
            TheExpert theExpert= new TheExpert();
            System.out.println("Enter your password:");
            String passwordTE = scanner.next();
            if (passwordTE.equals(login.TheExpertPassword)) {
                System.out.println(theExpert.greetings);
                theExpert.showOptions();
                String option = theExpert.selectOption();
                System.out.println(option);
            }else{
                System.out.println("Password entered incorrectly , please try again!");
            }
        }else if(logIn.equals(login.SystemManagerLogin)){
            SystemManager systemManager = new SystemManager();
            System.out.println("Enter your password:");
            String passwordSM = scanner.next();
            if (passwordSM.equals(login.SystemManagerPassword)) {
                System.out.println(systemManager.greetings);
                systemManager.showOptions();
                String option = systemManager.selectOption();
                System.out.println(option);
            }else{
                System.out.println("Password entered incorrectly , please try again!");
            }
        }else{
            System.out.println("This account does not exist , please try again!");
        }
    }
}
