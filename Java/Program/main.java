import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int i, choice = 0, n = 0;
        String id, nama, bidang, partai;
        
        ArrayList<Anggota> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Pilih Opsi");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Done");
            try
            {
                choice = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("The input is not an integer!");
            }
            
            if (choice == 1) {
                System.out.print("Jumlah Anggota DPR: ");
                n = sc.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.println("Anggota DPR " + (i + 1) + ":");
                    System.out.print("Id     : ");
                    id = sc.next();
                    System.out.print("Nama   : ");
                    nama = sc.next();
                    System.out.print("Bidang : ");
                    bidang = sc.next();
                    System.out.print("Partai : ");
                    partai = sc.next();

                    Anggota temp = new Anggota(id, nama, bidang, partai);
                    list.add(temp);
                }
                displayTable(list);
            }
            else if (choice == 2) {
                if (list.isEmpty()) {
                    System.out.println("List Kosong\n");
                } else {
                    int index;
                    System.out.print("Pilih anggota yang akan diedit (1-" + list.size() + "): ");
                    index = sc.nextInt();
            
                    if (index >= 1 && index <= list.size()) {
                        System.out.println("Edit Anggota DPR " + index + ":");
                        System.out.print("Id     : ");
                        id = sc.next();
                        System.out.print("Nama   : ");
                        nama = sc.next();
                        System.out.print("Bidang : ");
                        bidang = sc.next();
                        System.out.print("Partai : ");
                        partai = sc.next();
            
                        list.get(index - 1).setId(id);
                        list.get(index - 1).setNama(nama);
                        list.get(index - 1).setBidang(bidang);
                        list.get(index - 1).setPartai(partai);
                    } else {
                        System.out.println("Index Invalid");
                    }
                }
                displayTable(list);
            }
            else if (choice == 3) {
                if (list.isEmpty()) {
                    System.out.println("List Kosong");
                } else {
                    int index;
                    System.out.print("Pilih anggota yang akan didelete (1-" + list.size() + "): ");
                    index = sc.nextInt();
            
                    if (index >= 1 && index <= list.size()) {
                        list.remove(index - 1);
                    } else {
                        System.out.println("Index Invalid\n");
                    }
                }
                displayTable(list);

            } else if (choice == 4) {
                if (list.isEmpty()) {
                    System.out.println("List Kosong");
                } else {
                    displayTable(list);
                }
            }
        } while ( choice != 4);
    }

    public static void displayTable(ArrayList<Anggota> list) {
        // Determine maximum lengths for each column
        int maxNoLength = String.valueOf(list.size()).length();
        int maxIdLength = 2; // Minimum length for ID column
        int maxNamaLength = 4; // Minimum length for Nama column
        int maxBidangLength = 6; // Minimum length for Bidang column
        int maxPartaiLength = 6; // Minimum length for Partai column
        
        // Update maximum lengths based on the data in the list
        for (Anggota anggota : list) {
            maxIdLength = Math.max(maxIdLength, anggota.getId().length());
            maxNamaLength = Math.max(maxNamaLength, anggota.getNama().length());
            maxBidangLength = Math.max(maxBidangLength, anggota.getBidang().length());
            maxPartaiLength = Math.max(maxPartaiLength, anggota.getPartai().length());
        }
        // Print the separator line
        for (int i = 0; i < maxNoLength + maxIdLength + maxNamaLength + maxBidangLength + maxPartaiLength + 16; i++) {
            System.out.print("-");
        }
        System.out.println();
        
        // Print the table header
        System.out.printf("| %-" + (maxNoLength + 1) + "s| %-" + (maxIdLength + 1) + "s| %-" + (maxNamaLength + 1) + "s| %-" + (maxBidangLength + 1) + "s| %-" + (maxPartaiLength + 1) + "s|%n",
                "No", "ID", "Nama", "Bidang", "Partai");
        
        // Print the separator line
        for (int i = 0; i < maxNoLength + maxIdLength + maxNamaLength + maxBidangLength + maxPartaiLength + 16; i++) {
            System.out.print("-");
        }
        System.out.println();
        
        // Print the data
        for (int i = 0; i < list.size(); i++) {
            Anggota anggota = list.get(i);
            System.out.printf("| %-" + (maxNoLength + 1) + "d| %-" + (maxIdLength + 1) + "s| %-" + (maxNamaLength + 1) + "s| %-" + (maxBidangLength + 1) + "s| %-" + (maxPartaiLength + 1) + "s|%n",
                    (i + 1), anggota.getId(), anggota.getNama(), anggota.getBidang(), anggota.getPartai());
        }

        // Print the separator line
        for (int i = 0; i < maxNoLength + maxIdLength + maxNamaLength + maxBidangLength + maxPartaiLength + 16; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
