package ru.netology.domain.vk;

import lombok.Data;

@Data
public class GeoInfo {


    private String type;
    private String coordinates;
    private  PlaceInfo place;
}
