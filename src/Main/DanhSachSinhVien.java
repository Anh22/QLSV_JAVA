package Main;

import javax.print.attribute.standard.MediaSize;
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
    public void update(String masinhvien ,SinhVien sinhVien){
        int index = -1;
        for (int i = 0; i < this.danhSach.size(); i++) {
            if (masinhvien==this.danhSach.get(i).getMaSinhVien()){
                index = i;
            }
            this.danhSach.set(index,sinhVien);


        }
    }
    public void delete(String maSingVien){
        int  index = -1;
        for (int i = 0; i < this.danhSach.size(); i++) {
            if (maSingVien==this.danhSach.get(i).getMaSinhVien()){
                index=i;
            }
            this.danhSach.remove(index);

        }

    }
    public void findAll(String hoTen){
        for (int i = 0; i < this.danhSach.size(); i++) {
            if (this.danhSach.get(i).getMaSinhVien().equals(hoTen)){
                System.out.println(this.danhSach.get(i));
            }

        }
    }

}
