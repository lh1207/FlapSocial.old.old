package org.flapsocial.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserTest {
    @Test
    public void testGetEmail() {
        User user = new User(1, "test@example.com", "profile.jpg");
        Assertions.assertEquals("test@example.com", user.getEmail());
    }
    @Test
    public void testSetEmail() {
        User user = new User(1, "test@example.com", "profile.jpg");
        user.setEmail("newemail@example.com");
        Assertions.assertEquals("newemail@example.com", user.getEmail());
    }
    @Test
    public void testGetProfilePic() {
        User user = new User(1, "test@example.com", "profile.jpg");
        Assertions.assertEquals("profile.jpg", user.getProfilePic());
    }
    @Test
    public void testSetProfilePic() {
        User user = new User(1, "test@example.com", "profile.jpg");
        user.setProfilePic("newprofile.jpg");
        Assertions.assertEquals("newprofile.jpg", user.getProfilePic());
    }
    @Test
    public void testToString() {
        User user = new User(1, "test@example.com", "profile.jpg");
        String expected = "User{userId=1, email='test@example.com', profilePic='profile.jpg'}";
        Assertions.assertEquals(expected, user.toString());
    }
}