package Bai_on_GK;

public class Nguoi_doc extends Nguoi{
    private String masinhvien;
    private String ngaymuon;
    private String ngaytra;
    public Nguoi_doc(String hoten, int sdt, String email, String masinhvien, String ngaymuon, String ngaytra){
        super(hoten, sdt, email);
        this.masinhvien = masinhvien;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    @Override

    public String toString() {
        return super.toString() + "Nguoi_doc{" +
                "masinhvien='" + masinhvien + '\'' +
                ", ngaymuon='" + ngaymuon + '\'' +
                ", ngaytra='" + ngaytra + '\'' +
                '}';
    }
}
