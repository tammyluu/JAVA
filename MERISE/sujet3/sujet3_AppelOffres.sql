CREATE DATABASE sujet3_appel_offres;
-- drop database sujet3_appel_offres;
Use sujet3_appel_offres;
CREATE TABLE ServiceProduction(
   id_prod VARCHAR(50),
   nom VARCHAR(50),
   PRIMARY KEY(id_prod)
);

CREATE TABLE AppelOffres(
   numero_offre VARCHAR(50),
   dateOffre DATE,
   dateCloture DATE,
   quantite INT,
   numeroProd VARCHAR(50),
   nomProduit VARCHAR(50),
   PRIMARY KEY(numero_offre)
);

CREATE TABLE PropositionAchat(
   id_proposition VARCHAR(50),
   dateChoix DATE,
   motifChoix VARCHAR(50),
   PRIMARY KEY(id_proposition)
);

CREATE TABLE SelectionFournisseur(
   id_selection VARCHAR(50),
   dateSelection DATE,
   numero_offre VARCHAR(50) NOT NULL,
   PRIMARY KEY(id_selection),
   FOREIGN KEY(numero_offre) REFERENCES AppelOffres(numero_offre)
);

CREATE TABLE ServiceAchats(
   id_offres VARCHAR(50),
   nom_offres VARCHAR(50),
   numero_offre VARCHAR(50),
   id_prod VARCHAR(50) NOT NULL,
   PRIMARY KEY(id_offres),
   FOREIGN KEY(numero_offre) REFERENCES AppelOffres(numero_offre),
   FOREIGN KEY(id_prod) REFERENCES ServiceProduction(id_prod)
);

CREATE TABLE Fourniseur(
   numero VARCHAR(50),
   nom VARCHAR(50),
   adresse VARCHAR(50),
   codePostal VARCHAR(50),
   ville VARCHAR(50),
   id_offres VARCHAR(50) NOT NULL,
   PRIMARY KEY(numero),
   FOREIGN KEY(id_offres) REFERENCES ServiceAchats(id_offres)
);

CREATE TABLE Contrat(
   numéro_contrat VARCHAR(50),
   date_contrat DATE,
   nombre_negocie INT,
   signature boolean,
   id_offres VARCHAR(50) NOT NULL,
   numero_offre VARCHAR(50) NOT NULL,
   PRIMARY KEY(numéro_contrat),
   FOREIGN KEY(id_offres) REFERENCES ServiceAchats(id_offres),
   FOREIGN KEY(numero_offre) REFERENCES AppelOffres(numero_offre)
);

CREATE TABLE Produit(
   id_produit VARCHAR(50),
   nom VARCHAR(50),
   prix DECIMAL(15,2),
   numero VARCHAR(50) NOT NULL,
   PRIMARY KEY(id_produit),
   FOREIGN KEY(numero) REFERENCES Fourniseur(numero)
);

CREATE TABLE proposer(
   numero VARCHAR(50),
   numero_offre VARCHAR(50),
   PRIMARY KEY(numero, numero_offre),
   FOREIGN KEY(numero) REFERENCES Fourniseur(numero),
   FOREIGN KEY(numero_offre) REFERENCES AppelOffres(numero_offre)
);

CREATE TABLE avoir(
   numero_offre VARCHAR(50),
   id_proposition VARCHAR(50),
   PRIMARY KEY(numero_offre, id_proposition),
   FOREIGN KEY(numero_offre) REFERENCES AppelOffres(numero_offre),
   FOREIGN KEY(id_proposition) REFERENCES PropositionAchat(id_proposition)
);

CREATE TABLE Associer(
   numero_offre VARCHAR(50),
   id_produit VARCHAR(50),
   PRIMARY KEY(numero_offre, id_produit),
   FOREIGN KEY(numero_offre) REFERENCES AppelOffres(numero_offre),
   FOREIGN KEY(id_produit) REFERENCES Produit(id_produit)
);

-- Insertion de données dans ServiceProduction
INSERT INTO ServiceProduction (id_prod, nom) VALUES
   ('P001', 'Produit1'),
   ('P002', 'Produit2'),
   ('P003', 'Produit3');

-- Insertion de données dans AppelOffres
INSERT INTO AppelOffres (numero_offre, dateOffre, dateCloture, quantite, numeroProd, nomProduit) VALUES
   ('OA001', '2022-01-01', '2022-01-15', 100, 'P001', 'Produit1'),
   ('OA002', '2022-02-01', '2022-02-15', 150, 'P002', 'Produit2'),
   ('OA003', '2022-03-01', '2022-03-15', 200, 'P003', 'Produit3');
  INSERT INTO AppelOffres VALUES 
  ('OA004', '2022-02-20', '2022-02-15', 150, 'P002', 'Produit2'),
   ('OA005', '2022-03-18', '2022-03-15', 200, 'P003', 'Produit3');

-- Insertion de données dans PropositionAchat
INSERT INTO PropositionAchat (id_proposition, dateChoix, motifChoix) VALUES
   ('PA001', '2022-01-10', 'Prix compétitif'),
   ('PA002', '2022-02-10', 'Qualité du produit'),
   ('PA003', '2022-03-10', 'Délai de livraison');

-- Insertion de données dans SelectionFournisseur
INSERT INTO SelectionFournisseur (id_selection, dateSelection, numero_offre) VALUES
   ('SF001', '2022-01-20', 'OA001'),
   ('SF002', '2022-02-20', 'OA002'),
   ('SF003', '2022-03-20', 'OA003');

-- Insertion de données dans ServiceAchats
INSERT INTO ServiceAchats (id_offres, nom_offres, numero_offre, id_prod) VALUES
   ('SA001', 'Offre1', 'OA001', 'P001'),
   ('SA002', 'Offre2', 'OA002', 'P002'),
   ('SA003', 'Offre3', 'OA003', 'P003');

-- Insertion de données dans Fourniseur
INSERT INTO Fourniseur (numero, nom, adresse, codePostal, ville, id_offres) VALUES
   ('F001', 'Fournisseur1', 'Adresse1', '12345', 'Lille', 'SA001'),
   ('F002', 'Fournisseur2', 'Adresse2', '67890', 'Paris', 'SA002'),
   ('F003', 'Fournisseur3', 'Adresse3', '54321', 'Lyon', 'SA003');

-- Insertion de données dans Contrat
INSERT INTO Contrat (numéro_contrat, date_contrat, nombre_negocie, signature, id_offres, numero_offre) VALUES
   ('C001', '2022-01-25', 100, TRUE, 'SA001', 'OA001'),
   ('C002', '2022-02-25', 150, TRUE, 'SA002', 'OA002'),
   ('C003', '2022-03-25', 200, TRUE, 'SA003', 'OA003');
INSERT INTO Contrat VALUES ('C004', '2022-03-26', 180, False, 'SA002', 'OA002');
-- Insertion de données dans Produit
INSERT INTO Produit (id_produit, nom, prix, numero) VALUES
   ('PROD001', 'Produit1', 50.00, 'F001'),
   ('PROD002', 'Produit2', 75.00, 'F002'),
   ('PROD003', 'Produit3', 100.00, 'F003');

-- Insertion de données dans proposer
INSERT INTO proposer (numero, numero_offre) VALUES
   ('F001', 'OA001'),
   ('F002', 'OA002'),
   ('F003', 'OA003');

-- Insertion de données dans avoir
INSERT INTO avoir (numero_offre, id_proposition) VALUES
   ('OA001', 'PA001'),
   ('OA002', 'PA002'),
   ('OA003', 'PA003');

-- Insertion de données dans Associer
INSERT INTO Associer (numero_offre, id_produit) VALUES
   ('OA001', 'PROD001'),
   ('OA002', 'PROD002'),
   ('OA003', 'PROD003');



Select * from  ServiceProduction;
Select * from   AppelOffres;
Select * from    PropositionAchat;
Select * from    SelectionFournisseur;
Select * from    ServiceAchats;
Select * from    Fourniseur;
Select * from    Contrat;
Select * from    proposer;
Select * from    avoir;
Select * from    Assosier;
Select * from    produit;

-- 1 - Sélectionner tous les produits avec leur prix.
SELECT * FROM produit;
-- 2 - Trouver le nombre total d'offres disponibles.
select count(*) from AppelOffres;
-- 3 - Lister tous les fournisseurs situés à Paris.
select * from fourniseur where ville = 'Paris';
-- 4 - Afficher les offres et la quantité totale de produits demandés pour chaque offre.
SELECT
    AO.numero_offre,
    AO.dateOffre,
    AO.dateCloture,
    SUM(AO.quantite) AS quantite_totale
FROM
    AppelOffres AO, Associer ASS
WHERE
    AO.numero_offre = ASS.numero_offre
GROUP BY
    AO.numero_offre;

-- 5 - Trouver les produits qui n'ont pas encore été inclus dans un contrat.
SELECT P.id_produit, P.nom, P.prix
FROM Produit P
LEFT JOIN Associer A ON P.numero = A.id_produit
WHERE A.id_produit IS NULL;

-- 6 - Afficher les contrats signés par chaque fournisseur avec la date de signature.
SELECT F.numero AS numero_fournisseur, F.nom AS nom_fournisseur, C.numéro_contrat, C.date_contrat
FROM Fourniseur F, Contrat C
WHERE F.id_offres = C.id_offres and C.signature = true;
 
-- 7 - Lister les offres avec les noms des produits correspondants.
SELECT AO.numero_offre, AO.nomProduit
FROM AppelOffres AO ,Associer ASS,  Produit P
WHERE AO.numero_offre = ASS.numero_offre and ASS.id_produit = P.id_produit;


-- 8 - Trouver le fournisseur qui a effectué le plus d'offres.
SELECT F.numero, F.nom, COUNT(AO.numero_offre) AS nombre_offres
FROM Fourniseur F , ServiceAchats SA, AppelOffres AO
WHERE F.id_offres = SA.id_offres and SA.numero_offre = AO.numero_offre
GROUP BY F.numero, F.nom
ORDER BY nombre_offres DESC
LIMIT 1;


-- 9 - Calculer le montant total des contrats par produit.
SELECT P.id_produit, P.nom AS nom_produit, SUM(C.nombre_negocie * P.prix) AS montant_total_contrats
FROM Produit P, Fourniseur F , Contrat C
WHERE P.numero = F.numero and F.id_offres = C.id_offres
GROUP BY P.id_produit, P.nom;

-- 10 - Trouver les offres qui n'ont pas été signées avant leur date de clôture et les fournisseurs responsables.
SELECT AO.numero_offre, AO.dateOffre, AO.dateCloture, F.numero AS numero_fournisseur, F.nom AS nom_fournisseur
FROM AppelOffres AO
JOIN ServiceAchats SA ON AO.numero_offre = SA.numero_offre
JOIN Fourniseur F ON SA.id_offres = F.id_offres
LEFT JOIN Contrat C ON AO.numero_offre = C.numero_offre
WHERE C.numéro_contrat IS NULL OR C.signature = false OR C.date_contrat > AO.dateCloture;
