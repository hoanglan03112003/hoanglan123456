package baitap3;

public class giaodichdat extends giaodich {
    private String loaiDat;
 
    public giaodichdat() {
        super();
    }
 
    public giaodichdat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }
 
    public String getLoaiDat() {
        return loaiDat;
    }
 
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
     
    public void nhap() {
        super.nhap();
        System.out.print("Nhập loại đất (A/B/C): ");
        loaiDat = sc.nextLine();
    }
 
    @Override
    public String toString() {
        return super.toString() + ", loại đất: " + this.loaiDat;
    }
}
