package com.example.android.musicapp;

public class Song {

    private String mSong;

    private String mArtist;

    private int mAlbum;

    public Song(String song, String artist, int album) {
        mSong = song;
        mArtist = artist;
        mAlbum = album;
    }

    public String artist() {
        return mArtist;
    }

    public int album() {
        return mAlbum;
    }

    public String song() {
        return mSong;
    }
}
