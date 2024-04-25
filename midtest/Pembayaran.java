class Pembayaran {
    public void bayar(int jumlahUang, int totalHarga) {
        if (jumlahUang >= totalHarga) {
            int kembalian = jumlahUang - totalHarga;
            System.out.println("total harga : Rp " + totalHarga);
            System.out.println("Pembayaran : Rp " + jumlahUang);
            System.out.println("Pembayaran berhasil. Kembalian: Rp " + kembalian);
        } else {
            System.err.println("Pembayaran gagal. Jumlah uang tidak mencukupi.");
        }
    }
}