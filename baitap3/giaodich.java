package baitap3;

import java.util.Scanner;

public class giaodich {
    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    private float dienTich;
    Scanner sc = new Scanner(System.in);
     
    public giaodich() {
        super();
    }
 
    public giaodich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich) {
        super();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
 
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
 
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
 
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }
 
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
 
    public long getDonGia() {
        return donGia;
    }
 
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
 
    public float getDienTich() {
        return dienTich;
    }
 
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
     
    public void nhap() {
        System.out.print("Nhập mã giao dịch: ");
        maGiaoDich = sc.nextLine();
        System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
        ngayGiaoDich = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = Long.parseLong(sc.nextLine());
        System.out.print("Nhập diện tích: ");
        dienTich = Float.parseFloat(sc.nextLine());
        sc.close();
    }
     
    @Override
    public String toString() {
        return "Mã giao dịch: " + this.maGiaoDich + ", ngày giao dịch: " + this.ngayGiaoDich + 
            ", đơn giá: " + this.donGia + ", diện tích: " + this.dienTich;
    }
}
