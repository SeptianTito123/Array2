import java.util.Scanner;
public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner input2 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[][] {
            {"***", "***"},
            {"***", "***"},
            {"***", "***"}
        };
        
        int menu;
        boolean exit = true;

        while (exit) {
            System.out.println("Menu");
            System.out.println("1.Input data penonton");
            System.out.println("2.Tampilkan daftar penonton");
            System.out.println("3.Exit");

            System.out.println("Pilih Menu 1/2/3 :");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                for (int i = 0 ; i < penonton.length;){
                System.out.print("Masukkan nama penonton: ");
                nama = input2.nextLine();
                System.out.print("Masukkan baris: ");
                baris = input.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = input.nextInt();
                
                if (baris >= 0 && baris < penonton.length && kolom <= penonton[i].length) {
                    if (penonton[baris-1][kolom-1] != "***") {
                    System.out.println("Kursi sudah terisi");
                    } else {
                        penonton[baris-1] [kolom-1] = nama;
                        System.out.println("Kursi tersedia");
                    } 
                } else {
                    System.out.println("Kursi tidak tersedia");
                }

                System.out.println("Apakah ingin meng-input data lagi? (y/n)");
                next = input2.nextLine();
                
                if (next.equalsIgnoreCase("y")){
                    i++;
                } else{
                    break;
                }
            }
                case 2:
                System.out.println("Daftar penonton");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton ke-" + (i+1) + " : "+ String.join(",", penonton[i]));                   
                }
                break;

                case 3:
                System.out.println("Program telah berakhir");
                exit = false;

                default:
                    break;  

            }
        }
    }
}