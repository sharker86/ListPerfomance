package com.example.joanisaac.listperfomance;

import android.graphics.Bitmap;
import android.media.Image;

/**
 * Created by JoanIsaac on 19/05/2015.
 */
public class Model {

    private Bitmap Picture;
    private String Title;
    private String Description;

    public Model() {
    }

    public Model(Bitmap picture, String title, String description){
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

    public Bitmap getPicture() {
        return Picture;
    }

    public void setPicture(Bitmap picture) {
        Picture = picture;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}