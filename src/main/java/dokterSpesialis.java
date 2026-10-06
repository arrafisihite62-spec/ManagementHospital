/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hafiz
 */
public class dokterSpesialis extends pegawaiRumahSakit {

    private String spesialis;

    public dokterSpesialis(String nama, String nomorPegawai, String spesialis) {
        super(nama, nomorPegawai);
        this.spesialis = spesialis;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Dokter : " + nama);
        System.out.println("Nomor Pegawai : " + nomorPegawai);
        System.out.println("Spesialis : " + spesialis);
    }
}
