package entity;

import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "vondautu")
public class VonDauTu implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double vonTuCo;
    private double vonVay;
    private double thoiGianVayVon;
    private double chiPhiVonTuCo;
    private double chiPhiVonVay;
    @OneToOne(mappedBy = "vonDauTu")
    private TongDuAn tongDuAn;
    
    public VonDauTu() {
    }
    
    public TongDuAn getTongDuAn() {
        return this.tongDuAn;
    }
    
    public VonDauTu(final int id) {
        this.id = id;
    }
    
    public void setTongDuAn(final TongDuAn tongDuAn) {
        this.tongDuAn = tongDuAn;
    }
    
    public double getVonTuCo() {
        return this.vonTuCo;
    }
    
    public void setVonTuCo(final double vonTuCo) {
        this.vonTuCo = vonTuCo;
    }
    
    public double getVonVay() {
        return this.vonVay;
    }
    
    public void setVonVay(final double vonVay) {
        this.vonVay = vonVay;
    }
    
    public double getThoiGianVayVon() {
        return this.thoiGianVayVon;
    }
    
    public void setThoiGianVayVon(final double thoiGianVayVon) {
        this.thoiGianVayVon = thoiGianVayVon;
    }
    
    public double getChiPhiVonTuCo() {
        return this.chiPhiVonTuCo;
    }
    
    public void setChiPhiVonTuCo(final double chiPhiVonTuCo) {
        this.chiPhiVonTuCo = chiPhiVonTuCo;
    }
    
    public double getChiPhiVonVay() {
        return this.chiPhiVonVay;
    }
    
    public void setChiPhiVonVay(final double chiPhiVonVay) {
        this.chiPhiVonVay = chiPhiVonVay;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "VonDauTu{id=" + this.id + ", vonTuCo=" + this.vonTuCo + ", vonVay=" + this.vonVay + ", thoiGianVayVon=" + this.thoiGianVayVon + ", chiPhiVonTuCo=" + this.chiPhiVonTuCo + ", chiPhiVonVay=" + this.chiPhiVonVay + '}';
    }
    
    public double getChietKhau() {
        return (this.vonTuCo * this.chiPhiVonTuCo + this.vonVay * this.chiPhiVonVay) / (this.vonTuCo + this.vonVay);
    }
}