package com.example.paypalimage.flickrutil;

import java.io.Serializable;
import java.util.List;


public class PhotoSet implements Serializable {
    private String id;
    private String owner;
    private String ownername;
    private String page;
    private String pages;
    private String per_page;
    private String perpage;

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    private List<Photo> photo;
    private String primary;
    private String title;
    private String total;
}
