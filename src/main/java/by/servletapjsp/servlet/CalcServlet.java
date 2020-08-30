package by.servletapjsp.servlet;

import by.servletapjsp.entity.Operation;
import by.servletapjsp.service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CalcServlet", urlPatterns = "/calc")
public class CalcServlet extends HttpServlet {
    private CalcService calcService = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("calc.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        List<Operation> history = (List<Operation>) request.getSession().getAttribute("history");

        int result = calcService.calc(n1, n2, operation, history);
        request.setAttribute("result", result);
        request.getRequestDispatcher("calc.jsp").forward(request, response);
        response.getWriter().println("forward is OK");
    }
}
