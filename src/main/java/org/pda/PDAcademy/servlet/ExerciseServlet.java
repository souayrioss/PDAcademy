package org.loukili.javac.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.loukili.javac.entity.Exercise;
import org.loukili.javac.entity.ExerciseStatus;
import org.loukili.javac.service.ExerciseService;
import org.loukili.javac.service.ICRUDService;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ExerciseServlet", urlPatterns = {"/exercises", "/create-exercise", "/insert-exercise", "/update-exercise", "/edit-exercise", "/delete-exercise"})
public class ExerciseServlet extends HttpServlet {
  ICRUDService<Exercise> exerciseService;
  public void init(){
    exerciseService = new ExerciseService();
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getServletPath();
    try{
      switch (action){
        case "/create-exercise":
          createForm(request, response);
          break;
        case "/insert-exercise":
          storeExercise(request, response);
          break;
        case "/edit-exercise":
          editForm(request, response);
          break;
        case "/update-exercise":
          updateExercise(request, response);
          break;
        case "/delete-exercise":
          deleteExercise(request, response);
          break;
        case "/exercises":
          listExercises(request, response);
          break;
      }
    } catch (SQLException | ParseException ex) {
      throw  new ServletException();
    }
  }

  private void deleteExercise(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    if (exerciseService.delete(id)){
      response.sendRedirect("exercises");
    }
    System.out.println("something went wrong");
  }

  private void listExercises(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Exercise> listExercises = exerciseService.getAll();
    request.setAttribute("exercises", listExercises);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/exercises/index.jsp");
    dispatcher.forward(request, response);
  }

  private void updateExercise(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException, IOException {
    Exercise exerciseToBeUpdated = new Exercise();

    exerciseToBeUpdated.setId(Long.parseLong(request.getParameter("id")));
    exerciseToBeUpdated.setYear(Integer.valueOf(request.getParameter("year")));
    exerciseToBeUpdated.setTitle(request.getParameter("title"));
    exerciseToBeUpdated.setExerciseStatus(ExerciseStatus.valueOf(request.getParameter("exercise-status")));
    exerciseToBeUpdated.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    exerciseToBeUpdated.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("end-date")));
    exerciseService.update(exerciseToBeUpdated);
    response.sendRedirect("exercises");
  }

  private void editForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Exercise exerciseToEdit = exerciseService.find(Long.parseLong(request.getParameter("id")));
    request.setAttribute("exercise", exerciseToEdit);
    request.setAttribute("status", ExerciseStatus.values());

    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/exercises/edit.jsp");
    dispatcher.forward(request, response);
  }

  private void storeExercise(HttpServletRequest request, HttpServletResponse response) throws ParseException, SQLException, ServletException, IOException{
    Exercise exercise = new Exercise();
    exercise.setYear(Integer.valueOf(request.getParameter("year")));
    exercise.setTitle(request.getParameter("title"));
    exercise.setExerciseStatus(ExerciseStatus.valueOf(request.getParameter("exercise-status")));
    exercise.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    exercise.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("end-date")));
    exerciseService.add(exercise);
    response.sendRedirect("exercises");
  }

  private void createForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    request.setAttribute("status", ExerciseStatus.values());
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/exercises/create.jsp");
    dispatcher.forward(request, response);
  }


}
