package com.example.android.musicalstructure;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class TrackInfo {
    private Integer mTrackArtist;
    private Integer mTrackTitle;
    private Integer mTrackAlbum;
    private Integer mTrackLength;
    private Integer mTrackImgAlbum;

    public TrackInfo(Integer TrackArtist, Integer TrackTitle, Integer TrackAlbum, Integer TrackTrackLength, Integer TrackImgAlbum) {
        mTrackArtist = TrackArtist;
        mTrackTitle = TrackTitle;
        mTrackAlbum = TrackAlbum;
        mTrackLength = TrackTrackLength;
        mTrackImgAlbum = TrackImgAlbum;
    }

    public Integer getTrackArtist() {
        return mTrackArtist;
    }

    public Integer getTrackTitle() {
        return mTrackTitle;
    }

    public Integer getTrackAlbum() {
        return mTrackAlbum;
    }

    public Integer getTrackLength() {
        return mTrackLength;
    }

    public Integer getTrackImgAlbum() {
        return mTrackImgAlbum;
    }

}
