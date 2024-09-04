package praktik;
public class Mahasiswa {
    String nama;
    String npm;
    String kelas;
    
    void mhs(){
        System.out.println("Nama\t: "+nama);
        System.out.println("NPM\t: "+npm);
        System.out.println("Kelas\t: "+kelas);
    }
    
    void membaca(){
        System.out.println("Mahasiswa ini membaca");
    }
    
    void nyontek(){
        System.out.println("Mahasiswa ini menyontek");
    }
    
    void modifikasi(){
        System.out.println("Mahasiswa ini memodifikasi");
    }
}
