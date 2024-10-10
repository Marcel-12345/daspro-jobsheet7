import java.util.Scanner;

public class Tugas7_1_05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int tiket = 50000;
        int jumlah, totalTiket = 0;
        double harga, diskon, totalHarga = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk cek total): ");
            jumlah = sc.nextInt();
            if (jumlah < 0) {
                System.out.println("Masukkan jumlah tiket yang benar!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }
            if (jumlah > 10) {
                diskon = 0.15;
                System.out.println("harga = Rp. " + (jumlah * tiket - (jumlah * tiket * diskon)));
            } else if (jumlah > 4) {
                diskon = 0.1;
                System.out.println("harga = Rp. " + (jumlah * tiket - (jumlah * tiket * diskon)));
            } else {
                diskon = 0.0;
                System.out.println("harga = Rp. " + (jumlah * tiket));
            }
            harga = jumlah * tiket - (jumlah * tiket * diskon);
            totalHarga += harga;
            totalTiket += jumlah;

        }

        System.out.println("Total tiket terjual sebanyak " + totalTiket + " buah.");
        System.out.println("Total harga penjualan tiket sebanyak Rp." + totalHarga);

    }
}

