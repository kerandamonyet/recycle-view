package com.universitaskuningan.recycle_view;

public class Kontak {
    private String nama;
    private String telepon;
    private String link_gambar;

    public Kontak(String nama, String telepon, String link_gambar) {
        this.nama = nama;
        this.telepon = telepon;
        this.link_gambar = link_gambar;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk telepon
    public String getTelepon() {
        return telepon;
    }

    // Setter untuk telepon
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    // Getter untuk link_gambar
    public String getLink_gambar() {
        return link_gambar;
    }

    // Setter untuk link_gambar
    public void setLink_gambar(String link_gambar) {
        this.link_gambar = link_gambar;
    }
}
