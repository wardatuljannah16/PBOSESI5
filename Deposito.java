public class Deposito extends Rekening {
    int jangkaWaktuBulan;
    double sukuBunga;

    public Deposito(String namaPemilik, String nomorRekening, double saldo, int jangkaWaktuBulan, double sukuBunga) {
        super(namaPemilik, nomorRekening, saldo);
        this.jangkaWaktuBulan = jangkaWaktuBulan;
        this.sukuBunga = sukuBunga;
    }

    @Override
    public void tarik(double jumlah) {
        if (jangkaWaktuBulan > 0) {
            saldo -= jumlah + (jumlah * 0.10); // Denda 10%
            System.out.println("Penarikan sebelum jatuh tempo dikenakan denda.");
        } else {
            saldo -= jumlah;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jangka Waktu: " + jangkaWaktuBulan + " bulan");
        System.out.println("Suku Bunga: " + sukuBunga + "%");
    }

    // Menghitung bunga
    public double hitungBunga() {
        return saldo * (sukuBunga / 100) * jangkaWaktuBulan / 12;
    }
}
