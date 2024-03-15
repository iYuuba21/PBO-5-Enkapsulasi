public class BujurSangkar extends BangunDatar {

    BujurSangkar(int s) {

        super(s);

    }

    int hitungLuas() {
        int s = super.getS();
        return s * s;
    }

    int hitungKeliling() {
        int s = super.getS();
        return 4 * s;
    }

    public String toString() {
        return "Luas Bujur Sangkar" + hitungLuas() + "\n" +
                "Keliling Bujur Sangkar " + hitungKeliling();
    }

}
