package com.gordeeva.servletsquizapp.services;

import com.gordeeva.servletsquizapp.model.QuizEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizService {
    private final QuizEntityService quizEntityService = new QuizEntityService();
    private Map<String,String> quizMap;
    public QuizService(){
        this.quizMap = getQuizMap();
    }

    private Map<String,String> getQuizMap(){
        List<QuizEntity> quizEntityList =  quizEntityService.getAllQuizEntities();
        Map<String,String> quizMap = new HashMap<>();
        for(QuizEntity quizEntity: quizEntityList){
            quizMap.put(quizEntity.getQuestion(), quizEntity.getAnswer());
        }
        return quizMap;
    }

    public int getTestResult(HttpServletRequest request){
        Map<String, String[]> userAnswers = request.getParameterMap();
        return calculateTestResult(userAnswers);
    }

    public int calculateTestResult(Map<String,String[]> userAnswers){
        int result = 0;

        for(Map.Entry<String, String[]> entry: userAnswers.entrySet()){
            if(entry.getValue()[0].equals(quizMap.get(entry.getKey()))){
                result++;
            }
        }

        return result;
    }
}
