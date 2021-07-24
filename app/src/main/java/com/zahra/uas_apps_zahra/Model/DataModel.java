package com.zahra.uas_apps_zahra.Model;

public class DataModel {
    private int id;
    private String customer, part_name, part_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return customer;
    }

    public void setNama(String nama) {
        this.customer = customer;
    }

    public String getAlamat() {
        return part_name;
    }

    public void setAlamat(String alamat) {
        this.part_name = part_name;
    }

    public String getTelepon() {
        return part_code;
    }

    public void setTelepon(String telepon) {
        this.part_code = part_code;
    }
}
