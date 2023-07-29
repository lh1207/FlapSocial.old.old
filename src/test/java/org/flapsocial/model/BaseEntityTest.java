package org.flapsocial.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BaseEntityTest {
    @Test
    public void testGetUserId() {
        BaseEntity entity = new BaseEntity();
        entity.setUserId(1);
        int userId = entity.getUserId();
        Assertions.assertEquals(1, userId);
    }
    @Test
    public void testSetUserId() {
        BaseEntity entity = new BaseEntity();
        entity.setUserId(1);
        int userId = entity.getUserId();
        Assertions.assertEquals(1, userId);
        entity.setUserId(2);
        userId = entity.getUserId();
        Assertions.assertEquals(2, userId);
    }
    @Test
    public void testEquals() {
        BaseEntity entity1 = new BaseEntity().setUserId(1);
        BaseEntity entity2 = new BaseEntity().setUserId(1);
        BaseEntity entity3 = new BaseEntity().setUserId(2);
        Assertions.assertEquals(entity1, entity2);
        Assertions.assertNotEquals(entity1, entity3);
    }
    @Test
    public void testHashCode() {
        BaseEntity entity1 = new BaseEntity().setUserId(1);
        BaseEntity entity2 = new BaseEntity().setUserId(1);
        BaseEntity entity3 = new BaseEntity().setUserId(2);
        Assertions.assertEquals(entity1.hashCode(), entity2.hashCode());
        Assertions.assertNotEquals(entity1.hashCode(), entity3.hashCode());
    }
}