package Main;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach=new ArrayList<SinhVien>();
    }
    public void temSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien:danhSach
             ) {
            System.out.println(sinhVien);
        }

    }
    //kiểm tra có rỗng k
    public boolean kiemTraDanhSachRong(){
       return this.danhSach.isEmpty();

    }
    //Lấy ra số lượng sv
    public int layRaSoLuongSV(){
        return this.danhSach.size();

    }
    // làm rỗng ds sv
    public void lamRongDS(){
        this.danhSach.removeAll(danhSach);
    }

}
