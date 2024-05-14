package ProjectCoordinator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectCoordinator_CRUDUtils {
    private static String UPDATE_ROLES = "UPDATE tasks SET role = ? WHERE id = ?";
    private static String UPDATE_RESPONSIBILITY = "UPDATE tasks SET responsibility = ? WHERE id = ?";
    private static String INSERT_PROJECT = "INSERT INTO projects(name , start , deadline) VALUES(? , ? , ?);";

    public static List<Task> getTaskData(String query){
        List<Task> tasks = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String role = rs.getString("role");
                String responsibility = rs.getString("responsibility");

                tasks.add(new Task(id ,name , surname, role , responsibility));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return tasks;
    }
    public static List<Task>updateRoles( String tasksRole , int tasksId){
        List<Task>updateRoles = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ROLES)){
            preparedStatement.setString(1, tasksRole);
            preparedStatement.setInt(2, tasksId);
            preparedStatement.executeUpdate();

            PreparedStatement allTasks = connection.prepareStatement("SELECT * FROM tasks");
            ResultSet rs = allTasks.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String role = rs.getString("role");
                String responsibility = rs.getString("responsibility");
                updateRoles.add(new Task(id,name , surname ,role , responsibility));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updateRoles;
    }

    public static List<Task>updateResponsibility( String tasksResponsibility , int tasksId){
        List<Task>updateResponsibility = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_RESPONSIBILITY)){
            preparedStatement.setString(1, tasksResponsibility);
            preparedStatement.setInt(2, tasksId);
            preparedStatement.executeUpdate();

            PreparedStatement allTasks = connection.prepareStatement("SELECT * FROM tasks");
            ResultSet rs = allTasks.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String role = rs.getString("role");
                String responsibility = rs.getString("responsibility");
                updateResponsibility.add(new Task(id,name , surname ,role , responsibility));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updateResponsibility;
    }

    public static List<Projects> getProjectsData(String query) {
        List<Projects> projects = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String start = rs.getString("start");
                String deadline = rs.getString("deadline");

                projects.add(new Projects(id, name, start, deadline));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return projects;
    }

    public static List<Projects>saveProjects( String projectsName , String projectsStart , String projectsDeadline){
        List<Projects>saveProjects = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PROJECT)){
            preparedStatement.setString(1, projectsName);
            preparedStatement.setString(2, projectsStart);
            preparedStatement.setString(3, projectsDeadline);
            preparedStatement.executeUpdate();

            PreparedStatement allProjects = connection.prepareStatement("SELECT * FROM tasks");
            ResultSet rs = allProjects.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String start = rs.getString("start");
                String deadline = rs.getString("deadline");
                saveProjects.add(new Projects(id, name , start ,deadline));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return saveProjects;
    }

    public static List<Progress> getProgressData(String query) {
        List<Progress> progressData = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String status = rs.getString("status");


                progressData.add(new Progress(id, name, status));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return progressData;
    }
}
