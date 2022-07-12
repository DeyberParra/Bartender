package com.pisteapp.bartender.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Drinks {

    @SerializedName("strDrink")
    @Expose
    private String name;
    @SerializedName("strDrinkThumb")
    @Expose
    private String img;
    @SerializedName("trInstructions")
    @Expose
    private String detail;

    public Drinks(String name, String img, String detail) {
        super();
        this.name = name;
        this.img = img;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
