/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;

/**
 *
 * @author Thanh
 */
public class BangDiem implements Serializable{
    private int diem;
    private HocSinh sv;
    private MonHoc mh;

    public BangDiem() {
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public HocSinh getSv() {
        return sv;
    }

    public void setSv(HocSinh sv) {
        this.sv = sv;
    }

    public BangDiem(int diem, HocSinh sv, MonHoc mh) {
        this.diem = diem;
        this.sv = sv;
        this.mh = mh;
    }

//    public Object[] toArray()
//    {
//        return new Object[]{sv.getMaSV(),sv.getHo()+" "+sv.getTen(),mh.getTenMon()
//            ,diem};
//    }
    
}