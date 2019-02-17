package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import ru.javawebinar.topjava.util.MealsUtil;
import java.util.List;



public class MealServlet extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(MealServlet.class);

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        LOG.info("getAll");
        req.setAttribute("mealList", MealsUtil.getWithExceeded(MealsUtil.MEALS, 2000));
        req.getRequestDispatcher("mealList.jsp").forward(req,resp);
    }
}
