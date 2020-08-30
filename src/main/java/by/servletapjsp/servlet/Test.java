package by.servletapjsp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/testfor")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> list = new ArrayList<>();
        list.add("Hello 1");
        list.add("Hello 2");
        list.add("Hello 3");
        list.add("Hello 4");
        list.add("Hello 5");
        list.add("Hello 6");
        list.add("Hello 7");
        list.add("Hello 8");
        req.setAttribute("list", list);
        req.getRequestDispatcher("test.jsp").forward(req, resp);
    }
}
