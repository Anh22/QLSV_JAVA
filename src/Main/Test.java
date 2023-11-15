package Main;

import sun.misc.FDBigInteger;

import java.util.Scanner;

public class Test {
    public static void main(String[] a ) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int luaChon = 0;

        do {
            System.out.println("Menu--------");
            System.out.println("Vui long cọn chức năng");

            System.out.println("1. Thêm sinh viên vào danh sach.\n" +
                    "2. In ra danh sách sinh viên ra màn hình \n" +
                    "3. Tìm sinh viên \n"+
                    "4. Detete sinh viên\n "+
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
                System.out.println("Sinh vien cần tìm");
                scanner.nextLine();
                String findNam = scanner.nextLine();
                danhSachSinhVien.findAll(findNam);

            } else if (luaChon==4) {
                System.out.println("Nhập vào tên muốn xóa");
                String deleteID = scanner.nextLine();
                danhSachSinhVien.delete(deleteID);


            }

        }while(luaChon!=0);



    }
}
