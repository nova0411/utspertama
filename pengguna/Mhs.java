package pengguna;

public class Mhs extends User{
    private String Nama;
    private String Nim;
    private int Smt;


    public Mhs(String username, String password){
        super("ini_username", "ini_password");
    }

public void setNama(String nama){
    this.Nama = nama;
}

public String getNama(){
    return this.Nama;
}

public void setNim(String nim){
    this.Nim = nim;
}

public String getNim(){
    return this.Nim;
}

public void setSmt(int smt){
    this.Smt = smt;
}

public int getSmt(){
    return this.Smt;
}
}