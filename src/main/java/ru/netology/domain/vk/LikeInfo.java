package ru.netology.domain.vk;

import lombok.Data;

@Data
public class LikeInfo {
    private int countLikes; // число лайков
    private boolean userLike; // наличие отметки мне нравится от текущего пользователя
    private boolean canLike;// может ли пользователь поставить like

}
