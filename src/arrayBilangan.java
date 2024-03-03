import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class arrayBilangan {
    public static void printArray(){
        Scanner scanner = new Scanner(System.in);
        byte sign = 0;

        do{
            System.out.println("\n===MENU ARRAY===");
            System.out.println("1. Print Array");
            System.out.println("2. Jumlah Value Array");
            System.out.println("3. Jumlah Value Array Multi Dimensi");
            System.out.println("4. Membalik Susunan Array");
            System.out.println("0. Keluar");

            System.out.print("\nPilih Menu Array: ");
            int pilih = scanner.nextInt();

            if(pilih==1)
                print();
            else if (pilih==2) {
                System.out.print("\nMasukkan jumlah array yang ingin dijumlahkan value nya: ");
                int n = scanner.nextInt();
                int hasil = jumlahArray(n);
                System.out.println("\nBerikut hasil penjumlahan arraynya: " + hasil);
            } else if (pilih == 3) {
                System.out.print("\nMasukkan jumlah multi array yang ingin dijumlahkan\nvalue nya kedalam array: ");
                int n = scanner.nextInt();
                System.out.print("Masukkan jumlah arraynya: ");
                int m = scanner.nextInt();
                jumlahMultiArray(n, m);
            } else if (pilih == 4) {
                printTerbalik();
            } else if (pilih==0)
                sign++;
        }while(sign ==0);

        System.out.print("\n===Terima Kasih===");
    }

    private static void print() {
        Scanner scanner = new Scanner(System.in);
        //input user
        System.out.print("\nMasukkan jumlah array: ");
        int n = scanner.nextInt();
        System.out.print("\n");

        int[] numbers = new int[n];

        int nomor = 1;
        for(int i=0; i<n; i++){
            System.out.print("Masukkan value array ke " + nomor + ": ");
            numbers[i] = scanner.nextInt();
            nomor++;
        }

        System.out.println("\nBerikut value arraynya:");
        for(int i=0; i<n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }

    private static int jumlahArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[n];

        System.out.println(" ");
        byte nomor = 1;
        for(int i=0; i<n; i++){
            System.out.print("Masukkan value array ke " + nomor + ": ");
            numbers[i] = scanner.nextInt();
            nomor++;
        }

        int hasil = 0;
        for(int i=0; i<n; i++){
            hasil = hasil + numbers[i];
        }
        return hasil;
    }

    private static int jumlahMultiArray(int n, int m) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[n][m];

        byte baris = 1, kolom = 0;
        int i=0, j=0;
        System.out.println(" ");

        for(i=0; i<n; i++){
            kolom = 0;
            for(j=0; j<m; j++) {
                kolom++;
                System.out.print("Masukkan value array " + baris + " ke " + kolom + ": ");
                numbers[i][j] = scanner.nextInt();
            }
            baris++;
            System.out.println(" ");
        }

        System.out.println("\nBerikut Array Multidimensinya:");
        int nomor = 1;
        for(j=0; j<n; j++) {
            System.out.print("Array " + nomor + ": ");
            for(i=0; i<m; i++){
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println(" ");
            nomor++;
        }

        int[] hasil = new int[n];
        int temp = 0;

        for(j=0; j<n; j++) {
            for(i=0; i<m; i++){
                temp = temp + numbers[j][i];
                //System.out.println("hasil array " + temp);
            }

            hasil[j] = temp;
            temp = 0;
        }

        System.out.println("\nBerikut hasil penjumlahan array mulidimensinya:");
        System.out.print("Array Hasil: ");

        byte tanda = 1;
        for(j=0; j<n; j++) {
            if(tanda < n){
                System.out.print(hasil[j] + ", ");
                tanda++;
            }else{
                System.out.print(hasil[j]);
            }
        }

        System.out.print("\n");

        int x=0;
        return x;
    }

    private static void printTerbalik() {
        Scanner scanner = new Scanner(System.in);
        //input user
        System.out.print("\nMasukkan jumlah array: ");
        int n = scanner.nextInt();
        System.out.print("\n");

        int[] numbers = new int[n];

        int nomor = 1;
        for(int i=0; i<n; i++){
            System.out.print("Masukkan value array ke " + nomor + ": ");
            numbers[i] = scanner.nextInt();
            nomor++;
        }

        System.out.println("\nBerikut value arraynya:");
        for(int i=n-1; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }











}

