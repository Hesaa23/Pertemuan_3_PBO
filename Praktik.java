package praktik;
public class Praktik{
    String nama;
    String npm;
    String jurusan;
    double ipk;
    
    void Perkenalan(){
        System.out.println("Nama\t: " + nama);
        System.out.println("NPM\t: " + npm);
        System.out.println("Jurusan\t: " + jurusan);
    }
    
    void ipk(){
        if(ipk >= 3){
            System.out.println("status\t: LULUS");
        }else{
            System.out.println("status\t: TIDAK LULUS");
        }
    }
}


