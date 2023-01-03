-- a. Menambahkan TABLE
CREATE TABLE IF NOT EXISTS mahasiswa (
    NPM INTEGER,
    Nama VARCHAR(50),
    Kelas VARCHAR(4),
    NilaiTugas INTEGER,
    NilaiUTS INTEGER,
    NilaiUAS INTEGER
);

-- b. Membuat 5 record
INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
    202143500451, 'Fauzan Aditia Pamungkas', 'R3D', 92, 94, 94
);
INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
    202143500452, 'Budi Ardian', 'R3D', 86, 88, 84
);
INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
    202143500453, 'Alexander Entruv', 'R3D', 90, 92, 88
);
INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
    202143500454, 'Jaka Perdana', 'R3D', 88, 90, 90
);
INSERT INTO mahasiswa (NPM, Nama, Kelas, NilaiTugas, NilaiUTS, NilaiUAS) VALUES (
    202143500455, 'Bunga Lestari', 'R3D', 90, 90, 92
);

-- c. Menampilkan Semua dari TABLE
-- Outputnya 
-- NPM           Nama                     Kelas  NilaiTugas  NilaiUTS  NilaiUAS
-- ------------  -----------------------  -----  ----------  --------  --------
-- 202143500451  Fauzan Aditia Pamungkas  R3D    92          94        94
-- 202143500452  Budi Ardian              R3D    86          88        84
-- 202143500453  Alexander Entruv         R3D    90          92        88
-- 202143500454  Jaka Perdana             R3D    88          90        90
-- 202143500455  Bunga Lestari            R3D    90          90        92

-- d. Menampilkan (NPM, Nama, Kelas) yang namanya diawali dari "a" atau "i"

-- SELECT NPM, Nama, Kelas FROM mahasiswa WHERE (Nama LIKE 'a%') OR (Nama LIKE '%i');

-- Outputnya 

-- NPM           Nama              Kelas
-- ------------  ----------------  -----
-- 202143500453  Alexander Entruv  R3D
-- 202143500455  Bunga Lestari     R3D

-- e. Menambahkan kolom Rata - Rata dan Membuat nilai Rata - Ratanya
-- ALTER TABLE mahasiswa ADD Rata_Rata INTEGER;
-- UPDATE mahasiswa SET Rata_Rata = (NilaiTugas + NilaiUTS + NilaiUAS) / 3;

-- f. Merubah nilai tugas, uts, dan uas bertambah 10, yang nilai rata-ratanya kurang dari 60;

-- UPDATE mahasiswa SET NilaiTugas = NilaiTugas + 10, NilaiUTS = NilaiUTS + 10, NilaiUAS = NilaiUAS + 10 WHERE Rata_Rata < 60;



