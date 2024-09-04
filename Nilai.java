package praktik;
public class Nilai {
    String nama;
    String npm;
    double absen,tugas,uts,uas,akhir;
    
    void Nilai(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("NPM\t\t: "+npm);
        System.out.println("Nilai Absen\t: "+absen * 0.1);
        System.out.println("Nilai tugas\t: "+tugas * 0.2);
        System.out.println("Nilai UTS\t: "+uts * 0.3);
        System.out.println("Nilai UAS\t: "+uas * 0.4);
        akhir = absen * 0.1 + tugas * 0.2 + uts * 0.3 + uas * 0.4;
    }
    
    void CetakNilai(){
        System.out.println("Nilai Akhir\t: " + akhir);
    }
}
