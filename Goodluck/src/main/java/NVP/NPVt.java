
package NVP;

public class NPVt
{
    private double CIFt;
    private double COFt;
    private double r;
    private int nam;
    
    public double getNVP_CIFt() {
        return this.CIFt / this.getChietKhau();
    }
    
    public double getNVP_COFt() {
        return this.COFt / this.getChietKhau();
    }
    
    public double getNpvt() {
        return this.getPv() / this.getChietKhau();
    }
    
    public NPVt(final double CIFt, final double COFt, final double r, final int nam) {
        this.CIFt = CIFt;
        this.COFt = COFt;
        this.r = r;
        this.nam = nam;
        this.getChietKhau();
    }
    
    public NPVt() {
    }
    
    public double getPv() {
        return this.CIFt - this.COFt;
    }
    
    public double getChietKhau() {
        return Math.pow(1.0 + this.r / 100.0, this.nam);
    }
    
    public int getNam() {
        return this.nam;
    }
    
    public void setNam(final int nam) {
        this.nam = nam;
    }
    
    public double getCIFt() {
        return this.CIFt;
    }
    
    public void setCIFt(final double CIFt) {
        this.CIFt = CIFt;
    }
    
    public double getCOFt() {
        return this.COFt;
    }
    
    public void setCOFt(final double COFt) {
        this.COFt = COFt;
    }
    
    public double getR() {
        return this.r;
    }
    
    public void setR(final double r) {
        this.r = r;
    }
    
    @Override
    public String toString() {
        return "NPVt{CIFt=" + this.CIFt + ", COFt=" + this.COFt + ", r=" + this.r + ", nam=" + this.nam + ", PV=" + this.getPv() + ", NPVt=" + this.getNpvt() + ", chiet khau " + this.getChietKhau() + '}';
    }
}
