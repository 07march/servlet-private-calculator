package by.servletapjsp.servlet;

import by.servletapjsp.entity.Operation;
import by.servletapjsp.service.HistoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/history")
public class HistoryServlet extends HttpServlet {
    private HistoryService historyService = new HistoryService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("visibleAll", false);
        request.setAttribute("visibleFilter", true);
        List<Operation> history = (List<Operation>) request.getSession().getAttribute("history");
        String find = request.getParameter("find");
        String param = request.getParameter("param");
        switch (find) {
            case "operation":
                List<Operation> allByOperation = historyService.findAllByOperation(param, history);
                request.setAttribute("data", allByOperation);
//                if (allByOperation == null) {
//                    request.setAttribute("message", "no operations");
//                } else {
//                    request.setAttribute("message", allByOperation);
//                }
                request.getRequestDispatcher("/his.jsp").forward(request, response);
                break;
            case "result":
                List<Operation> allByResult = historyService.findAllByResult(Integer.parseInt(param), history);
                request.setAttribute("data", allByResult);
//                if (allByResult == null) {
//                    request.setAttribute("message", "no operations");
//                } else {
//                    request.setAttribute("message", allByResult);
//                }
                request.getRequestDispatcher("/his.jsp").forward(request, response);
                break;
//            case "all":
////                List<Operation> all = historyService.getAll(history);
////                request.setAttribute("data", all);
////                if (all == null) {
////                    request.setAttribute("message", "no operations");
////                } else {
////                    request.setAttribute("message", all);
////                }
////                request.getRequestDispatcher("/his.jsp").forward(request, response);
////                break;
            default:

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Operation> history = (List<Operation>) request.getSession().getAttribute("history");
        List<Operation> all = historyService.getAll(history);
        request.setAttribute("data", all);
        request.setAttribute("visibleAll", true);
        request.setAttribute("visibleFilter", false);
        request.getRequestDispatcher("/his.jsp").forward(request, response);
    }
}
