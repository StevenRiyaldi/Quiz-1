import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;

public class app {
    public static void main(String[] args) throws Exception {
        
        mahasiswa mhs1 = new mahasiswa("Calvin Wendy", "03082200010",false);
        mahasiswa mhs2 = new mahasiswa("Sri Rahayu", "03082200013",true);
        mahasiswa mhs3 = new mahasiswa("Elvia Clarissa", "03082200020",true);
        mahasiswa mhs4 = new mahasiswa("Excel", "03082200002",false);
        mahasiswa mhs5 = new mahasiswa("Steven Riyaldi", "03082200022",false);
        mahasiswa mhs6 = new mahasiswa("Yordan Tanama", "03082200007",false);
        mahasiswa mhs7 = new mahasiswa("Andrean", "03082200005",false);
        mahasiswa mhs8 = new mahasiswa("Felix Limbardon", "03082200018",false);
        mahasiswa mhs9 = new mahasiswa("Fernando", "03082200021",false);
        mahasiswa mhs10 = new mahasiswa("Ricky", "03082200012",false);
        mahasiswa mhs11 = new mahasiswa("Robert Wijaya", "03082200011",false);
        mahasiswa mhs12 = new mahasiswa("Richard Tanoto", "03082200019",false);
        mahasiswa mhs13 = new mahasiswa("Richard Hanitio", "03082200014",false);
        mahasiswa mhs14 = new mahasiswa("William", "03082200017",false);
    
        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);
        JadwalKuliah.tambahMahasiswa(mhs4);
        JadwalKuliah.tambahMahasiswa(mhs5);
        JadwalKuliah.tambahMahasiswa(mhs6);
        JadwalKuliah.tambahMahasiswa(mhs7);
        JadwalKuliah.tambahMahasiswa(mhs8);
        JadwalKuliah.tambahMahasiswa(mhs9);
        JadwalKuliah.tambahMahasiswa(mhs10);
        JadwalKuliah.tambahMahasiswa(mhs11);
        JadwalKuliah.tambahMahasiswa(mhs12);
        JadwalKuliah.tambahMahasiswa(mhs13);
        JadwalKuliah.tambahMahasiswa(mhs14);

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}