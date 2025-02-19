/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */

public class Sach {
    private String masach;
    private String nxb;
    private String tensach;
    private String mota;
    private String tacgia;
    private TheLoai theloai;
    private String namxb;
    private String ngonngu;
    private String anhbia;
    private String trangthai;
    private int gia;
    private int soluong;

    // ✅ Private constructor để bắt buộc dùng Builder
    private Sach(SachBuilder builder) {
        this.masach = builder.masach;
        this.nxb = builder.nxb;
        this.tensach = builder.tensach;
        this.mota = builder.mota;
        this.tacgia = builder.tacgia;
        this.theloai = builder.theloai;
        this.namxb = builder.namxb;
        this.ngonngu = builder.ngonngu;
        this.anhbia = builder.anhbia;
        this.trangthai = builder.trangthai;
        this.gia = builder.gia;
        this.soluong = builder.soluong;
    }

    // ✅ Builder Class
    public static class SachBuilder {
        private String masach;
        private String nxb;
        private String tensach;
        private String mota;
        private String tacgia;
        private TheLoai theloai;
        private String namxb;
        private String ngonngu;
        private String anhbia;
        private String trangthai;
        private int gia;
        private int soluong;

        public SachBuilder setMasach(String masach) {
            this.masach = masach;
            return this;
        }

        public SachBuilder setNxb(String nxb) {
            this.nxb = nxb;
            return this;
        }

        public SachBuilder setTensach(String tensach) {
            this.tensach = tensach;
            return this;
        }

        public SachBuilder setGia(int gia) {
            this.gia = gia;
            return this;
        }

        public SachBuilder setSoluong(int soluong) {
            this.soluong = soluong;
            return this;
        }

        // (Có thể thêm các setter khác nếu cần)

        public Sach build() {
            return new Sach(this);
        }
    }
}
