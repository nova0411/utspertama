import pengguna.*;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("ini_username", "ini_password");

        mhs.setNama("Nova Alvin Utomo");
        mhs.setNim("G.111.20.0028");
        mhs.setSmt(6);

        System.out.println("Nama Mhs: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());
        System.out.println("Username: " + mhs.getUsername());
        System.out.println("Password: " + mhs.getPassword());

    }
}