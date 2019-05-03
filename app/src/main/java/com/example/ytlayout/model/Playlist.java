package com.example.ytlayout.model;

public class Playlist {
    private int Image;
    private String judul, jmlVideo;

    public Playlist(int image, String judul, String jmlVideo) {
        Image = image;
        this.judul = judul;
        this.jmlVideo = jmlVideo;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJmlVideo() {
        return jmlVideo;
    }

    public void setJmlVideo(String jmlVideo) {
        this.jmlVideo = jmlVideo;
    }
}
