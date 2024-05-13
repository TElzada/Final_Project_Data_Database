CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS tasks;
CREATE TABLE tasks(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , surname VARCHAR(100) , role VARCHAR (80), responsibility VARCHAR (100));
INSERT INTO tasks VALUES('Kevin' , 'Tran' , 'student-researcher', 'Participation in student projects and research, preparation of reports and presentations on research results');
INSERT INTO tasks VALUES('Sam' ,'Winchester' , 'research advisor' , 'Support students in conducting research , evaluating research results and preparing recommendations');
INSERT INTO tasks VALUES('Charlie' , 'Bradbury' , 'the expert', 'Participation in project evaluation');
INSERT INTO tasks VALUES('Jimmy' , 'Novak' ,'system manager' , 'Creating , editing and deleting user profiles');

DROP TABLE IF EXISTS projects;
CREATE TABLE projects(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR (80) , start VARCHAR(80) , deadline VARCHAR(70));
INSERT INTO projects VALUES('The Weather App' , '12.04.24' , '10.06.24');
INSERT INTO projects VALUES('The Movies App' , '25.12.23' , '12.08.24');
INSERT INTO projects VALUES('Chat Application' , '03.03.24' , '25.05.24');
INSERT INTO projects VALUES('Task planner' , '12.01.24' , '17.09.24');
INSERT INTO projects VALUES('Safe Transport' , '21.11.23' , '21.12.24');


DROP TABLE IF EXISTS progress;
CREATE TABLE progress (id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , status VARCHAR(80));
INSERT INTO progress VALUES('The Weather App' , 'In Process');
INSERT INTO progress VALUES('The Movies App' , 'In Process');
INSERT INTO progress VALUES('Chat Application' , 'Finished');
INSERT INTO progress VALUES('Task Planner' , 'Finished');
INSERT INTO progress VALUES('Safe Transport' , 'In Process');


DROP TABLE IF EXISTS recommendations;
CREATE TABLE recommendations(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , recommendations VARCHAR(100));
INSERT INTO projects VALUES('The Weather App','Interface has to be changed.');
INSERT INTO projects VALUES('The Movies App' , 'More movies need to be added');
INSERT INTO projects VALUES('Chat Application' , 'Everything is great , no recommendations needed');
INSERT INTO projects VALUES('Task Planner' , 'Everything is great , no recommendations needed');
INSERT INTO projects VALUES('Safe Transport' , 'The look of the code is not great , has to be organized');


DROP TABLE IF EXISTS projectEvaluation;
CREATE TABLE projectEvaluation(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), grade INTEGER);
INSERT INTO projectEvaluation VALUES('The Weather App' , 70);
INSERT INTO projectEvaluation VALUES('The Movies App' , 75);
INSERT INTO projectEvaluation VALUES('Chat Application' , 95);
INSERT INTO projectEvaluation VALUES('Task Planner', 97);
INSERT INTO projectEvaluation VALUES('Safe Transport' , 30);


DROP TABLE IF EXISTS projectBudgets;
CREATE TABLE projectBudgets(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , budget VARCHAR(50));
INSERT INTO TABLE projectBudgets VALUES('The Weather App' , '30000');
INSERT INTO TABLE projectBudgets VALUES('The Movies App' , '30000');
INSERT INTO TABLE projectBudgets VALUES('Chat Application' , '20000');
INSERT INTO TABLE projectBudgets VALUES('Task Planner' , '15000' );
INSERT INTO TABLE projectBudgets VALUES('Safe Transport' , '50000');


DROP TABLE IF EXISTS theWeatherApp;
CREATE TABLE theWeatherApp (name VARCHAR(90) , languageUsed VARCHAR(80));
INSERT INTO theWeatherApp VALUES('The Weather App' , 'Python');

DROP TABLE IF EXISTS theMoviesApp;
CREATE TABLE theMoviesApp(name VARCHAR(80) , languageUsed VARCHAR(80));
INSERT INTO theMoviesApp VALUES('The Movies App' , 'Java');

DROP TABLE IF EXISTS chatApplication;
CREATE TABLE chatApplication (name VARCHAR(80) , languageUsed VARCHAR(80));
INSERT INTO chatApplication VALUES('Chat Application' , 'Python');

DROP TABLE IF EXISTS taskPlanner;
CREATE TABLE taskPlanner(name VARCHAR(80) , languageUsed VARCHAR(90));
INSERT INTO taskPlanner VALUES('Task Planner' , "Python");

DROP TABLE IF EXISTS safeTransport;
CREATE TABLE safeTransport(name VARCHAR(90) , languageUsed VARCHAR (90));
INSERT INTO safeTransport VALUES('Safe Transport' , 'Java');
