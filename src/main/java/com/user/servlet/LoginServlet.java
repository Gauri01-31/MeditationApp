package com.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDAO;
import com.user.model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    @Override
    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        // Authenticate user
        boolean isValidUser = authenticateUser(username, email, country, password);

        if (isValidUser) {
            response.getWriter().println("<h1>Login Successful! Welcome, " + username + "!</h1>");
        } else {
            response.getWriter().println("<h1>Invalid credentials. Please try again.</h1>");
        }
    }

    private boolean authenticateUser(String username, String email, String country, String password) {
        for (User user : userDAO.selectAllUsers()) {
            if (user.getUsername().equals(username) &&
                user.getEmail().equals(email) &&
                user.getCountry().equals(country) &&
                user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

