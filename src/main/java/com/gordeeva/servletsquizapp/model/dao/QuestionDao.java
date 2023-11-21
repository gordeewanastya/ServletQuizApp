package com.gordeeva.servletsquizapp.model.dao;

import com.gordeeva.servletsquizapp.dbconfig.ConfigurationDBConnection;
import com.gordeeva.servletsquizapp.model.QuizEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao {

    private final String SQL_GET_ALL_QUESTIONS = "SELECT * FROM questions";

    public List<QuizEntity> getAllQuizEntities(){
        List<QuizEntity> allQuizEntities = new ArrayList<>();
        Connection connection = ConfigurationDBConnection.getConnection();

        try(PreparedStatement prepStatement = connection.prepareStatement(SQL_GET_ALL_QUESTIONS)){
            ResultSet rs  = prepStatement.executeQuery();
            while(rs.next()){
                QuizEntity quizEntity = new QuizEntity();
                quizEntity.setQuestion(rs.getString("question"));
                quizEntity.setAnswer(rs.getString("answer"));
                allQuizEntities.add(quizEntity);
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }

        return allQuizEntities;
    }
}
