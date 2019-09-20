package edu.mum.cs;

import com.google.gson.Gson;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/guestapi")
public class GuestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out  = resp.getWriter();
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("UTF-8");

//        out.println("<html>");
//        out.println("<body>");
//        out.println("<form>");
//        out.println("<div>");
//        out.println("<input type='text' name='firstname' />");
//        out.println("<input type='text' name='lastname' />");
//        out.println("</div>");
//        out.println("</form>");
//        out.println("</body>");
//        out.println("</html>");
//        out.close();

        RequestDispatcher view = req.getRequestDispatcher("guest.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String first = req.getParameter("first");
        String last = req.getParameter("last");

        User user = new User(first, last);

        Gson json = new Gson();
        String jsonString = json.toJson(user);
        resp.setContentType("application/json");

        System.out.println(jsonString);
        System.out.println();

        resp.getWriter().write(jsonString);
    }
}
