package entity;

public class SoBoDuAn
{
    private String tenDuAn;
    private int soNamThamDinh;
    private SoLieuChiPhi soLieuChiPhi;
    private SoLieuDoanhThu soLieuDoanhThu;
    private VonDauTu vonDauTu;
    
    public SoBoDuAn() {
        this.soLieuChiPhi = new SoLieuChiPhi();
        this.soLieuDoanhThu = new SoLieuDoanhThu();
    }
    
    public String getTenDuAn() {
        return this.tenDuAn;
    }
    
    public void setTenDuAn(final String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }
    
    public int getSoNamThamDinh() {
        return this.soNamThamDinh;
    }
    
    public void setSoNamThamDinh(final int soNamThamDinh) {
        this.soNamThamDinh = soNamThamDinh;
    }
    
    public SoLieuChiPhi getSoLieuChiPhi() {
        return this.soLieuChiPhi;
    }
    
    public void setSoLieuChiPhi(final SoLieuChiPhi soLieuChiPhi) {
        this.soLieuChiPhi = soLieuChiPhi;
    }
    
    public SoLieuDoanhThu getSoLieuDoanhThu() {
        return this.soLieuDoanhThu;
    }
    
    public void setSoLieuDoanhThu(final SoLieuDoanhThu soLieuDoanhThu) {
        this.soLieuDoanhThu = soLieuDoanhThu;
    }
    
    public VonDauTu getVonDauTu() {
        return this.vonDauTu;
    }
    
    public void setVonDauTu(final VonDauTu vonDauTu) {
        this.vonDauTu = vonDauTu;
    }
}