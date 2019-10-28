package entity;

import javax.persistence.ManyToOne;
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
@Table(name = "chitietduan")
public class ChiTietDuAn implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int nam;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "doanhthu_id")
    private DoanhThu doanhThu;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "chiphi_id")
    private ChiPhi chiPhi;
    @ManyToOne
    @JoinColumn(name = "idDuAn")
    private TongDuAn tongDuAn;
    
    public ChiTietDuAn() {
        this.doanhThu = new DoanhThu();
        this.chiPhi = new ChiPhi();
    }
    
    public ChiTietDuAn(final int nam, final DoanhThu doanhThu, final ChiPhi chiPhi) {
        this.nam = nam;
        this.doanhThu = doanhThu;
        this.chiPhi = chiPhi;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public int getNam() {
        return this.nam;
    }
    
    public void setNam(final int nam) {
        this.nam = nam;
    }
    
    public DoanhThu getDoanhThu() {
        return this.doanhThu;
    }
    
    public void setDoanhThu(final DoanhThu doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public ChiPhi getChiPhi() {
        return this.chiPhi;
    }
    
    public void setChiPhi(final ChiPhi chiPhi) {
        this.chiPhi = chiPhi;
    }
    
    public TongDuAn getTongDuAn() {
        return this.tongDuAn;
    }
    
    public void setTongDuAn(final TongDuAn tongDuAn) {
        this.tongDuAn = tongDuAn;
    }
    
    @Override
    public String toString() {
        return "ChiTietDuAn{id=" + this.id + ", nam=" + this.nam + ", doanhThu=" + this.chiPhi.getSoLieuChiPhi() + ", chiPhiChung=" + this.chiPhi.getSoLieuChiPhi() + '}';
    }
    
    public double getTongDoanhThuTrongNam() {
        this.doanhThu.setDoanhThuPhong(this.doanhThu.getSoLieuDoanhThu().getSoLuongPhong() * this.doanhThu.getSoLieuDoanhThu().getGiaPhongBinhQuan() * Math.pow(1.0 + this.doanhThu.getSoLieuDoanhThu().getTocDoTangGiaTrenNam() / 100.0, this.nam - 1) * (this.doanhThu.getSoLieuDoanhThu().getCongSuatHoatDong() / 100.0));
        this.doanhThu.setDoanhThuNhaHang(this.doanhThu.getDoanhThuPhong() * (this.doanhThu.getSoLieuDoanhThu().getTyLeDoanhThuNhaHangSoVoiPhong() / 100.0));
        return this.doanhThu.getTongDoanhThu();
    }
    
    public double getChiPhiTrongNam() {
        this.chiPhi.setTienLuong(this.chiPhi.getSoLieuChiPhi().getLuongBQ() * 12 * this.chiPhi.getSoLieuChiPhi().getSoLaoDong() * Math.pow(1.0 + this.chiPhi.getSoLieuChiPhi().getTangLuongHangNam() / 100.0, this.nam - 1));
        this.chiPhi.setBaoHiem(this.chiPhi.getTienLuong() * (this.chiPhi.getSoLieuChiPhi().getBaoHiem() / 100.0));
        this.chiPhi.setDienThoai(this.getTongDoanhThuTrongNam() * (this.chiPhi.getSoLieuChiPhi().getDienThoai_DienNuoc() / 100.0));
        this.chiPhi.setQuangCao(this.chiPhi.getSoLieuChiPhi().getQuangCao_TiepThi() / 100.0 * this.getTongDoanhThuTrongNam());
        this.chiPhi.setSuaChua(this.chiPhi.getSoLieuChiPhi().getSuaChua() / 100.0 * this.getTongDoanhThuTrongNam());
        this.chiPhi.setThueDat(this.chiPhi.getSoLieuChiPhi().getThueDat() * 12.0);
        this.chiPhi.setQuanLy(this.chiPhi.getSoLieuChiPhi().getQuanLy() / 100.0 * this.getTongDoanhThuTrongNam());
        this.chiPhi.setChiPhiPhongNgu(this.chiPhi.getSoLieuChiPhi().getChiPhiPhongNgu() / 100.0 * this.getTongDoanhThuTrongNam());
        return this.chiPhi.getTongChiPhi();
    }
}