
package NVP;

import java.util.Iterator;
import entity.ChiTietDuAn;
import java.util.ArrayList;
import java.util.List;
import entity.TongDuAn;

public class NPV
{
    private TongDuAn duAn;
    private List<NPVt> listNPV;
    private IRR irr;
    private PP pp;
    private List<Double> listPVTichLuy;
    
    public void setListNPVt() {
        final List<NPVt> listNPVt = new ArrayList<NPVt>();
        listNPVt.add(new NPVt(0.0, this.duAn.getVonDauTu().getVonTuCo() + this.duAn.getVonDauTu().getVonVay(), this.duAn.getChietKhau(), 0));
        for (final ChiTietDuAn chiTietDuAn : this.duAn.getListChiTietDuAn()) {
            listNPVt.add(new NPVt(chiTietDuAn.getTongDoanhThuTrongNam(), chiTietDuAn.getChiPhiTrongNam(), this.duAn.getChietKhau(), chiTietDuAn.getNam()));
        }
        this.listNPV = listNPVt;
    }
    
    public List<NPVt> getListNPV() {
        return this.listNPV;
    }
    
    public NPV(final TongDuAn duAn) {
        this.duAn = duAn;
        this.pp = new PP();
        this.irr = new IRR();
        this.setListNPVt();
    }
    
    public PP getPP() {
        double sumPV = 0.0;
        for (int i = 0; i < this.listNPV.size(); ++i) {
            sumPV += this.listNPV.get(i).getPv();
            if (sumPV > 0.0) {
                this.pp.setNam(i - 1);
                final double _thang = -this.getPvTichLuy(i - 1) / this.listNPV.get(i).getPv() * 12.0;
                this.pp.setThang((int)_thang);
                break;
            }
        }
        return this.pp;
    }
    
    public List<Double> getListPVTichLuy() {
        final List<Double> list = new ArrayList<Double>();
        for (int i = 1; i <= this.listNPV.size(); ++i) {
            list.add(this.getPvTichLuy(i));
        }
        return list;
    }
    
    public void setPp(final PP pp) {
        this.pp = pp;
    }
    
    public IRR getIrr() {
        this.irr.setNpv1(this.getNpv());
        final double r1 = this.getDuAn().getChietKhau();
        this.irr.setR1(r1);
        this.irr.setNpv1(this.getNpv());
        double r2 = this.getDuAn().getChietKhau();
        double npv2;
        NPV npv3;
        for (npv2 = 1.0; npv2 > 0.0; npv2 = npv3.getNpv()) {
            ++r2;
            this.getDuAn().setChietKhau(r2);
            npv3 = new NPV(this.getDuAn());
        }
        this.irr.setNpv2(npv2);
        this.irr.setR2(r2);
        this.getDuAn().setChietKhau(r1);
        this.setListNPVt();
        return this.irr;
    }
    
    public NPV(final List<NPVt> NVPtList) {
        this.listNPV = NVPtList;
    }
    
    public double getBcr() {
        return this.getNpvCIF() / this.getNpvCOF();
    }
    
    public TongDuAn getDuAn() {
        return this.duAn;
    }
    
    public void setDuAn(final TongDuAn duAn) {
        this.duAn = duAn;
    }
    
    public double getNpv() {
        double npv = 0.0;
        for (final NPVt npvt : this.listNPV) {
            npv += npvt.getNpvt();
        }
        return npv;
    }
    
    public double getNpvCIF() {
        double cif = 0.0;
        for (final NPVt npvt : this.listNPV) {
            cif += npvt.getNVP_CIFt();
        }
        return cif;
    }
    
    public double getNpvCOF() {
        double cof = 0.0;
        for (final NPVt npvt : this.listNPV) {
            cof += npvt.getNVP_COFt();
        }
        return cof;
    }
    
    private double getPvTichLuy(final int nam) {
        double sumPV = 0.0;
        for (final NPVt npvt : this.listNPV) {
            if (npvt.getNam() <= nam) {
                sumPV += npvt.getPv();
            }
        }
        return sumPV;
    }
    
    public PP getPp() {
        return this.pp;
    }
    
    @Override
    public String toString() {
        return "NPV{ NVPtList=" + this.listNPV + ", pp=" + this.getPP() + ", BRC=" + this.getBcr() + ", r=" + this.duAn.getChietKhau() + ", NPV=" + this.getNpv() + ", IRR=" + this.getIrr() + "npv: " + this.getNpv() + '}';
    }
}