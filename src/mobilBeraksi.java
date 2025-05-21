public class mobilBeraksi {
    public static void main(String[] args) {
        // membuat object dari class Mobil
        Mobil myCar = new Mobil ();

        // mengisi atribut class
        myCar.warna         = "Merah";
        myCar.tahunProduksi = 1990;

        // memanggil isi atribut
        System.out.println("Identitas Mobil:");
        System.out.println("Warna Mobil : " + myCar.warna);
        System.out.println("Warna Mobil : " + myCar.tahunProduksi);
    }
}
