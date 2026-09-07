/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hafiz
 */
    public class pasien {

    // fiield
    String nama;
    int umur;
    String jenisKelamin;
    String nomorRekamMedis;

    // constructor pasiennn
    public pasien(String nama, int umur, String jenisKelamin, String nomorRekamMedis) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.nomorRekamMedis = nomorRekamMedis;
    }

    // methodd
    public void tampilkanInformasi() {
        System.out.println("Nomor Rekam Medis : " + nomorRekamMedis);
        System.out.println("Nama               : " + nama);
        System.out.println("Umur               : " + umur);
        System.out.println("Jenis Kelamin      : " + jenisKelamin);
    }
}