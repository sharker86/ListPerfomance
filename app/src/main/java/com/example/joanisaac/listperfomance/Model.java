package com.example.joanisaac.listperfomance;

import android.graphics.Bitmap;
import android.media.Image;

import java.io.Serializable;

/**
 * Created by JoanIsaac on 19/05/2015.
 */
public class Model implements Serializable{

    private int Picture;
    private String Title;
    private String Description;

    public Model() {
    }

    public Model(int picture, String title, String description){
        Picture = picture;
        Title = title;
        Description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPicture() {
        return Picture;
    }

    public void setPicture(int picture) {
        Picture = picture;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}