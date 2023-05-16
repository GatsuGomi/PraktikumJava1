package Praktikumjava;
import Model.Mahasiswa;
import Model.Gundam;
import Model.MahasiswaTransfer;

public class praktikumJava {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setId(6);
        mahasiswa.setNPM("2110010495");
        mahasiswa.setNama("Angga Putra DN");
        mahasiswa.setIPK(4);

        mahasiswa.viewData();


        Mahasiswa m1 = new Mahasiswa(
                9,
                "2110010495",
                "Angga Putra DN",
                3.5);
        m1.viewData();

        Gundam gd = new Gundam();
        gd.setId(1);
        gd.setVersion("78");
        gd.setHarga(200);
        gd.setNama("RX");
        gd.viewData();

        Gundam gd1 = new Gundam(
                2,
                "000",
                "Barbatos Lupus",
                640);
        gd1.viewData();

        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.setId(5);
        mt.setNPM(2110010495);
        mt.setNama("Angga Putra Dwi Nugraha");
        mt.setIPK(4);
        mt.viewData();
    }
}