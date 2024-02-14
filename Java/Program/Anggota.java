import java.util.ArrayList;

public class Anggota
{
    private String id;
    private String nama;
    private String bidang;
    private String partai;

    /*Constructor */
    public Anggota()
    {
        this.id = "";
        this.nama = "";
        this.bidang = "";
        this.partai = "";
    }

    public Anggota(String id, String nama, String bidang, String partai)
    {
        this.id = id;
        this.nama = nama;
        this.bidang = bidang;
        this.partai = partai;
    }
    
    /*Getter and Setter */

    // Getter
    public String getId()
    {
        return this.id;
    }
    public String getNama()
    {
        return this.nama;
    }
    public String getBidang()
    {
        return this.bidang;
    }
    public String getPartai()
    {
        return this.partai;
    }

    // Setter
    public void setId(String id)
    {
        this.id = id;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setBidang(String bidang)
    {
        this.bidang = bidang;
    }

    public void setPartai(String partai)
    {
        this.partai = partai;
    }

    /*Methods */
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