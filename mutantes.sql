-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2021 a las 21:06:12
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mutantes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cadenasmutantes`
--

CREATE TABLE `cadenasmutantes` (
  `id` int(11) NOT NULL,
  `adn` varchar(1024) COLLATE utf8_spanish_ci NOT NULL COMMENT 'Cadena de adn',
  `Typeadn` int(11) NOT NULL COMMENT 'Campo que define si es o no mutante 1 = si 0 =no'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cadenasmutantes`
--

INSERT INTO `cadenasmutantes` (`id`, `adn`, `Typeadn`) VALUES
(6, 'ATGCGAAAGTGCTTATGTAGAAGGCCCCTATCACTG', 1),
(2, 'ATGCGACAGTGCTTATGTAGAAGGCCCCTATCACTG', 1),
(4, 'dsfsdfsdfsdfsfsf', 0),
(5, 'oifdfiufghlkhbgjhxjpzxccxxde', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cadenasmutantes`
--
ALTER TABLE `cadenasmutantes`
  ADD PRIMARY KEY (`adn`),
  ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cadenasmutantes`
--
ALTER TABLE `cadenasmutantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
