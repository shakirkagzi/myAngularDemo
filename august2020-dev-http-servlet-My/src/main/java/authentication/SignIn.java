package authentication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignIn", urlPatterns = "login")
public class SignIn extends HttpServlet{
    public String message;

    @Override
    public void init() throws ServletException {
        System.out.println("......Servlet Initialization.......");
        message = "Welcome to Web World!";
       // super.init();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("Under the Do Get method...");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>"+"You don't need to sign in to watch free demo."+"</h1>");

        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Under the Do Post method...");
        resp.setContentType("text/html");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        if(userName.equalsIgnoreCase("shakir") && password.equalsIgnoreCase("shakir")){
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<h1>"+"You're the authorized user. Welcome to Servlet Demo.");
        }else{
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<h1>"+"You're not the authorized user. Not allowed.");
        }

        //super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println(".........Servlet is destroying now.........");
        //super.destroy();
    }
}
