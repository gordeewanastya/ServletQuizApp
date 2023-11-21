package com.gordeeva.servletsquizapp.services;

import com.gordeeva.servletsquizapp.model.QuizEntity;
import com.gordeeva.servletsquizapp.model.dao.QuestionDao;

import java.util.List;

public class QuizEntityService {
    private final QuestionDao questionDao = new QuestionDao();

    public List<QuizEntity> getAllQuizEntities(){
        return questionDao.getAllQuizEntities();
    }
}
