DROP TABLE Pseudos;

CREATE TABLE Affection (
  idUser NUMBER,
  idGuild NUMBER,
  indexPseudo NUMBER(3),
  CONSTRAINT pk_Affection PRIMARY KEY (idUser, idGuild)
);

CREATE TABLE Pseudos(
  indexPseudo NUMBER(3),
  CONSTRAINT pk_Pseudos PRIMARY KEY (indexPseudo)
);

CREATE OR REPLACE PROCEDURE init_pseudos(MaxPseudo_p INT) IS
MaxPseudo INT := MaxPseudo_p;
BEGIN
WHILE MaxPseudo >= 0
LOOP
    INSERT INTO Pseudos 
(
  indexPseudo
)
VALUES
(
  MaxPseudo
);
    MaxPseudo := MaxPseudo - 1;
END LOOP;
END;

CREATE OR REPLACE FUNCTION recupere_pseudo_non_utilise (
idGuild_p INT) RETURN INT IS
resulta INT;
BEGIN
  SELECT *
  INTO resulta
  FROM (
    SELECT * 
    FROM pseudos 
    WHERE indexPseudo NOT IN (
      SELECT indexPseudo 
      FROM Affection 
      WHERE idGuild = idGuild_p)
    ORDER BY DBMS_RANDOM.RANDOM)
WHERE rownum = 1;
  RETURN resulta;
END recupere_pseudo_non_utilise;
/