# java-project
# sql code used for banks data base
CREATE TABLE `banks`.`user` (
  `userid` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `surName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE INDEX `userid_UNIQUE` (`userid` ASC) VISIBLE);
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('1', 'john', 'butler');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('2', 'dean', 'win');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('3', 'sam', 'win');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('4', 'cass', 'sain');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('5', 'bobby', 'ghost');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('6', 'jane', 'dirc');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('7', 'jill', 'johnes');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('8', 'jude', 'keil');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('9', 'leon', 'kill');
INSERT INTO `banks`.`user` (`userid`, `name`, `surName`) VALUES ('10', 'lin', 'lane');
CREATE TABLE `banks`.`account` (
  `accountid` INT NOT NULL,
  `account` INT NOT NULL,
  `userid` INT NOT NULL,
  PRIMARY KEY (`accountid`));

INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('1', '19000', '2');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('2', '456', '4');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('3', '78900', '5');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('4', '65400', '7');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('5', '98000', '8');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('6', '7643', '9');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('7', '65', '10');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('8', '894', '1');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('9', '6753', '3');
INSERT INTO `banks`.`account` (`accountid`, `account`, `userid`) VALUES ('10', '75', '6');

#1-4 and half of 5 task was done

