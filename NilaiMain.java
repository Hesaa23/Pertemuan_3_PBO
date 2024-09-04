package praktik;
public class NilaiMain {
    public static void main(String[] args) {
        Nilai orang1 = new Nilai();
        Nilai orang2 = new Nilai();
        
        orang1.nama = "Mahes";
        orang1.npm = "2310631170029";
        orang1.absen = 80;
        orang1.tugas = 85;
        orang1.uts = 90;
        orang1.uas = 90;
        orang1.Nilai();
        orang1.CetakNilai();
        
        orang2.nama = "Lidiaa";
        orang2.npm = "2410631170109";
        orang2.absen = 90;
        orang2.tugas = 87;
        orang2.uts = 100;
        orang2.uas = 90;
        orang2.Nilai();
        orang2.CetakNilai();
    }
}
