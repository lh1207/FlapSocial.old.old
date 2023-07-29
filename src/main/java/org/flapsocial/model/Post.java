package org.flapsocial.model;

public class Post extends BaseEntity {
    private String caption;
    private String description;
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
    public Post(int postId, int userId, String caption, String description) {
        super.setUserId(postId);
        super.setUserId(userId);
        this.caption = caption;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Post{" +
                "postId=" + getUserId() +
                ", userId=" + getUserId() +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}