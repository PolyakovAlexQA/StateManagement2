package ru.netology.domain.vk;

public class Post {
    private int id;
    private int idOwner;
    private int idFrom;
    private int idCreatedBy;
    private int date;
    private int text;
    private int idReplyOwner;
    private int replyPostId;
    private int friendsOnly;
    private  CommentsInfo commentsInfo;
    private String copyright;
    private LikeInfo like;
    private RepostInfo repost;
    private ViewInfo view;
    private String postType;
    private PostSource postSource;
    private GeoInfo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

}
