import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku(1, "Pergi", "Tere Liye");
        Buku buku2 = new Buku(2, "Pulang", "Tere Liye");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Anggota anggota1 = new Anggota(1, "Hanna");
        Anggota anggota2 = new Anggota(2, "Habib");

        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);

        perpustakaan.pinjamBuku(anggota1, buku1);
        perpustakaan.kembalikanBuku(anggota1, buku1);
    }
}
