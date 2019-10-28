/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "chiphi")
public class ChiPhi implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double tienLuong;
    private double baoHiem;
    private double dienThoai;
    private double quangCao;
    private double suaChua;
    private double thueDat;
    private double quanLy;
    private double chiPhiPhongNgu;
    private double tongChiPhi;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "solieuchiphi_id")
    private SoLieuChiPhi soLieuChiPhi;
    @OneToOne(mappedBy = "chiPhi")
    private ChiTietDuAn chiTietDuAn;
    
    public ChiPhi() {
        this.soLieuChiPhi = new SoLieuChiPhi();
    }
    
    public ChiPhi(final SoLieuChiPhi soLieuChiPhi) {
        this.soLieuChiPhi = soLieuChiPhi;
    }
    
    public void setTongChiPhi(final double tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }
    
    public double getTongChiPhi() {
        return this.tongChiPhi = this.baoHiem + this.chiPhiPhongNgu + this.dienThoai + this.quanLy + this.quangCao + this.suaChua + this.thueDat + this.tienLuong;
    }
    
    public ChiTietDuAn getChiTietDuAn() {
        return this.chiTietDuAn;
    }
    
    public void setChiTietDuAn(final ChiTietDuAn chiTietDuAn) {
        this.chiTietDuAn = chiTietDuAn;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public double getTienLuong() {
        return this.tienLuong;
    }
    
    public void setTienLuong(final double tienLuong) {
        this.tienLuong = tienLuong;
    }
    
    public double getBaoHiem() {
        return this.baoHiem;
    }
    
    public void setBaoHiem(final double baoHiem) {
        this.baoHiem = baoHiem;
    }
    
    public double getDienThoai() {
        return this.dienThoai;
    }
    
    public void setDienThoai(final double dienThoai) {
        this.dienThoai = dienThoai;
    }
    
    public double getQuangCao() {
        return this.quangCao;
    }
    
    public void setQuangCao(final double quangCao) {
        this.quangCao = quangCao;
    }
    
    public double getSuaChua() {
        return this.suaChua;
    }
    
    public void setSuaChua(final double suaChua) {
        this.suaChua = suaChua;
    }
    
    public double getThueDat() {
        return this.thueDat;
    }
    
    public void setThueDat(final double thueDat) {
        this.thueDat = thueDat;
    }
    
    public double getQuanLy() {
        return this.quanLy;
    }
    
    public void setQuanLy(final double quanLy) {
        this.quanLy = quanLy;
    }
    
    public double getChiPhiPhongNgu() {
        return this.chiPhiPhongNgu;
    }
    
    public void setChiPhiPhongNgu(final double chiPhiPhongNgu) {
        this.chiPhiPhongNgu = chiPhiPhongNgu;
    }
    
    public SoLieuChiPhi getSoLieuChiPhi() {
        return this.soLieuChiPhi;
    }
    
    public void setSoLieuChiPhi(final SoLieuChiPhi soLieuChiPhi) {
        this.soLieuChiPhi = soLieuChiPhi;
    }
    
    public double getChiPhi() {
        return this.baoHiem + this.chiPhiPhongNgu + this.dienThoai + this.quanLy + this.quangCao + this.suaChua + this.thueDat + this.tienLuong;
    }
}