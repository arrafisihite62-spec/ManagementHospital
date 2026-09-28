/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hafiz
 */
public class pasienRawatInap extends pasien {
    
    private String nomorKamar;
    private int lamaRawat;

    public pasienRawatInap(String nama, int umur, String jenisKelamin, String nomorRekamMedis, String nomorKamar, int lamaRawat) {
        super(nama, umur, jenisKelamin, nomorRekamMedis);
        this.nomorKamar = nomorKamar;
        this.lamaRawat = lamaRawat;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public int getLamaRawat() {
        return lamaRawat;
    }

    public void setLamaRawat(int lamaRawat) {
        this.lamaRawat = lamaRawat;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Lama Rawat : " + lamaRawat + " hari");
    }
}