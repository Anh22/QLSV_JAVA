package Main;

import sun.misc.FDBigInteger;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int luaChon = 0;

        do {
            System.out.println("Menu--------");
            System.out.println("Vui long cọn chức năng");

            System.out.println("1. Thêm sinh viên vào danh sach.\n" +
                    "2. In ra danh sách sinh viên ra màn hình \n" +
                    "3. Kiểm tra danh sách đó có rỗng hay không\n"+
                    "4. Lấy ra số lượng sinh viên trong danh sách\n "+
                    "0. Thoát khỏi chương trình");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon==1){
                System.out.println("Nhập mã sv");String maSinhVien = scanner.nextLine();
                System.out.println("Nhập họ và tên");String hoVaTen = scanner.nextLine();
                System.out.println("Nhập năm sinh");int namSinh = scanner.nextInt();
                System.out.println("Nhập điểm trung bình");float diemTrungBinh = scanner.nextFloat();
                SinhVien sinhVien = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                danhSachSinhVien.temSinhVien(sinhVien);



            } else if (luaChon==2) {
                //in danh sách sv ra màn hình
                danhSachSinhVien.inDanhSachSinhVien();


            } else if (luaChon==3) {
                System.out.println("Kiểm tra sd rỗng"+danhSachSinhVien.kiemTraDanhSachRong());

            } else if (luaChon==4) {
                System.out.println("Số lượng hiện tại"+danhSachSinhVien.layRaSoLuongSV());

            }
        }while(luaChon!=0);



    }
}
