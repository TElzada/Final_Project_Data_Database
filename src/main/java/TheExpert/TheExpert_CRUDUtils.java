package TheExpert;

import ProjectCoordinator.DBUtils;
import ProjectCoordinator.Progress;
import ProjectCoordinator.Projects;
import ResearchAdvisor.Evaluation;
import ResearchAdvisor.Recommendation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TheExpert_CRUDUtils {
    private static String UPDATE_EVALUATION = "UPDATE projectEvaluation SET grade = ? WHERE id = ?";
    public static List<Evaluation> updateEvaluation(String projectEvaluationGrade , int projectEvaluationId) {
        List<Evaluation> updateEvaluation = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EVALUATION)) {
            preparedStatement.setString(1, projectEvaluationGrade);
            preparedStatement.setInt(2, projectEvaluationId);
            preparedStatement.executeUpdate();

            PreparedStatement allEvaluation = connection.prepareStatement("SELECT * FROM projectEvaluation");
            ResultSet rs = allEvaluation.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int grade = rs.getInt("grade");
                updateEvaluation.add(new Evaluation(id, name, grade));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updateEvaluation;
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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return progressData;
    }
    public static List<Recommendation> getRecommendationData(String query) {
        List<Recommendation> recommendationData = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String recommendation = rs.getString("recommendation");

                recommendationData.add(new Recommendation(id, name, recommendation));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return recommendationData;
    }
    public static List<Evaluation> getEvaluationData(String query) {
        List<Evaluation> evaluation = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int grade = rs.getInt("grade");

                evaluation.add(new Evaluation(id, name, grade));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return evaluation;
    }
}
