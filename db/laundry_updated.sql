-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2016 at 08:14 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

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
`addressid` int(10) NOT NULL,
  `customerid` int(10) DEFAULT NULL,
  `address1` varchar(30) DEFAULT NULL,
  `address2` varchar(30) DEFAULT NULL,
  `landmark` varchar(30) DEFAULT NULL,
  `postalcode` varchar(10) DEFAULT NULL,
  `district` varchar(30) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `stampdate` date DEFAULT NULL,
  `stampuser` varchar(30) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`addressid`, `customerid`, `address1`, `address2`, `landmark`, `postalcode`, `district`, `state`, `country`, `stampdate`, `stampuser`) VALUES
(1, 1, 'Qrs. No. : F-30', '', '', '751003', 'Khurda', 'Odisha', 'India', '2016-07-18', NULL);

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
  `stampuser` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE IF NOT EXISTS `booking` (
`bookingid` int(10) NOT NULL,
  `orderid` int(20) DEFAULT NULL,
  `customerid` int(10) DEFAULT NULL,
  `bookingdatetime` datetime NOT NULL,
  `pickuptime1` time NOT NULL,
  `pickuptime2` time NOT NULL,
  `delivertime1` time NOT NULL,
  `delivertime2` time NOT NULL,
  `addressid` int(10) DEFAULT NULL,
  `status` varchar(10) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `bookingitems`
--

CREATE TABLE IF NOT EXISTS `bookingitems` (
`bookingItemId` bigint(20) NOT NULL,
  `bookingid` int(11) NOT NULL,
  `serviceitemid` int(11) NOT NULL,
  `itemquantity` int(11) NOT NULL,
  `totaliteminkg` float NOT NULL,
  `totalcharges` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
`customerid` int(10) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `middlename` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `phone1` bigint(15) NOT NULL,
  `phone2` bigint(15) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerid`, `firstname`, `middlename`, `lastname`, `email`, `phone1`, `phone2`, `stampdate`, `stampuser`) VALUES
(1, 'Jyoti', 'R', 'Behera', '', 9777237597, 0, '2016-07-18', '');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE IF NOT EXISTS `items` (
`itemid` int(11) NOT NULL,
  `itemname` varchar(2000) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `paymentdetail`
--

CREATE TABLE IF NOT EXISTS `paymentdetail` (
  `orderid` int(10) NOT NULL,
  `billedamount` double NOT NULL,
  `paidamount` double NOT NULL,
  `paymenttype` varchar(20) NOT NULL,
  `paidinfullflag` tinyint(1) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL
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
  `stampuser` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `servicegroup`
--

INSERT INTO `servicegroup` (`servicegroupcode`, `servicegrouptype`, `servicegroupdesc`, `stampdate`, `stampuser`) VALUES
(1001, 'Dry', 'Dry Clean', '2016-07-18', ''),
(1002, 'Wet', 'Wet Clean', '2016-07-18', '');

-- --------------------------------------------------------

--
-- Table structure for table `serviceitems`
--

CREATE TABLE IF NOT EXISTS `serviceitems` (
`serviceitemid` int(11) NOT NULL,
  `serviceid` int(11) NOT NULL,
  `itemid` int(11) NOT NULL,
  `chargesperkg` float NOT NULL,
  `discount` float NOT NULL,
  `stampdate` int(11) NOT NULL,
  `stampuser` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE IF NOT EXISTS `services` (
`serviceid` int(10) NOT NULL,
  `servicegroupcode` int(10) NOT NULL,
  `servicename` varchar(40) NOT NULL,
  `servicecode` int(10) NOT NULL,
  `servicedesc` varchar(50) NOT NULL,
  `stampdate` date NOT NULL,
  `stampuser` varchar(30) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`serviceid`, `servicegroupcode`, `servicename`, `servicecode`, `servicedesc`, `stampdate`, `stampuser`) VALUES
(1, 1001, 'Light Dry Clean', 100101, 'Light Cloth Dry Clean', '2016-07-18', ''),
(2, 1001, 'Heavy Dry Clean', 100102, 'Heavy Dry Clean', '2016-07-18', ''),
(3, 1002, 'Light Wet Cloth', 100201, 'Light Wet Cloth', '2016-07-18', ''),
(4, 1002, 'Heavy Wet Clean', 100202, 'Heavy Wet Clean', '2016-07-18', '');

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
  `stampuser` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`customerid`, `password`, `status`, `OTP`, `stampdate`, `stampuser`) VALUES
(1, 'GBVZ/Mk2pCQ=', '', '', '2016-07-18', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
 ADD PRIMARY KEY (`addressid`), ADD KEY `customerid` (`customerid`);

--
-- Indexes for table `backofficeuser`
--
ALTER TABLE `backofficeuser`
 ADD UNIQUE KEY `email` (`email`,`phone1`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
 ADD PRIMARY KEY (`bookingid`), ADD KEY `FK_booking01` (`customerid`), ADD KEY `FK_booking02` (`orderid`), ADD KEY `FK_booking03` (`addressid`);

--
-- Indexes for table `bookingitems`
--
ALTER TABLE `bookingitems`
 ADD PRIMARY KEY (`bookingItemId`), ADD KEY `FK_bookingitems01` (`bookingid`), ADD KEY `FK_serviceitems02` (`serviceitemid`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
 ADD PRIMARY KEY (`customerid`), ADD UNIQUE KEY `email` (`email`,`phone1`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
 ADD PRIMARY KEY (`itemid`);

--
-- Indexes for table `paymentdetail`
--
ALTER TABLE `paymentdetail`
 ADD PRIMARY KEY (`orderid`), ADD UNIQUE KEY `orderid` (`orderid`);

--
-- Indexes for table `servicegroup`
--
ALTER TABLE `servicegroup`
 ADD PRIMARY KEY (`servicegroupcode`), ADD UNIQUE KEY `servicegroupcode` (`servicegroupcode`);

--
-- Indexes for table `serviceitems`
--
ALTER TABLE `serviceitems`
 ADD PRIMARY KEY (`serviceitemid`), ADD KEY `FK_serviceitems01` (`serviceid`), ADD KEY `FK_serviceitems02` (`itemid`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
 ADD PRIMARY KEY (`serviceid`), ADD UNIQUE KEY `serviceid` (`serviceid`), ADD KEY `FK_services01` (`servicegroupcode`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
 ADD UNIQUE KEY `customerid` (`customerid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
MODIFY `addressid` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
MODIFY `bookingid` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `bookingitems`
--
ALTER TABLE `bookingitems`
MODIFY `bookingItemId` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
MODIFY `customerid` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
MODIFY `itemid` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `serviceitems`
--
ALTER TABLE `serviceitems`
MODIFY `serviceitemid` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `services`
--
ALTER TABLE `services`
MODIFY `serviceid` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
ADD CONSTRAINT `ADDRESS_CUSTOMER_ADD ADD CONSTRAINT` FOREIGN KEY (`customerid`) REFERENCES `customer` (`customerid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
ADD CONSTRAINT `FK_booking01` FOREIGN KEY (`customerid`) REFERENCES `customer` (`customerid`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `FK_booking02` FOREIGN KEY (`orderid`) REFERENCES `paymentdetail` (`orderid`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `FK_booking03` FOREIGN KEY (`addressid`) REFERENCES `address` (`addressid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `bookingitems`
--
ALTER TABLE `bookingitems`
ADD CONSTRAINT `FK_bookingitems01` FOREIGN KEY (`bookingid`) REFERENCES `booking` (`bookingid`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `FK_bookingitems02` FOREIGN KEY (`serviceitemid`) REFERENCES `serviceitems` (`serviceitemid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `serviceitems`
--
ALTER TABLE `serviceitems`
ADD CONSTRAINT `FK_serviceitems01` FOREIGN KEY (`serviceid`) REFERENCES `services` (`serviceid`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `FK_serviceitems02` FOREIGN KEY (`itemid`) REFERENCES `items` (`itemid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `services`
--
ALTER TABLE `services`
ADD CONSTRAINT `FK_services01` FOREIGN KEY (`servicegroupcode`) REFERENCES `servicegroup` (`servicegroupcode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `signup`
--
ALTER TABLE `signup`
ADD CONSTRAINT `CUSTOMER_SIGNUP_ADD ADD CONSTRAINT` FOREIGN KEY (`customerid`) REFERENCES `customer` (`customerid`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
