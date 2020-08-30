package by.servletapjsp.servlet;

import by.servletapjsp.entity.User;
import by.servletapjsp.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "AutorizServlet", urlPatterns = "/autoriz")
//public class AutorizServlet extends HttpServlet {
//    private UserService userService = new UserService();
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
//
//        User byUserName = userService.findByUserName(login);
//        if (byUserName == null) {
//            request.setAttribute("message", "User not found");
//            request.getRequestDispatcher("auth.jsp").forward(request, response);
//            return;
//        }
//        if (!byUserName.getPassword().equals(password)) {
//            request.setAttribute("message", "Password incorrect");
//            request.getRequestDispatcher("auth.jsp").forward(request, response);
//            return;
//        }
//        request.getSession().setAttribute("currentUser", byUserName);
//        request.setAttribute("message", "Ok");
//        request.getRequestDispatcher("auth.jsp").forward(request, response);
//    }
//
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("auth.jsp").forward(request, response);
//    }
//}
