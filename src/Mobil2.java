import javax.swing.*;

public class Mobil2 {
    String merk;
    String warna;
    int tahunProduksi;
    int Gigi;
    int gigiBaru;
    boolean isMesinMati = true;

    // Method 1
    void isiVariabel(String merkMobil, String warnaMobil , int tahunMobil) {
        merk = merkMobil;
        warna = warnaMobil;
        tahunProduksi = tahunMobil;
    }

    // Method 2
    void printMobil() {
        System.out.println("Identitas Mobil");
        System.out.println("Merk Mobil      :" + merk );
        System.out.println("Warna Mobil     :" + warna);
        System.out.println("Identitas Mobil :" + tahunProduksi);
    }

    // LATIHAN
    void hidupkan() {
        Gigi = 0;
        if (!isMesinMati) { // jiks isMesinMati = true (mesin mati)
            System.out.println("\nMesin Mobil dalam keadaan Mati!");
        } else { // jika var isMesinMati = false
            System.out.println("\nMesin Hidup!");
            System.out.println("Gigi berada pada posisi Netral atau " + Gigi);
        }
    }

    void ubahGigi() {
        if (!isMesinMati) { // jika isMesinMati = true (mesin mati)
            System.out.println("Nyalakan Mesin terlebih dahulu sebelum mengubah gigi!"); // ngaruh di boolean isMesinMati
            return;
        }
        // inputan gigi
        String inputGigi = JOptionPane.showInputDialog("\nMasukkan Gigi: (1 - 5)");

        if (inputGigi == null || inputGigi.trim().equals("")) { // jika inputan kosong
            System.out.println("Input dibatalkan atau kosong");
            return;
        }
        try { // coba cari code yang kemungkinan error
            // jadikan var inputGigi bernilai integer
            gigiBaru = Integer.parseInt(inputGigi);

            if (gigiBaru >= 0 && gigiBaru <= 5) { // jika value gigiBaru 0 - 5
                Gigi = gigiBaru;
                System.out.println("G\nigi berhasil diubah ke posisi ke- " + Gigi);
            } else { // kalau ga, munculin allert
                System.out.println("\nInput tidak valid! Harus 0 sampai dengan 5!");
            }
        } catch (NumberFormatException e) { // ambil error nya lalu tangani
            System.out.println("\nInput tidak valid! Harus berupa angka antara 0 sampai dengan 5!");
        }
    }

    void matikan() {
        if (!isMesinMati) { // jika isMesinMati = true (mesin mati)
            System.out.println("Mesin sudah mati!");
            return;
        }
        if (Gigi == 0) { // jika value Gigi = 0 maka matikan
            System.out.println("\nMesin Mobil Dimatikan!");
        } else { // kalo value Gigi != 0 maka :
            System.out.println("\nTidak bisa mematikan mesin! Pindahkan gigi ke netral atau 0 terlebih dahulu!");
            while (Gigi > 0 && Gigi <= 5) { // lanjut looping untuk menentukan value Gigi
                ubahGigi(); // eksekusi method ubahGigi() buat bisa nginput Gigi
            }
            if (Gigi == 0) { // jika value Gigi sudah 0 maka matikan mesin
                System.out.println("\nMesin Mobil Dimatikan!");
            }
        }

    }

}


















