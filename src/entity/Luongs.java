/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TUAN
 */
public class Luongs {
    private String maL;
    private String maNV;
    private float hsLuong;
    private float hsPhuCap;
    private double luongCB;

    public Luongs() {
    }

    public Luongs(String maL, String maNV, float hsLuong, float hsPhuCap, double luongCB) {
        this.maL = maL;
        this.maNV = maNV;
        this.hsLuong = hsLuong;
        this.hsPhuCap = hsPhuCap;
        this.luongCB = luongCB;
    }

    public String getMaL() {
        return maL;
    }

    public void setMaL(String maL) {
        this.maL = maL;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public float getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(float hsLuong) {
        this.hsLuong = hsLuong;
    }

    public float getHsPhuCap() {
        return hsPhuCap;
    }

    public void setHsPhuCap(float hsPhuCap) {
        this.hsPhuCap = hsPhuCap;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    
    
    
}
