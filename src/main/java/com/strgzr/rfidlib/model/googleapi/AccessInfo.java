package com.strgzr.rfidlib.model.googleapi;

import lombok.Data;

@Data
public class AccessInfo {
    public String country;
    public String viewability;
    public boolean embeddable;
    public boolean publicDomain;
    public String textToSpeechPermission;
    public Epub epub;
    public Pdf pdf;
    public String webReaderLink;
    public String accessViewStatus;
    public boolean quoteSharingAllowed;
}
