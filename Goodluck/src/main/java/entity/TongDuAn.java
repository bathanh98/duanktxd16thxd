package entity;

import java.util.ArrayList;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "tongduan")
public class TongDuAn implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tenDuAn;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayThanhlap;
    @OneToMany(mappedBy = "tongDuAn", cascade = { CascadeType.ALL })
    private List<ChiTietDuAn> listChiTietDuAn;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "idVonDauTu")
    private VonDauTu vonDauTu;
    private double chietKhau;
    
    public TongDuAn(final int id) {
        this.id = id;
    }
    
    public TongDuAn(final String tenDuAn, final LocalDate ngayThanhlap, final VonDauTu vonDauTu) {
        this.tenDuAn = tenDuAn;
        this.ngayThanhlap = ngayThanhlap;
        this.vonDauTu = vonDauTu;
    }
    
    public TongDuAn(final String tenDuAn, final VonDauTu vonDauTu) {
        this.tenDuAn = tenDuAn;
        this.vonDauTu = vonDauTu;
    }
    
    public double getChietKhau() {
        return this.chietKhau;
    }
    
    public void setChietKhau(final double chietKhau) {
        this.chietKhau = chietKhau;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public String getTenDuAn() {
        return this.tenDuAn;
    }
    
    public void setTenDuAn(final String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }
    
    public LocalDate getNgayThanhlap() {
        return this.ngayThanhlap;
    }
    
    public void setNgayThanhlap(final LocalDate ngayThanhlap) {
        this.ngayThanhlap = ngayThanhlap;
    }
    
    public List<ChiTietDuAn> getListChiTietDuAn() {
        return this.listChiTietDuAn;
    }
    
    public void setListChiTietDuAn(final List<ChiTietDuAn> listChiTietDuAn) {
        this.listChiTietDuAn = listChiTietDuAn;
    }
    
    public VonDauTu getVonDauTu() {
        return this.vonDauTu;
    }
    
    public void setVonDauTu(final VonDauTu vonDauTu) {
        this.vonDauTu = vonDauTu;
    }
    
    public TongDuAn() {
        this.listChiTietDuAn = new ArrayList<ChiTietDuAn>();
    }
    
    @Override
    public String toString() {
        return "TongDuAn{id=" + this.id + ", tenDuAn=" + this.tenDuAn + ", ngayThanhlap=" + this.ngayThanhlap + ", listChiTietDuAn=" + this.listChiTietDuAn + ", vonDauTu=" + this.vonDauTu + '}';
    }
}
