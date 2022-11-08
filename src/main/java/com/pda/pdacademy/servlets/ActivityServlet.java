package com.pda.pdacademy.servlets;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.services.ActivityService;
import com.pda.pdacademy.services.Iservice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "manageActivity", urlPatterns = {"/activities", "/create-activity", "/insert-activity", "/update-activity", "/edit-activity"})
public class ActivityServlet extends HttpServlet {
  private Iservice<Activity> activityService;
  public void init(){
    activityService = new ActivityService();
  }
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
//
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getServletPath();
    System.out.println(action);
    try{
      switch (action){
        case "/create-activity":
          createForm(request, response);
          break;
        case "/insert-activity":
          storeActivity(request, response);
          break;
        case "/edit-activity":
          editForm(request, response);
          break;
        case "/update-activity":
          updateActivity(request, response);
          break;
        case "/activities":
          listActivities(request, response);
          break;
      }
    } catch (SQLException ex) {
      throw  new ServletException();
    }

  }

  private void listActivities(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
    List<Activity> listActivities = activityService.getAll();
    request.setAttribute("activities", listActivities);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/index.jsp");
    dispatcher.forward(request, response);
  }

  private void updateActivity(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {

  }

  private void editForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/edit.jsp");
    dispatcher.forward(request, response);
  }

  private void storeActivity(HttpServletRequest request, HttpServletResponse response) {
  }

  private void createForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/create.jsp");
    dispatcher.forward(request, response);
  }

}
