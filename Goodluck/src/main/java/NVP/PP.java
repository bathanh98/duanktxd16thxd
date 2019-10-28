
package NVP;

public class PP
{
    private int thang;
    private int nam;
    
    public int getThang() {
        return this.thang;
    }
    
    public void setThang(final int thang) {
        this.thang = thang;
    }
    
    public int getNam() {
        return this.nam;
    }
    
    public void setNam(final int nam) {
        this.nam = nam;
    }
    
    @Override
    public String toString() {
        return "PP{thang=" + this.thang + ", nam=" + this.nam + '}';
    }
}