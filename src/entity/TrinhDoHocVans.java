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
public class TrinhDoHocVans {
    private String maTDHV;
    private String tenTDHV;
    private String chuyenNganh;

    public TrinhDoHocVans() {
    }

    public TrinhDoHocVans(String maTDHV, String tenTDHV, String chuyenNganh) {
        this.maTDHV = maTDHV;
        this.tenTDHV = tenTDHV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaTDHV() {
        return maTDHV;
    }

    public void setMaTDHV(String maTDHV) {
        this.maTDHV = maTDHV;
    }

    public String getTenTDHV() {
        return tenTDHV;
    }

    public void setTenTDHV(String tenTDHV) {
        this.tenTDHV = tenTDHV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    
    
}
