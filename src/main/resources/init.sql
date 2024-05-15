CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS profiles;
CREATE TABLE profiles(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , surname VARCHAR(90) , email VARCHAR (90) , age VARCHAR(90) , positions VARCHAR (100));
INSERT INTO profiles(name , surname , email , age , positions) VALUES('Dean' , 'Winchester', 'impala67@gmail.com' , 46 , 'Project Coordinator');
INSERT INTO profiles(name , surname , email , age , positions) VALUES('Kevin' , 'Tran', 'kevintran@gmail.com' , 19 , 'Student-Researcher');
INSERT INTO profiles(name , surname , email , age , positions) VALUES('Sam' , 'Winchester', 'winchesterjr@gmail.com' , 42 , 'Research Advisor');
INSERT INTO profiles(name , surname , email , age , positions) VALUES('Charlie' , 'Bradbury', 'genius77@gmail.com' , 35 , 'The Expert');
INSERT INTO profiles(name , surname , email , age , positions) VALUES('Jimmy' , 'Novak', 'novak74@gmail.com' , 30 , 'System Manager');

DROP TABLE IF EXISTS tasks;
CREATE TABLE tasks(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , surname VARCHAR(100) , role VARCHAR (80), responsibility VARCHAR (500));
INSERT INTO tasks(name , surname , role , responsibility) VALUES('Kevin' , 'Tran' , 'student-researcher', 'Participation in student projects and research, preparation of reports and presentations on research results');
INSERT INTO tasks(name , surname , role , responsibility) VALUES('Sam' ,'Winchester' , 'research advisor' , 'Support students in conducting research , evaluating research results and preparing recommendations');
INSERT INTO tasks(name , surname , role , responsibility) VALUES('Charlie' , 'Bradbury' , 'the expert', 'Participation in project evaluation');
INSERT INTO tasks(name , surname , role , responsibility) VALUES('Jimmy' , 'Novak' ,'system manager' , 'Creating , editing and deleting user profiles');

DROP TABLE IF EXISTS projects;
CREATE TABLE projects(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR (80) , start VARCHAR(80) , deadline VARCHAR(70));
INSERT INTO projects(name , start , deadline) VALUES('The Weather App' , '12.04.24' , '10.06.24');
INSERT INTO projects(name , start , deadline) VALUES('The Movies App' , '25.12.23' , '12.08.24');
INSERT INTO projects(name , start , deadline) VALUES('Chat Application' , '03.03.24' , '25.05.24');
INSERT INTO projects(name , start , deadline) VALUES('Task planner' , '12.01.24' , '17.09.24');
INSERT INTO projects(name , start , deadline) VALUES('Safe Transport' , '21.11.23' , '21.12.24');

DROP TABLE IF EXISTS progress;
CREATE TABLE progress (id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , status VARCHAR(80));
INSERT INTO progress(name , status) VALUES('The Weather App' , 'In Process');
INSERT INTO progress(name , status) VALUES('The Movies App' , 'In Process');
INSERT INTO progress(name , status) VALUES('Chat Application' , 'Finished');
INSERT INTO progress(name , status) VALUES('Task Planner' , 'Finished');
INSERT INTO progress(name , status) VALUES('Safe Transport' , 'In Process');

DROP TABLE IF EXISTS recommendations;
CREATE TABLE recommendations(id BIGINT PRIMARY KEY AUTO_INCREMENT , name VARCHAR(80) , recommendations VARCHAR(100));
INSERT INTO recommendations(name , recommendations) VALUES('The Weather App','Interface has to be changed.');
INSERT INTO recommendations(name , recommendations) VALUES('The Movies App' , 'More movies need to be added');
INSERT INTO recommendations(name , recommendations) VALUES('Chat Application' , 'Everything is great , no recommendations needed');
INSERT INTO recommendations(name , recommendations) VALUES('Task Planner' , 'Everything is great , no recommendations needed');
INSERT INTO recommendations(name , recommendations) VALUES('Safe Transport' , 'The look of the code is not great , has to be organized');

DROP TABLE IF EXISTS projectEvaluation;
CREATE TABLE projectEvaluation(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), grade INTEGER);
INSERT INTO projectEvaluation(name , grade) VALUES('The Weather App' , 70);
INSERT INTO projectEvaluation(name , grade) VALUES('The Movies App' , 75);
INSERT INTO projectEvaluation(name , grade) VALUES('Chat Application' , 95);
INSERT INTO projectEvaluation(name , grade) VALUES('Task Planner', 97);
INSERT INTO projectEvaluation(name , grade) VALUES('Safe Transport' , 30);


