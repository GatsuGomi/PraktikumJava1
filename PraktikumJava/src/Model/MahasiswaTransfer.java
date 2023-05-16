package Model;
public class MahasiswaTransfer extends Mahasiswa{
    private double IPKSebelumnya;

    public double getIPKSebelumnya(){

    }

    public void setIPKSebelumnya(double IPKSebelumnya){
        this.IPKSebelumnya = IPKSebelumnya;
    }

    @Override
    public void inputKRS(){
        super.inputKRS();
        System.out.println("Ini Hasil Overlorad");
    }
}