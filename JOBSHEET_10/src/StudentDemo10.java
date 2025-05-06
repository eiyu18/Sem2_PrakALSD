import java.util.Scanner;

public class StudentDemo10 {
    public static void main(String[] args) {
        StudentAssignmentStack10 stack = new StudentAssignmentStack10(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Student10 mhs = new Student10(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.name);
                    break;
                case 2:
                    Student10 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari" + dinilai.name);
                        System.out.println("Masukan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.name, nilai);
                    }
                    break;
                case 3:
                    Student10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.name);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }   
        }while (pilih >= 1 && pilih <= 4);
    }
}
