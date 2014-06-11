package com.example.paypalimage.flickrutil;

import android.util.Log;

import com.example.paypalimage.flickrutil.JSONObject.PhotoSetsJSON;
import com.hintdesk.core.utils.JSONHttpClient;
import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

public class PhotoSets extends FlickrBaseItem {

    public PhotoSets(String api_key,String format)
    {
        super(api_key,format);

    }

    public List<Photo> getPhotos(String photoset_id)
    {
        JSONHttpClient jsonHttpClient = new JSONHttpClient();
        Log.d("getPhotos - photoset_id", photoset_id);
        
        String url = String.format(FlickrUrls.flickr_photosets_getPhotos,format,api_key,photoset_id);
        //String url = String.format(FlickrUrls.flickr_photos_getSizes,format,api_key,photoset_id);
        
        Log.d("getPhotos - url", url);
        Log.d("getPhotos - format", format);
        
        PhotoSetsJSON photoSetJson = jsonHttpClient.Get(url,  new ArrayList<NameValuePair>(), PhotoSetsJSON.class);
        Log.d("getPhotos - JSON string", new String(photoSetJson.toString()));
        Log.d("getPhotos - JSON stat", new String(photoSetJson.getStat()));
        return photoSetJson.getPhotoset().getPhoto();
    }
}
