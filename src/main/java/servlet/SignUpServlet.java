package servlet;

import models.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        request.getRequestDispatcher("/WEB-INF/views/signup.jsp")
               .forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.trim().isEmpty()
                || password == null || password.trim().isEmpty()) {
        	
            request.setAttribute("error", "Tous les champs sont obligatoires.");
            request.getRequestDispatcher("/WEB-INF/views/signup.jsp")
                   .forward(request, response);
            return;
            
        }

        if (User.addUser(username.trim(), password)) {
        	
            request.setAttribute("success", "Compte créé. Vous pouvez vous connecter.");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp")
                   .forward(request, response);
            
        } else {
        	
            request.setAttribute("error", "Ce nom d'utilisateur est déjà utilisé.");
            request.getRequestDispatcher("/WEB-INF/views/signup.jsp")
                   .forward(request, response);
            
        }
        
    }
}