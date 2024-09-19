package percabangan;
import java.util.Scanner;
public class AplikasiMatematika {
    public static void main(String[] args) {
        int menu;
        String label;
        double angka1, angka2, hasil;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Aplikasi Matematika : ");
        System.out.println("1. Penambahan" + "\n" + "2. Pengurangan" + "\n"+ "3. Perkalian" + "\n" + "4. Pembagian");
        System.out.print("Pilih Menu = ");
        menu = input.nextInt();
        
        if (menu < 1 || menu > 4) {
            System.err.println("Error");
        } else {
            System.out.print("Masukan Angka Pertama = ");
            angka1 = input.nextDouble();
            System.out.print("Masukan Angka Kedua = ");
            angka2 = input.nextDouble();

            if (menu == 1) {
                hasil = angka1 + angka2;
                label = "Penambahan ";
            } else if (menu == 2) {
                hasil = angka1 - angka2;
                label = "Pengurangan ";
            } else if (menu == 3) {
                hasil = angka1 * angka2;
                label = "Perkalian ";
            } else {
                hasil = angka1 / angka2;
                label = "Pembagian ";
            }
            System.out.println("\n" + "Hasil " + label + "antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
        }
    }
}
