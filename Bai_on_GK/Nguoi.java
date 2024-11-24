package Bai_on_GK;

public class Nguoi implements printable{
    private String hoten;
    private int sdt;
    private String email;
    public Nguoi(String hoten, int sdt, String email){
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
    }
    public String setHoten(String hoten) {
        return hoten;
    }
    public int setSdt(int sđt) {
        return sdt;
    }
    public String setEmail(String email) {
        return email;
    }

    @Override
    public void print() {

    }
}
