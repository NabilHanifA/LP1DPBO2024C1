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

}