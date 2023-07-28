package org.flapsocial.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PostTest {
    @Test
    public void testGetPostId() {
        Post post = new Post(1, 1, "email", "profilePic");
        Assertions.assertEquals(1, post.getPostId());
    }
    @Test
    public void testSetPostId() {
        Post post = new Post(1, 1, "email", "profilePic");
        post.setPostId(2);
        Assertions.assertEquals(2, post.getPostId());
    }
    @Test
    public void testGetUserId() {
        Post post = new Post(1, 1, "email", "profilePic");
        Assertions.assertEquals(1, post.getUserId());
    }
    @Test
    public void testSetUserId() {
        Post post = new Post(1, 1, "email", "profilePic");
        post.setUserId(2);
        Assertions.assertEquals(2, post.getUserId());
    }
    @Test
    public void testGetEmail() {
        Post post = new Post(1, 1, "email", "profilePic");
        Assertions.assertEquals("email", post.getEmail());
    }
    @Test
    public void testSetEmail() {
        Post post = new Post(1, 1, "email", "profilePic");
        post.setEmail("newEmail");
        Assertions.assertEquals("newEmail", post.getEmail());
    }
    @Test
    public void testGetProfilePic() {
        Post post = new Post(1, 1, "email", "profilePic");
        Assertions.assertEquals("profilePic", post.getProfilePic());
    }
    @Test
    public void testSetProfilePic() {
        Post post = new Post(1, 1, "email", "profilePic");
        post.setProfilePic("newProfilePic");
        Assertions.assertEquals("newProfilePic", post.getProfilePic());
    }
    @Test
    public void testEquals() {
        Post post1 = new Post(1, 1, "email", "profilePic");
        Post post2 = new Post(1, 1, "email", "profilePic");
        Post post3 = new Post(2, 2, "newEmail", "newProfilePic");
        Assertions.assertEquals(post1, post2);
        Assertions.assertNotEquals(post1, post3);
    }
    @Test
    public void testHashCode() {
        Post post1 = new Post(1, 1, "email", "profilePic");
        Post post2 = new Post(1, 1, "email", "profilePic");
        Post post3 = new Post(2, 2, "newEmail", "newProfilePic");
        Assertions.assertEquals(post1.hashCode(), post2.hashCode());
        Assertions.assertNotEquals(post1.hashCode(), post3.hashCode());
    }
}