package org.flapsocial.model;

public class Post {
    // declarations
    int postId;
    int userId;
    String caption;
    String description;

    public int getPostId() {
        return postId;
    }

    public Post setPostId(int postId) {
        this.postId = postId;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Post setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public Post setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Post setDescription(String description) {
        this.description = description;
        return this;
    }

    // constructor
    public Post(int postId, int userId, String caption, String description) {
        this.postId = postId;
        this.userId = userId;
        this.caption = caption;
        this.description = description;
    }

    // toString
    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;

        if (postId != post.postId) return false;
        if (userId != post.userId) return false;
        if (!caption.equals(post.caption)) return false;
        return description.equals(post.description);
    }

    // hashCode
    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + userId;
        result = 31 * result + caption.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    // main
    public static void main(String[] args) {
        Post post = new Post(1, 1, "caption", "description");
        System.out.println(post);
    }
}