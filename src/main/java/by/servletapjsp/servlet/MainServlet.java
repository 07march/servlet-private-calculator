package by.servletapjsp.servlet;

import by.servletapjsp.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        if (currentUser == null) {
            req.setAttribute("message", "Hello Guest");
            req.getRequestDispatcher("main.jsp").forward(req, resp);
        } else {
            req.setAttribute("message", "Hello " + currentUser.getName());
            req.getRequestDispatcher("main.jsp").forward(req, resp);
        }
    }
}
