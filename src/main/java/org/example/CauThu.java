package org.example;

import java.util.Random;
import java.util.Scanner;

public class CauThu extends VanDongVien{
    public String CauLacBo;
    public int LuongTuan;
    public CauThu(){}
    public CauThu(String CauLacBo, int LuongTuan, String HoTen, int Tuoi, float CanNang, float ChieuCao){
        this.LuongTuan= LuongTuan;
        this.CauLacBo = CauLacBo;
        super.ChieuCao = ChieuCao;
        super.HoTen = HoTen;
        super.CanNang = CanNang;
        super.Tuoi = Tuoi;
    }

    public boolean SoSanh(CauThu cauThu1, CauThu cauThu2) {
        if(cauThu1.LuongTuan>cauThu2.LuongTuan){
            return true;
        }
        else if(cauThu1.LuongTuan<cauThu2.LuongTuan){
            return false;
        }
        else return super.SoSanh(cauThu1, cauThu2);
    }
    public static CauThuBuilder createBuilder1(){
        return new CauThuBuilder();
    }
    public static class CauThuBuilder{
        private String HoTen;
        private int Tuoi;
        private float CanNang;
        private float ChieuCao;
        private String CauLacBo;
        private int LuongTuan;
        public CauThuBuilder(){}
        public CauThuBuilder withName(String HoTen){
            this.HoTen = HoTen;
            return this;
        }
        public CauThuBuilder withTuoi(int Tuoi){
            this.Tuoi = Tuoi;
            return this;
        }
        public CauThuBuilder withCanNang(float CanNang){
            this.CanNang = CanNang;
            return this;
        }
        public CauThuBuilder withChieuCao(float ChieuCao){
            this.ChieuCao = ChieuCao;
            return this;
        }
        public CauThuBuilder withCauLacBo(String CauLacBo){
            this.CauLacBo = CauLacBo;
            return this;
        }
        public CauThuBuilder withLuongTuan(int LuongTuan){
            this.LuongTuan = LuongTuan;
            return this;
        }
        public CauThu Builder(){
            return new CauThu(this.CauLacBo, this.LuongTuan, this.HoTen, this.Tuoi, this.CanNang, this.ChieuCao);
        }
    }
    public static CauThu InputCauThu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: \n");
        String HoTen = sc.nextLine();
        System.out.println("Tuoi: ");
        int Tuoi = sc.nextInt();
        System.out.println("Chieu Cao: ");
        float ChieuCao = sc.nextFloat();
        System.out.println("Can Nang: ");
        float CanNang = sc.nextFloat();
        sc.nextLine();
        System.out.println("Cau Lac Bo: ");
        String CauLacBo = sc.nextLine();
        System.out.println("Luong Tuan: ");
        int LuongTuan = sc.nextInt();
        CauThu cauthu = CauThu.createBuilder1().withName(HoTen).withTuoi(Tuoi).withChieuCao(ChieuCao).withCanNang(CanNang).withCauLacBo(CauLacBo).withLuongTuan(LuongTuan).Builder();
        return cauthu;
    }
    public static void ShowCauThu(CauThu cauThu) throws Exception{
        System.out.println("Ho Ten: "+ cauThu.HoTen + " Tuoi: "+ cauThu.Tuoi+ " Chieu Cao: "+ cauThu.ChieuCao+" Can Nang: "+ cauThu.CanNang+ " Cau Lac Bo: "+ cauThu.CauLacBo +" Luong Tuan: "+ cauThu.LuongTuan);
    }
    public static void main(String[] args) throws Exception {
        // Khai bao 1 doi tuong, khoi tao, hien thi thong tin cua doi tuong Van Dong Vien
        VanDongVien vdv = VanDongVien.createBuilder().withName("Minh An").withTuoi(23).withChieuCao(164).withCanNang(50).Builder();
        vdv.ShowVDV(vdv);
        // Nhap vao 1 mang n cau thu
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.print("Nhập so luong Cau thu n =");
        int n = sc.nextInt();
        Random rdn = new Random();
        CauThu cauThu = new CauThu();
        CauThu[] arrCauThu = new CauThu[n];
        for (int i = 0; i<n; i++){
            System.out.println("Nhap VDV thu "+ (i+1) +" :");
            cauThu = CauThu.InputCauThu();
            arrCauThu[i]= cauThu;
        }
        // Hien thi danh sach da nhap ra man hinh
        System.out.println("***********************************************");
        System.out.println("Danh sach cac VDV da nhap");
        for (int i = 0; i<n ; i++){
            System.out.println("Van dong vien thu "+i+" :");
            ShowCauThu(arrCauThu[i]);
        }
        //Sap xep mang da nhap theo thu tu tang dan va hien thi ra man hinh
        CauThu temp = new CauThu();
        for (int i = 0; i<n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (temp.SoSanh(arrCauThu[i],arrCauThu[j])){
                    temp = arrCauThu[j];
                    arrCauThu[j] = arrCauThu[i];
                    arrCauThu[i] = temp;

                }
            }
        }
        System.out.println("***********************************************");
        System.out.println("Sau khi sap xep theo thu tu can nang tang dan:");
        for (int i = 0; i<n ; i++){
            System.out.println("Cau Thu thu "+i+" :");
            ShowCauThu(arrCauThu[i]);
        }

    }
}
