package Model;
public class Gundam {
    public int id;
    private String version;
    private String nama;
    private double harga;

    public Gundam() {
    }

    public Gundam(int id, String version, String nama, double harga) {
        this.id = id;
        this.version = version;
        this.nama = nama;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void viewData(){
        System.out.println("========== Transaksi ==========");
        System.out.println("ID  \t "+id);
        System.out.println("Versi Gundam  \t "+version);
        System.out.println("Nama Gundam \t"+nama);
        System.out.println("Harga \t"+harga);
    }
}



