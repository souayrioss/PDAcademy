package com.pda.pdacademy.servlets;

import com.pda.pdacademy.entity.ActiviteType;
import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.entity.Etat;
import com.pda.pdacademy.services.ActivityService;
import com.pda.pdacademy.services.Iservice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "manageActivity", urlPatterns = {"/activities", "/create-activity", "/insert-activity", "/update-activity", "/edit-activity"})
public class ActivityServlet extends HttpServlet {
  private Iservice<Activity> activityService;
  public void init(){
    //activityService = new ActivityService();
  }
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
//
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getServletPath();
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
    } catch (SQLException | ParseException ex) {
      throw  new ServletException();
    }

  }

  private void listActivities(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
    List<Activity> listActivities = activityService.getAll();
    request.setAttribute("activities", listActivities);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/index.jsp");
    dispatcher.forward(request, response);
  }

  private void updateActivity(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException, ParseException {
    Activity activityToUpdate = new Activity();
    activityToUpdate.setId_activity(Long.parseLong(request.getParameter("id")));
    activityToUpdate.setTitle_activity(request.getParameter("title"));
    activityToUpdate.setDescription_activity(request.getParameter("description"));
    activityToUpdate.setActiviteType(ActiviteType.valueOf(request.getParameter("activity-type")));
    activityToUpdate.setEtat(Etat.valueOf(request.getParameter("activity-etat")));
    activityToUpdate.setStart_date_activity(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    activityToUpdate.setEnd_date_activity(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    activityService.update(activityToUpdate);
    response.sendRedirect("activities");
  }

  private void editForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    Activity activityToEdit = activityService.find(Long.parseLong(request.getParameter("id")));
    request.setAttribute("activity", activityToEdit);
    request.setAttribute("activityTypes", ActiviteType.values());
    request.setAttribute("etats", Etat.values());
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/edit.jsp");
    dispatcher.forward(request, response);
  }

  private void storeActivity(HttpServletRequest request, HttpServletResponse response) throws ParseException, SQLException, ServletException, IOException {
    // create an instance of the data we get
    Activity activity = new Activity();
    activity.setTitle_activity(request.getParameter("title"));
    activity.setDescription_activity(request.getParameter("description"));
    activity.setActiviteType(ActiviteType.valueOf(request.getParameter("activity-type")));
    activity.setEtat(Etat.valueOf(request.getParameter("activity-etat")));
    activity.setStart_date_activity(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    activity.setEnd_date_activity(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    activityService.add(activity);
    response.sendRedirect("activities");
  }

  private void createForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
    request.setAttribute("activityTypes", ActiviteType.values());
    request.setAttribute("etats", Etat.values());
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/create.jsp");
    dispatcher.forward(request, response);
  }
}
