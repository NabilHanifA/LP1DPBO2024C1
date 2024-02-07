#include <bits/stdc++.h>
#include "Anggota.cpp"

using namespace std;

int main()
{
    int i, n = 0;
    int choice;
    string id, nama, bidang, partai;
    vector<Anggota> vec;

    do{
        cout << "Pilih Opsi" << endl;
        cout << "1. Add" << endl;
        cout << "2. Edit" << endl;
        cout << "3. Delete" << endl;
        cout << "4. Done" << endl;
        cin >> choice;

        if (choice == 1){
            cout << "Jumlah Anggota DPR: ";
            cin >> n;
            for (i = 0; i < n; i++){
                cout << "Anggota DPR " << i + 1 << ":" << endl;
                cout << "Id     : ";
                cin >> id;
                cout << "Nama   : ";
                cin >> nama;
                cout << "Bidang : ";
                cin >> bidang;
                cout << "Partai : ";
                cin >> partai;

                Anggota temp(id, nama, bidang, partai);
                vec.push_back(temp);
            }

            cout << "Anggota DPR" << endl;
            for (i = 0; i < vec.size(); i++){
                cout << "| " <<(i + 1) << " | " << vec[i].getId() << " | " << vec[i].getNama() << " | " << vec[i].getBidang() << " | " << vec[i].getPartai()<< " | " << endl;
            }
            cout << '\n';
        }
        else if (choice == 2){
            if (vec.empty()){
                cout << "List Kosong" << "\n\n";
            }
            else{
                int index;
                cout << "Pilih anggota yang akan diedit (1-" << vec.size() << "): ";
                cin >> index;

                if (index >= 1 && index <= vec.size()){
                    cout << "Edit Anggota DPR " << index << ":" << endl;
                    cout << "Id     : ";
                    cin >> id;
                    cout << "Nama   : ";
                    cin >> nama;
                    cout << "Bidang : ";
                    cin >> bidang;
                    cout << "Partai : ";
                    cin >> partai;

                    vec[index - 1].setId(id);
                    vec[index - 1].setNama(nama);
                    vec[index - 1].setBidang(bidang);
                    vec[index - 1].setPartai(partai);
                }
                else{
                    cout << "Index Invalid" << endl;
                }
            }
            cout << "Anggota DPR" << endl;
            for (i = 0; i < vec.size(); i++){
                cout << "| " <<(i + 1) << " | " << vec[i].getId() << " | " << vec[i].getNama() << " | " << vec[i].getBidang() << " | " << vec[i].getPartai()<< " | " << endl;
            }
            cout << '\n';
        }
        else if (choice == 3){
            if (vec.empty()){
                cout << "List Kosong" << endl;
            }
            else{
                int index;
                cout << "Pilih anggota yang akan didelete (1-" << vec.size() << "): ";
                cin >> index;

                if (index >= 1 && index <= vec.size()){
                    vec.erase(vec.begin() + index - 1);
                } else{
                    cout << "Index Invalid" << "\n\n";
                }
            }
            cout << "Anggota DPR" << endl;
            for (i = 0; i < vec.size(); i++){
                cout << "| " <<(i + 1) << " | " << vec[i].getId() << " | " << vec[i].getNama() << " | " << vec[i].getBidang() << " | " << vec[i].getPartai()<< " | " << endl;
            }
            cout << '\n';
        }

        else if (choice == 4){
            if(vec.empty()){
                cout << "List Kosong" << endl;
            }
            else{
                cout << "Anggota DPR" << endl;
                for (i = 0; i < vec.size(); i++){
                    cout << "| " <<(i + 1) << " | " << vec[i].getId() << " | " << vec[i].getNama() << " | " << vec[i].getBidang() << " | " << vec[i].getPartai()<< " | " << endl;
                }    
            }
        }
    }while(choice != 4);

    return 0;
}