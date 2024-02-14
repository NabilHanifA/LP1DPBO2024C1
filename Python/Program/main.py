from Anggota import Anggota

def display_table(anggota_list):
        # Determine maximum lengths for each column
        max_no_length = len(str(len(anggota_list)))
        max_id_length = 2  # Minimum length for ID column
        max_nama_length = 4  # Minimum length for Nama column
        max_bidang_length = 6  # Minimum length for Bidang column
        max_partai_length = 6  # Minimum length for Partai column

        # Update maximum lengths based on the data in the list
        for anggota in anggota_list:
            max_id_length = max(max_id_length, len(anggota.get_id()))
            max_nama_length = max(max_nama_length, len(anggota.get_nama()))
            max_bidang_length = max(max_bidang_length, len(anggota.get_bidang()))
            max_partai_length = max(max_partai_length, len(anggota.get_partai()))
        # Print the separator line
        print("-" * (max_no_length + max_id_length + max_nama_length + max_bidang_length + max_partai_length + 16))

        # Print the table header
        print("| {:<{}s}| {:<{}s}| {:<{}s}| {:<{}s}| {:<{}s}|".format(
            "No", max_no_length + 1, "ID", max_id_length + 1, "Nama", max_nama_length + 1,
            "Bidang", max_bidang_length + 1, "Partai", max_partai_length + 1))

        # Print the separator line
        print("-" * (max_no_length + max_id_length + max_nama_length + max_bidang_length + max_partai_length + 16))

        # Print the data
        for i, anggota in enumerate(anggota_list, 1):
            print("| {:<{}}| {:<{}}| {:<{}}| {:<{}}| {:<{}}|".format(
                i, max_no_length + 1, anggota.get_id(), max_id_length + 1,
                anggota.get_nama(), max_nama_length + 1, anggota.get_bidang(), max_bidang_length + 1,
                anggota.get_partai(), max_partai_length + 1))

        # Print the separator line
        print("-" * (max_no_length + max_id_length + max_nama_length + max_bidang_length + max_partai_length + 16))

anggota = []
choice = 0
while choice != 4:
    print("Pilih Opsi")
    print("1. Add")
    print("2. Edit")
    print("3. Delete")
    print("4. Done")
    try:
        choice = int(input())
    except ValueError:
        print("The input is not an integer!")
        continue
    

    if choice == 1:
        print("Jumlah Anggota DPR: ", end='')
        try:
            n = int(input())
        except ValueError:
            print("The input is not an integer!")
            continue
        for i in range(n):
            print("Anggota DPR " + str(i + 1) + ":")
            print("Id     : ", end='')
            id = str(input())
            print("Nama   : ", end='')
            nama = str(input())
            print("Bidang : ", end='')
            bidang = str(input())
            print("Partai : ", end='')
            partai = str(input())

            anggota.append(Anggota(id, nama, bidang, partai))

        display_table(anggota)

    elif choice == 2:
        if len(anggota) == 0:
            print("List Kosong")
        else:
            print("Pilih anggota yang akan diedit (1-" + str(len(anggota)) + "):")
            try:
                index = int(input())
                if index >= 1 and index <= len(anggota):
                    print("Edit Anggota DPR " + str(index) + ":")
                    print("Id     : ", end='')
                    id = str(input())
                    print("Nama   : ", end='')
                    nama = str(input())
                    print("Bidang : ", end='')
                    bidang = str(input())
                    print("Partai : ", end='')
                    partai = str(input())

                    anggota[index - 1].set_id(id)
                    anggota[index - 1].set_nama(nama)
                    anggota[index - 1].set_bidang(bidang)
                    anggota[index - 1].set_partai(partai)
                else:
                    print("Index Invalid")
            except ValueError:
                print("The input is not an integer!")
            display_table(anggota)

    elif choice == 3:
        if len(anggota) == 0:
            print("List Kosong")
        else:
            print("Pilih anggota yang akan didelete (1-" + str(len(anggota)) + "):")
            try:
                index = int(input())
                if index >= 1 and index <= len(anggota):
                    anggota.pop(index - 1)
                else:
                    print("Index Invalid")
            except ValueError:
                print("The input is not an integer!")
            display_table(anggota)

    elif choice == 4:
        if len(anggota) == 0:
            print("List Kosong")
        else:
            display_table(anggota)
