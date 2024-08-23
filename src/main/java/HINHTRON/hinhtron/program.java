/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HINHTRON.hinhtron;


public class program {
    public static void main(String[] args) {
        hinhtron c1=new hinhtron(5.0);
        System.out.println("hinh tron[ban kinh:"+ c1.getBanKinh()+"' dien tich:"+c1.tinhDienTich()+",chu vi"+c1.tinhChuVi());
        
        hinhtru c2 = new hinhtru(5.0,4.0);
        System.out.println("hinh tron[ban kinh:"+ c2.getBanKinh()+",chieu cao"+c2.getChieuCao()+"' dien tich:"+c2.tinhDienTich()+",the tich"+c2.tinhTheTich());
    }
}