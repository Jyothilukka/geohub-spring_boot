create table if not exists country(
    countryId INT PRIMARY KEY AUTO_INCREMENT,
    countryName varchar(200),
    currency varchar(100),
    population INT,
    latitude varchar(200),
    longitude varchar(200)
);

create table if not exists city(
    cityId INT PRIMARY KEY AUTO_INCREMENT,
    cityName varchar(200),
    population INT,
    latitude varchar(200),
    longitude varchar(200),
    countryId INT,
    FOREIGN KEY (countryId) references country(countryId)
);