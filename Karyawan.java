
package tokoonline;
import java.util.ArrayList;
public class Karyawan {
    ArrayList<String> namaKaryawan = new ArrayList<String>();
    ArrayList<String> alamat = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();
    ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    Karyawan(){
        this.namaKaryawan.add("Adel");
        this.alamat.add("Tempatnya");
        this.telepon.add("080878926320");
        this.jabatan.add(0);
        
        this.namaKaryawan.add("Natah");
        this.alamat.add("Madiun");
        this.telepon.add("087346829923");
        this.jabatan.add(1);

    }
    void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    int getJabatan(int id){
        return this.jabatan.get(id);
    }
    int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }
    
    void setNama(String nama){
        this.namaKaryawan.add(nama);
    }
    void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    String getNama(int idKaryawan){
        return this.namaKaryawan.get(idKaryawan);
    }
    String getAlamat(int idKaryawan){
        return this.alamat.get(idKaryawan);
    }
    String getTelepon(int idKaryawan){
        return this.telepon.get(idKaryawan);
    }
}