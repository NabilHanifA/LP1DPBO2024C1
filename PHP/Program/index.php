<?php  
    require ('Anggota.php');
    require ('Tabel.php');

    $dpr1 = new Anggota("2001", "Nabil", "Ketua", "ABC", "<img src='Foto.png' width='50' height='50'>");
    $dpr2 = new Anggota("2002", "Themy", "Wakil Ketua", "ABC", "<img src='Foto.png' width='50' height='50'>");
    $dpr3 = new Anggota("2003", "Humay", "Sekretaris", "ABC", "<img src='Foto.png' width='50' height='50'>");
    $dpr4 = new Anggota("2004", "Jason", "Bendahara", "ABC", "<img src='Foto.png' width='50' height='50'>");

    $anggota = array();
    array_push($anggota, $dpr1);
    array_push($anggota, $dpr2);
    array_push($anggota, $dpr3);
    array_push($anggota, $dpr4);
?>

<table border="1">
    <thead>
        <tr>
            <th>No</th>
            <th>ID</th>
            <th>Nama</th>
            <th>Bidang</th>
            <th>Partai</th>
            <th>Foto</th>
        </tr>
    </thead>
    <tbody>
        <?php
            $no = 1;
            foreach ($anggota as $a) {
                echo "<tr>";
                echo "<td>$no</td>";
                echo "<td>" . $a->getId() . "</td>";
                echo "<td>" . $a->getNama() . "</td>";
                echo "<td>" . $a->getBidang() . "</td>";
                echo "<td>" . $a->getPartai() . "</td>";
                echo "<td>" . $a->getFoto() . "</td>";
                echo "</tr>";
                $no++;
            }
        ?>
    </tbody>
</table>
