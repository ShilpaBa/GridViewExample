package com.example.paypalimage.flickrutil.JSONObject;

import com.example.paypalimage.flickrutil.Sizes;

public class PhotosJSON extends FlickrBaseItemJSON {
    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    private Sizes sizes;
}
