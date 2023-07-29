package org.flapsocial.model;
public abstract class BaseEntity {
    protected int userId;
    public int getUserId() {
        return userId;
    }
    public BaseEntity setUserId(int userId) {
        this.userId = userId;
        return this;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseEntity) {
            BaseEntity entity = (BaseEntity) obj;
            return this.userId == entity.userId;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.userId;
    }
}