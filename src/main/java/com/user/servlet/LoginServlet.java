package com.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.user.dao.UserDAO;
import com.user.model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    @Override
    public void init() throws ServletException {
        userDAO = new UserDAO(); // Initialize the DAO
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Just show the login form when the GET request is made
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameters from the login form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate user
        User user = userDAO.getUserByUsername(username); // Fetch user by username
        if (user != null && user.getPassword().equals(password)) {
            // Successful login - Store the username in the session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to the homepage after successful login
            response.sendRedirect("website.jsp");
        } else {
            // Login failed, redirect back to login page or show error message
            request.setAttribute("errorMessage", "Invalid username or password. Please try again.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}

