CREATE DATABASE dbsistema;
USE dbsistema;

CREATE TABLE cliente(
id INT  NOT NULL AUTO_INCREMENT,
nome VARCHAR(200),
cpf VARCHAR (25),
datanascimento DATE,
PRIMARY KEY (id)
);


INSERT INTO cliente (id, nome, cpf, datanascimento)
VALUES
(1, 'Guilherme', '284.666.888-08', '2022-06-30'),
(2, 'Julinha', '908.212.328-95', '2022-06-29');

UPDATE cliente SET cpf = '902.289.213-76' WHERE cpf = '908;212.328-95'

SELECT * FROM cliente



