package com.example.recyclerviewkelas;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;

public class Profile {
    private String nama, silsilah;
    private Drawable picture;

    public Profile (String nama, String silsilah, Drawable picture )
    {
        this.nama = nama;
        this.silsilah = silsilah;
        this.picture = picture;
    }

    public Profile (ArrayList<Profile> ProfileArrayList)
    {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSilsilah() {
        return silsilah;
    }

    public void setSilsilah(String silsilah) {
        this.silsilah = silsilah;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }
}


