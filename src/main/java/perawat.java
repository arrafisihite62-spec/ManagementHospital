/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hafiz
 */
public class perawat extends pegawaiRumahSakit implements dapatBertugas {

    private String bagian;

    public perawat(String nama, String nomorPegawai, String bagian) {
        super(nama, nomorPegawai);
        this.bagian = bagian;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Perawat : " + nama);
        System.out.println("Nomor Pegawai : " + nomorPegawai);
        System.out.println("Bagian : " + bagian);
    }

    @Override
    public void mulaiBertugas() {
        System.out.println(nama + " mulai bertugas di bagian " + bagian);
    }
}