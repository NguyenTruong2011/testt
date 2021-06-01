package com.example.ngtruong123;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class User {

    private String id;
    private String name;
    private String diaChi;

    public User(String id, String name, String diaChi) {
        this.id = id;
        this.name = name;
        this.diaChi = diaChi;
    }

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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("ten", name);
        result.put("diaChi",diaChi);

        return  result;
    }
    public User() {
    }
    public User(String name, String diaChi) {
        this.name = name;
        this.diaChi = diaChi;
    }
}
