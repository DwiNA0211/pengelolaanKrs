/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankrs;

public class Krs {
    private String idKrs;
    private String npm;
    private String kodeJadwal;
    private String tahun;
    private String nama;
    private String dosen;
    private String semester;
    private String makul;


    public Krs(String idKrs, String npm, String kodeJadwal, String tahun) {
        this.idKrs = idKrs;
        this.npm = npm;
        this.kodeJadwal = kodeJadwal;
        this.tahun = tahun;
    }

    Krs(String idKrs, String npm, String kodeJadwal, String tahun, String nama, String dosen, String semester, String makul) {
        this.idKrs = idKrs;
        this.npm = npm;
        this.kodeJadwal = kodeJadwal;
        this.tahun = tahun;
        this.nama = nama;
        this.dosen = dosen;
        this.semester = semester;
        this.makul = makul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getMakul() {
        return makul;
    }

    public void setMakul(String makul) {
        this.makul = makul;
    }

    
    
    public String getIdKrs() {
        return idKrs;
    }

    public void setIdKrs(String idKrs) {
        this.idKrs = idKrs;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
    
}
