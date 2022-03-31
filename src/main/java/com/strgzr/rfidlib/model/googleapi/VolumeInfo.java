package com.strgzr.rfidlib.model.googleapi;

import lombok.Data;

import java.util.ArrayList;

@Data
public class VolumeInfo {
    public String title;
    public ArrayList<String> authors;
    public String publishedDate;
    public ArrayList<IndustryIdentifier> industryIdentifiers;
    public ReadingModes readingModes;
    public int pageCount;
    public String printType;
    public ArrayList<String> categories;
    public String maturityRating;
    public boolean allowAnonLogging;
    public String contentVersion;
    public ImageLinks imageLinks;
    public String language;
    public String previewLink;
    public String infoLink;
    public String canonicalVolumeLink;
}
