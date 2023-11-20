package com.gordeeva.servletsquizapp.servlets;

import com.gordeeva.servletsquizapp.services.QuizService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "QuizServlet", urlPatterns = "/quizServlet")
public class QuizServlet extends HttpServlet {

    private QuizService quizService = new QuizService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("quiz.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int result = quizService.getTestResult(request);
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
