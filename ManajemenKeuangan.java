import java.util.Scanner;

public class ManajemenKeuangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();
        
        System.out.print("Masukkan jumlah uang yang dimiliki: ");
        int jumlahUang = scanner.nextInt();
        
        System.out.print("Masukkan rata-rata pengeluaran harian: ");
        int pengeluaranHarian = scanner.nextInt();
        
        int sisaUang30Hari = jumlahUang - (pengeluaranHarian * 30);
        double bulanBertahan = (double) jumlahUang / (pengeluaranHarian * 30);
     
        String statusKeuangan;
        if (bulanBertahan < 1) {
            statusKeuangan = "PERINGATAN: Keuangan anda kurang stabil!";
        } else if (bulanBertahan > 6) {
            statusKeuangan = "Keuangan anda dalam kondisi aman.";
        } else {
            statusKeuangan = "Keuangan anda cukup stabil.";
        }

        System.out.println("Apakah usia lebih dari 30? " + (usia > 30));
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + (usia > 30 && jumlahUang > 10_000_000));
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + (usia < 30 || jumlahUang > 5_000_000));
        

        System.out.print("Masukkan jumlah hutang: ");
        int hutang = scanner.nextInt();
        
        int nilaiAbsolutHutang = Math.abs(hutang);
        int pengeluaranHarianBulat = (int) Math.ceil((double) pengeluaranHarian / 1000) * 1000;
        int bonusTakTerduga = 720000;
        
        System.out.println("Laporan Keuangan Pribadi");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Uang yang dimiliki: Rp" + jumlahUang);
        System.out.println("Pengeluaran harian: Rp" + pengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: Rp" + sisaUang30Hari);
        System.out.println("Estimasi bulan bertahan: " + String.format("%.1f", bulanBertahan) + " bulan");
        System.out.println("Status Keuangan: " + statusKeuangan);
        System.out.println("Nilai absolut dari hutang: Rp" + nilaiAbsolutHutang);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + pengeluaranHarianBulat);
        System.out.println("Bonus tak terduga: Rp" + bonusTakTerduga);
        System.out.println("Total uang setelah pengeluaran dan bonus: Rp" + (jumlahUang - (pengeluaranHarian * 30) + bonusTakTerduga));
        
        scanner.close();
    }
}
