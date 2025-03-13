class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (saldo + limitPenarikan >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Penarikan melebihi limit giro.");
        }
    }
}
