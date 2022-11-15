package org.loukili.javac.servlet;

import java.io.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.hibernate.Transaction;
import org.loukili.javac.entity.*;
import org.loukili.javac.hibernate.HibernateFactory;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
  private String message;

  public void init() {
    message = "Hello World!";
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");
//    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
//    System.out.println("entityManager open "+entityManagerFactory.isOpen());

    // Hello
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<h1>" + message + "</h1>");
    out.println("</body></html>");
  }

  public void destroy() {
  }
}
