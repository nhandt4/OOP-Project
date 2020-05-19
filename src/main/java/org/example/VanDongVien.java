package org.example;
// Create by Nhandt4
// Created 18/5/2020

import java.security.Permission;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VanDongVien {
    public String HoTen;
    public int Tuoi;
    public float CanNang;
    public float ChieuCao;
    public VanDongVien(){}
    public VanDongVien(String HoTen, int Tuoi, float CanNang, float ChieuCao){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.CanNang = CanNang;
        this.ChieuCao = ChieuCao;

    }
    public boolean SoSanh(VanDongVien vdv1, VanDongVien vdv2){
        if(vdv1.ChieuCao > vdv2.ChieuCao)
            return true;
        else if(vdv1.ChieuCao < vdv2.ChieuCao)
            return false;
        else {
            if(vdv1.CanNang>= vdv2.CanNang)
                return true;
            else return false;
        }

    }
    public void ShowVDV(VanDongVien vdv) throws Exception{
        System.out.println("Ho Ten: "+ vdv.HoTen + " Tuoi: "+ vdv.Tuoi+ " Chieu Cao: "+ vdv.ChieuCao+" Can Nang: "+ vdv.CanNang);
    }

    public static VanDongVienBuilder createBuilder(){
        return new VanDongVienBuilder();
    }
    public static class VanDongVienBuilder{
        private String HoTen;
        private int Tuoi;
        private float CanNang;
        private float ChieuCao;
        public VanDongVienBuilder(){}
        public VanDongVienBuilder withName(String HoTen){
            this.HoTen = HoTen;
            return this;
        }
        public VanDongVienBuilder withTuoi(int Tuoi){
            this.Tuoi = Tuoi;
            return this;
        }
        public VanDongVienBuilder withCanNang(float CanNang){
            this.CanNang = CanNang;
            return this;
        }
        public VanDongVienBuilder withChieuCao(float ChieuCao){
            this.ChieuCao = ChieuCao;
            return this;
        }
        public VanDongVien Builder(){
            return new VanDongVien(this.HoTen, this.Tuoi, this.CanNang, this.ChieuCao);
        }
    }

}
