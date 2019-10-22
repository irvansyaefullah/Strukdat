package Tugas;

public class test {
    public static void main(String[] args) {
        stack objek = new stack(7);

        String ke = "Menuju";
        objek.push("UIN SUSKA \t\t\t\t");
        objek.push("Jl Buluh Cina \t\t\t");
        objek.push("Jl Garuda Sakti KM 2 \t");
        objek.push("Gg Teladan \t\t\t\t");
        objek.push("Jl Merpati Sakti \t\t");
        objek.push("Gg Masjid \t\t\t\t");
        objek.push("Kost \t\t\t\t\t");

        objek.cetak();
        objek.pop(); //mencoba mengeluarkan data dengan pop
        objek.pop(); //mencoba mengeluarkan data dengan pop
        objek.pop(); //mencoba mengeluarkan data dengan pop

        objek.cetak(); //mengouputkan sisa data yang belum di pop
    }
}
