package com.pda.pdacademy.servlets;

import java.io.*;
import java.net.http.HttpClient;

import com.pda.pdacademy.services.ImpService.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = null;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        AdminService adminService = new AdminService();

        boolean a = adminService.login(email,password);
        System.out.println(a);


        if (a == false) {

            message = "password or email as incorrect";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
        }
    }
    public void destroy() {
    }
}