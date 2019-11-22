DROP DATABASE IF EXISTS POJO_RENTING;
CREATE DATABASE IF NOT EXISTS POJO_RENTING;
USE POJO_RENTING;

CREATE TABLE CLIENTE(
	ID INT UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
	NOMBRE VARCHAR(30) NOT NULL ,
	TELEFONO VARCHAR(12) NOT NULL ,
	EMAIL VARCHAR(30) NOT NULL ,
	PRIMARY KEY(ID),
	UNIQUE (NOMBRE)
) ENGINE = INNODB;

CREATE TABLE PARTICULAR(
	ID INT UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
	DNI CHAR(9) NOT NULL,
	EDAD INT NOT NULL,
	PUNTOS INT NOT NULL,
	PRIMARY KEY(ID),
    CONSTRAINT FK1_CLIENTE
		FOREIGN KEY (ID) REFERENCES CLIENTE (ID)
			ON DELETE CASCADE
            ON UPDATE CASCADE,
	INDEX FK1_CLIENTE(ID)
)ENGINE = INNODB;

CREATE TABLE EMPRESA(
	ID INT UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
	CIF CHAR(9) NOT NULL,
	N_ALQUILERES INT UNSIGNED NOT NULL,
	PRIMARY KEY(ID),
    CONSTRAINT FK2_CLIENTE
		FOREIGN KEY (ID) REFERENCES CLIENTE (ID)
			ON DELETE CASCADE
            ON UPDATE CASCADE,
	INDEX FK2_CLIENTE(ID)
)ENGINE = INNODB;

CREATE TABLE ALQUILER(
	ID INT UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
	FECHA_INICIO DATE NOT NULL,
    FECHA_FIN DATE NOT NULL,
    PRECIO_TOTAL FLOAT NOT NULL,
	DESCUENTO FLOAT NOT NULL,
    PRIMARY KEY(ID)
)ENGINE = INNODB;

CREATE TABLE LARGO_PLAZO(
	ID INT UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(ID),
	CONSTRAINT FK1_ALQUILER
		FOREIGN KEY (ID) REFERENCES ALQUILER (ID)
			ON DELETE CASCADE
            ON UPDATE CASCADE,
	INDEX FK1_ALQUILER(ID)
)ENGINE = INNODB;

CREATE TABLE RESERVA(
	ID INT UNSIGNED	ZEROFILL NOT NULL AUTO_INCREMENT,
    FECHA_INICIO DATE NOT NULL,
    FECHA_FIN DATE NOT NULL,
    PRIMARY KEY(ID)
)ENGINE = INNODB;

CREATE TABLE COCHE(
	ID INT UNSIGNED	ZEROFILL NOT NULL AUTO_INCREMENT,
	MODELO VARCHAR(30) NOT NULL,
    MARCA VARCHAR(30) NOT NULL,
    PRIMARY KEY(ID)
)ENGINE = INNODB;