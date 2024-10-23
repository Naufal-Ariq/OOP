package sistemmahasiswa2;

import sistemmahasiswa3.matakuliah;

public class mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public String jurusan;
    public matakuliah[] daftarmatakuliah;

    public mahasiswa(String nim, String nama, String kelas, String jurusan, matakuliah[] daftarmatakuliah) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.jurusan = jurusan;
        this.daftarmatakuliah = daftarmatakuliah;
    }

    public void tampilkanDataMahasiswa() {
        System.out.printf("| %-20s | %-22s |\n", "NIM", nim);
        System.out.printf("| %-20s | %-22s |\n", "Nama", nama);
        System.out.printf("| %-20s | %-22s |\n", "Kelas", kelas);
        System.out.printf("| %-20s | %-22s |\n", "Jurusan", jurusan);
        System.out.println("+----------------------+------------------------+");

        // Tampilkan data mata kuliah yang dimiliki mahasiswa
        System.out.println("\n+---------------------------------------------------------------+");
        System.out.println("|                       Data Mata Kuliah                        |");
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("| No | Nama Mata Kuliah                      | SKS  | Nilai | Grade |");
        System.out.println("+----+---------------------------------------+------+-------+-------+");

        for (int i = 0; i < daftarmatakuliah.length; i++) {
            System.out.printf("| %-2d | ", i+1);
            daftarmatakuliah[i].tampilkanDataMataKuliah();
        }

        System.out.println("+----+---------------------------------------+------+-------+-------+");
    }
}
