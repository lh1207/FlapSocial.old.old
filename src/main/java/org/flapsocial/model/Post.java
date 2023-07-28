package org.flapsocial.model;

public class Post {
    // declarations
    int postId;
    int userId;
    String email;
    String profilePic;

    int postId() {
        return postId;
    }

    Post postId(int postId) {
        this.postId = postId;
        return this;
    }

    int userId() {
        return userId;
    }

    Post userId(int userId) {
        this.userId = userId;
        return this;
    }

    String email() {
        return email;
    }

    Post email(String email) {
        this.email = email;
        return this;
    }

    String profilePic() {
        return profilePic;
    }

    Post profilePic(String profilePic) {
        this.profilePic = profilePic;
        return this;
    }

    // constructor
    public Post(int postId, int userId, String email, String profilePic) {
        this.postId = postId;
        this.userId = userId;
        this.email = email;
        this.profilePic = profilePic;
    }

    // toString
    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", email='" + email + '\'' +
                ", profilePic='" + profilePic + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (postId != post.postId) return false;
        if (userId != post.userId) return false;
        if (!email.equals(post.email)) return false;
        return profilePic.equals(post.profilePic);
    }

    // hashCode
    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + userId;
        result = 31 * result + email.hashCode();
        result = 31 * result + profilePic.hashCode();
        return result;
    }

    // main
    public static void main(String[] args) {
        Post post = new Post(1, 1, "email", "profilePic");
        System.out.println(post);
    }
}
