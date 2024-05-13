CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS roles_and_responsibilities;
CREATE TABLE roles_and_responsibilities(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , surname VARCHAR(100) , role VARCHAR (80), responsibility VARCHAR (100));
INSERT INTO roles_and_responsibilities VALUES('Kevin' , 'Tran' , 'student-researcher', 'Participation in student projects and research, preparation of reports and presentations on research results');
INSERT INTO roles_and_responsibilities VALUES('Sam' ,'Winchester' , 'research advisor' , 'Support students in conducting research , evaluating research results and preparing recommendations');
INSERT INTO roles_and_responsibilities VALUES('Charlie' , 'Bradbury' , 'the expert', 'Participation in project evaluation');
INSERT INTO roles_and_responsibilities VALUES('Jimmy' , 'Novak' ,'system manager' , 'Creating , editing and deleting user profiles');

DROP TABLE IF EXISTS projects;
CREATE TABLE projects(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR (80) , start VARCHAR(80) , deadline VARCHAR(70));
INSERT INTO projects VALUES('The Weather App' , '12.04.24' , '10.06.24');
INSERT INTO projects VALUES('')
INSERT INTO projects VALUES()
INSERT INTO projects VALUES()
INSERT INTO projects VALUES()
INSERT INTO projects VALUES()

DROP TABLE IF EXISTS progress;
CREATE TABLE progress (id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , status VARCHAR(80));
INSERT INTO progress VALUES('The Weather App' , 'In Progress');
INSERT INTO progress VALUES()
INSERT INTO progress VALUES()
INSERT INTO progress VALUES()
INSERT INTO progress VALUES()
INSERT INTO progress VALUES()


DROP TABLE IF EXISTS recommendations;
CREATE TABLE recommendations(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , recommendations VARCHAR(100));
INSERT INTO projects VALUES('The Weather App','Interface has to be changed.');
INSERT INTO projects VALUES()
INSERT INTO projects VALUES()
INSERT INTO projects VALUES()
INSERT INTO projects VALUES()
INSERT INTO projects VALUES()

DROP TABLE IF EXISTS projectEvaluation;
CREATE TABLE projectEvaluation(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), grade INTEGER);
INSERT INTO projectEvaluation VALUES('The Weather App' , 70);
INSERT INTO projectEvaluation VALUES()
INSERT INTO projectEvaluation VALUES()
INSERT INTO projectEvaluation VALUES()
INSERT INTO projectEvaluation VALUES()
INSERT INTO projectEvaluation VALUES()

DROP TABLE IF EXISTS projectBudgets;
CREATE TABLE projectBudgets(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , budget VARCHAR(50));
INSERT INTO TABLE projectBudgets VALUES('The Weather App' , '30000');
INSERT INTO TABLE projectBudgets VALUES()
INSERT INTO TABLE projectBudgets VALUES()
INSERT INTO TABLE projectBudgets VALUES()
INSERT INTO TABLE projectBudgets VALUES()
INSERT INTO TABLE projectBudgets VALUES()

CREATE TABLE TheWeatherApp (name VARCHAR(90));
INSERT INTO TheWeatherApp VALUES
