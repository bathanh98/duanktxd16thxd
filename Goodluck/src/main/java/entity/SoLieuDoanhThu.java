package entity;

import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "solieudoanhthu")
public class SoLieuDoanhThu implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int soLuongPhong;
    private double giaPhongBinhQuan;
    private double tocDoTangGiaTrenNam;
    private double congSuatHoatDong;
    private double tyLeDoanhThuNhaHangSoVoiPhong;
    @OneToOne(mappedBy = "soLieuDoanhThu")
    private DoanhThu doanhThu;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public int getSoLuongPhong() {
        return this.soLuongPhong;
    }
    
    public void setSoLuongPhong(final int soLuongPhong) {
        this.soLuongPhong = soLuongPhong;
    }
    
    public double getGiaPhongBinhQuan() {
        return this.giaPhongBinhQuan;
    }
    
    public void setGiaPhongBinhQuan(final double giaPhongBinhQuan) {
        this.giaPhongBinhQuan = giaPhongBinhQuan;
    }
    
    public double getTocDoTangGiaTrenNam() {
        return this.tocDoTangGiaTrenNam;
    }
    
    public void setTocDoTangGiaTrenNam(final double tocDoTangGiaTrenNam) {
        this.tocDoTangGiaTrenNam = tocDoTangGiaTrenNam;
    }
    
    public double getCongSuatHoatDong() {
        return this.congSuatHoatDong;
    }
    
    public void setCongSuatHoatDong(final double congSuatHoatDong) {
        this.congSuatHoatDong = congSuatHoatDong;
    }
    
    public double getTyLeDoanhThuNhaHangSoVoiPhong() {
        return this.tyLeDoanhThuNhaHangSoVoiPhong;
    }
    
    public void setTyLeDoanhThuNhaHangSoVoiPhong(final double tyLeDoanhThuNhaHangSoVoiPhong) {
        this.tyLeDoanhThuNhaHangSoVoiPhong = tyLeDoanhThuNhaHangSoVoiPhong;
    }
    
    public DoanhThu getDoanhThu() {
        return this.doanhThu;
    }
    
    public void setDoanhThu(final DoanhThu doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    @Override
    public String toString() {
        return "So lieuj{id=" + this.id + ", soLuongPhong=" + this.soLuongPhong + ", giaPhongBinhQuan=" + this.giaPhongBinhQuan + ", tocDoTangGiaTrenNam=" + this.tocDoTangGiaTrenNam + ", congSuatHoatDong=" + this.congSuatHoatDong + ", tyLeDoanhThuNhaHangSoVoiPhong=" + this.tyLeDoanhThuNhaHangSoVoiPhong + '}';
    }
}