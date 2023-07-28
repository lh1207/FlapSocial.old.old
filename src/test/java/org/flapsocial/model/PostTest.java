package org.flapsocial.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PostTest {
    @Test
    public void testGetPostId() {
        Post post = new Post(1, 1, "Caption", "Description");
        Assertions.assertEquals(1, post.getPostId());
    }
    @Test
    public void testSetPostId() {
        Post post = new Post(1, 1, "Caption", "Description");
        post.setPostId(2);
        Assertions.assertEquals(2, post.getPostId());
    }
    @Test
    public void testGetUserId() {
        Post post = new Post(1, 1, "Caption", "Description");
        Assertions.assertEquals(1, post.getUserId());
    }
    @Test
    public void testSetUserId() {
        Post post = new Post(1, 1, "Caption", "Description");
        post.setUserId(2);
        Assertions.assertEquals(2, post.getUserId());
    }
    @Test
    public void testGetCaption() {
        Post post = new Post(1, 1, "Caption", "Description");
        Assertions.assertEquals("Caption", post.getCaption());
    }
    @Test
    public void testSetCaption() {
        Post post = new Post(1, 1, "Caption", "Description");
        post.setCaption("newCaption");
        Assertions.assertEquals("newCaption", post.getCaption());
    }
    @Test
    public void testGetDescription() {
        Post post = new Post(1, 1, "Caption", "Description");
        Assertions.assertEquals("Description", post.getDescription());
    }
    @Test
    public void testSetDescription() {
        Post post = new Post(1, 1, "Caption", "Description");
        post.setDescription("newDescription");
        Assertions.assertEquals("newDescription", post.getDescription());
    }
    @Test
    public void testEquals() {
        Post post1 = new Post(1, 1, "Caption", "Description");
        Post post2 = new Post(1, 1, "Caption", "Description");
        Post post3 = new Post(2, 2, "newCaption", "newDescription");
        Assertions.assertEquals(post1, post2);
        Assertions.assertNotEquals(post1, post3);
    }
    @Test
    public void testHashCode() {
        Post post1 = new Post(1, 1, "Caption", "Description");
        Post post2 = new Post(1, 1, "Caption", "Description");
        Post post3 = new Post(2, 2, "newCaption", "newDescription");
        Assertions.assertEquals(post1.hashCode(), post2.hashCode());
        Assertions.assertNotEquals(post1.hashCode(), post3.hashCode());
    }
}