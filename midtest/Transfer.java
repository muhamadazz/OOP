class Transfer extends Pembayaran {
    private static final int BIAYA_PENANGANAN = 500;

    @Override
    public void bayar(int jumlahUang, int totalHarga) {
        if (jumlahUang >= (totalHarga+BIAYA_PENANGANAN)) {
            int kembalian = jumlahUang - (totalHarga+BIAYA_PENANGANAN);
            System.out.println("total harga : Rp " + totalHarga);
            System.out.println("biaya penanganan: Rp " + BIAYA_PENANGANAN);
            System.out.println("total yang harus dibayar: Rp " + (totalHarga+BIAYA_PENANGANAN));
            System.out.println("Pembayaran : Rp " + jumlahUang);
            System.out.println("Pembayaran berhasil dengan transfer. Kembalian: Rp " + kembalian);
        } else {
            System.err.println("Pembayaran gagal. Jumlah uang tidak mencukupi.");
        }
    }
}