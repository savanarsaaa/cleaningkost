package com.example.cleaningkost;

import com.example.cleaningkost.infoakun;

public class infoakun {
    String nama;
    String email;
    String alamat;
    String telpon;

    public infoakun() {
    }

    public infoakun(String nama,String email,String alamat,String telpon) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.telpon = telpon;
    }
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getTelpon(){
        return telpon;
    }
    public void setTelpon(){
        this.telpon = telpon;
    }
}


