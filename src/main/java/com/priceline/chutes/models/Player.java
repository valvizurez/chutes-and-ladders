package com.priceline.chutes.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private final String name;
    private int position = 0;

    public Player(String name){
        this.name = name;
    }

}
