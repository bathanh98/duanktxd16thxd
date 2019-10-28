
package NVP;

public class IRR
{
    private double npv1;
    private double npv2;
    private double r1;
    private double r2;
    
    public double getNpv1() {
        return this.npv1;
    }
    
    public void setNpv1(final double npv1) {
        this.npv1 = npv1;
    }
    
    public double getNpv2() {
        return this.npv2;
    }
    
    public void setNpv2(final double npv2) {
        this.npv2 = npv2;
    }
    
    public double getR1() {
        return this.r1;
    }
    
    public void setR1(final double r1) {
        this.r1 = r1;
    }
    
    public double getR2() {
        return this.r2;
    }
    
    public void setR2(final double r2) {
        this.r2 = r2;
    }
    
    public IRR() {
    }
    
    public IRR(final double npv1, final double npv2, final double r1, final double r2) {
        this.npv1 = npv1;
        this.npv2 = npv2;
        this.r1 = r1;
        this.r2 = r2;
    }
    
    public double getIrr() {
        return this.r1 + this.npv1 / (this.npv1 - this.npv2) * (this.r2 - this.r1);
    }
    
    @Override
    public String toString() {
        return "IRR{npv1=" + this.npv1 + ", npv2=" + this.npv2 + ", r1=" + this.r1 + ", r2=" + this.r2 + " irr= " + this.getIrr() + '}';
    }
}