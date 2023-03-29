
package tokoonline;
import java.util.ArrayList;
public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Barang(){
        this.namaBarang.add("EsTehAnget");
        this.stok.add(24);
        this.harga.add(2500);
        
        this.namaBarang.add("TehPiring");
        this.stok.add(50);
        this.harga.add(1000);
        
        this.namaBarang.add("MariUnnie");
        this.stok.add(10);
        this.harga.add(3000);
        
        
    }
    
    public int getJmlBarang(){
        return namaBarang.size();
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    public void editStok(int idBarang, int stok){
        this.stok.add(idBarang, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
}
