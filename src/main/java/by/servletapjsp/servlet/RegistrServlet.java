package by.servletapjsp.servlet;

import by.servletapjsp.entity.User;
import by.servletapjsp.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "RegistrServlet", urlPatterns = "/registr")
//public class RegistrServlet extends HttpServlet {
//    private UserService userService = new UserService();
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("name");
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
//        String age = request.getParameter("age");
//        String id = request.getParameter("id");
//        int age1 = Integer.parseInt(age);
//        int id1 = Integer.parseInt(id);
//
//        userService.add(new User(name, age1, password, login, id1));
//
//        request.setAttribute("message", "Ок");
//        request.getRequestDispatcher("reg.jsp").forward(request, response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("reg.jsp").forward(request, response);
//    }
//}
