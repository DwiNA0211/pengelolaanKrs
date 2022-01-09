/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankrs;

/**
 *
 * @author ACER
 */
public class gabung {
    private int id;
    private int npm;
    private String nama;
    private String program;
    private int kode;
    private String dosen;
    private String makul;
    private int sks;
    private String semester;
    private int tahun;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getMakul() {
        return makul;
    }

    public void setMakul(String makul) {
        this.makul = makul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public gabung(int id, int npm, String nama, String program, int kode, String dosen, String makul, int sks, String semester, int tahun) {
        this.id = id;
        this.npm = npm;
        this.nama = nama;
        this.program = program;
        this.kode = kode;
        this.dosen = dosen;
        this.makul = makul;
        this.sks = sks;
        this.semester = semester;
        this.tahun = tahun;
    }
    
}
