/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author UnmatchedTaiNguyen
 */
public class JobModel {

    public JobModel() {
    }

    public JobModel(String KyNangMem, String NNLT, String QutMoCongTy, String LinhVuc, String KhuVuc, String NgoaiNgu, String KinhNghiem, String Luong) {
        this.KyNangMem = KyNangMem;
        this.NNLT = NNLT;
        this.QutMoCongTy = QutMoCongTy;
        this.LinhVuc = LinhVuc;
        this.KhuVuc = KhuVuc;
        this.NgoaiNgu = NgoaiNgu;
        this.KinhNghiem = KinhNghiem;
        this.Luong = Luong;
    }
    
    private String KyNangMem;
    private String NNLT;
    private String QutMoCongTy;
    private String LinhVuc;
    private String KhuVuc;
    private String NgoaiNgu;
    private String KinhNghiem;
    private String Luong;

    public String getKyNangMem() {
        return KyNangMem;
    }

    public void setKyNangMem(String KyNangMem) {
        this.KyNangMem = KyNangMem;
    }

    public String getNNLT() {
        return NNLT;
    }

    public void setNNLT(String NNLT) {
        this.NNLT = NNLT;
    }

    public String getQutMoCongTy() {
        return QutMoCongTy;
    }

    public void setQutMoCongTy(String QutMoCongTy) {
        this.QutMoCongTy = QutMoCongTy;
    }

    public String getLinhVuc() {
        return LinhVuc;
    }

    public void setLinhVuc(String LinhVuc) {
        this.LinhVuc = LinhVuc;
    }

    public String getKhuVuc() {
        return KhuVuc;
    }

    public void setKhuVuc(String KhuVuc) {
        this.KhuVuc = KhuVuc;
    }

    public String getNgoaiNgu() {
        return NgoaiNgu;
    }

    public void setNgoaiNgu(String NgoaiNgu) {
        this.NgoaiNgu = NgoaiNgu;
    }

    public String getKinhNghiem() {
        return KinhNghiem;
    }

    public void setKinhNghiem(String KinhNghiem) {
        this.KinhNghiem = KinhNghiem;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }
    
}
