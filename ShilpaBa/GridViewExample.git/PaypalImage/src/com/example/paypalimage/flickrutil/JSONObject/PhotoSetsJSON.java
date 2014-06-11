package com.example.paypalimage.flickrutil.JSONObject;

import com.example.paypalimage.flickrutil.FlickrBaseItem;
import com.example.paypalimage.flickrutil.PhotoSet;

public class PhotoSetsJSON extends FlickrBaseItemJSON{
    public PhotoSet getPhotoset() {
        return photoset;
    }

    public void setPhotoset(PhotoSet photoset) {
        this.photoset = photoset;
    }

    private PhotoSet photoset;


}
