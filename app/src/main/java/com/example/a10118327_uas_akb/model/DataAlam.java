package com.example.a10118327_uas_akb.model;

import com.google.android.gms.maps.model.LatLng;

public class DataAlam{
    String nama;
    String Desc;
    String img;
    LatLng latLng;

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DataAlam(String nama, String desc, String img, LatLng latLng) {
        this.nama = nama;
        Desc = desc;
        this.img = img;
        this.latLng = latLng;
    }
}
// 6 AGUSTUS 2021
//10118327
// DERAN DERIYANA FAUZZAN
//IF-8
