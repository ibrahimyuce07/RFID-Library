package com.strgzr.rfidlib.model.googleapi;

import lombok.Data;

import java.util.ArrayList;

@Data
public class GoogleApiModel {
    public String kind;
    public int totalItems;
    public ArrayList<Item> items;
}
