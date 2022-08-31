#CREATE DATABASE dbexercicio1;
USE dbexercicio1;

CREATE TABLE aluno(
numero INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(20),
PRIMARY KEY (numero)
);



INSERT INTO aluno (nome)
VALUES
('Huguinho'),
('Zezinho'),
('Luizinho'),
('Pato Donald'),
('Tio Patinhas'),
('Margarida'),
('Pluto'),
('Mickey');

SELECT * FROM aluno;



CREATE TABLE departamento(
codigo INT NOT NULL PRIMARY KEY,
nome VARCHAR(20) NOT NULL
);

INSERT INTO departamento(codigo, nome)
VALUES
(100, 'Piscologia'),
(200, 'Física');



SELECT * FROM departamento;


CREATE TABLE orientador(
cod INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(40),
codigodep INT NOT NULL,
PRIMARY KEY (cod),
FOREIGN KEY (codigodep) REFERENCES departamento(codigo)
);

DROP TABLE orientador;


INSERT INTO orientador(nome, codigodep)
VALUES
('Dr.Emmett Brown', 200),
('Prof.Marty McFly', 200),
('Dr.Robert Ford', 100);

SELECT * FROM orientador;

CREATE TABLE orientacao(
codigo_orientador INT,
numero_aluno INT, 	
PRIMARY KEY (codigo_orientador, numero_aluno),
FOREIGN KEY (codigo_orientador) REFERENCES orientador(cod),
FOREIGN KEY (numero_aluno) REFERENCES aluno(numero)
);


SELECT * FROM orientacao;

#1.	Remova o Zezinho da lista de alunos. Faça as demais remoções que forem necessárias.
DELETE FROM orientacao WHERE numero_aluno = 2;
DELETE FROM aluno WHERE numero = 2;

#2.	Troque a orientação do aluno Mickey para o professor Marty McFly.

SELECT * FROM aluno;
SELECT * FROM orientacao WHERE numero_aluno = 8;
SELECT * FROM orientador WHERE cod = 1;

UPDATE orientacao SET codigo_orientador = 2 WHERE numero_aluno = 8;


SELECT orientador.nome , aluno.nome FROM orientacao
INNER JOIN orientador
ON orientacao.codigo_orientador = orientador.cod
INNER JOIN aluno
ON orientacao.numero_aluno = aluno.numero

#3.	Inclua novamente o Zezinho na lista de alunos e coloque ele como orientando do Dr. Robert Ford.
INSERT INTO aluno(nome)
VALUES('Zezinho');
SELECT * FROM aluno

SELECT * FROM orientador WHERE cod = 3;
SELECT * FROM orientador;

INSERT INTO orientacao(codigo_orientador, numero_aluno)
VALUES(3,100);


SELECT * FROM orientacao WHERE numero_aluno = 100;

#4.	Modifique o nome do departamento de “Física” para “Física Aplicada”.

UPDATE departamento SET nome = 'Fisica aplicada' WHERE codigo = 200;


#5.	Apresente quantos alunos são orientados no departamento de Física e no de Psicologia?
SELECT departamento.nome, COUNT(1)  FROM orientacao
INNER JOIN orientador
ON orientacao.codigo_orientador = orientador.cod
INNER JOIN departamento
ON orientador.codigodep = departamento.codigo
GROUP BY departamento.codigo


#6.	Apresente quantos alunos são orientados por cada professor?
SELECT orientador.nome, COUNT(1) FROM orientacao
INNER JOIN orientador
ON orientador.cod = orientacao.codigo_orientador
GROUP BY orientador.cod



#7.	Apresente todos os professores que tem o título de doutor?

SELECT * FROM orientador
WHERE nome LIKE 'Dr.%';

SELECT * FROM aluno

SELECT departamento.nome, COUNT(1) FROM orientador
INNER JOIN departamento
ON orientador.codigodep = departamento.codigo
GROUP BY departamento.codigo

















