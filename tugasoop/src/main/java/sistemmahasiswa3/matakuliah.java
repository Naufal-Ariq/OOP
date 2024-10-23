package sistemmahasiswa3;

public class matakuliah {
    public String namaMatkul;
    public int sks;
    public int nilai;
    public String grade;

    public matakuliah(String namaMatkul, int sks, int nilai) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.nilai = nilai;
        this.grade = hitungGrade(nilai);
    }

    public void tampilkanDataMataKuliah() {
        System.out.printf("%-39s | %-4d | %-5d | %-5s |\n", namaMatkul, sks, nilai, grade);
    }

    private String hitungGrade(int nilai) {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}




