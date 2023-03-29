/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoonline;

/**
 *
 * @author Asus
 */
public class Laporan {
    void Laporan(Barang barang){
        int x = barang.getJmlBarang();
        
        System.out.println("");
        System.out.println("Tabel Barang");
        System.out.println("");
        System.out.println("Nama \t\tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(barang.getNamaBarang(i)+"\t"+barang.getStok(i)+"\t"+barang.getHarga(i));
        }
        System.out.println("===========================================");
    }
    void Laporan(Member member){
        int x=member.getJmlMember();
        
        System.out.println("");
        System.out.println("Tabel Member");
        System.out.println("");
        System.out.println("Nama \tAlamat \tTelepon \t\tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(member.getNama(i)+"\t"+member.getAlamat(i)+"\t"+member.getTelepon(i)+"\t"+member.getSaldo(i));
        }
        System.out.println("===========================================");
    }
    void Laporan(Transaksi transaksi, Barang barang){
        int x = transaksi.getJmlTransaksi();

        System.out.println("");
        System.out.println("Laporan Transaksi");
        System.out.println("Nama \t\tQTY  \tHarga \tJumlah");
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
            total += jumlah;
            System.out.println(barang.getNamaBarang(transaksi.getIdBarang(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
        }
        System.out.println("\nTotal Omset = "+total);
        System.out.println("===========================================");
    }
    public static void main(String[] args) {
        Laporan laporan = new Laporan();
        Member member = new Member();
        Barang barang = new Barang();
        Transaksi transaksi =  new Transaksi();
        Karyawan karyawan = new Karyawan();
        
        laporan.Laporan(barang);
        laporan.Laporan(member);
        laporan.Laporan(transaksi, barang);
        
        transaksi.prosesTransaksi(member, transaksi, barang);
    }
}
