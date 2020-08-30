package by.servletapjsp.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "LogoutAndPrivateFilter", servletNames = {"LogoutServlet", "PrivateCabServlet"})
public class LogoutAndPrivateFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getSession().getAttribute("currentUser") != null) {
            chain.doFilter(req, res);
        } else res.sendRedirect("/main");
    }
}
