package com.test.bean;

import com.givenera.share.entity.Content;

public class ContentWithBLOBs extends Content {
    private byte[] eventdateinstant;

    private byte[] publishedatinstant;

    public byte[] getEventdateinstant() {
        return eventdateinstant;
    }

    public void setEventdateinstant(byte[] eventdateinstant) {
        this.eventdateinstant = eventdateinstant;
    }

    public byte[] getPublishedatinstant() {
        return publishedatinstant;
    }

    public void setPublishedatinstant(byte[] publishedatinstant) {
        this.publishedatinstant = publishedatinstant;
    }
}
