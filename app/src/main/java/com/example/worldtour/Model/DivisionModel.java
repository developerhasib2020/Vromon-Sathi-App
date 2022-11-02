package com.example.worldtour.Model;

public class DivisionModel {
    String name;
    String spotnumber;
    int Image;

    public DivisionModel(String name, String spotnumber, int image) {
        this.name = name;
        this.spotnumber = spotnumber;
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpotnumber() {
        return spotnumber;
    }

    public void setSpotnumber(String spotnumber) {
        this.spotnumber = spotnumber;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
