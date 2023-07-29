import org.flapsocial.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PostTest {
    @Test
    public void testGetCaption() {
        Post post = new Post(1, 1, "Caption", "Description");
        Assertions.assertEquals("Caption", post.getCaption());
    }
    @Test
    public void testSetCaption() {
        Post post = new Post(1, 1, "Caption", "Description");
        post.setCaption("New Caption");
        Assertions.assertEquals("New Caption", post.getCaption());
    }
    @Test
    public void testGetDescription() {
        Post post = new Post(1, 1, "Caption", "Description");
        Assertions.assertEquals("Description", post.getDescription());
    }
    @Test
    public void testSetDescription() {
        Post post = new Post(1, 1, "Caption", "Description");
        post.setDescription("New Description");
        Assertions.assertEquals("New Description", post.getDescription());
    }
    @Test
    public void testToString() {
        Post post = new Post(1, 1, "Caption", "Description");
        String expected = "Post{postId=1, userId=1, caption='Caption', description='Description'}";
        Assertions.assertEquals(expected, post.toString());
    }
}