/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    static ArrayList<sinhvien> danhsach = new ArrayList<>();
    public static void main(String[] args) {
        nemu();
        
    }

    private static void nemu() {
        int chon = 5;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo điem");
            System.out.println("5. Ket thuc");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    nhapds();
                    break;
                case 2:
                    xuatds();
                    break;
                case 3:
                    xuatdshsgioi();
                    break;
                case 4:
                    sapxepdssvtheodiem();
                    break;
                case 5:
                    System.out.println("bye ban");
                     break;
            }
        }
    }

    private static ArrayList<sinhvien> danhSach = new ArrayList<>();

    
    private static void nhapds() {
        String tieptuc = "y";
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            System.out.println("Thuc hien nhap danh sach sinh vien");

            System.out.println("Chon nganh (1-IT, 2-Biz): ");
            int chon = sc1.nextInt();

            sc1.nextLine(); 

            if (chon == 1) {
                System.out.print("Ho ten: ");
                String hoten = sc1.nextLine();

                System.out.print("Điem Java: ");
                double java = sc1.nextDouble();

                System.out.print("Điem CSS: ");
                double cssl = sc1.nextDouble();

                System.out.print("Điem HTML: ");
                double html = sc1.nextDouble();

                sinhvienIT sv = new sinhvienIT(hoten, java, html, cssl);
                danhSach.add(sv);
            } else if (chon == 2) {
                System.out.print("Ho ten: ");
                String hoten = sc1.nextLine();

                System.out.print("Điem Marketing: ");
                double marketing = sc1.nextDouble();

                System.out.print("Điem Sales: ");
                double sale = sc1.nextDouble();

                sinhvienBIZ sv = new sinhvienBIZ(hoten, marketing, sale);
                danhSach.add(sv);
            } else {
                System.out.println("Lua chon ko hop le. Vui lòng chọn lại: ");
            }

            sc1.nextLine(); 
            System.out.print("Co tiep tuc nhap khong? (y/n): ");
            tieptuc = sc2.nextLine();

        } while (tieptuc.equalsIgnoreCase("y"));
    }


    private static void xuatds() {
         System.out.println("thuc hien danh sach");
         for(sinhvien sv :danhSach){
             sv.xuat();
        }
    }

    private static void xuatdshsgioi() { 
        for(sinhvien sv :danhSach){
           if (sv.getDiem()<9 && sv.getDiem()>=7.5)
           {
               sv.xuat();
           }
        }
        
    }

    private static void sapxepdssvtheodiem() {
        Comparator<sinhvien>cmp=new Comparator<sinhvien>(){ 
            @Override
            public int compare(sinhvien sv1, sinhvien sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        };
       Collections.sort(danhsach,cmp);
    }
}
