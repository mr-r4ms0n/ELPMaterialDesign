-- Integrantes
-- Kevin Benítez Valentín  
-- Sandro de Jesús Hernández del Ángel  
-- David Vergara Gómez*/

-- Creacion de la base de datos para elprisas
CREATE DATABASE IF NOT EXISTS `elprisas`;
USE `elprisas`;

-- Creacion Tabla elprisas.admins
CREATE TABLE IF NOT EXISTS `admins` (
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Tabla donde se almacenaran los usuarios que ingresaran al sistema';

-- Creacion Tabla elprisas.datos_personales
CREATE TABLE IF NOT EXISTS `datos_personales` (
  `id_datos_personales` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `ApeP` varchar(50) NOT NULL,
  `ApeM` varchar(50) NOT NULL,
  PRIMARY KEY (`id_datos_personales`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COMMENT='Tabla donde se almacenara el nombre completo del remitente y destinarario\r\n';

-- Creacion Tabla elprisas.direccion
CREATE TABLE IF NOT EXISTS `direccion` (
  `clave_domicilio` int(11) NOT NULL AUTO_INCREMENT,
  `calle` varchar(50) NOT NULL,
  `localidad` varchar(50) NOT NULL,
  `codigo_postal` int(11) NOT NULL,
  `ciudad` varchar(50) NOT NULL,
  PRIMARY KEY (`clave_domicilio`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='Tabla donde se almacenaran las direcciones correspondientes a los paquetes recibidos\r\n';

-- Volcando estructura para tabla elprisas.paquetes
CREATE TABLE IF NOT EXISTS `paquetes` (
  `num_guia` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_recp` varchar(50) NOT NULL,
  `fecha_ent` varchar(50) NOT NULL,
  `peso` float NOT NULL DEFAULT '0',
  `altura` float NOT NULL DEFAULT '0',
  `ancho` float NOT NULL DEFAULT '0',
  `profundidad` float NOT NULL DEFAULT '0',
  `precio` float NOT NULL DEFAULT '0',
  `id_nombre_emisor` int(11) NOT NULL,
  `id_nombre_receptor` int(11) NOT NULL,
  `id_direccion` int(11) NOT NULL,
  PRIMARY KEY (`num_guia`),
  KEY `FK_paquetes_datos_personales` (`id_nombre_emisor`),
  KEY `FK_paquetes_datos_personales_2` (`id_nombre_receptor`),
  KEY `FK_paquetes_direccion` (`id_direccion`),
  CONSTRAINT `FK_paquetes_datos_personales` FOREIGN KEY (`id_nombre_emisor`) REFERENCES `datos_personales` (`id_datos_personales`),
  CONSTRAINT `FK_paquetes_datos_personales_2` FOREIGN KEY (`id_nombre_receptor`) REFERENCES `datos_personales` (`id_datos_personales`),
  CONSTRAINT `FK_paquetes_direccion` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`clave_domicilio`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COMMENT='Tabla donde se almacenaran los paquetes recibidos\r\n';

-- Insercion de datos en las tablas
-- elprisas.admins
INSERT INTO `admins` (`usuario`, `contraseña`) VALUES
	('r4ms0n', '123');

-- elprisas.datos_personales
INSERT INTO `datos_personales` (`id_datos_personales`, `nombre`, `ApeP`, `ApeM`) VALUES
	(11, 'David', 'Vergara', 'Gomez'),
	(12, 'Sandro', 'Hernandez', 'Del Angel'),
	(13, 'Teodoro', 'Martinez', 'Sotelo'),
	(14, 'Panfilo', 'Domingez', 'Pakuzo'),
	(15, 'Sandro De Jesus', 'Hernandez', 'Del Angel'),
	(16, 'Marcial', 'Torres', 'Trujillo'),
	(17, 'Pancho', 'Rodriguez', 'Martinez');

-- elprisas.direccion
INSERT INTO `direccion` (`clave_domicilio`, `calle`, `localidad`, `codigo_postal`, `ciudad`) VALUES
	(5, 'Tamarindo', 'Xona', 50010, 'Toluca'),
	(6, 'Cincuenta Arrobas S/n', 'Cincuenta Arrobas', 51530, 'Amatepec'),
	(7, 'La Rayuela', 'La Rayuela', 51550, 'Tlatlaya'),
	(8, 'El Limon', 'San Pedro Limon', 51550, 'Tlatlaya'),
	(9, 'El Naranjo', 'El Pantalon', 51530, 'Amatepec');

-- elprisas.paquetes
INSERT INTO `paquetes` (`num_guia`, `fecha_recp`, `fecha_ent`, `peso`, `altura`, `ancho`, `profundidad`, `precio`, `id_nombre_emisor`, `id_nombre_receptor`, `id_direccion`) VALUES
	(2, '10/05/2021', 'PENDIENTE', 12, 20, 20, 20, 20, 11, 12, 5),
	(3, '11/05/2021', 'PENDIENTE', 0.5, 14, 12, 5, 150, 11, 13, 6),
	(4, '15/08/2021', 'PENDIENTE', 3, 50, 50, 20, 157, 11, 14, 7),
	(5, '12/05/2021', 'PENDIENTE', 9, 20, 20, 20, 360, 15, 16, 8),
	(6, '12/12/2021', 'PENDIENTE', 10, 10, 10, 10, 40, 11, 17, 9);

/*1.- CONSULTA PARA PAQUETES RECIBIDOS*/
SELECT paquetes.num_guia AS "Numero de guia",
CONCAT(datos_personalesA1.nombre, " ", datos_personalesA1.apeP, " ", datos_personalesA1.apeM) AS "Emisor",
paquetes.fecha_recp AS "Fecha de recepcion",
CONCAT(datos_personalesA2.nombre, " ", datos_personalesA2.apeP, " ", datos_personalesA2.apeM) AS "Receptor",
paquetes.fecha_ent AS "Fecha de entrega",
CONCAT(direccionB1.calle, ", ", direccionB1.localidad, ", ", direccionB1.ciudad, ", C.P. ", direccionB1.codigo_postal) AS "Direccion",
paquetes.peso AS "Peso",
paquetes.altura AS "Altura",
paquetes.profundidad AS "Profundidad",
paquetes.precio AS "Precio"
FROM paquetes
INNER JOIN datos_personales AS datos_personalesA1 ON datos_personalesA1.id_datos_personales = paquetes.id_nombre_emisor
INNER JOIN datos_personales AS datos_personalesA2 ON datos_personalesA2.id_datos_personales = paquetes.id_nombre_receptor
INNER JOIN direccion AS direccionB1 ON direccionB1.clave_domicilio = paquetes.id_direccion
WHERE paquetes.fecha_ent="PENDIENTE";

/*2.- CONSULTA PARA PAQUETES ENVIADOS*/
SELECT paquetes.num_guia AS "Numero de guia",
CONCAT(datos_personalesA1.nombre, " ", datos_personalesA1.apeP, " ", datos_personalesA1.apeM) AS "Emisor",
paquetes.fecha_recp AS "Fecha de recepcion",
CONCAT(datos_personalesA2.nombre, " ", datos_personalesA2.apeP, " ", datos_personalesA2.apeM) AS "Receptor",
paquetes.fecha_ent AS "Fecha de entrega",
CONCAT(direccionB1.calle, ", ", direccionB1.localidad, ", ", direccionB1.ciudad, ", C.P. ", direccionB1.codigo_postal) AS "Direccion",
paquetes.peso AS "Peso",
paquetes.altura AS "Altura",
paquetes.profundidad AS "Profundidad",
paquetes.precio AS "Precio"
FROM paquetes
INNER JOIN datos_personales AS datos_personalesA1 ON datos_personalesA1.id_datos_personales = paquetes.id_nombre_emisor
INNER JOIN datos_personales AS datos_personalesA2 ON datos_personalesA2.id_datos_personales = paquetes.id_nombre_receptor
INNER JOIN direccion AS direccionB1 ON direccionB1.clave_domicilio = paquetes.id_direccion
WHERE paquetes.fecha_ent!="PENDIENTE";

/*3.- CONSULTA PARA BUSCAR POR PRECIOS MAYORES A 100 EN LOS PAQUETES RECIBIDOS*/
SELECT paquetes.num_guia AS "Numero de guia",
CONCAT(datos_personalesA1.nombre, " ", datos_personalesA1.apeP, " ", datos_personalesA1.apeM) AS "Emisor",
paquetes.fecha_recp AS "Fecha de recepcion",
CONCAT(datos_personalesA2.nombre, " ", datos_personalesA2.apeP, " ", datos_personalesA2.apeM) AS "Receptor",
paquetes.fecha_ent AS "Fecha de entrega",
CONCAT(direccionB1.calle, ", ", direccionB1.localidad, ", ", direccionB1.ciudad, ", C.P. ", direccionB1.codigo_postal) AS "Direccion",
paquetes.peso AS "Peso",
paquetes.altura AS "Altura",
paquetes.profundidad AS "Profundidad",
paquetes.precio AS "Precio"
FROM paquetes
INNER JOIN datos_personales AS datos_personalesA1 ON datos_personalesA1.id_datos_personales = paquetes.id_nombre_emisor
INNER JOIN datos_personales AS datos_personalesA2 ON datos_personalesA2.id_datos_personales = paquetes.id_nombre_receptor
INNER JOIN direccion AS direccionB1 ON direccionB1.clave_domicilio = paquetes.id_direccion
WHERE paquetes.fecha_ent="PENDIENTE" AND paquetes.precio>100;

/*4.- CONSULTA PARA BUSCAR POR NOMBRE DE RECEPTOR EN LOS PAQUETES RECIBIDOS*/
SELECT paquetes.num_guia AS "Numero de guia",
CONCAT(datos_personalesA1.nombre, " ", datos_personalesA1.apeP, " ", datos_personalesA1.apeM) AS "Emisor",
paquetes.fecha_recp AS "Fecha de recepcion",
CONCAT(datos_personalesA2.nombre, " ", datos_personalesA2.apeP, " ", datos_personalesA2.apeM) AS "Receptor",
paquetes.fecha_ent AS "Fecha de entrega",
CONCAT(direccionB1.calle, ", ", direccionB1.localidad, ", ", direccionB1.ciudad, ", C.P. ", direccionB1.codigo_postal) AS "Direccion",
paquetes.peso AS "Peso",
paquetes.altura AS "Altura",
paquetes.profundidad AS "Profundidad",
paquetes.precio AS "Precio"
FROM paquetes
INNER JOIN datos_personales AS datos_personalesA1 ON datos_personalesA1.id_datos_personales = paquetes.id_nombre_emisor
INNER JOIN datos_personales AS datos_personalesA2 ON datos_personalesA2.id_datos_personales = paquetes.id_nombre_receptor
INNER JOIN direccion AS direccionB1 ON direccionB1.clave_domicilio = paquetes.id_direccion
WHERE paquetes.fecha_ent="PENDIENTE" AND CONCAT (datos_personalesA2.nombre, " ", datos_personalesA2.apeP, " ", datos_personalesA2.apeM) LIKE "%Pan%";

/*5.- CONSULTA PARA BUSCAR POR DIRECCION EN LOS PAQUETES RECIBIDOS*/
SELECT paquetes.num_guia AS "Numero de guia",
CONCAT(datos_personalesA1.nombre, " ", datos_personalesA1.apeP, " ", datos_personalesA1.apeM) AS "Emisor",
paquetes.fecha_recp AS "Fecha de recepcion",
CONCAT(datos_personalesA2.nombre, " ", datos_personalesA2.apeP, " ", datos_personalesA2.apeM) AS "Receptor",
paquetes.fecha_ent AS "Fecha de entrega",
CONCAT(direccionB1.calle, ", ", direccionB1.localidad, ", ", direccionB1.ciudad, ", C.P. ", direccionB1.codigo_postal) AS "Direccion",
paquetes.peso AS "Peso",
paquetes.altura AS "Altura",
paquetes.profundidad AS "Profundidad",
paquetes.precio AS "Precio"
FROM paquetes
INNER JOIN datos_personales AS datos_personalesA1 ON datos_personalesA1.id_datos_personales = paquetes.id_nombre_emisor
INNER JOIN datos_personales AS datos_personalesA2 ON datos_personalesA2.id_datos_personales = paquetes.id_nombre_receptor
INNER JOIN direccion AS direccionB1 ON direccionB1.clave_domicilio = paquetes.id_direccion
WHERE paquetes.fecha_ent="PENDIENTE" AND CONCAT(direccionB1.calle, ", ", direccionB1.localidad, ", ", direccionB1.ciudad, ", C.P. ", direccionB1.codigo_postal) LIKE "%515%";

