package org.flapsocial;

import org.flapsocial.model.Post;

public class Main {
    static Post post1 = new Post(1, 1, "example caption", "this is an example description");
    public static void main(String[] args) {
        System.out.println(post1);
    }
}