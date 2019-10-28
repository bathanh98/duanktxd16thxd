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
@Table(name = "doanhthu")
public class DoanhThu implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double doanhThuPhong;
    private double doanhThuNhaHang;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "solieudoanhthu_id")
    private SoLieuDoanhThu soLieuDoanhThu;
    private double tongDoanhThu;
    @OneToOne(mappedBy = "doanhThu")
    private ChiTietDuAn chiTietDuAn;
    
    public DoanhThu() {
        this.soLieuDoanhThu = new SoLieuDoanhThu();
    }
    
    public DoanhThu(final SoLieuDoanhThu soLieuDoanhThu) {
        this.soLieuDoanhThu = soLieuDoanhThu;
    }
    
    public ChiTietDuAn getChiTietDuAn() {
        return this.chiTietDuAn;
    }
    
    public void setChiTietDuAn(final ChiTietDuAn chiTietDuAn) {
        this.chiTietDuAn = chiTietDuAn;
    }
    
    public double getTongDoanhThu() {
        return this.tongDoanhThu = this.doanhThuNhaHang + this.doanhThuPhong;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public SoLieuDoanhThu getSoLieuDoanhThu() {
        return this.soLieuDoanhThu;
    }
    
    public void setSoLieuDoanhThu(final SoLieuDoanhThu soLieuDoanhThu) {
        this.soLieuDoanhThu = soLieuDoanhThu;
    }
    
    public double getDoanhThuPhong() {
        return this.doanhThuPhong;
    }
    
    public void setTongDoanhThu(final double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }
    
    public void setDoanhThuPhong(final double doanhThuPhong) {
        this.doanhThuPhong = doanhThuPhong;
    }
    
    public double getDoanhThuNhaHang() {
        return this.doanhThuNhaHang;
    }
    
    public void setDoanhThuNhaHang(final double doanhThuNhaHang) {
        this.doanhThuNhaHang = doanhThuNhaHang;
    }
    
    @Override
    public String toString() {
        return "DoanhThu{id=" + this.id + ", doanhThuPhong=" + this.doanhThuPhong + ", doanhThuNhaHang=" + this.doanhThuNhaHang + ", soLieuDoanhThu=" + this.soLieuDoanhThu + '}';
    }
}