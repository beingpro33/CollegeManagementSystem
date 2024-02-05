drop table login;

--Create login table
create table login (
	name varchar(30),
	username varchar(30),
	password varchar(10));
	
--Inserting some values in the login table
insert into login values('Admin1', 'adm1', 'adm1');

--Create student table
create table student_Details(
	name varchar(30),
	father_name varchar(30),
	roll_no varchar(20),
	dob varchar(20),
	address varchar(100),
	phone varchar(10),
	email varchar(50),
	class_x varchar(20),
	class_xii varchar(20),
	aadhar varchar(12),
	course varchar(20),
	branch varchar(40));
	
	
--Create teacher table
create table teacher_Details(
	name varchar(30),
	father_name varchar(30),
	teacher_ID varchar(20),
	dob varchar(20),
	address varchar(100),
	phone varchar(10),
	email varchar(50),
	class_x varchar(20),
	class_xii varchar(20),
	aadhar varchar(12),
	course varchar(20),
	department varchar(40));
	
select * from student_Details;	


--Create student Leave table
create table student_Leave(
	roll_no varchar(20),
	date varchar(20),
	duration varchar(20));
	
	
--Create teacher Leave table
create table teacher_Leave(
	teacher_ID varchar(20),
	date varchar(20),
	duration varchar(20));
	
select * from student_Leave;	
select * from teacher_Leave;


--Create table to Store Subjects
create table subject(
	roll_no varchar(20),
	semester varchar(20),
	subject1 varchar(20),
	subject2 varchar(20),
	subject3 varchar(20),
	subject4 varchar(20),
	subject5 varchar(20));
	
	
--Create table to store marks
create table marks_Details(
	roll_no varchar(20),
	semester varchar(20),
	marks1 varchar(20),
	marks2 varchar(20),
	marks3 varchar(20),
	marks4 varchar(20),
	marks5 varchar(20));
	
	
