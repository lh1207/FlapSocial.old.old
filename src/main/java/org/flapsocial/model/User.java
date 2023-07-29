package org.flapsocial.model;

public class User extends BaseEntity {
    private String email;
    private String profilePic;
    public String getEmail() {
        return email;
    }
    public User setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getProfilePic() {
        return profilePic;
    }
    public User setProfilePic(String profilePic) {
        this.profilePic = profilePic;
        return this;
    }
    public User(int userId, String email, String profilePic) {
        super.setUserId(userId);
        this.email = email;
        this.profilePic = profilePic;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + getUserId() +
                ", email='" + email + '\'' +
                ", profilePic='" + profilePic + '\'' +
                '}';
    }
}