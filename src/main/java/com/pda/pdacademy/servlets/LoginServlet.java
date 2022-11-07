package com.pda.pdacademy.servlets;

import java.io.*;

import com.pda.pdacademy.entity.Admin;
import com.pda.pdacademy.services.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
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

        Admin adminConnect = adminService.login(email,password);


        if (adminConnect == null) {

            message = "password or email as incorrect";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            request.setAttribute("admin",adminConnect);
            HttpSession session = request.getSession();

            session.setAttribute("adminConn", adminConnect);
            request.getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
        }
    }
    public void destroy() {
    }
}