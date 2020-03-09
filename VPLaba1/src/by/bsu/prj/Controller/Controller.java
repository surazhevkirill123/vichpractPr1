package by.bsu.prj.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/controller", "*.do"})
public class Controller extends HttpServlet {
    static Logger log= LogManager.getLogger(Controller.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.getWriter().println("hello" +request.getMethod());

        String Str = ScoreReader.str();
        log.debug("Здесь сработало логгирование");

        request.setAttribute("res",Str);
        request.getRequestDispatcher("pages/main.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
