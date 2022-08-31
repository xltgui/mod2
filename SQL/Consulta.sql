#criar um banco de dados
#CREATE DATABASE dbexerc0;


#lista os bancos de dados no SGBD
#SHOW DATABASES;

#Remove totalmente um banco de dados;
#DROP DATABASE dbexerc0;

USE dbexerc0;
#CREATE TABLE projeto(
#codproj VARCHAR(6) NOT null,
#tipo VARCHAR(255),
#descr VARCHAR(500),
#PRIMARY KEY (codproj)
#);

#DESC projeto;


#INSERT - insere registros (tuplas) na tabela do banco de dados;

#INSERT INTO projeto(codproj, tipo, descr) 
#VALUES('LSC001', 'Novo desenv.','Sistema de estoque');

#INSERT INTO projeto(codproj, tipo, descr) 
#VALUES('PAG02', 'Manutenção','Sistema de RH');

#SELECT * FROM projeto;

#SELECT descr, tipo FROM projeto WHERE codproj = 'PAG02' AND tipo = 'Manutenção';
#SELECT COUNT(1) FROM projeto WHERE codproj = 'LSC001';

#SELECT descr, tipo FROM projeto WHERE codproj = 'PAG02';

#SELECT * FROM projeto LIMIT 1;

CREATE TABLE categoria(
cat VARCHAR(2) NOT NULL,
sal INTEGER(255),
PRIMARY KEY (cat)
);

INSERT INTO categoria(cat, sal)
VALUES ('A1'	, 5000);

INSERT INTO categoria(cat, sal)
VALUES ('A2'	, 4000);

INSERT INTO categoria(cat, sal)
VALUES ('A3'	, 3500);

INSERT INTO categoria(cat, sal)
VALUES ('GG', 8000);

SELECT * FROM categoria;

UPDATE categoria
SET cat = 'B1'
WHERE cat = 'A5';

SELECT * FROM categoria ORDER BY sal; # ORDEM CRESCENTE

SELECT * FROM categoria ORDER BY sal DESC; # ORDEM DECRESCENTE

SELECT cat FROM categoria ORDER BY sal DESC LIMIT 1; # SELECIONA O MAIOR SALARIO

SELECT cat FROM categoria ORDER BY sal  LIMIT 1; # SELECIONA O MENOR SALARIO


SELECT SUM(sal)
FROM categoria; 



#TRUNCATE TABLE categoria;

CREATE TABLE empregado (
codemp INT NOT NULL,
nome VARCHAR(255) NOT NULL,
cat VARCHAR (2) NOT NULL, 
PRIMARY KEY (codemp),
FOREIGN KEY (cat) REFERENCES categoria(cat)
);
	
INSERT INTO empregado (codemp, nome, cat)
VALUES
(1100, 'Paulo','A1'),
(1235, 'Roberto','A2'),
(2123, 'Ana','B1'),
(1435, 'Maria','A2'),
(1854, 'Fernando','A1');


SELECT * FROM empregado;

DELETE FROM categoria WHERE cat = 'A1';

#SELECT * FROM empregado, categoria
#WHERE empregado.cat = categoria.cat;


#ALIAS - APELIDO
explain SELECT * FROM empregado A
INNER JOIN categoria B
ON A.cat = B.cat;


SELECT codemp AS códgio, nome, sal AS salário FROM empregado
INNER JOIN categoria
ON empregado.cat = categoria.cat;



SELECT codemp, nome, sal, empregado.cat FROM empregado
INNER JOIN categoria
ON empregado.cat = categoria.cat;



SELECT codemp, nome, sal, empregado.cat FROM empregado
INNER JOIN categoria
ON empregado.cat = categoria.cat
ORDER BY sal DESC LIMIT 2;


CREATE TABLE projemp(
codproj VARCHAR(6) NOT NULL,
codemp INT NOT NULL,
dataini DATE,
tempal INT,
PRIMARY KEY (codproj, codemp),
FOREIGN KEY (codproj) REFERENCES projeto(codproj),
FOREIGN KEY (codemp) REFERENCES empregado(codemp)
);

INSERT INTO projemp (codproj, codemp, dataini, tempal)
VALUES
('LSC001',1100, '2018-11-01','24'),
('LSC001',1235, '2018-10-02',	'24'),
('LSC001',2123, '2019-10-03', '18'),
('LSC001',1435,'2019-10-04', '12'),
('LSC001',1854, '2019-11-01', '12'),
('PAG02',1854, '2020-05-01', '12'),
('PAG02',1100, '2018-01-04', '24'),
('PAG02',2123, '2019-11-01', '12'); 

SELECT * FROM projeto
INNER JOIN projemp
ON projeto.codproj = projemp.codproj

SELECT projeto.descr, COUNT(projemp.codemp)
FROM projeto
INNER JOIN projemp
ON projeto.codproj = projemp.codproj
GROUP BY projeto.codproj

SELECT COUNT(1) FROM empregado;

SELECT COUNT(1) FROM empregado.proj;

#DELETE FROM projeto WHERE codproj = 'LS001';

SELECT COUNT(1) projetos FROM projeto;

#6
SELECT projemp.codproj, projeto.descr, empregado.nome, categoria.sal FROM projemp
INNER JOIN projeto 
ON projemp.codproj = projeto.codproj

INNER JOIN empregado
ON projemp.codemp = empregado.codemp

INNER JOIN categoria 
ON empregado.cat = categoria.cat

ORDER BY categoria.sal







#7
SELECT projemp.codproj, projeto.descr, empregado.nome, categoria.sal FROM projemp
INNER JOIN projeto 
ON projemp.codproj = projeto.codproj

INNER JOIN empregado
ON projemp.codemp = empregado.codemp

INNER JOIN categoria 
ON empregado.cat = categoria.cat WHERE sal <= 4000

ORDER BY categoria.sal

#8
#Listagem contendo (Código do Projeto, Descrição do Projeto, Nome do Empregado) com filtro pela Data Inicial (entre os meses de outubro e novembro de 2019)
SELECT * FROM projemp;

SELECT projemp.codproj, projemp.dataini, projeto.descr, empregado.nome FROM projemp
INNER JOIN projeto 
ON projemp.codproj = projeto.codproj

INNER JOIN empregado
ON projemp.codemp = empregado.codemp

WHERE dataini BETWEEN '2019-10-01' AND '2019-11-01';

SELECT * FROM projemp

#9
#Listagem contendo (Código do Projeto, Descrição do Projeto, Nome do Empregado, e APENAS o ANO da Data Inicial do empregado no Projeto)
# using EXTRACT
SELECT projemp.codproj, EXTRACT(YEAR FROM projemp.dataini), projeto.descr, empregado.nome FROM projemp
INNER JOIN projeto 
ON projemp.codproj = projeto.codproj

INNER JOIN empregado
ON projemp.codemp = empregado.codemp

ORDER BY projemp.dataini


#or using YEAR
SELECT projemp.codproj, YEAR(projemp.dataini), projeto.descr, empregado.nome FROM projemp
INNER JOIN projeto 
ON projemp.codproj = projeto.codproj

INNER JOIN empregado
ON projemp.codemp = empregado.codemp

ORDER BY projemp.dataini




EXTRACT(YEAR) FROM projemp.dataini











SELECT * FROM empregado;



#full table SCAN