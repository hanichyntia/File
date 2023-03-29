    package tokoonline;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi{
    private ArrayList<Integer> idMember = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
     Transaksi(){
        this.idMember.add(0);
        this.idBarang.add(0);
        this.banyak.add(2);
        
        this.idMember.add(0);
        this.idBarang.add(1);
        this.banyak.add(3);
        
        this.idMember.add(1);
        this.idBarang.add(2);
        this.banyak.add(1);
        
    }
    
    public void prosesTransaksi(Member member, Transaksi transaksi, Barang barang){
        Scanner ob = new Scanner(System.in);
        System.out.println("Selamat Belanja");
        System.out.println("");
        System.out.print("Masukkan ID member : ");
        int idMember = ob.nextInt();
        if (idMember < 3) {
            System.out.println("=====================");
            System.out.println("Selamat datang "+member.getNama(idMember));
        
            ArrayList<Integer> idBarang = new ArrayList<Integer>();
            ArrayList<Integer> banyak = new ArrayList<Integer>();
            int i = 0;
            int temp = 0;
        
        do{
            System.out.print("Masukkan ID barang : ");
            temp = ob.nextInt();
            if (temp!=99) {
                idBarang.add(temp);
                System.out.println(barang.getNamaBarang(idBarang.get(i))+" sebanyak: ");
                banyak.add(ob.nextInt());
                
            }
        }while  (temp!=99); 
        }else
        
        System.out.println("Transaksi Belanja "+member.getNama(idMember)+ "sebagai berikut");
        System.out.println("ID \tNama Barang \tHarga \tJumlah");
        int total = 0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah=banyak.get(j)*barang.getHarga(idBarang.get(j));
            total += jumlah;
            System.out.println(idBarang.get(j)+"\t"+barang.getNamaBarang(idBarang.get(j))+"\t"
                    + "\t"+barang.getHarga(idBarang.get(j))+"\t"+jumlah);
            transaksi.setTransaksi(barang, idMember, idBarang.get(j), banyak.get(j));
        }
        System.out.println("\nTotal Belanja : "+total);
        member.editSaldo(idMember, member.getSaldo(idMember)-total);
    }
    public void setTransaksi(Barang barang, int idMember, int idBarang, int banyaknya){
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyaknya);
        barang.editStok(idBarang, barang.getStok(idBarang)-banyaknya);
    }
    public int getJmlTransaksi(){
        return this.idMember.size();
    }
    
    public int getIdBarang(int id){
        return this.idBarang.get(id);
    }
    public int geIdMember(int id){
        return this.idMember.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
}