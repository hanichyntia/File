
package tokoonline;
import java.util.ArrayList;
public class Member implements User{
    ArrayList<String> namaMember = new ArrayList<String>();
    ArrayList<String> alamat = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();
    ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    Member(){
        this.namaMember.add("Alea");
        this.alamat.add("sunda");
        this.telepon.add("088111222333");
        this.saldo.add(300000);
        
        this.namaMember.add("Marissa");
        this.alamat.add("jawa");
        this.telepon.add("082341589230");
        this.saldo.add(50000);
    }
    
    void setSaldo(int saldo){ 
        this.saldo.add(saldo);
    }
    int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    void editSaldo(int idMember, int saldo){//.
        this.saldo.set(idMember, saldo);
    }
    int getJmlMember(){ //.
        return this.saldo.size();
    }
    public void setNama(String namaMember){
        this.namaMember.add(namaMember);
    }
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    public String getNama(int idMember){
        return this.namaMember.get(idMember);
    }
    public String getAlamat(int idMember){
        return this.alamat.get(idMember);
    }
    public String getTelepon(int idMember){
        return this.telepon.get(idMember);
    }
}
