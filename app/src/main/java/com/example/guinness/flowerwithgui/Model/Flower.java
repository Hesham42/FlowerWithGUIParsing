package com.example.guinness.flowerwithgui.Model;

import android.graphics.Bitmap;

/**
 * Created by guinness on 22/11/16.
 */

public class Flower {
    private int proudctID;
    private String name;
    private String Catagory;
    private String instrutions;
    private double price;
    private String photo;
    private Bitmap bitmap;

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getProudctID() {
        return proudctID;
    }

    public void setProudctID(int proudctID) {
        this.proudctID = proudctID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String catagory) {
        Catagory = catagory;
    }

    public String getInstrutions() {
        return instrutions;
    }

    public void setInstrutions(String instrutions) {
        this.instrutions = instrutions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


}


