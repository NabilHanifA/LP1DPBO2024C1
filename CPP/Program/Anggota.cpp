#include <iostream>
#include <string>

using namespace std;

class Anggota
{
    private:
        string id;
        string nama;
        string bidang;
        string partai;

    public:
        Anggota()
        {
            this->id = "";
            this->nama = "";
            this->bidang = "";
            this->partai = "";
            
        }

        Anggota(string id, string nama, string bidang, string partai)
        {
            this->id = id;
            this->nama = nama;
            this->bidang = bidang;
            this->partai = partai;
        }

        string getId(){
            return this->id;
        }
        string getNama(){
            return this->nama;
        }
        string getBidang(){
            return this->bidang;
        }
        string getPartai(){
            return this->partai;
        }

        void setId(string id){
            this->id = id;
        }
        void setNama(string nama){
            this->nama = nama;
        }
        void setBidang(string bidang){
            this->bidang = bidang;
        }
        void setPartai(string partai){
            this->partai = partai;
        }

        ~Anggota()
        {}
};
