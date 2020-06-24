package ru.netology.domain.vk.manager;

import lombok.Data;
import ru.netology.domain.vk.Post;
@Data

public class PostManager {

    private Post[] posts;
    public Post[] search(int idOwner, String domain, String query, int ownersOnly, int count, int offset) {
        return null;
    }
    public void delete(int idOwner, int postId) {

    }
}