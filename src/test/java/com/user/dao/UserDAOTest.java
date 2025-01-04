package com.user.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.user.model.User;

class UserDAOTest {

    private UserDAO userDAO;

    @BeforeEach
    void setUp() {
        userDAO = new UserDAO(); // Initialize the UserDAO
    }

    @Test
    void testGetUserByUsername_ValidUser() {
        // Assuming a user with the username "testuser" exists in the database
        String testUsername = "testuser";
        User user = userDAO.getUserByUsername(testUsername);

        assertNotNull(user, "The user should not be null.");
        assertEquals(testUsername, user.getUsername(), "The username should match the expected.");
    }

    @Test
    void testGetUserByUsername_InvalidUser() {
        // Assuming no user exists with the username "nonexistentuser"
        String testUsername = "nonexistentuser";
        User user = userDAO.getUserByUsername(testUsername);

        assertNull(user, "The user should be null when no user is found.");
    }

    @Test
    void testInsertUser() {
        // Create a new User object
        User user = new User(0, "newuser", "newuser@example.com", "USA", "password123");

        // Insert the user
        userDAO.insertUser(user);

        // Verify the user is inserted by fetching it again
        User insertedUser = userDAO.getUserByUsername("newuser");
        assertNotNull(insertedUser, "The newly inserted user should be retrieved.");
        assertEquals("newuser", insertedUser.getUsername(), "The username should match.");
    }

    @Test
    void testUpdateUser() {
        // Fetch an existing user
        User user = userDAO.getUserByUsername("testuser");
        assertNotNull(user, "The user should exist in the database.");

        // Update the user's information
        user.setEmail("newemail@example.com");
        user.setCountry("Canada");
        boolean isUpdated = userDAO.updateUser(user);

        // Verify the update was successful
        assertTrue(isUpdated, "The user should be updated successfully.");

        // Fetch the user again and check the updated details
        User updatedUser = userDAO.getUserByUsername("testuser");
        assertEquals("newemail@example.com", updatedUser.getEmail(), "The email should be updated.");
        assertEquals("Canada", updatedUser.getCountry(), "The country should be updated.");
    }

    @Test
    void testDeleteUser() {
        // Create a new User for deletion
        User user = new User(0, "deleteuser", "deleteuser@example.com", "UK", "password123");
        userDAO.insertUser(user);

        // Delete the user
        boolean isDeleted = userDAO.deleteUser(user.getId());

        // Verify the deletion
        assertTrue(isDeleted, "The user should be deleted successfully.");

        // Verify the user no longer exists
        User deletedUser = userDAO.getUserByUsername("deleteuser");
        assertNull(deletedUser, "The user should no longer exist after deletion.");
    }
}

