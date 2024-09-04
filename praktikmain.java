package praktik;
public class praktikmain {
    public static void main(String[] args) {
        Praktik orang1 = new Praktik();
        Praktik orang2 = new Praktik();
        
        orang1.nama = "Mahesa";
        orang1.jurusan = "Sastra Mesin";
        orang1.npm = "2310631170029";
        orang1.ipk = 3.5;
        orang1.Perkenalan();
        orang1.ipk();
        
        orang2.nama = "Dia";
        orang2.jurusan = "Sastra Mesin";
        orang2.npm = "2310631170109";
        orang2.ipk = 2;
        orang2.Perkenalan();
        orang2.ipk();
        
    }
}
