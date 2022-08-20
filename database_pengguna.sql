-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 20, 2022 at 03:26 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_pengguna`
--

-- --------------------------------------------------------

--
-- Table structure for table `filetask`
--

CREATE TABLE `filetask` (
  `token` varchar(10) NOT NULL,
  `nama_file` varchar(200) NOT NULL,
  `note` text NOT NULL,
  `create_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `filetask`
--

INSERT INTO `filetask` (`token`, `nama_file`, `note`, `create_date`) VALUES
('AQLNWDMCLT', 'GUIDE ALOKASI SPG.pdf', 'file guide', '2022-08-20'),
('AQLNWDMCLT', 'GUIDE ALOKASI SPG.pdf', 'note', '2022-08-20'),
('AQLNWDMCLT', 'GUIDE ALOKASI SPG.pdf', 'note', '2022-08-20'),
('AQLNWDMCLT', 'GUIDE ALOKASI SPG.pdf', 'file program 2022', '2022-08-20'),
('AQLNWDMCLT', 'Blitz 3 enduro.pdf', 'final report 2022', '2022-08-20'),
('AQLNWDMCLT', 'Blitz 3 enduro NEW.pdf', 'file program 2022', '2022-08-20'),
('AQLNWDMCLT', 'Blitz 3 enduro.pdf', 'file report', '2022-08-20');

-- --------------------------------------------------------

--
-- Table structure for table `tasklist`
--

CREATE TABLE `tasklist` (
  `id` int(11) NOT NULL,
  `status_progress` varchar(50) DEFAULT NULL,
  `title` varchar(200) NOT NULL,
  `assign_to` varchar(100) NOT NULL,
  `due_date` date NOT NULL,
  `description` text NOT NULL,
  `priority` varchar(50) NOT NULL,
  `token` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tasklist`
--

INSERT INTO `tasklist` (`id`, `status_progress`, `title`, `assign_to`, `due_date`, `description`, `priority`, `token`) VALUES
(2, 'In Progress', 'Report Program 2022 Agustus', 'Rima', '2022-01-24', 'Create Report Program 2022 mengacu pada file 2021', 'Medium', 'AQLNWDMCLT');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(5) NOT NULL,
  `username` varchar(150) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `status` varchar(50) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `role` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `nama`, `status`, `jabatan`, `role`) VALUES
(1, 'user', '123', 'Rima', 'Aktif', 'Staff Admin', 'ADM'),
(2, 'manager', '123', 'Manager Testing', 'Aktif', 'Manager', 'MNG'),
(3, 'resky', '123', 'Resky ', 'Aktif', 'Staff Admin', 'ADM'),
(4, 'ryan', '123', 'Ryan', 'Aktif', 'Staff Admin', 'ADM'),
(7, 'user123', '123', 'user testing', 'Aktif', 'Staff Admin', 'ADM'),
(8, 'user testing ', '123', 'user', 'Aktif', 'Staff Admin', 'MNG'),
(9, 'usertest', '123', 'Rima Regiani', 'Aktif', 'Staff Admin', 'ADM'),
(10, 'rimatest', '123', 'Rima', 'Aktif', 'Staff Admin', 'ADM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tasklist`
--
ALTER TABLE `tasklist`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`,`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tasklist`
--
ALTER TABLE `tasklist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
