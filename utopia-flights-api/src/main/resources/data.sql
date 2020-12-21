CREATE TABLE IF NOT EXISTS `tbl_flight` (
  `flightId` INT NOT NULL AUTO_INCREMENT,
  `DEPARTTIME` DATETIME NOT NULL,
  `seatsAvailable` INT NOT NULL,
  `price` FLOAT NOT NULL,
  `departCityId` INT NOT NULL,
  `arriveCityId` INT NOT NULL,
  PRIMARY KEY (`flightId`, `DEPARTTIME`, `departCityId`, `arriveCityId`));

INSERT INTO tbl_flight(DEPARTTIME, SEATSAVAILABLE, PRICE, DEPARTCITY, ARRIVECITY) 
VALUES('2020-12-11 12:30:00', 30, 200.00, 10, 40);

COMMIT;