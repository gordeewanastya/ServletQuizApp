package com.gordeeva.servletsquizapp.services;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static java.util.Map.*;

public class QuizService {
    private Map<String,String> answers = ofEntries(
            entry("q1", "b"),
            entry("q2", "c"),
            entry("q3", "b"),
            entry("q4", "b"),
            entry("q5", "a")
    );

    public int getTestResult(HttpServletRequest request){
        Map<String, String[]> userAnswers = request.getParameterMap();
        return calculateTestResult(userAnswers);
    }

    public int calculateTestResult(Map<String,String[]> userAnswers){
        int result = 0;

        for(Map.Entry<String, String[]> entry: userAnswers.entrySet()){
            if(entry.getValue()[0].equals(answers.get(entry.getKey()))){
                result++;
            }
        }

        return result;
    }
}
