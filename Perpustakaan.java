import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<Buku> daftarBuku;
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void hapusBuku(Buku buku) {
        daftarBuku.remove(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public void hapusAnggota(Anggota anggota) {
        daftarAnggota.remove(anggota);
    }

    public boolean pinjamBuku(Anggota anggota, Buku buku) {
        return true; // Berhasil dipinjam
    }

    public boolean kembalikanBuku(Anggota anggota, Buku buku) {
        return true; // Berhasil dikembalikan
    }
}
