package SystemManager;

import ProjectCoordinator.DBUtils;
import ProjectCoordinator.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SystemManager_CRUDUtils {
    private static String UPDATE_EMAIL = "UPDATE profiles SET email = ? WHERE id = ?";
    private static String UPDATE_POSITION = "UPDATE profiles SET position = ? WHERE id = ?";
    private static String INSERT_PROFILE = "INSERT INTO profiles (name , surname , email , age , position) VALUES(? , ? , ? , ? , ?);";
    private static String DELETE_PROFILE = "DELETE FROM profiles WHERE id = ?";
    public static List<Profiles> updateEmail(String profilesEmail , int profilesId) {
        List<Profiles> updateEmail = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMAIL)) {
            preparedStatement.setString(1, profilesEmail );
            preparedStatement.setInt(2, profilesId);
            preparedStatement.executeUpdate();

            PreparedStatement allProfiles = connection.prepareStatement("SELECT * FROM profiles");
            ResultSet rs = allProfiles.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                String positions = rs.getString("positions");

                updateEmail.add(new Profiles(id, name, surname, email, age, positions));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updateEmail;
    }
    public static List<Profiles> updatePosition(String profilesPositions , int profilesId) {
        List<Profiles> updatePosition = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_POSITION)) {
            preparedStatement.setString(1, profilesPositions);
            preparedStatement.setInt(2, profilesId);
            preparedStatement.executeUpdate();

            PreparedStatement allProfiles = connection.prepareStatement("SELECT * FROM profiles");
            ResultSet rs = allProfiles.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                String positions = rs.getString("positions");

                updatePosition.add(new Profiles(id, name, surname, email, age, positions));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updatePosition;
    }
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
    public static List<Profiles> getProfilesData(String query) {
        List<Profiles> profiles = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                String positions = rs.getString("positions");

                profiles.add(new Profiles(id, name, surname, email, age, positions));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return profiles;
    }
    public static List<Profiles>createProfiles( String profilesName , String profilesSurname , String profilesEmail , int profilesAge , String profilesPositions) {
        List<Profiles> createProfiles = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PROFILE)) {
            preparedStatement.setString(1, profilesName);
            preparedStatement.setString(2, profilesSurname);
            preparedStatement.setString(3, profilesEmail);
            preparedStatement.setInt(3, profilesAge);
            preparedStatement.setString(3, profilesPositions);
            preparedStatement.executeUpdate();

            PreparedStatement allProfiles = connection.prepareStatement("SELECT * FROM profiles");
            ResultSet rs = allProfiles.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                String positions = rs.getString("positions");

                createProfiles.add(new Profiles(id, name, surname, email, age, positions));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return createProfiles;
    }
    public static List<Profiles> deleteProfiles(int profilesId){
        List<Profiles> deleteProfile = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PROFILE)) {
            preparedStatement.setInt(1, profilesId);
            preparedStatement.executeUpdate();
            PreparedStatement allProfiles = connection.prepareStatement("SELECT * FROM profiles");
            ResultSet rs = allProfiles.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                String positions = rs.getString("positions");

                deleteProfile.add(new Profiles(id, name, surname, email, age, positions));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return deleteProfile;
    }

}

