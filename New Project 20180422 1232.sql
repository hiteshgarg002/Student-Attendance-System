-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.33-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema student_attendance
--

CREATE DATABASE IF NOT EXISTS student_attendance;
USE student_attendance;

--
-- Definition of table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `enrollmentno` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `departmentid` int(10) unsigned NOT NULL,
  `semester` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` (`id`,`enrollmentno`,`date`,`departmentid`,`semester`) VALUES 
 (1,'100','2018/04/22 10:32:27',1,'1'),
 (2,'200','2018/04/22 10:32:27',1,'1'),
 (3,'100','2018/04/22 10:32:55',1,'1'),
 (4,'100','2018/04/22 10:34:38 AM ',1,'1');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;


--
-- Definition of table `branch`
--

DROP TABLE IF EXISTS `branch`;
CREATE TABLE `branch` (
  `branchid` int(10) unsigned NOT NULL auto_increment,
  `branchname` varchar(45) NOT NULL,
  PRIMARY KEY  (`branchid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branch`
--

/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` (`branchid`,`branchname`) VALUES 
 (1,'Computer Science'),
 (2,'M.E');
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;


--
-- Definition of table `cities`
--

DROP TABLE IF EXISTS `cities`;
CREATE TABLE `cities` (
  `cityid` int(10) unsigned NOT NULL auto_increment,
  `stateid` int(10) unsigned NOT NULL,
  `cityname` varchar(45) NOT NULL,
  PRIMARY KEY  (`cityid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` (`cityid`,`stateid`,`cityname`) VALUES 
 (1,7,'gwalior'),
 (2,7,'indore'),
 (3,4,'delhi'),
 (4,4,'agra'),
 (5,8,'jhansi');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;


--
-- Definition of table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(10) unsigned NOT NULL auto_increment,
  `department_name` varchar(45) NOT NULL,
  `semester` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` (`department_id`,`department_name`,`semester`) VALUES 
 (1,'CSE',1),
 (2,'EC',1),
 (3,'CE',2);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;


--
-- Definition of table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
CREATE TABLE `faculty` (
  `faculty_id` int(10) unsigned NOT NULL auto_increment,
  `faculty_name` varchar(45) NOT NULL,
  `department_id` int(10) unsigned NOT NULL,
  `email_id` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `photo` varchar(45) NOT NULL,
  PRIMARY KEY  (`faculty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;


--
-- Definition of table `semester`
--

DROP TABLE IF EXISTS `semester`;
CREATE TABLE `semester` (
  `semester` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`semester`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semester`
--

/*!40000 ALTER TABLE `semester` DISABLE KEYS */;
INSERT INTO `semester` (`semester`) VALUES 
 (1),
 (2),
 (3),
 (4),
 (5),
 (6),
 (7),
 (8);
/*!40000 ALTER TABLE `semester` ENABLE KEYS */;


--
-- Definition of table `states`
--

DROP TABLE IF EXISTS `states`;
CREATE TABLE `states` (
  `stateid` int(10) unsigned NOT NULL auto_increment,
  `statename` varchar(45) NOT NULL,
  PRIMARY KEY  (`stateid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `states`
--

/*!40000 ALTER TABLE `states` DISABLE KEYS */;
INSERT INTO `states` (`stateid`,`statename`) VALUES 
 (3,'kerala'),
 (4,'uttar pradesh'),
 (7,'madhya pradesh'),
 (8,'gujarat');
/*!40000 ALTER TABLE `states` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `father_name` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `yearofadmission` int(10) unsigned NOT NULL,
  `enrollmentno` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `departmentid` varchar(45) NOT NULL,
  `semester` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`id`,`enrollmentno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`,`name`,`father_name`,`dob`,`gender`,`address`,`state`,`city`,`email`,`mobile`,`yearofadmission`,`enrollmentno`,`password`,`departmentid`,`semester`) VALUES 
 (1,'Ragini','Mahesh','1997-26-7','F','XYZ','M.P.','gwalior','ragini@gmail.com','9977665544',2015,'100','123','1','1'),
 (2,'XYZ','ABC','2009-09-21','M','PQR','M.P.','Guna','react@gmail.com','8866443322',2014,'200','123','1','1');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Definition of table `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `subjectid` int(10) unsigned NOT NULL auto_increment,
  `branchid` varchar(45) NOT NULL,
  `semester` varchar(45) NOT NULL,
  `subjectname` varchar(45) NOT NULL,
  PRIMARY KEY  (`subjectid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` (`subjectid`,`branchid`,`semester`,`subjectname`) VALUES 
 (100,'1','1','m1'),
 (101,'1','1','aaa'),
 (201,'1','2','ed'),
 (202,'1','2','m2'),
 (301,'1','3','m3'),
 (302,'1','3','m4');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
