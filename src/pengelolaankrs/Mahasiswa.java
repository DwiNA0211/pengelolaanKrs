/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankrs;

public class Mahasiswa {
    private int id;
    private String npm;
    private String nama;
    private String jk;
    private String studi;
    private String tgl;
    private String tmpt;
    private String pass;

    public Mahasiswa(int id, String npm, String nama, String jk, String studi, String tgl, String tmpt, String pass) {
        this.id = id;
        this.npm = npm;
        this.nama = nama;
        this.jk = jk;
        this.studi = studi;
        this.tgl = tgl;
        this.tmpt = tmpt;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getStudi() {
        return studi;
    }

    public void setStudi(String studi) {
        this.studi = studi;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getTmpt() {
        return tmpt;
    }

    public void setTmpt(String tmpt) {
        this.tmpt = tmpt;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    
    
}
