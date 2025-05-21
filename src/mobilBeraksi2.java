import javax.swing.*;

public class mobilBeraksi2 {
    public static void main(String[] args) {
        // membuat object dari class Mobil2
        Mobil2 myCar2 = new Mobil2();

        // mengisi atribut class
        myCar2.isiVariabel("Ferrari GTO", "Silver",1964);

        // memanggil method printMobil()
        myCar2.printMobil();

        // memanggil method hidupkan() mesinMobil
        myCar2.hidupkan();

        // nanya mau ubah gigi apa ga
        String nanya    = JOptionPane.showInputDialog("\n Ingin mengubah gigi ? (y / n)");

        // looping untuk pertanyaan ubahGigi()
        while (nanya.equalsIgnoreCase("y")){
            myCar2.ubahGigi();

            nanya = JOptionPane.showInputDialog("\n Ingin mengubah gigi lagi? (y / n)");
            // looping untuk jawaban tidak valid
            while (!nanya.equalsIgnoreCase("y") && !nanya.equalsIgnoreCase("n")){
                nanya = JOptionPane.showInputDialog("Jawaban tidak valid. Ketik y atau n:");
        }
        }

        // eksekusi method matikan()
        myCar2.matikan();

    }
}
