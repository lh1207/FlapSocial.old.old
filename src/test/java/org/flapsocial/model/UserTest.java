package org.flapsocial.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserTest {
    @Test
    public void testGetUserId() {
        User user = new User(1, "test@example.com", "profile.jpg");
        int userId = user.getUserId();
        Assertions.assertEquals(1, userId);
    }
    @Test
    public void testSetUserId() {
        User user = new User(1, "test@example.com", "profile.jpg");
        user.setUserId(2);
        int userId = user.getUserId();
        Assertions.assertEquals(2, userId);
    }
    @Test
    public void testGetEmail() {
        User user = new User(1, "test@example.com", "profile.jpg");
        String email = user.getEmail();
        Assertions.assertEquals("test@example.com", email);
    }
    @Test
    public void testSetEmail() {
        User user = new User(1, "test@example.com", "profile.jpg");
        user.setEmail("newemail@example.com");
        String email = user.getEmail();
        Assertions.assertEquals("newemail@example.com", email);
    }
    @Test
    public void testGetProfilePic() {
        User user = new User(1, "test@example.com", "profile.jpg");
        String profilePic = user.getProfilePic();
        Assertions.assertEquals("profile.jpg", profilePic);
    }
    @Test
    public void testSetProfilePic() {
        User user = new User(1, "test@example.com", "profile.jpg");
        user.setProfilePic("newprofile.jpg");
        String profilePic = user.getProfilePic();
        Assertions.assertEquals("newprofile.jpg", profilePic);
    }
    @Test
    public void testEquals() {
        User user1 = new User(1, "test@example.com", "profile.jpg");
        User user2 = new User(1, "test2@example.com", "profile2.jpg");
        Assertions.assertEquals(user1, user2);
    }
    @Test
    public void testNotEquals() {
        User user1 = new User(1, "test@example.com", "profile.jpg");
        User user2 = new User(2, "test@example.com", "profile.jpg");
        Assertions.assertNotEquals(user1, user2);
    }
    @Test
    public void testHashCode() {
        User user = new User(1, "test@example.com", "profile.jpg");
        int hashCode = user.hashCode();
        Assertions.assertEquals(1, hashCode);
    }
}