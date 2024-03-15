public class BangunDatar {

    private int p;
    private int l;
    private int s;

    BangunDatar(int p, int l) {
        this.p = p;
        this.l = l;

    }

    BangunDatar(int s) {
        this.s = s;

    }

    void setPL(int p, int l) {
        this.p = p;
        this.l = l;
    }

    void setS(int s) {
        this.s = s;
    }

    int getP() {
        return p;

    }

    int getL() {
        return l;
    }

    int getS() {
        return s;
    }
}