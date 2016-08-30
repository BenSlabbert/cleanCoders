CREATE TABLE `Animal` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DateOfBirth` datetime NOT NULL,
  `Breed` varchar(45) DEFAULT NULL,
  `Sex` tinyint(2) NOT NULL,
  `Weight` decimal(3,2) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `isVaccinated` int(11) NOT NULL DEFAULT '0',
  `isParent` int(11) NOT NULL DEFAULT '0',
  `Type` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 CREATE TABLE `Farmer` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Farm` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Address` varchar(45) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
