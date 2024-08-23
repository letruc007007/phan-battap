/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

/**
 *
 * @author ADMIN
 */
 class sinhvienIT extends sinhvien {
    public double diemJava;
    public final double diemHtml;
    public final double diemCss;

    public sinhvienIT(String hoTen, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, "Công nghệ thông tin");
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}
