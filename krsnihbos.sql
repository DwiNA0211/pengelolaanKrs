-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jan 2022 pada 09.26
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `krsnihbos`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_admin`
--

CREATE TABLE `tb_admin` (
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_admin`
--

INSERT INTO `tb_admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_jadwal`
--

CREATE TABLE `tb_jadwal` (
  `kode_jadwal` varchar(11) NOT NULL,
  `makul` varchar(11) NOT NULL,
  `dosen` varchar(100) NOT NULL,
  `kelas` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `jam` varchar(100) NOT NULL,
  `hari` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_jadwal`
--

INSERT INTO `tb_jadwal` (`kode_jadwal`, `makul`, `dosen`, `kelas`, `semester`, `jam`, `hari`) VALUES
('123', 'Algo1', 'Mayang', '1n', 'Semester 1', '7.10', 'Rabu'),
('afd', 'PBO 2', 'EDYA', '5n', 'Semester 5', '7.30', 'senin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_krs`
--

CREATE TABLE `tb_krs` (
  `id_krs` varchar(200) NOT NULL,
  `npm` varchar(110) NOT NULL,
  `kode_jadwal` varchar(200) NOT NULL,
  `tahun_ajar` varchar(11) NOT NULL,
  `nama` varchar(250) NOT NULL,
  `dosen` varchar(100) NOT NULL,
  `Semester` varchar(200) NOT NULL,
  `makul` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_krs`
--

INSERT INTO `tb_krs` (`id_krs`, `npm`, `kode_jadwal`, `tahun_ajar`, `nama`, `dosen`, `Semester`, `makul`) VALUES
('13', '19630243', 'Dwi Novi Ariyanti', '2019', 'Semester 1', 'Algo1', 'Mayang', '22'),
('22', '19630243', 'Dwi Novi Ariyanti', '2021', 'Semester 5', 'PBO 2', 'Edya', '22');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mahasiswa`
--

CREATE TABLE `tb_mahasiswa` (
  `id_mhs` int(11) NOT NULL,
  `npm` varchar(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jkelamin` enum('Laki - laki','Perempuan','','') NOT NULL,
  `studi` enum('Teknik Informatika','Sistem Informasi','','') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `tempat_lahir` varchar(255) NOT NULL,
  `password` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`id_mhs`, `npm`, `nama`, `jkelamin`, `studi`, `tgl_lahir`, `tempat_lahir`, `password`) VALUES
(1, '19630243', 'Dwi Novi Ariyanti', 'Perempuan', 'Teknik Informatika', '2001-11-02', 'Barabai', '123');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `tb_jadwal`
--
ALTER TABLE `tb_jadwal`
  ADD PRIMARY KEY (`kode_jadwal`);

--
-- Indeks untuk tabel `tb_krs`
--
ALTER TABLE `tb_krs`
  ADD PRIMARY KEY (`id_krs`);

--
-- Indeks untuk tabel `tb_mahasiswa`
--
ALTER TABLE `tb_mahasiswa`
  ADD PRIMARY KEY (`id_mhs`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_mahasiswa`
--
ALTER TABLE `tb_mahasiswa`
  MODIFY `id_mhs` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
