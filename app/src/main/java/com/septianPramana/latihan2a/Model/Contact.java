package com.septianPramana.latihan2a.Model;

import android.graphics.drawable.Drawable;

import com.septianPramana.latihan2a.R;

public class Contact {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String city;
    private boolean isMale;
    private boolean sd,smp,sma;
    private boolean s1,s2,s3;

    private Drawable imgPath;

    public Contact(String id, String name, boolean isMale) {
        this.id = id;
        this.name = name;
        this.isMale = isMale;
    }

    public Contact(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isSd() {
        return sd;
    }

    public void setSd(boolean sd) {
        this.sd = sd;
    }

    public boolean isSmp() {
        return smp;
    }

    public void setSmp(boolean smp) {
        this.smp = smp;
    }

    public boolean isSma() {
        return sma;
    }

    public void setSma(boolean sma) {
        this.sma = sma;
    }

    public boolean isS1() {
        return s1;
    }

    public void setS1(boolean s1) {
        this.s1 = s1;
    }

    public boolean isS2() {
        return s2;
    }

    public void setS2(boolean s2) {
        this.s2 = s2;
    }

    public boolean isS3() {
        return s3;
    }

    public void setS3(boolean s3) {
        this.s3 = s3;
    }

    public Drawable getImg() {
        return imgPath;
    }

    public void setImg(Drawable imgPath) {
        this.imgPath = imgPath;
    }
}
