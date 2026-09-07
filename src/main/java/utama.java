/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hafiz
 */
public class utama {

    public static void main(String[] args) {

        // Object Instantiation
        pasien pasien1 = new pasien(
            "Andi",
            25,
            "Laki-laki",
            "RM001"
        );

        pasien pasien2 = new pasien(
            "Siti",
            30,
            "Perempuan",
            "RM002"
        );

        pasien pasien3 = new pasien(
            "Budi",
            40,
            "Laki-laki",
            "RM003"
        );

     
        pasien1.tampilkanInformasi();

        System.out.println();

        pasien2.tampilkanInformasi();

        System.out.println();

        pasien3.tampilkanInformasi();
    }
}