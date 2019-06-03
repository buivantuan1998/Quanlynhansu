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
public class NhanVien {
    private String maNV;
    private String hoTen;
    private String diaChi;
    private String gioiTinh;
    private String sDT;
    private String maCV;
    private String maTDHV;
    private String maPB;
    private String ngaySinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String diaChi, String gioiTinh, String sDT, String maCV, String maTDHV, String maPB, String ngaySinh) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.sDT = sDT;
        this.maCV = maCV;
        this.maTDHV = maTDHV;
        this.maPB = maPB;
        this.ngaySinh = ngaySinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getMaTDHV() {
        return maTDHV;
    }

    public void setMaTDHV(String maTDHV) {
        this.maTDHV = maTDHV;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
   
    
    
}
