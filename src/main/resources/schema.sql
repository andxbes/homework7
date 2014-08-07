
DROP TABLE IF EXISTS STUDENT;
DROP TABLE IF EXISTS INSTRUMENT;
DROP TABLE IF EXISTS PERFORMANCE_PERTICIPANTS;
DROP TABLE IF EXISTS PERFORMANCE;
DROP TABLE IF EXISTS COMPOSITION;



CREATE TABLE INSTRUMENT(
  ID INT NOT NULL AUTO_INCREMENT
, TYPE_ VARCHAR(15) NOT NULL
, PRODUCER VARCHAR(30) NOT NULL
, PROD_DATE DATE,
, PURCH_DATE DATE,
, VERSION INT NOT NULL DEFAULT 0
, UNIQUE UQ_CONTACT_1 (TYPE_, PRODUCER)
, PRIMARY KEY (ID)
);

CREATE TABLE PERFORMANCE(
, ID INT NOT NULL AUTO_INCREMENT
, CONSTRAINT FK_COMPOSITION FOREIGN KEY (COMPOSITION_ID) REFERENCES COMPOSITION(ID)
, PRIMARY KEY (ID)
);

CREATE TABLE PERFORMANCE_PARTICIPANTS(
, CONSTRAINT FK_STUDENT FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID)
, CONSTRAINT FK_PERFORMANCE FOREIGN KEY (PERFORMANCE_ID) REFERENCES PERFORMANCE(ID)
, PRIMARY KEY (STUDENT_ID)
);

CREATE TABLE COMPOSITION(
  ID INT NOT NULL AUTO_INCREMENT
, TITLE VARCHAR(25) NOT NULL
, AUTHOR VARCHAR(50) NOT NULL
, UNIQUE UQ_CONTACT_1 (TITLE, AUTHOR)
, PRIMARY KEY (ID)
);

CREATE TABLE STUDENT(
  ID INT NOT NULL AUTO_INCREMENT
, FIRST_NAME VARCHAR(40) NOT NULL
, LAST_NAME VARCHAR(40) NOT NULL
, BIRTH_DATE DATE,
, VERSION INT NOT NULL DEFAULT 0
, UNIQUE UQ_CONTACT_1 (FIRST_NAME, LAST_NAME)
, PRIMARY KEY (ID)
, CONSTRAINT FK_INSTRUMENT FOREIGN KEY (INSTRUMENT_ID) REFERENCES INSTRUMENT(ID)

);