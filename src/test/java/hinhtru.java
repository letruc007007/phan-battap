/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HINHTRON.hinhtron;

/**
 *
 * @author ADMIN
 */
public class hinhtru extends hinhtron {
    private double chieucao;

    public hinhtru() {
        super();
        this.chieucao = 0.0;
    }

    public hinhtru(double bankinh, double chieucao) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public void setChieuCao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getChieuCao() {
        return this.chieucao;
    }

    public double tinhTheTich() {
        return tinhDienTich() * chieucao;
    }

    @Override
    public double tinhDienTich() {
        double s_day=super.tinhDienTich();
        double s_xq = super.tinhChuVi()*chieucao;
        return 2*s_day +s_xq;
    }
}