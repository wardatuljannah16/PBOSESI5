// Source code is decompiled from a .class file using FernFlower decompiler.
class REKENINGCLASS {
    String namaPemilik;
    String nomorRekening;
    double saldo;
 
    public REKENINGCLASS (String var1, String var2, double var3) {
       this.namaPemilik = var1;
       this.nomorRekening = var2;
       this.saldo = var3;
    }
 
    public void setor(double var1) {
       this.saldo += var1;
    }
 
    public void tarik(double var1) {
       if (var1 <= this.saldo) {
          this.saldo -= var1;
       } else {
          System.out.println("Saldo tidak cukup.");
       }
 
    }
    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            saldo += jumlah - 2500; // Biaya administrasi
        } else {
            saldo += jumlah;
        }
    }
    public void tampilkanInfo() {
       System.out.println("Nama Pemilik: " + this.namaPemilik);
       System.out.println("Nomor Rekening: " + this.nomorRekening);
       System.out.println("Saldo: " + this.saldo);
    }
 }
 