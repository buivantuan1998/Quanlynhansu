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
public class Phong {
    private String maPB;
    private String tenPB;
    private String sDT;
    private String diaChi;

    public Phong() {
    }

    public Phong(String maPB, String tenPB, String sDT, String diaChi) {
        this.maPB = maPB;
        this.tenPB = tenPB;
        this.sDT = sDT;
        this.diaChi = diaChi;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
    
}
