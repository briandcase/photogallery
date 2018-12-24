package com.example.bdcas.photogallery;

import android.net.Uri;

public class GalleryItem {
    // public String getmCaption() {
    //    return mCaption;
    // }

    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    private String mCaption;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    private String mId;

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    private String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }

    // public String getmOwner() {
    //    return mOwner;
    // }

    public void setmOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    private String mOwner;
}
