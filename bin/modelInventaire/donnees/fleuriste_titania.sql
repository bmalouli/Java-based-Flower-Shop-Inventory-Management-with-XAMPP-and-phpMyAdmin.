-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 15 août 2023 à 21:57
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `fleuriste_titania`
--

-- --------------------------------------------------------

--
-- Structure de la table `inventaire`
--

CREATE TABLE `inventaire` (
  `id` int(3) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `couleur` varchar(10) NOT NULL,
  `prix` int(2) DEFAULT NULL,
  `quantite` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `inventaire`
--

INSERT INTO `inventaire` (`id`, `nom`, `couleur`, `prix`, `quantite`) VALUES
(1, 'Rose', 'Rouge', 7, 53),
(2, 'Lavande', 'Mauve', 5, 35),
(3, 'Jonquille', 'Jaune', 5, 23),
(4, 'Campanule', 'Mauve', 3, 20),
(5, 'Lilas', 'Mauve', 5, 32),
(6, 'Gardenia', 'Blanc', 3, 36),
(7, 'Pivoine', 'Rose', 4, 28),
(8, 'Marguerite', 'Blanc', 5, 37),
(9, 'Lys', 'Blanc', 7, 45),
(10, 'Hyacinthe', 'Mauve', 5, 25),
(11, 'Muflier', 'Rouge', 3, 21),
(12, 'Rose', 'Jaune', 6, 13);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `inventaire`
--
ALTER TABLE `inventaire`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `inventaire`
--
ALTER TABLE `inventaire`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
