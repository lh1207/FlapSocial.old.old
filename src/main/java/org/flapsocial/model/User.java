package org.flapsocial.model;

public class User {
    // declarations
    int userId;
    String email;
    String profilePic;

    public int getUserId() {
        return userId;
    }

    public User setUserId(int userId) {
        this.userId = userId;
        return this;
    }

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

    // constructor
    public User(int userId, String email, String profilePic) {
        this.userId = userId;
        this.email = email;
        this.profilePic = profilePic;
    }

    // toString
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", profilePic='" + profilePic + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return this.userId == user.userId;
        }
        return false;
    }

    // hashCode
    @Override
    public int hashCode() {
        return this.userId;
    }
}
