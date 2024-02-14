<?php 

class Anggota {
    // Atribut
    private $id = '';
    private $nama = '';
    private $bidang = '';
    private $partai = '';
    private $foto = '';

    // Constructor
    public function __construct($id = '', $nama = '', $bidang = '', $partai = '', $foto = '')
    {
        $this->id = $id;
        $this->nama = $nama;
        $this->bidang = $bidang;
        $this->partai = $partai;
        $this->foto = $foto;
    }

    //Setter and Getter
    //Setter
    public function setId($id){
        $this->id = $id;
    }
    public function setNama($nama){
        $this->nama = $nama;
    }
    public function setBidang($bidang){
        $this->bidang = $bidang;
    }
    public function setPartai($partai){
        $this->partai = $partai;
    }
    public function setFoto($foto){
        $this->foto = $foto;
    }

    //Getter
    public function getId(){
        return $this->id;
    }
    public function getNama(){
        return $this->nama;
    }
    public function getBidang(){
        return $this->bidang;
    }
    public function getPartai(){
        return $this->partai;
    }
    public function getFoto(){
        return $this->foto;
    }
}


?>