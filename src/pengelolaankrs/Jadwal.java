/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankrs;

public class Jadwal {
    private String kodeJadwal;
    private String makul;
    private String dosen;
    private String kelas;
    private String semester;
    private String jam;
    private String hari;

    public Jadwal(String kodeJadwal, String makul, String dosen, String kelas, String semester, String jam, String hari) {
        this.kodeJadwal = kodeJadwal;
        this.makul = makul;
        this.dosen = dosen;
        this.kelas = kelas;
        this.semester = semester;
        this.jam = jam;
        this.hari = hari;
    }

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }

    public String getMakul() {
        return makul;
    }

    public void setMakul(String makul) {
        this.makul = makul;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
    
}
