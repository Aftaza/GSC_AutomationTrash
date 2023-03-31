import java.util.Scanner;

/*
 * import java.time.LocalDate;

abstract class pelanggan {
    private String firstName;
    private String lastName;

    public Pelanggan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        if (getFirstName() != null && getLastName() != null) {
            return getFirstName() + " " + getLastName();
        } else {
            return "";
        }
    }
}
class guest extends pelanggan {
    public Guest(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
class member extends pelanggan {
    public Member(String firstName, String lastName {
        super(firstName, lastName);
    }
}

 */



class registrasi {
    public String nama;
    registrasi() {
        this.nama = null;
    }
    registrasi(String s) {
        this.nama = s;
    }
    public void setNama(String s) {
        this.nama = s;
    }
    public void print() {
        System.out.println("\n  ===Selamat Datang===");
        System.out.println("\n   Username : " + nama);
    }
    public void end() {
        System.out.printf("\n%20s ==========Terima Kasih==========\n", " ");
    }
}

class user extends registrasi {
    user() {
        this.nama = "Guest";
    }
    public void print() {
        System.out.println("\n  ===Selamat Datang===");
        System.out.printf("\n %7s " + nama + " \n", " ");
    }
}

class makanan extends list {
    private int jumMakanan;
    private int RPMakanan;
    private int hargaMakanan;
    private int jmlHargaMakanan;

    makanan(String s, int x){
        makanan=s.toLowerCase();
        jumMakanan=x;
        getJumlahMakanan();
    }
    public void DisplayMakanan() {
        if (makanan.contains("salad") || makanan.contains("pasta")) {
        System.out.printf(makanan + " %7s " + jumMakanan + " %-10s " + hargaMakanan + " %-5s " + RPMakanan + "\n",  " ", " ", " ");
        } else {
        System.out.printf(makanan + " %6s " + jumMakanan + " %-10s " + hargaMakanan + " %-5s " + RPMakanan,  " ", " ", " ");
        }
    }
    public String setMakanan(String s) {
        return makanan = s.toLowerCase();
    }

    public int setjumlahMakanan(int x) {
        jumMakanan = x;
        RPMakanan = getHargaMakanan(jumMakanan);
        jmlHargaMakanan = jmlHargaMakanan + RPMakanan;
        return RPMakanan;
    }
    public int getJumlahMakanan(){
        RPMakanan = getHargaMakanan(jumMakanan);
        jmlHargaMakanan = jmlHargaMakanan + RPMakanan;
        return RPMakanan;
    }

    // encapsulation
    private int getHargaMakanan(int jumlah) {
        if (makanan.contains("seblak")) {
            hargaMakanan = 15000;
            return jumlah * hargaMakanan;
        } else if (makanan.contains("pasta")) {
            hargaMakanan = 12000;
            return jumlah * hargaMakanan;
        } else if (makanan.contains("salad")) {
            hargaMakanan = 13000;
            return jumlah * hargaMakanan;
        } else if (makanan.contains("burger")) {
            hargaMakanan = 15000;
            return jumlah * hargaMakanan;
        } else {
            return 0;
        }
    }
    // public void DisplayMakanan() {
    //     if (makanan.contains("salad") || makanan.contains("pasta")) {
    //     System.out.printf(makanan + " %7s " + jumMakanan + " %-10s " + hargaMakanan + " %-5s " + RPMakanan + "\n",  " ", " ", " ");
    //     } else {
    //     System.out.printf(makanan + " %6s " + jumMakanan + " %-10s " + hargaMakanan + " %-5s " + RPMakanan,  " ", " ", " ");
    //     }
    // }
}
class makananSehat extends makanan{
    private String type;
    makananSehat(String makanan, int jumMakanan){
        super(makanan, jumMakanan);
        type=" sehat ";
    }
    public void DisplayMakanan(){
        System.out.printf("\n%-5s  "+type+" %-5s ", " ", " ");
        super.DisplayMakanan();
    }
}
class makananBerat extends makanan{
    private String type;
    private int kalori;
    makananBerat(String makanan, int jumMakanan){
        super(makanan, jumMakanan);
        type=" Berat ";
    }
    public int getKalori(){
        if(makanan.contains("seblak")){
            kalori = 400;
           return kalori;
        } else if(makanan.contains("burger")){
            kalori=600;
            return kalori;
        } else{
            return 0;
        }
    }
    public void DisplayMakanan(){
        System.out.printf("\n%-5s  "+type+" %-5s ", " ", " ");
        super.DisplayMakanan();
        System.out.printf("%5s"+getKalori()+" cal/qty\n", " ");
    }
}
class minuman extends list {
    private int hargaMinuman;
    private int jmlHargaMinuman;
    private int RPMinuman;

    minuman(String s, int x){
        minuman = s.toLowerCase();
        jumMinuman=x;
        getJumlahMinuman();
    }
    public void DisplayMinuman() {
        if (minuman.contains("milk tea")) {
        System.out.printf(minuman + " %5s " + jumMinuman + " %-10s " + hargaMinuman + " %-5s " + RPMinuman, " ", " ", " ");
        } else {
        System.out.printf(minuman + " %4s " + jumMinuman + " %-10s " + hargaMinuman + " %-5s " + RPMinuman, " ", " ", " ");
        }
    }   
    public String setMinuman(String s) {
        return minuman = s.toLowerCase();
    }
    public int setjumlahMinuman(int x) {
        jumMinuman = x;
        RPMinuman = getHargaMinuman(jumMinuman);
        jmlHargaMinuman = jmlHargaMinuman + RPMinuman;
        return jumMinuman;
    }
    public int getJumlahMinuman(){
        RPMinuman = getHargaMinuman(jumMinuman);
        jmlHargaMinuman = jmlHargaMinuman + RPMinuman;
        return jumMinuman;
    }
    // encapsulation
    private int getHargaMinuman(int jumlah) {
        if (minuman.contains("mocachino")) {
            hargaMinuman = jumlah * 15000;
            return hargaMinuman;
        } else if (minuman.contains("cappucino")) {
            hargaMinuman = jumlah * 12000;
            return hargaMinuman;
        } else if (minuman.contains("milk tea")) {
            hargaMinuman = jumlah * 13000;
            return hargaMinuman;
        } else if (minuman.contains("americano")) {
            hargaMinuman = jumlah * 15000;
            return hargaMinuman;
        } else {
            return 0;
        }
    }
    // public void DisplayMinuman() {
    //     if (minuman.contains("milk tea")) {
    //     System.out.printf(minuman + " %5s " + jumMinuman + " %-10s " + hargaMinuman + " %-5s " + RPMinuman, " ", " ", " ");
    //     } else {
    //     System.out.printf(minuman + " %4s " + jumMinuman + " %-10s " + hargaMinuman + " %-5s " + RPMinuman, " ", " ", " ");
    //     }
    // }   
}
class minumanDingin extends minuman{
    private String type;
    private char ukuran;
    private int jumEs;
    minumanDingin(String minuman, int jumMinuman, char ukuran, int jumEs){
        super(minuman, jumMinuman);
        type="Ice";
        this.jumEs=jumEs;
        this.ukuran=ukuran;
    }
    public void DisplayMinuman(){
        System.out.printf("%-5s   "+type+"("+ukuran+") %-4s ", " ", " ");
        super.DisplayMinuman();
        // System.out.printf("%5s"++" cal/qty\n", " ");
        System.out.printf("%-5s"+jumEs+" es batu\n", " ");
    }
}
class minumanHangat extends minuman{
    private String type;
    private char ukuran;
    minumanHangat(String minuman, int jumMinuman, char ukuran){
        super(minuman, jumMinuman);
        type="Hot";
        this.ukuran=ukuran;
    }
    public void DisplayMinuman(){
        System.out.printf("%-5s   "+type+"("+ukuran+") %-4s ", " ", " ");
        super.DisplayMinuman();
        System.out.println();
        // System.out.printf("%5s"++" cal/qty\n", " ");
        // System.out.printf("%-5s"+jumEs+" es batu\n", " ");
    }
    
}
class list {
     public String makanan;
     public String minuman;
     public int jumMinuman;
     public int jumMakanan;

     list(){
        makanan=null;
        minuman=null;
     }

    public void DisplayMenu() {
        System.out.printf("\n%5s ===List Menu===\n", " ");
        System.out.printf("  Makanan %7s Harga\n", " ");
        System.out.printf("seblak %8s Rp 15.000\n", " ");
        System.out.printf("pasta %9s Rp 12.000\n", " ");
        System.out.printf("salad %9s Rp 13.000\n", " ");
        System.out.printf("burger %8s Rp 15.000\n", " ");
        System.out.printf("\n  Minuman %7s Harga\n", " ");
        System.out.printf("mocachino %5s Rp 15.000\n", " ");
        System.out.printf("cappucino %5s Rp 12.000\n", " ");
        System.out.printf("milk tea %6s Rp 15.000\n", " ");
        System.out.printf("americano %5s Rp 15.000\n", " ");
    }
    public void nota() {
        System.out.printf("\n%20s ==========Nota Pesanan==========\n", " ");
        // System.out.printf("\n%30s Nama : " + nama + "\n\n", " ");
        System.out.printf("%7s Jenis %7s nama %5s jumlah %5s Harga/qty %3s Total", " ", " ", " ", " ", " ");
    }
    // public void DisplayTotal() {
    // System.out.printf("%5s Total %47s " + (jmlHargaMakanan + jmlHargaMinuman), "
    // ", " ");
    // }
}
class HargaTotal  {
    // harga(){

    // }
}

public class FilkomCafe {

    public static void main(String[] args) {
        String nama=null;
        String data1 = null, data2=null;
        int jumData1, jumData2, es;
        String type2=null;
        char size= ' ';
        // String login=null;
        String choose = null;
        char x = ' ';
        registrasi[] member = new registrasi[3];
        list[] beli = new list[3];
        makanan[] makan = new makanan[3];
        minuman[] minum = new minuman[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0, j = 0; j < 3;) {
            // if(i==0){
            // System.out.println("\n===Registrasi===\n");
            // System.out.print("Masukkan Nama : ");
            // nama = input.nextLine();
            // System.out.print("Apakah Anda mau menjadi Member? Y/N : ");
            // x =input.nextLine().charAt(0);
            // } 
            // else if(i>0&&x=='Y'){
            // System.out.println("\n===Page===\n");
            // System.out.println("Registrasi/Login : ");
            // }
            if(i==0&&j==0){
                System.out.printf("\n%5s ===Registrasi===\n", " ");
                System.out.printf("%6s Nama : ", " ");
                nama = input.nextLine();
                System.out.print("Apakah Anda mau menjadi Member? Y/N : ");
                x = input.nextLine().charAt(0);
            }
            else if(j>0){
                System.out.println("\n===Page===\n");
                System.out.print("Registrasi/Login : ");
                choose = input.nextLine().toLowerCase();
                if(choose.contains("registrasi")){
                    System.out.printf("\n%5s ===Registrasi===\n", " ");
                    System.out.printf("%6s Nama : ", " ");
                    nama = input.nextLine();
                    System.out.print("Apakah Anda mau menjadi Member? Y/N : ");
                    x = input.nextLine().charAt(0);
                } else if(choose.contains("login")){
                    System.out.println("Maaf untuk saat ini belum bisa login\nanda akan dialihkan ke mode Guest");
                    x='N';
                    // System.out.print("Nama : ");
                    // login = input.nextLine().toLowerCase();
                    // for(int y=0; y<3; y++){
                    //     if(login.contains(member[1].nama)){
                    //         member[y].print();
                    //     }
                    //     else{
                    //         System.out.println("Maaf, akun salah. Silahkan menjadi member dahulu");
                    //     }
                    // }
                } else {

                }
            } else {

            }
        //     // penggunaan Constructor dan Polymorphism
            if (x == 'Y') {
                i++;
                j++;
                // j += i;
                if (x == 'Y' && j <= 2) {
                    member[j] = new registrasi(nama);
                    beli[j]= new list();
                    beli[j].DisplayMenu();
                    member[j].print();
                    i = j;
                } else if (x == 'Y' && j >= 3) {
                    i = 0;
                    System.out.println("Maaf, Kuota member penuh\nanda akan dialihkan ke tamu");
                    member[i] = new user();
                    beli[i]= new list();
                    beli[i].DisplayMenu();
                    member[i].print();
                }
            } else if(x=='N'){
                i = 0;
                member[i] = new user();
                beli[i]= new list();
                beli[i].DisplayMenu();
                member[i].print();
            }
            else{

            }

        //     beli[i].setNama(nama);
            System.out.printf("\n%2s ===List Pesanan===\n", " ");
            // menu
            System.out.print("   Makanan : ");
            data1=input.nextLine().toLowerCase();
            // makan[i]= new makanan(input.nextLine());
            // beli[i].setMakanan(input.nextLine());
            System.out.print(" Jumlah Makanan : ");
            jumData1=Integer.parseInt(input.nextLine());
            if(data1.contains("salad") || data1.contains("pasta")){
                makan[i]=new makananSehat(data1, jumData1);
            } else {
                makan[i]=new makananBerat(data1, jumData1);
            }
            System.out.print("   Minuman : ");
            data2=input.nextLine().toLowerCase();
            System.out.print("  Es/Panas : ");
            type2=input.nextLine().toLowerCase();
            System.out.print(" Jumlah Minuman : ");
            jumData2=Integer.parseInt(input.nextLine());
            System.out.print("Ukuran M/L : ");
            size=input.nextLine().charAt(0);
            if (type2.contains("es")){
                System.out.print(" Jumlah es : ");
                es=Integer.parseInt(input.nextLine());
                minum[i]=new minumanDingin(data2, jumData2, size, es);
            } else {
                minum[i]=new minumanHangat(data2, jumData2, size);
            }
            beli[i].nota();
            makan[i].DisplayMakanan();
            minum[i].DisplayMinuman();
            i=j;
        }
        input.close();
    }
}

