/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hafiz
 */
import java.util.ArrayList;
import java.util.Scanner;

public class utama {

    static Scanner input = new Scanner(System.in);
    static ArrayList<pasien> daftarPasien = new ArrayList<>();
    static ArrayList<pegawaiRumahSakit> daftarPegawai = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN RUMAH SAKIT ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("3. Cari Pasien");
            System.out.println("4. Daftarkan Rawat Inap");
            System.out.println("5. Tampilkan Pegawai");
            System.out.println("6. Tambah Pegawai");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(input.nextLine());

                switch (pilihan) {
                    case 1:
                        tambahPasien();
                        break;
                    case 2:
                        tampilkanPasien();
                        break;
                    case 3:
                        cariPasien();
                        break;
                    case 4:
                        tambahRawatInap();
                        break;
                    case 5:
                        tampilkanPegawai();
                        break;
                    case 6:
                        tambahPegawai();
                        break;
                    case 0:
                        System.out.println("Program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan menu tidak tersedia.");
                }
            } catch (NumberFormatException e) {
                pilihan = -1;
                System.out.println("Input harus berupa angka.");
            }

        } while (pilihan != 0);
    }

    static void tambahPasien() {
        try {
            System.out.print("Nomor Rekam Medis: ");
            String nomor = input.nextLine().trim();

            if (nomor.isEmpty()) {
                throw new IllegalArgumentException("Nomor rekam medis wajib diisi.");
            }

            for (pasien p : daftarPasien) {
                if (p.nomorRekamMedis.equalsIgnoreCase(nomor)) {
                    throw new IllegalArgumentException("Nomor rekam medis sudah terdaftar.");
                }
            }

            System.out.print("Nama pasien: ");
            String nama = input.nextLine().trim();

            if (nama.isEmpty()) {
                throw new IllegalArgumentException("Nama pasien wajib diisi.");
            }

            System.out.print("Umur pasien: ");
            int umur = Integer.parseInt(input.nextLine());

            if (umur < 1 || umur > 120) {
                throw new IllegalArgumentException("Umur harus antara 1 sampai 120 tahun.");
            }

            System.out.print("Jenis kelamin: ");
            String jenisKelamin = input.nextLine().trim();

            if (jenisKelamin.isEmpty()) {
                throw new IllegalArgumentException("Jenis kelamin wajib diisi.");
            }

            pasien data = new pasien(nama, umur, jenisKelamin, nomor);
            daftarPasien.add(data);

            System.out.println("Pasien berhasil ditambahkan.");

        } catch (NumberFormatException e) {
            System.out.println("Umur harus berupa angka.");
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal menambahkan pasien: " + e.getMessage());
        }
    }

    static void tampilkanPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
            return;
        }

        for (pasien p : daftarPasien) {
            System.out.println();
            p.tampilkanInformasi();
        }
    }

    static void cariPasien() {
        System.out.print("Masukkan nomor rekam medis: ");
        String nomor = input.nextLine().trim();

        for (pasien p : daftarPasien) {
            if (p.nomorRekamMedis.equalsIgnoreCase(nomor)) {
                p.tampilkanInformasi();
                return;
            }
        }

        System.out.println("Pasien tidak ditemukan.");
    }

    static void tambahRawatInap() {
        try {
            System.out.print("Nomor Rekam Medis: ");
            String nomor = input.nextLine().trim();

            for (pasien p : daftarPasien) {
                if (p.nomorRekamMedis.equalsIgnoreCase(nomor)) {
                    throw new IllegalArgumentException(
                        "Nomor rekam medis sudah digunakan."
                    );
                }
            }

            if (nomor.isEmpty()) {
                throw new IllegalArgumentException("Nomor rekam medis wajib diisi.");
            }

            System.out.print("Nama pasien: ");
            String nama = input.nextLine().trim();

            if (nama.isEmpty()) {
                throw new IllegalArgumentException("Nama pasien wajib diisi.");
            }

            System.out.print("Umur pasien: ");
            int umur = Integer.parseInt(input.nextLine());

            if (umur < 1 || umur > 120) {
                throw new IllegalArgumentException("Umur harus antara 1 sampai 120 tahun.");
            }

            System.out.print("Jenis kelamin: ");
            String jenisKelamin = input.nextLine().trim();

            System.out.print("Nomor kamar: ");
            String kamar = input.nextLine().trim();

            if (kamar.isEmpty()) {
                throw new IllegalArgumentException("Nomor kamar wajib diisi.");
            }

            System.out.print("Lama rawat (hari): ");
            int lamaRawat = Integer.parseInt(input.nextLine());

            if (lamaRawat < 1) {
                throw new IllegalArgumentException("Lama rawat minimal 1 hari.");
            }

            pasienRawatInap data = new pasienRawatInap(
                nama, umur, jenisKelamin, nomor, kamar, lamaRawat
            );

            daftarPasien.add(data);
            System.out.println("Pendaftaran rawat inap berhasil.");

        } catch (NumberFormatException e) {
            System.out.println("Umur dan lama rawat harus berupa angka.");
        } catch (IllegalArgumentException e) {
            System.out.println("Pendaftaran gagal: " + e.getMessage());
        }
    }

    static void tampilkanPegawai() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("Belum ada data pegawai.");
            return;
        }

        for (pegawaiRumahSakit pegawai : daftarPegawai) {
            System.out.println();
            pegawai.tampilkanInformasi();
        }
    }

    static void tambahPegawai() {
        try {
            System.out.println("1. Dokter Spesialis");
            System.out.println("2. Perawat");
            System.out.print("Pilih jenis pegawai: ");

            int jenis = Integer.parseInt(input.nextLine());

            System.out.print("Nama pegawai: ");
            String nama = input.nextLine().trim();

            System.out.print("Nomor pegawai: ");
            String nomor = input.nextLine().trim();

            if (nama.isEmpty() || nomor.isEmpty()) {
                throw new IllegalArgumentException(
                    "Nama dan nomor pegawai wajib diisi."
                );
            }

            for (pegawaiRumahSakit p : daftarPegawai) {
                if (p.nomorPegawai.equalsIgnoreCase(nomor)) {
                    throw new IllegalArgumentException(
                        "Nomor pegawai sudah terdaftar."
                    );
                }
            }

            if (jenis == 1) {
                System.out.print("Spesialis: ");
                String spesialis = input.nextLine().trim();

                if (spesialis.isEmpty()) {
                    throw new IllegalArgumentException(
                        "Spesialis wajib diisi."
                    );
                }

                daftarPegawai.add(
                    new dokterSpesialis(nama, nomor, spesialis)
                );

            } else if (jenis == 2) {
                System.out.print("Bagian: ");
                String bagian = input.nextLine().trim();

                if (bagian.isEmpty()) {
                    throw new IllegalArgumentException(
                        "Bagian perawat wajib diisi."
                    );
                }

                daftarPegawai.add(new perawat(nama, nomor, bagian));

            } else {
                throw new IllegalArgumentException(
                    "Jenis pegawai tidak tersedia."
                );
            }

            System.out.println("Data pegawai berhasil ditambahkan.");

        } catch (NumberFormatException e) {
            System.out.println("Pilihan harus berupa angka.");
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal menambahkan pegawai: " + e.getMessage());
        }
    }
}
