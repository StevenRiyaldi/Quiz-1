package edu.uph.SIAK.model;

import java.util.ArrayList;
import java.util.Scanner;
public class jadwalkuliah{
    Scanner Input = new Scanner(System.in);
    ArrayList<mahasiswa> Mahasiswa = new ArrayList<mahasiswa>();
    dosen Dosen;
    matakuliah Matakuliah;
    //ruangan


    public jadwalkuliah() {
    }


    public jadwalkuliah(ArrayList<mahasiswa> Mahasiswa, dosen Dosen, matakuliah Matakuliah) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
    }


    public ArrayList<mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public dosen getDosen() {
        return this.Dosen;
    }

    public void setDosen(dosen Dosen) {
        this.Dosen = Dosen;
    }

    public matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public void tambahMahasiswa(mahasiswa mhs){
        Mahasiswa.add(mhs);
    }

    dosen dosen1 = new dosen("Ferry");
    dosen dosen2 = new dosen("Ade Maulana");
    dosen dosen3 = new dosen("Bertlan");

    matakuliah matakuliah1 = new matakuliah("Bahasa Indonesia");
    matakuliah matakuliah2 = new matakuliah("Pemrograman Berorientasi Objek (PBO)");
    matakuliah matakuliah3 = new matakuliah("Filsafat Ilmu Pengetahuan (FIP)");

    public void tampilkanJadwalKuliah(){
        char yn = 'n';
        do{
            System.out.println("Pilih Mata Kuliah");
            System.out.println("1. Bahasa Indonesia");
            System.out.println("2. Pemrograman Berorientasi Objek (PBO)");
            System.out.println("3. Filsafat Ilmu Pengetahuan (FIP)");
            System.out.println("nomor ? ");
            int i = Input.nextShort();
            if (i==1){
                System.out.println("Jadwal Kuliah ");
                System.out.println("Nama Matakuliah : " + matakuliah1.toString());
                System.out.println("Dosen : " + dosen1.toString());
                System.out.println("Kelas : 20TI2");
                System.out.println("Daftar Mahasiswa ");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else if (i==2){
                System.out.println("Jadwal Kuliah ");
                System.out.println("Nama Matakuliah : " + matakuliah2.toString());
                System.out.println("Dosen : " + dosen2.toString());
                System.out.println("Kelas : 20TI2");
                System.out.println("Daftar Mahasiswa ");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else if (i==3){
                System.out.println("Jadwal Kuliah ");
                System.out.println("Nama Matakuliah : " + matakuliah3.toString());
                System.out.println("Dosen : " + dosen3.toString());
                System.out.println("Kelas : 20TI2");
                System.out.println("Daftar Mahasiswa ");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else {
                System.out.println("Pilihan hanya [ 1 - 3 ]");
            }
            System.out.println("Repeat This Program ? [y / n] :"); 
            Input.nextLine();
            String yesno = Input.nextLine();
            yn = yesno.charAt(0);
        }while(yn == 'y' || yn == 'Y');
    }   
}
