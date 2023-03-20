package baitap3;

public class giaodichnha extends giaodich {
    private String loaiNha, diaChi;
    private int choose;
     
    public giaodichnha() {
        super();
    }
 
    public giaodichnha(String loaiNha, String diaChi) {
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
 
    public String getLoaiNha() {
        return loaiNha;
    }
 
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
     
    public void nhap() {
        super.nhap();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập loại nhà (0: cao cấp, 1: thường): ");
        choose = sc.nextInt();
        switch (choose) {
            case 0:
                loaiNha = "cao cấp";
                break;
            case 1: 
                loaiNha = "thường";
                break;
            default:
                System.out.println("Chọn số không hợp lệ.");
                break;
        }
    }
     
    @Override
    public String toString() {
        return super.toString() + ", loại nhà: " + this.loaiNha + ", địa chỉ: " + this.diaChi;
    }
}
