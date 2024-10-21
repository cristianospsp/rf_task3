-- Criação da tabela TB_GENDER
CREATE TABLE TB_GENDER (
                           ID_GENDER INTEGER PRIMARY KEY,
                           NAME VARCHAR(50) NOT NULL
);

-- Inserindo gêneros
INSERT INTO TB_GENDER (ID_GENDER, NAME) VALUES (1, 'MALE');
INSERT INTO TB_GENDER (ID_GENDER, NAME) VALUES (2, 'FEMALE');

-- Criação da tabela TB_PERSON
CREATE TABLE TB_PERSON (
                           ID_PERSON INTEGER PRIMARY KEY AUTO_INCREMENT,
                           FULLNAME VARCHAR(50) NOT NULL,
                           BIRTHDATE DATE NOT NULL,
                           ID_GENDER INTEGER,
                           CONSTRAINT FK_GENDER FOREIGN KEY (ID_GENDER) REFERENCES TB_GENDER (ID_GENDER)
);