package com.strgzr.rfidlib.model.googleapi;

import lombok.Data;

@Data
public class Item {
    public String kind;
    public String id;
    public String etag;
    public String selfLink;
    public VolumeInfo volumeInfo;
    public SaleInfo saleInfo;
    public AccessInfo accessInfo;
    public SearchInfo searchInfo;
}
