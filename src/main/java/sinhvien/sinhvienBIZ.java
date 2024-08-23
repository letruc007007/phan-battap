/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

/**
 *
 * @author ADMIN
 */
class sinhvienBIZ extends sinhvien {
    public double diemMarketing;
    public double diemSales;

    public sinhvienBIZ(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Kinh doanh");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}