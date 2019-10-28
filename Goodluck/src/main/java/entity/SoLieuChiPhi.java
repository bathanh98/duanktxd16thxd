package entity;

import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "solieuchiphi")
public class SoLieuChiPhi implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int luongBQ;
    private int soLaoDong;
    private double tangLuongHangNam;
    private double baoHiem;
    private double dienThoai_DienNuoc;
    private double quangCao_TiepThi;
    private double suaChua;
    private double thueDat;
    private double quanLy;
    private double chiPhiPhongNgu;
    @OneToOne(mappedBy = "soLieuChiPhi")
    private ChiPhi chiPhi;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public int getLuongBQ() {
        return this.luongBQ;
    }
    
    public void setLuongBQ(final int luongBQ) {
        this.luongBQ = luongBQ;
    }
    
    public int getSoLaoDong() {
        return this.soLaoDong;
    }
    
    public void setSoLaoDong(final int soLaoDong) {
        this.soLaoDong = soLaoDong;
    }
    
    public double getTangLuongHangNam() {
        return this.tangLuongHangNam;
    }
    
    public void setTangLuongHangNam(final double tangLuongHangNam) {
        this.tangLuongHangNam = tangLuongHangNam;
    }
    
    public double getBaoHiem() {
        return this.baoHiem;
    }
    
    public void setBaoHiem(final double baoHiem) {
        this.baoHiem = baoHiem;
    }
    
    public double getDienThoai_DienNuoc() {
        return this.dienThoai_DienNuoc;
    }
    
    public void setDienThoai_DienNuoc(final double dienThoai_DienNuoc) {
        this.dienThoai_DienNuoc = dienThoai_DienNuoc;
    }
    
    public double getQuangCao_TiepThi() {
        return this.quangCao_TiepThi;
    }
    
    public void setQuangCao_TiepThi(final double quangCao_TiepThi) {
        this.quangCao_TiepThi = quangCao_TiepThi;
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
    
    public ChiPhi getChiPhi() {
        return this.chiPhi;
    }
    
    public void setChiPhi(final ChiPhi chiPhi) {
        this.chiPhi = chiPhi;
    }
    
    @Override
    public String toString() {
        return "ChiPhiChung{id=" + this.id + ", luongBQ=" + this.luongBQ + ", soLaoDong=" + this.soLaoDong + ", tangLuongHangNam=" + this.tangLuongHangNam + ", baoHiem=" + this.baoHiem + '}';
    }
}