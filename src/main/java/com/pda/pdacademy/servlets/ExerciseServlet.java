package com.pda.pdacademy.servlets;

import com.pda.pdacademy.entity.Exercise;
import com.pda.pdacademy.services.ExerciseService;
import com.pda.pdacademy.services.Iservice;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

@WebServlet(name = "manageActivity", urlPatterns = {"/exercises", "/create-exercise", "/insert-exercise", "/update-exercise", "/edit-exercise"})
public class ExerciseServlet extends HttpServlet {
    private Iservice<Exercise> exerciseService;

    public void init(){
        exerciseService = new ExerciseService();
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
                case "/create-exercise":
                    createForm(request, response);
                    break;
                case "/insert-exercise":
                    storeActivity(request, response);
                    break;
                case "/edit-exercise":
                    editForm(request, response);
                    break;
                case "/update-exercise":
                    updateActivity(request, response);
                    break;
                case "/exercises":
                    listActivities(request, response);
                    break;
            }
        } catch (SQLException | ParseException ex) {
            throw  new ServletException();
        }

    }

    private void listActivities(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
        List<Exercise> exerciseList = exerciseService.getAll();
        request.setAttribute("exercises", exerciseList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/exercises/index.jsp");
        dispatcher.forward(request, response);
    }

    private void updateActivity(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException, ParseException {
        Exercise activityToUpdate = new Exercise();
        activityToUpdate.setId_exercise(Long.parseLong(request.getParameter("id")));

        response.sendRedirect("exercises");
    }

    private void editForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        Exercise activityToEdit = exerciseService.find(Long.parseLong(request.getParameter("id")));
        request.setAttribute("activity", activityToEdit);
        //request.setAttribute("activityTypes", ActiviteType.values());
        //request.setAttribute("etats", Etat.values());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/exercises/edit.jsp");
        dispatcher.forward(request, response);
    }

    private void storeActivity(HttpServletRequest request, HttpServletResponse response) throws ParseException, SQLException, ServletException, IOException {
        // create an instance of the data we get
        Exercise activity = new Exercise();
        /*activity.setTitle_activity(request.getParameter("title"));
        activity.setDescription_activity(request.getParameter("description"));
        activity.setActiviteType(ActiviteType.valueOf(request.getParameter("activity-type")));
        activity.setEtat(Etat.valueOf(request.getParameter("activity-etat")));
        activity.setStart_date_activity(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
        activity.setEnd_date_activity(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("start-date")));
        long id_res = Integer.parseInt(request.getParameter("responsable"));
        Responsable responsable = responsableService.find(id_res);
        activity.setResponsable_id(responsable);
        activityService.add(activity);

         */
        response.sendRedirect("exercises");
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        //request.setAttribute("activityTypes", ActiviteType.values());
        //request.setAttribute("etats", Etat.values());
        //responsableService = new ResponsableService();
        //List responsables = responsableService.getAll();
        //request.setAttribute("responsables" , responsables);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/exercises/create.jsp");
        dispatcher.forward(request, response);
    }
}
