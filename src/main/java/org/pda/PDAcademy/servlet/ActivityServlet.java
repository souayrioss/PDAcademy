package org.loukili.javac.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.loukili.javac.entity.*;
import org.loukili.javac.service.ActivityService;
import org.loukili.javac.service.ExerciseService;
import org.loukili.javac.service.ICRUDService;
import org.loukili.javac.service.ResponsibleService;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ActivityServlet", urlPatterns = {"/activities", "/create-activity", "/insert-activity", "/update-activity", "/edit-activity", "/delete-activity"})
public class ActivityServlet extends HttpServlet {
  ICRUDService<Activity> activityService;
  public void init(){
    activityService = new ActivityService();
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
        case "/delete-activity":
          deleteActivity(request, response);
          break;
        case "/activities":
          listActivities(request, response);
          break;
      }
    } catch (SQLException | ParseException ex) {
      throw  new ServletException();
    }
  }


  private void listActivities(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, ParseException, IOException {
    List<Activity> listActivities = activityService.getAll();
    request.setAttribute("activities", listActivities);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/index.jsp");
    dispatcher.forward(request, response);

  }

  private void deleteActivity(HttpServletRequest request, HttpServletResponse response) {

  }

  private void updateActivity(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException {
    Activity activityToBeUpdated = new Activity();
    List<Exercise> exercisesToActivity = new ArrayList<>();
    String[] assignedExercises = request.getParameterValues("exercises");
    Arrays.stream(assignedExercises).forEach(exercise -> {
      // get the exercise from the db, and add it to exercises list
      exercisesToActivity.add(new ExerciseService().find(Long.parseLong(exercise)));
    });
    activityToBeUpdated.setId(Long.parseLong(request.getParameter("id")));
    activityToBeUpdated.setTitle(request.getParameter("title"));
    activityToBeUpdated.setDescription(request.getParameter("description"));
    activityToBeUpdated.setState(State.valueOf(request.getParameter("activity-state")));
    activityToBeUpdated.setActivityType(ActivityType.valueOf(request.getParameter("activity-type")));
    activityToBeUpdated.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    activityToBeUpdated.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("end-date")));
    Responsible responsible = new ResponsibleService().find(Long.parseLong(request.getParameter("responsible")));
    activityToBeUpdated.setResponsible(responsible);
    activityToBeUpdated.setExercises(exercisesToActivity);
    activityService.update(activityToBeUpdated);
    response.sendRedirect("activities");
  }

  private void editForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Activity activityToEdit = activityService.find(Long.parseLong(request.getParameter("id")));
    request.setAttribute("exercises", new ExerciseService().getAll());
    request.setAttribute("activity", activityToEdit);
    request.setAttribute("states", State.values());
    request.setAttribute("activityTypes", ActivityType.values());
    request.setAttribute("responsibles", new ResponsibleService().getAll());


    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/edit.jsp");
    dispatcher.forward(request, response);
  }

  private void storeActivity(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
    Activity activity = new Activity();
    activity.setTitle(request.getParameter("title"));
    activity.setDescription(request.getParameter("description"));
    activity.setActivityType(ActivityType.valueOf(request.getParameter("activity-type")));
    activity.setState(State.valueOf(request.getParameter("activity-state")));
    activity.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
    activity.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("end-date")));
    Responsible responsible = new ResponsibleService().find(Long.parseLong(request.getParameter("responsible")));
    activity.setResponsible(responsible);
    activityService.add(activity);
    response.sendRedirect("activities");
  }

  private void createForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("states", State.values());
    request.setAttribute("activityTypes", ActivityType.values());
    request.setAttribute("responsibles", new ResponsibleService().getAll());
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/activities/create.jsp");
    dispatcher.forward(request, response);
  }
}
