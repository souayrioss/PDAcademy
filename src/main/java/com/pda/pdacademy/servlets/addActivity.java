package com.pda.pdacademy.servlets;

import com.pda.pdacademy.entity.Activity;
import com.pda.pdacademy.hibernate.HibernateFactory;
import jakarta.persistence.EntityManager;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.hibernate.Transaction;

import java.io.IOException;

@WebServlet(name = "addActivity", value = "/activities/create")
public class addActivity extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Transaction transaction = null;
    EntityManager em = new HibernateFactory().getEntityManager();
    try  {
      transaction = (Transaction) em.getTransaction();
      transaction.begin();
      em.persist(new Object());
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      e.printStackTrace();
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
