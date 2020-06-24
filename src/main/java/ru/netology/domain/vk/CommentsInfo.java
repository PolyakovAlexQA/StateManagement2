package ru.netology.domain.vk;

import lombok.Data;

@Data
public class CommentsInfo {
    private int id;
    private int fromId;
    private String text;
    private String nameAuthor;
    private int attachments;
    private int usersLikes;
    private int data;

}
