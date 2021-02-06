-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2020 at 01:06 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java1`
--

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE `contacts` (
  `sn` int(3) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`sn`, `name`, `address`, `email`, `phone`) VALUES
(2, 'Manish Bista', 'USA', 'manish@yahoo.com', '6022002000'),
(3, 'sachin', 'NEP', 'sachin@gmail.com', '6023002525'),
(4, 'Suraj Tamang', 'Delhi, India', 'suraj@outlook.com', '8989898989'),
(5, 'raj', 'IND', 'raj@gmail.com', '9777779775'),
(6, 'ram', 'NEP', 'ram@gmail.com', '9777779776'),
(7, 'jin', 'JAP', 'jin@gmail.com', '9777779777'),
(8, 'rock', 'USA', 'rock@gmail.com', '9777779778'),
(9, 'jill', 'UNK', 'jill@gmail.com', '9777779779'),
(10, 'surya', 'IND', 'surya@gmail.com', '9777779710'),
(11, 'sunil', 'IND', 'sunil@gmail.com', '9777779711'),
(12, 'rose', 'JAP', 'rose@gmail.com', '9777779712'),
(13, 'lee', 'JAP', 'lee@gmail.com', '9777779713'),
(14, 'jackie', 'CHI', 'jackie@gmail.com', '9777779714'),
(15, 'joo', 'CHI', 'joo@gmail.com', '9777779715'),
(16, 'sam', 'CAN', 'sam@gmail.com', '9777779716'),
(17, 'sim', 'CAN', 'sim@gmail.com', '9777779717'),
(18, 'jo', 'USA', 'jo@gmail.com', '9777779718'),
(19, 'adlyn', 'USA', 'adlyn@gmail.com', '9777779719'),
(20, 'adi', 'USA', 'adi@gmail.com', '9777779720'),
(21, 'aap', 'USA', 'aap@gmail.com', '9777779721'),
(22, 'hari', 'NEP', 'hari@gmail.com', '9777779722'),
(23, 'manish', 'NEP', 'manish1@gmail.com', '9777779723'),
(24, 'ramesh', 'NEP', 'ramesh@gmail.com', '9777779724'),
(25, 'abhi', 'NEP', 'abhi@gmail.com', '9777779725'),
(26, 'king', 'USA', 'king@gmail.com', '9777797726'),
(27, 'tamy', 'CAN', 'tamy@gmail.com', '9777779727'),
(28, 'tom', 'CAN ', 'tom@gmail.com', '9777779728'),
(29, 'rahul', 'IND', 'rahul@gmail.com', '9777779729'),
(30, 'roma', 'IND', 'roma@gmail.com', '9777779730'),
(31, 'rama', 'IND', 'rama@gmail.com', '9777779731'),
(32, 'rog', 'USA', 'rog@gmail.com', '9777779732'),
(33, 'rim', 'USA', 'rim@gmail.com', '9777779733'),
(34, 'doll', 'USA', 'doll@gmail.com', '9777779733'),
(35, 'geff', 'USA', 'geff@gmail.com', '9777779734'),
(36, 'hary', 'USA', 'hary@gmail.com', '9777779735'),
(37, 'victor', 'USA', 'victor@gmail.com', '9777779736'),
(38, 'bill', 'USA', 'bill@gmail.com', '9777779737'),
(39, 'purna', 'NEP', 'purna@gmail.com', '9777779738'),
(40, 'lama', 'NEP', 'lama@gmail.com', '9777779739'),
(41, 'ashok', 'NEP', 'ashok@gmail.com', '9777779740'),
(42, 'paul', 'CAN', 'paul@gmail.com', '9777779741'),
(43, 'pam', 'CAN', 'pam@gmail.com', '9777779742'),
(44, 'joss', 'CAN', 'joss@gmail.com', '9777779743'),
(45, 'tim', 'CAN', 'tim@gmail.com', '9777779744'),
(46, 'tashi', 'CAN', 'tashi@gmail.com', '9777779745'),
(47, 'ganesh', 'IND', 'ganesh@gmail.com', '9777779746'),
(48, 'gopal', 'IND', 'gopal@gmail.com', '9777779747'),
(49, 'bali', 'IND', 'bali@gmail.com', '9777779748'),
(50, 'uma', 'IND', 'uma@gmail.com', '9777000000'),
(51, 'mary', 'IND', 'mary@gmail.com', '9777700007'),
(52, 'rim', 'USA', 'rim@gmail.com', '1977777000'),
(53, 'reck', 'USA', 'reck@gmail.com', '977777900'),
(54, 'zill', 'USA', 'zill@gmail.com', '977777919'),
(55, 'mile', 'USA', 'mile@gmail.com', '977777918'),
(56, 'nick', 'USA', 'nick@gmail.com', '977777916'),
(57, 'bob', 'USA', 'bob@gmail.com', '977777915'),
(58, 'nim', 'USA', 'nim@gmail.com', '9777779714'),
(59, 'nash', 'USA', 'nash@gmail.com', '977777913'),
(60, 'nam', 'USA', 'nam@gmail.com', '977777912'),
(61, 'prity', 'IND', 'prity@gmail.com', '977777973'),
(62, 'puja', 'IND', 'puja@gmail.com', '977777237'),
(63, 'priya', 'IND', 'priya@gmail.com', '977773977'),
(64, 'raj', 'nisha', 'nisha@gmail.com', '977737977'),
(65, 'vimal', 'IND', 'vimal@gmail.com', '977377977'),
(66, 'vimala', 'IND', 'vimala@gmail.com', '973777977'),
(67, 'sashi', 'IND', 'sashi@gmail.com', '937777977'),
(68, 'suman', 'IND', 'suman@gmail.com', '917777977'),
(69, 'palas', 'IND', 'palas@gmail.com', '971777977'),
(70, 'shivi', 'NEP', 'shivi@gmail.com', '977177977'),
(71, 'shiv', 'NEP', 'shiv@gmail.com', '977717977'),
(72, 'bijay', 'NEP', 'bijay@gmail.com', '977771977'),
(73, 'bijaya', 'NEP', 'bijaya@gmail.com', '977777677'),
(74, 'rajiv', 'NEP', 'rajiv@gmail.com', '977777917'),
(75, 'rajeev', 'NEP', 'rajeev@gmail.com', '977777971'),
(76, 'neema', 'NEP', 'neema@gmail.com', '977777970'),
(77, 'vivek', 'NEP', 'vivek@gmail.com', '977777907'),
(78, 'niraj', 'NEP', 'niraj@gmail.com', '977777077'),
(79, 'rakesh', 'NEP', 'rakesh@gmail.com', '977770977'),
(80, 'rima', 'NEP', 'rima@gmail.com', '977707977'),
(81, 'dome', 'CAN', 'dome@gmail.com', '977077977'),
(82, 'sip', 'CAN', 'sip@gmail.com', '970777977'),
(83, 'wes', 'CAN', 'wes@gmail.com', '999777977'),
(84, 'wisley', 'CAN', 'wisley@gmail.com', '887777977'),
(85, 'liya', 'CAN', 'liya@gmail.com', '974477977'),
(86, 'jet', 'CAN', 'jet@gmail.com', '977774977'),
(87, 'reya', 'CAN', 'reya@gmail.com', '977777974'),
(88, 'queen', 'CAN', 'queen@gmail.com', '977777947'),
(89, 'adi', 'CAN', 'adi@gmail.com', '944779777'),
(90, 'agi', 'UNK', 'agi@gmail.com', '957777977'),
(91, 'tim', 'UNK', 'tim@gmail.com', '975777977'),
(92, 'tomy', 'UNK', 'tomy@gmail.com', '977577977'),
(93, 'gilly', 'UNK', 'gilly@gmail.com', '977757977'),
(94, 'vim', 'UNK', 'vim@gmail.com', '977777957'),
(95, 'billy', 'UNK', 'billy@gmail.com', '977777976'),
(96, 'nicky', 'UNK', 'nicky@gmail.com', '977777967'),
(97, 'neha', 'UNK', 'neha@gmail.com', '977776977'),
(98, 'manisha', 'UNK', 'manisha@gmail.com', '977767977'),
(101, 'Krishna', 'Kthm', 'krishna@gmai.l.com', '908080808'),
(102, 'Krishna', 'Ktm', 'infosag@@gmailcom', '02958055555');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`sn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
