/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Thanh
 */
public class MonHoc implements java.io.Serializable{
    String maMon;
    String tenMon;
    int soDonviht;

    public MonHoc(String maMon, String tenMon, int soDonviht) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soDonviht = soDonviht;
    }

    public MonHoc() {
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getSoDonviht() {
        return soDonviht;
    }

    public void setSoDonviht(int soDonviht) {
        this.soDonviht = soDonviht;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    
    public Object[] toArray()
    {
        return new Object[]{maMon,tenMon,soDonviht};
    }
}
