/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hafiz
 */
public class dokter {

    private String nama;
    private String spesialis;
    private String nomorDokter;

    public dokter(String nama, String spesialis, String nomorDokter) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.nomorDokter = nomorDokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getNomorDokter() {
        return nomorDokter;
    }

    public void setNomorDokter(String nomorDokter) {
        this.nomorDokter = nomorDokter;
    }

    public void tampilkanInformasi() {
        System.out.println("Nomor Dokter : " + nomorDokter);
        System.out.println("Nama         : " + nama);
        System.out.println("Spesialis    : " + spesialis);
    }
}