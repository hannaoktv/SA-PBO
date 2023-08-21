class Buku {
    private int id;
    private String judul;
    private String penulis;

    public Buku(int id, String judul, String penulis) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}