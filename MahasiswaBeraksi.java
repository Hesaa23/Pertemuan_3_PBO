package praktik;
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa orang1 = new Mahasiswa();
        Mahasiswa orang2 = new Mahasiswa();
        Mahasiswa orang3 = new Mahasiswa();
        
        orang1.nama = "Mahes";
        orang1.npm = "2310631170029";
        orang1.kelas = "3E";
        orang1.mhs();
        orang1.nyontek();
        
        orang2.nama = "Akbar";
        orang2.npm = "2310631170298";
        orang2.kelas = "3E";
        orang2.mhs();
        orang2.modifikasi();
        
        orang3.nama = "Rama";
        orang3.npm = "2310631170208";
        orang3.kelas = "3E";
        orang3.mhs();
        orang3.membaca();
    }
}
