## Latihan Soal UAS

### *2. a. Membuat tabel mahasiswa dengan kolom : NPM, Nama, Kelas, Nilai Tugas, UTS, UAS*
```sql
CREATE TABLE mahasiswa (
    NPM INTEGER,
    Nama VARCHAR(50),
    Kelas VARCHAR(4),
    NilaiTugas INTEGER,
    NilaiUTS INTEGER,
    NilaiUAS INTEGER
);
```



### b. Membuat 5 record
>
> ```sql
> INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
>    202143500451, 'Fauzan Aditia Pamungkas', 'R3D', 92, 94, 94
> );
> INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
>    202143500452, 'Budi Ardian', 'R3D', 86, 88, 84
> );
> INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
>    202143500453, 'Alexander Entruv', 'R3D', 90, 92, 88
> );
> INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
>    202143500454, 'Jaka Perdana', 'R3D', 88, 90, 90
> );
> INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
>    202143500455, 'Bunga Lestari', 'R3D', 90, 90, 92
> );
>
> ```

### c. Menampilkan semua dari tabel mahasiswa
> Query SQL :
> ``` sql
> SELECT * FROM mahasiswa;
> ```
>
> `Outputnya :`
> ```
> NPM           Nama                     Kelas  NilaiTugas  NilaiUTS  NilaiUAS
> ------------  -----------------------  -----  ----------  --------  --------
> 202143500451  Fauzan Aditia Pamungkas  R3D    92          94        94
> 202143500452  Budi Ardian              R3D    86          88        84
> 202143500453  Alexander Entruv         R3D    90          92        88
> 202143500454  Jaka Perdana             R3D    88          90        90
> 202143500455  Bunga Lestari            R3D    90          90        92
> ```

### d. Menampilkan (NPM, Nama, Kelas) yang namanya diawali dari "a" atau diakhiri "i"

> ``` sql
> SELECT NPM, Nama, Kelas FROM mahasiswa WHERE (Nama LIKE 'a%') OR (Nama LIKE '%i');
> ```
>
> `Outputnya : `
>
> ```
> NPM           Nama              Kelas
> ------------  ----------------  -----
> 202143500453  Alexander Entruv  R3D
> 202143500455  Bunga Lestari     R3D
> ```

### e. Menambahkan kolom rata-rata, dan menambahkan nilai kolom rata-rata berdasarkan nilai tugas, UTS, dan UAS
> ```sql
> ALTER TABLE mahasiswa ADD Rata_Rata FLOAT;
> UPDATE mahasiswa SET Rata_Rata = (NilaiTugas + NilaiUTS + NilaiUAS) / 3;
> ```

### f. Merubah nilai tugas, UTS dan UAS masing masing bertambah 10, yang nilai rata-ratanya kurang dari 60
> ```sql
> UPDATE mahasiswa SET NilaiTugas = NilaiTugas + 10, NilaiUTS = NilaiUTS + 10, NilaiUAS = NilaiUAS + 10 WHERE Rata_Rata < 60;
> ```

### g. Menghapus dari tabel mahasiswa yang nilai rata-ratanya kurang dari 50
> ```sql
> DELETE FROM mahasiswa WHERE (Rata_Rata < 60);
> ```

### No.3 
> Contoh Output 1
> 
> ![Contoh 1](sample%20output/3_1.png?raw=true)
> 
> Contoh Output 2
> 
> ![Contoh 1](sample%20output/3_2.png?raw=true)
> 
> Contoh Output 3
> 
> ![Contoh 1](sample%20output/3_3.png?raw=true)