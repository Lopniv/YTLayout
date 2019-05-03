package com.example.ytlayout.model;

public class Film {
    private String judul;
    private String channel;
    private int album;

    public Film(String judul, String channel, int album) {
        this.judul = judul;
        this.channel = channel;
        this.album = album;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getAlbum() {
        return album;
    }

    public void setAlbum(int album) {
        this.album = album;
    }
}
