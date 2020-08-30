package by.servletapjsp.servlet;

import by.servletapjsp.entity.User;
import by.servletapjsp.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PrivateCabServlet", urlPatterns = "/private")
public class PrivateCabServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User currentUser = (User) request.getSession().getAttribute("currentUser");

        if (!request.getParameter("name").equals("")){
            userService.updateNameById(request.getParameter("name"), currentUser.getId());
        }
        if (!request.getParameter("login").equals("")){
            userService.updateLoginById(request.getParameter("login"), currentUser.getId());
        }
        if (!request.getParameter("password").equals("")){
            userService.updatePasswordById(request.getParameter("password"), currentUser.getId());
        }

        request.getRequestDispatcher("priv.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("priv.jsp").forward(request, response);
    }
}
