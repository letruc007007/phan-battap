/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HINHTRON.hinhtron;

/**
 *
 * @author ADMIN
 */
public class hinhtron {
    public double bankinh;

    public hinhtron() {
        this.bankinh = 0.0;
    }

    public hinhtron(double bankinh) {
        this.bankinh = bankinh;
    }

    public void setBanKinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBanKinh() {
        return this.bankinh;
    }

    public double tinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * bankinh;
    }
}