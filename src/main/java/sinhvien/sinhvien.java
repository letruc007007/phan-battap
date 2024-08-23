/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

/**
 *
 * @author ADMIN
 */
 public abstract class sinhvien {
     public String hoTen;
     public String nganh;

    public sinhvien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng
    abstract public double getDiem();

    public String getHocLuc() {
        String kq= "";
        double diem = getDiem();
        if (diem < 5) {
            kq= "yeu";
        } else if (diem < 6.5) {
            kq= "trung binh";
        } else if (diem < 7.5) {
            kq= "kha";
        } else if (diem < 9) {
            kq= "gioi";
        } else {
            kq= "Xuat sac";
        }
        return kq;
        
    }

    public void xuat() {
        System.out.println("sinhvien[hoten:"+ hoTen+",nganh:"+nganh+",DTB:"+ getDiem()+",hocluc:"+getHocLuc()+"]");
       
    }
}