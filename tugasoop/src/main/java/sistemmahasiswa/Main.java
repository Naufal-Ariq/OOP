package sistemmahasiswa;

import sistemmahasiswa3.matakuliah;
import sistemmahasiswa2.mahasiswa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat daftar mata kuliah untuk setiap mahasiswa
        matakuliah[] mataKuliahAndi = {
            new matakuliah("Pemrograman Berorientasi Objek 1", 3, 90),
            new matakuliah("Basis Data Terdistribusi", 3, 85),
            new matakuliah("Sistem Operasi", 3, 75),
            new matakuliah("Jaringan Komputer 1", 3, 80),
            new matakuliah("Rekayasa Perangkat Lunak", 3, 88),
            new matakuliah("Statistika", 3, 70),
            new matakuliah("Teori Bahasa Otomata", 3, 65)
        };

        matakuliah[] mataKuliahBudi = {
            new matakuliah("Pemrograman Berorientasi Objek 1", 3, 70),
            new matakuliah("Basis Data Terdistribusi", 3, 60),
            new matakuliah("Sistem Operasi", 3, 85),
            new matakuliah("Jaringan Komputer 1", 3, 75),
            new matakuliah("Rekayasa Perangkat Lunak", 3, 80),
            new matakuliah("Statistika", 3, 65),
            new matakuliah("Teori Bahasa Otomata", 3, 90)
        };

        matakuliah[] mataKuliahCitra = {
            new matakuliah("Pemrograman Berorientasi Objek 1", 3, 95),
            new matakuliah("Basis Data Terdistribusi", 3, 80),
            new matakuliah("Sistem Operasi", 3, 90),
            new matakuliah("Jaringan Komputer 1", 3, 85),
            new matakuliah("Rekayasa Perangkat Lunak", 3, 88),
            new matakuliah("Statistika", 3, 78),
            new matakuliah("Teori Bahasa Otomata", 3, 82)
        };

        matakuliah[] mataKuliahDina = {
            new matakuliah("Pemrograman Berorientasi Objek 1", 3, 65),
            new matakuliah("Basis Data Terdistribusi", 3, 75),
            new matakuliah("Sistem Operasi", 3, 68),
            new matakuliah("Jaringan Komputer 1", 3, 55),
            new matakuliah("Rekayasa Perangkat Lunak", 3, 73),
            new matakuliah("Statistika", 3, 77),
            new matakuliah("Teori Bahasa Otomata", 3, 60)
        };

        matakuliah[] mataKuliahNaufal = {
            new matakuliah("Pemrograman Berorientasi Objek 1", 3, 88),
            new matakuliah("Basis Data Terdistribusi", 3, 82),
            new matakuliah("Sistem Operasi", 3, 85),
            new matakuliah("Jaringan Komputer 1", 3, 80),
            new matakuliah("Rekayasa Perangkat Lunak", 3, 90),
            new matakuliah("Statistika", 3, 92),
            new matakuliah("Teori Bahasa Otomata", 3, 89)
        };

        // Membuat array untuk 5 mahasiswa
        mahasiswa[] daftarMahasiswa = new mahasiswa[5];
        daftarMahasiswa[0] = new mahasiswa("123456789", "Andi irfan", "TIF-19 PE", "Informatika", mataKuliahAndi);
        daftarMahasiswa[1] = new mahasiswa("987654321", "Budi gunadi", "TI-23 PD", "Teknik Industri", mataKuliahBudi);
        daftarMahasiswa[2] = new mahasiswa("1122334455", "Citra kirana", "TIF-19 PB", "Informatika", mataKuliahCitra);
        daftarMahasiswa[3] = new mahasiswa("5566778899", "Dina susilawati", "SI-23 PC", "Sistem Informasi", mataKuliahDina);
        daftarMahasiswa[4] = new mahasiswa("23552011033", "Naufal Ariq Fauziy", "TIF-23 PA", "Informatika", mataKuliahNaufal);

        // Input NIM
        System.out.println("Masukkan NIM untuk melihat data mahasiswa: ");
        String nimInput = input.nextLine();

        // Mencari mahasiswa berdasarkan NIM yang diinput
        boolean mahasiswaDitemukan = false;
        for (mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.nim.equals(nimInput)) {
                mahasiswaDitemukan = true;

                // Header tabel data mahasiswa
                System.out.println("+-----------------------------------------------+");
                System.out.println("|                  Data Mahasiswa               |");
                System.out.println("+----------------------+------------------------+");

                // Tampilkan data mahasiswa
                mahasiswa.tampilkanDataMahasiswa();
                break;
            }
        }

        if (!mahasiswaDitemukan) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }

        input.close();
    }
}

