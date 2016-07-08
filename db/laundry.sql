-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2016 at 10:26 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE IF NOT EXISTS `address` (
  `addressid` int(10) NOT NULL AUTO_INCREMENT,
  `customerid` int(10) DEFAULT NULL,
  `address1` varchar(30) DEFAULT NULL,
  `address2` varchar(30) DEFAULT NULL,
  `landmark` varchar(30) DEFAULT NULL,
  `postalcode` varchar(10) DEFAULT NULL,
  `district` varchar(30) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `stampdate` date DEFAULT NULL,
  `stampuser` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`addressid`),
  KEY `customerid` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `backofficeuser`
--

CREATE TABLE IF NOT EXISTS `backofficeuser` (
  `userid` int(30) DEFAULT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `middlename` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `phone1` varchar(20) NOT NULL,
  `phone2` varchar(20) DEFAULT NULL,
  `passowrd` varchar(20) DEFAULT NULL,
  `usertype` varchar(10) DEFAULT NULL,
  `stampdate` date DEFAULT NULL,
  `stampuser` varchar(30) DEFAULT NULL,
  UNIQUE KEY `email` (`email`,`phone1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE IF NOT EXISTS `booking` (
  `bookingid` int(10) NOT NULL AUTO_INCREMENT,
  `orderid` int(20) DEFAULT NULL,
  `customerid` int(10) DEFAULT NULL,
  `serviceid` int(10) DEFAULT NULL,
  `quantity` int(10) NOT NULL,
  `quantityinkg` int(10) NOT NULL,
  `charges` int(10) NOT NULL,
  `bookingdatetime` datetime NOT NULL,
  `pickuptime1` time NOT NULL,
  `pickuptime2` time NOT NULL,
  `delivertime1` time NOT NULL,
  `delivertime2` time NOT NULL,
  `addressid` int(10) DEFAULT NULL,
  `status` varchar(10) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL,
  PRIMARY KEY (`bookingid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `customerid` int(10) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) NOT NULL,
  `middlename` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `phone1` int(15) NOT NULL,
  `phone2` int(15) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL,
  PRIMARY KEY (`customerid`),
  UNIQUE KEY `email` (`email`,`phone1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `paymentdetail`
--

CREATE TABLE IF NOT EXISTS `paymentdetail` (
  `orderid` int(10) NOT NULL,
  `billedamount` int(10) NOT NULL,
  `paidamount` int(10) NOT NULL,
  `paymenttype` varchar(20) NOT NULL,
  `paidinfullflag` tinyint(1) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL,
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `servicegroup`
--

CREATE TABLE IF NOT EXISTS `servicegroup` (
  `servicegroupcode` int(10) NOT NULL,
  `servicegrouptype` varchar(20) NOT NULL,
  `servicegroupdesc` varchar(40) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL,
  UNIQUE KEY `servicegroupcode` (`servicegroupcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE IF NOT EXISTS `services` (
  `serviceid` int(10) NOT NULL AUTO_INCREMENT,
  `servicegroupcode` int(10) NOT NULL,
  `servicename` varchar(40) NOT NULL,
  `servicecode` int(10) NOT NULL,
  `servicedesc` varchar(50) NOT NULL,
  `chargesperkg` int(10) NOT NULL,
  `discount` int(10) DEFAULT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL,
  PRIMARY KEY (`serviceid`),
  UNIQUE KEY `serviceid` (`serviceid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE IF NOT EXISTS `signup` (
  `customerid` int(10) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `OTP` varchar(10) DEFAULT NULL,
  `stampdate` date DEFAULT NULL,
  `stampuser` varchar(30) DEFAULT NULL,
  UNIQUE KEY `customerid` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `ADDRESS_CUSTOMER_ADD CONSTRAINT` FOREIGN KEY (`customerid`) REFERENCES `customer` (`customerid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `signup`
--
ALTER TABLE `signup`
  ADD CONSTRAINT `CUSTOMER_SIGNUP_ADD CONSTRAINT` FOREIGN KEY (`customerid`) REFERENCES `customer` (`customerid`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
