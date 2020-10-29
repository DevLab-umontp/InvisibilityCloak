CREATE TABLE Affection (
  idUser BIGINT UNSIGNED,
  idGuild BIGINT UNSIGNED,
  indexPseudo INT(3) UNSIGNED,
  CONSTRAINT pk_Affection PRIMARY KEY (idUser, idGuild)
);
-- 
CREATE TABLE Pseudos(
  indexPseudo INT(3),
  CONSTRAINT pk_Pseudos PRIMARY KEY (indexPseudo)
);
-- 
DELIMITER //
CREATE OR REPLACE PROCEDURE init_pseudos (MaxPseudo INT) BEGIN WHILE MaxPseudo >= 0 DO
INSERT INTO Pseudos (indexPseudo)
VALUES (MaxPseudo);
SET MaxPseudo = MaxPseudo - 1;
END WHILE;
END init_pseudos;
//
-- 
DELIMITER //
CREATE OR REPLACE FUNCTION recupere_pseudo_non_utilise (idGuild_p BIGINT UNSIGNED) RETURNS INT BEGIN
DECLARE resultat INT;
SELECT * INTO resultat
FROM Pseudos
WHERE indexPseudo NOT IN (
    SELECT indexPseudo
    FROM Affection
    WHERE idGuild = idGuild_p
  )
ORDER BY RAND()
LIMIT 1;
RETURN resultat;
END;
//