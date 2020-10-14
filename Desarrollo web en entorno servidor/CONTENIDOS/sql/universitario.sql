-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-01-2020 a las 10:06:52
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mantenimiento`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `universitario`
--

CREATE TABLE `universitario` (
  `id` bigint(20) NOT NULL,
  `dni` varchar(12) CHARACTER SET latin1 NOT NULL,
  `nombre` varchar(60) CHARACTER SET latin1 DEFAULT NULL,
  `ape1` varchar(30) CHARACTER SET latin1 DEFAULT NULL,
  `ape2` varchar(30) CHARACTER SET latin1 DEFAULT NULL,
  `carrera` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `nota` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `universitario`
--

INSERT INTO `universitario` (`id`, `dni`, `nombre`, `ape1`, `ape2`, `carrera`, `nota`) VALUES
(301, '5522478576', 'Libia', 'Katari', 'Reynoso', 'Enfermeria', 6),
(302, '6757218827', 'Lizzet', 'Rico', 'Surco', 'Ingenieria Química', 10),
(303, '3501621553', 'Anibal', 'Himmler', 'Rufino', 'Enfermeria', 6),
(304, '0760176438', 'Lena', 'Jimenez', 'Poquechoque', 'Arquitectura', 10),
(305, '1772230531', 'Lina', 'Kenjo', 'Llusco', 'Ingenieria Quimica', 10),
(326, '1071742326', 'Hilarion', 'Surco', 'Jimenez', 'Derecho', 6),
(327, '1651117538', 'Fernando', 'Kenjo', 'Fuertes', 'Farmacia', 8),
(328, '4727502832', 'Rei', 'Simpson', 'Fortuna', 'Medicina', 6),
(329, '2634301352', 'Paola', 'Altamirano', 'Fortuna', 'Farmacia', 8),
(330, '4060826165', 'Laura', 'Gorgori', 'Ikari', 'Administracion de Empresas', 6),
(331, '6562441148', 'Reyna', 'Alvis', 'Himmler', 'Agronomia', 9),
(332, '2278381772', 'Lena', 'Altamirano', 'Kenjo', 'Adm de Empresas', 6),
(333, '8554161628', 'Laura', 'Aviles', 'Llusco', 'Adm de Empresas', 9),
(334, '0002738271', 'Oscar', 'Camara', 'Katari', 'Gas y Petroleo', 6),
(335, '2673648388', 'Lena', 'Fortuna', 'Altamirano', 'Agronomia', 8),
(336, '3605678426', 'Lizzet', 'Zanabria', 'Callaza', 'Economia', 6),
(337, '1543513701', 'Fernando', 'Katari', 'Simpson', 'Interiores ', 6),
(338, '3877833273', 'Fernando', 'Camara', 'Chipana', 'Agronomia', 8),
(339, '5524582347', 'Oscar', 'Brinco', 'Chavez', 'Gas y Petroleo', 5),
(340, '7532852006', 'Cesar', 'Brinco', 'Ikari', 'Ingenieria de Sistemas', 6),
(341, '4740118030', 'Rei', 'Chive', 'Gorgori', 'Enfermeria', 9),
(342, '5663577704', 'Paola', 'Paravicini', 'Flanders', 'Derecho', 9),
(343, '5742610002', 'David', 'Brinco', 'Jimenez', 'Economia', 6),
(344, '3740560251', 'Pedro', 'Sanchez', 'Brinco', 'Agronomia', 8),
(345, '1681801012', 'Lula', 'Chive', 'Langley', 'Odontologia', 9),
(346, '0454664741', 'Bryan', 'Brinco', 'Jimenez', 'Ingenieria Quimica', 10),
(347, '30', 'pppp', 'ppp', 'ppp', 'pppppp', 7);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `universitario`
--
ALTER TABLE `universitario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `universitario`
--
ALTER TABLE `universitario`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=348;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
