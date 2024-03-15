import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Bujur angkar");
        System.out.println("Isikan Pilihan");

        try (Scanner sc = new Scanner(System.in)) {
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                BujurSangkar bs = new BujurSangkar(10);
                System.out.println("Luas Bujur Sangkar :" + bs.hitungLuas());
                System.out.println("keliling Bujur Sangkar : " + bs.hitungKeliling());
            }

            if (pilihan == 2) {
                PersegiPanjang bs = new PersegiPanjang(8, 12);
                System.out.println("Luas Persegi Panjang :" + bs.hitungLuas());
                System.out.println("keliling Persegi Panjang : " + bs.hitungKeliling());
            }
        }

    }

}
