package edu.uph.SIAK.model;

public class dosen {
    /* Nama Dosen */
    String nama;
    
    public dosen() {
    }

    public dosen(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    @Override
    public String toString() {
        return getNama();
    }
   
}
