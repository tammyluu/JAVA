CREATE DATABASE sujet_examen;
Use sujet_examen;

CREATE TABLE Enseignant(
   matricule_enseignant INT auto_increment,
   nom VARCHAR(50),
   telephone VARCHAR(10),
   adresse VARCHAR(100),
   ville VARCHAR(30),
   PRIMARY KEY(matricule_enseignant)
);

-- Insérer des données dans la table Enseignant
INSERT INTO Enseignant (nom, telephone, adresse, ville)
VALUES
  ('Dupont', '0123456789', '123 Rue de l\'École', 'Paris'),
  ('Martin', '0987654321', '456 Avenue des Professeurs', 'Lyon'),
  ('Dufresne', '0123456789', '789 Boulevard de l\'Enseignement', 'Marseille');


CREATE TABLE Dossier_inscription(
   id_dossier INT  auto_increment,
   nom VARCHAR(50),
   date_naissance_ DATE,
   etablissement_ VARCHAR(50),
   PRIMARY KEY(id_dossier)
);
-- Insérer des données dans la table Dossier_inscription
INSERT INTO Dossier_inscription (nom, date_naissance_, etablissement_)
VALUES
  ('Jean Dupont', '1990-05-15', 'École A'),
  ('Marie Martin', '1988-08-22', 'École B'),
  ('Pierre Dufresne', '1995-02-10', 'École C');


CREATE TABLE Etablissement(
   code_etablissement INT  auto_increment,
   nom VARCHAR(50),
   adresse VARCHAR(100),
   ville VARCHAR(30),
   PRIMARY KEY(code_etablissement)
);
-- Insérer des données dans la table Etablissement
INSERT INTO Etablissement (nom, adresse, ville)
VALUES
  ('École A', '123 Rue de l\'École', 'Paris'),
  ('École B', '456 Avenue des Professeurs', 'Lyon'),
  ('École C', '789 Boulevard de l\'Enseignement', 'Marseille');

CREATE TABLE Eleve(
   code_eleve INT  auto_increment,
   nom VARCHAR(50),
   adresse VARCHAR(100),
   ville VARCHAR(50),
   note DECIMAL(15,2),
   id_dossier INT NOT NULL,
   PRIMARY KEY(code_eleve),
   FOREIGN KEY(id_dossier) REFERENCES Dossier_inscription(id_dossier)
);
-- Insérer des données dans la table Eleve
INSERT INTO Eleve (nom, adresse, ville, note, id_dossier)
VALUES
  ('Jean Dupont', '123 Rue de l\'École', 'Paris', 85.50, 1),
  ('Marie Martin', '456 Avenue des Professeurs', 'Lyon', 90.25, 2),
  ('Pierre Dufresne', '789 Boulevard de l\'Enseignement', 'Marseille', 78.75, 3);


CREATE TABLE Examen(
   id_examen INT  auto_increment,
   coefficient INT,
   PRIMARY KEY(id_examen)
);
-- Insérer des données dans la table Examen
INSERT INTO Examen (coefficient)
VALUES
  (3),
  (4),
  (2);


CREATE TABLE inscrire(
   code_etablissement INT ,
   code_eleve INT,
   PRIMARY KEY(code_etablissement, code_eleve),
   FOREIGN KEY(code_etablissement) REFERENCES Etablissement(code_etablissement),
   FOREIGN KEY(code_eleve) REFERENCES Eleve(code_eleve)
);

INSERT INTO inscrire (code_etablissement, code_eleve)
VALUES
  (1, 1), -- Établissement 1, Élève 1
  (2, 2), -- Établissement 2, Élève 2
  (3, 3); -- Établissement 3, Élève 3


CREATE TABLE corriger(
   matricule_enseignant INT ,
   id_examen INT,
   PRIMARY KEY(matricule_enseignant, id_examen),
   FOREIGN KEY(matricule_enseignant) REFERENCES Enseignant(matricule_enseignant),
   FOREIGN KEY(id_examen) REFERENCES Examen(id_examen)
);
INSERT INTO corriger (matricule_enseignant, id_examen)
VALUES
  (1, 1), -- Enseignant 1, Examen 1
  (2, 2), -- Enseignant 2, Examen 2
  (3, 3); -- Enseignant 3, Examen 3

CREATE TABLE rédiger(
   matricule_enseignant INT,
   id_examen INT,
   PRIMARY KEY(matricule_enseignant, id_examen),
   FOREIGN KEY(matricule_enseignant) REFERENCES Enseignant(matricule_enseignant),
   FOREIGN KEY(id_examen) REFERENCES Examen(id_examen)
);
INSERT INTO rédiger (matricule_enseignant, id_examen)
VALUES
  (1, 1), -- Enseignant 1, Examen 1
  (2, 2), -- Enseignant 2, Examen 2
  (3, 3); -- Enseignant 3, Examen 3

CREATE TABLE passer(
   code_eleve INT,
   id_examen INT,
   PRIMARY KEY(code_eleve, id_examen),
   FOREIGN KEY(code_eleve) REFERENCES Eleve(code_eleve),
   FOREIGN KEY(id_examen) REFERENCES Examen(id_examen)
);
INSERT INTO passer (code_eleve, id_examen)
VALUES
  (1, 1), -- Élève 1, Examen 1
  (2, 2), -- Élève 2, Examen 2
  (3, 3); -- Élève 3, Examen 3
  -- Ajouter la colonne date_passage à la table passer
ALTER TABLE passer
ADD COLUMN date_passage DATE;

UPDATE passer
SET date_passage = '2022-02-15'
WHERE code_eleve = 1 AND id_examen = 1;

UPDATE passer
SET date_passage = '2021-04-15'
WHERE code_eleve = 2 AND id_examen = 2;

UPDATE passer
SET date_passage = '2023-10-15'
WHERE code_eleve = 3 AND id_examen = 3;

INSERT INTO passer (code_eleve, id_examen, date_passage)
VALUES
  (1, 2, '2022-06-15'), 
  (2, 3, '2021-09-15'), 
  (2, 1, '2021-09-15'), 
  (3, 1, '2023-11-15'); 
  
CREATE TABLE rattacher(
   matricule_enseignant INT,
   code_etablissement INT,
   PRIMARY KEY(matricule_enseignant, code_etablissement),
   FOREIGN KEY(matricule_enseignant) REFERENCES Enseignant(matricule_enseignant),
   FOREIGN KEY(code_etablissement) REFERENCES Etablissement(code_etablissement)
);
INSERT INTO rattacher (matricule_enseignant, code_etablissement)
VALUES
  (1, 1), -- Enseignant 1, Établissement 1
  (2, 2), -- Enseignant 2, Établissement 2
  (3, 3); -- Enseignant 3, Établissement 3


select * from Dossier_inscription;
select * from Enseignant;
select * from Etablissement;
select * from inscrire;
select * from Eleve;
select * from rattacher;
select * from passer;

--  1 - Sélectionner tous les élèves et leurs dates de naissance.
select e.nom, d.date_naissance_ from Eleve e, Dossier_inscription d Where e.id_dossier = d.id_dossier ;
 -- 2 - Trouver la note moyenne pour l'examen 'Baccalauréat'.
SELECT AVG(note) AS note_moyenne
FROM passer
JOIN Eleve ON passer.code_eleve = Eleve.code_eleve
WHERE passer.id_examen = 1;
--  3 - Lister tous les enseignants travaillant à 'Paris'.
SELECT * FROM Enseignant WHERE ville = 'Paris';
 -- 4 - Compter le nombre d'élèves inscrits dans chaque établissement.
SELECT etab.nom AS nom_etablissement, COUNT(el.code_eleve) AS nombre_eleves_inscrits
FROM Etablissement etab
LEFT JOIN inscrire i ON etab.code_etablissement = i.code_etablissement
LEFT JOIN Eleve el ON i.code_eleve = el.code_eleve
GROUP BY etab.code_etablissement, etab.nom;

 -- 5 - Obtenir les noms de tous les élèves ayant passé un examen avec une note supérieure à 15.
SELECT e.nom , (e.note * ex.coefficient) AS note FROM Eleve e, passer p, Examen ex 
WHERE e.code_eleve = p.code_eleve AND  p.id_examen = ex.id_examen AND (e.note * ex.coefficient) > 15;


 -- 6 - Afficher les examens et les noms des épreuves correspondantes avec leurs coefficients.
 
-- 7 - Lister les établissements avec le nombre d'examens différents pris, triés par le nombre d'examens.
SELECT e.code_etablissement, e.nom, COUNT(DISTINCT p.id_examen) AS nombre_examens
FROM Etablissement e
LEFT JOIN inscrire i  ON e.code_etablissement = i.code_etablissement
LEFT JOIN passer  p ON i.code_eleve = p.code_eleve
GROUP BY e.code_etablissement, e.nom
ORDER BY nombre_examens DESC;

--  8 - Trouver tous les élèves qui n'ont passé aucun examen :
SELECT e.code_eleve,e.nom
FROM Eleve e
LEFT JOIN passer p ON e.code_eleve = p.code_eleve
WHERE p.code_eleve IS NULL;

 -- 9 - Identifier les enseignants qui ont à la fois rédigé et corrigé la même épreuve :
SELECT DISTINCT r.matricule_enseignant, e.id_examen
FROM rédiger r ,corriger c, Examen e
WHERE r.matricule_enseignant = c.matricule_enseignant AND r.id_examen = c.id_examen AND r.id_examen = e.id_examen;

 -- 10 - Montrer le dernier examen que chaque élève a passé, avec la date et la note :
 --  WITH pour créer une vue temporaire appelée "ExamensEleve" en utilisant la fonction de fenêtrage ROW_NUMBER()
 WITH ExamensEleve AS (
    SELECT
        E.code_eleve,
        P.id_examen,
        P.date_passage,
        E.note * EX.coefficient AS note,
        ROW_NUMBER() OVER (PARTITION BY E.code_eleve ORDER BY P.date_passage DESC) AS row_num 
        -- à chaque ligne dans chaque partition d'élève, trié par date de passage décroissante.
    FROM Eleve E
    LEFT JOIN passer P ON E.code_eleve = P.code_eleve
    LEFT JOIN Examen EX ON P.id_examen = EX.id_examen
)
SELECT
    E.nom AS nom_eleve,
    EE.id_examen,
    EE.date_passage,
    EE.note
FROM Eleve E
JOIN ExamensEleve EE ON E.code_eleve = EE.code_eleve
WHERE EE.row_num = 1;








