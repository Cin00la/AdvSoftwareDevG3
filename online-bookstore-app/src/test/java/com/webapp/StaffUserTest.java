package com.webapp;

import com.g3app.model.StaffUser;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StaffUserTest {

    private StaffUser staffUser;

    /**
     * Sets up a sample StaffUser object before each test.
     */
    @Before
    public void setUp() {
        staffUser = new StaffUser("John", "Doe", "john.doe@example.com", "password123", "1990-01-01", "+61123456789",
                                  "123 Example Street", "Sydney", "2000", "Australia", "staff", "active");
    }

    /**
     * Test that the getFirstName method correctly returns the first name.
     */
    @Test
    public void testGetFirstName() {
        assertEquals("John", staffUser.getFirstName());
    }

    /**
     * Test that the getLastName method correctly returns the last name.
     */
    @Test
    public void testGetLastName() {
        assertEquals("Doe", staffUser.getLastName());
    }

    /**
     * Test that the getEmail method correctly returns the email.
     */
    @Test
    public void testGetEmail() {
        assertEquals("john.doe@example.com", staffUser.getEmail());
    }

    /**
     * Test that the getPhone method correctly returns the phone number.
     */
    @Test
    public void testGetPhone() {
        assertEquals("+61123456789", staffUser.getPhone());
    }

    /**
     * Test that the getRole method correctly returns the role.
     */
    @Test
    public void testGetRole() {
        assertEquals("staff", staffUser.getRole());
    }

    /**
     * Test that the getAccountStatus method correctly returns the account status.
     */
    @Test
    public void testGetAccountStatus() {
        assertEquals("active", staffUser.getAccountStatus());
    }

    /**
     * Test that the setFirstName method correctly updates the first name.
     */
    @Test
    public void testSetFirstName() {
        staffUser.setFirstName("Jane");
        assertEquals("Jane", staffUser.getFirstName());
    }

    /**
     * Test that the setEmail method correctly updates the email.
     */
    @Test
    public void testSetEmail() {
        staffUser.setEmail("jane.doe@example.com");
        assertEquals("jane.doe@example.com", staffUser.getEmail());
    }

    /**
     * Test that the setPassword method correctly updates the password.
     */
    @Test
    public void testSetPassword() {
        staffUser.setPassword("newPassword123");
        assertEquals("newPassword123", staffUser.getPassword());
    }

    /**
     * Test that setting an invalid email throws an IllegalArgumentException.
     * Assuming the StaffUser class has email validation.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEmail() {
        staffUser.setEmail("invalid-email");
    }

    /**
     * Test that setting a null first name throws an IllegalArgumentException.
     * Assuming the StaffUser class has validation for null first name.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNullFirstName() {
        staffUser.setFirstName(null);
    }

    /**
     * Test that setting an invalid password (e.g., less than 8 characters) throws an exception.
     */
    @Test
    public void testInvalidPassword() {
        try {
            staffUser.setPassword("short");  // Assuming this throws an IllegalArgumentException
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Password must be at least 8 characters long", e.getMessage());
        }
    }


    /**
     * Test that setting a valid date of birth works correctly.
     */
    @Test
    public void testSetDob() {
        staffUser.setDob("1985-05-15");
        assertEquals("1985-05-15", staffUser.getDob());
    }
}
