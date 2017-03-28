CREATE TABLE ADDRESSES (
  ADDR_ID INT(11) NOT NULL AUTO_INCREMENT,
  STREET VARCHAR(50) NOT NULL,
  CITY VARCHAR(50) NOT NULL,
  STATE VARCHAR(50) NOT NULL,
  ZIP VARCHAR(10) DEFAULT NULL,
  COUNTRY VARCHAR(50) NOT NULL,
  PRIMARY KEY (ADDR_ID)
);

CREATE TABLE STUDENTS (
  STUD_ID INT(11) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(50) NOT NULL,
  EMAIL VARCHAR(50) NOT NULL,
  PHONE VARCHAR(15) DEFAULT NULL,  
  DOB DATE DEFAULT NULL,
  BIO LONGTEXT DEFAULT NULL,
  PIC BLOB DEFAULT NULL,
  ADDR_ID INT(11) DEFAULT NULL,  
  PRIMARY KEY (STUD_ID),
  CONSTRAINT FK_STUDENTS_ADDR FOREIGN KEY (ADDR_ID)  REFERENCES ADDRESSES (ADDR_ID)
);

ALTER TABLE mybatis_dev.students ADD gender varchar(10) NULL ;



CREATE TABLE TUTORS (
  TUTOR_ID INT(11) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(50) NOT NULL,
  EMAIL VARCHAR(50) NOT NULL,
  PHONE VARCHAR(15) DEFAULT NULL,  
  DOB DATE DEFAULT NULL,
  BIO LONGTEXT DEFAULT NULL,
  PIC BLOB DEFAULT NULL,
  ADDR_ID INT(11) DEFAULT NULL,
  PRIMARY KEY (TUTOR_ID),
  CONSTRAINT FK_TUTORS_ADDR FOREIGN KEY (ADDR_ID)   REFERENCES ADDRESSES (ADDR_ID)  
);

CREATE TABLE COURSES (
  COURSE_ID INT(11) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(100) NOT NULL,
  DESCRIPTION VARCHAR(512) DEFAULT NULL,
  START_DATE DATE DEFAULT NULL,
  END_DATE DATE DEFAULT NULL,
  TUTOR_ID INT(11) NOT NULL,
  PRIMARY KEY (COURSE_ID),
  CONSTRAINT FK_COURSE_TUTOR FOREIGN KEY (TUTOR_ID)  REFERENCES TUTORS (TUTOR_ID)
);


CREATE TABLE COURSE_ENROLLMENT(
  COURSE_ID INT(11) NOT NULL,
  STUD_ID INT(11) NOT NULL,
  PRIMARY KEY (COURSE_ID,STUD_ID),
  CONSTRAINT FK_ENROLLMENT_STUD FOREIGN KEY (STUD_ID)  REFERENCES STUDENTS (STUD_ID),
  CONSTRAINT FK_ENROLLMENT_COURSE   FOREIGN KEY (COURSE_ID) REFERENCES COURSES (COURSE_ID)
);

//////////////////////////////////////////////////////////////////////////////////////////////////////


INSERT INTO ADDRESSES (ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY) VALUES 
 (1,'4891 Pacific Hwy','San Diego','CA','92110','San Diego'),
 (2,'2400 N Jefferson St','Perry','FL','32347','Taylor'),
 (3,'710 N Cable Rd','Lima','OH','45825','Allen'),
 (4,'5108 W Gore Blvd','Lawton','OK','32365','Comanche');

INSERT INTO STUDENTS (STUD_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES 
 (1,'Timothy','timothy@gmail.com','123-123-1234','1988-04-25',NULL,NULL,3),
 (2,'Douglas','douglas@gmail.com','789-456-1234','1990-08-15',NULL,NULL,4);

INSERT INTO TUTORS (TUTOR_ID,NAME,EMAIL,PHONE,DOB,BIO,PIC,ADDR_ID) VALUES 
 (1,'John','john@gmail.com','111-222-3333','1980-05-20',NULL,NULL,1),
 (2,'Ken','ken@gmail.com','111-222-3333','1980-05-20',NULL,NULL,1),
 (3,'Paul','paul@gmail.com','123-321-4444','1981-03-15',NULL,NULL,2),
 (4,'Mike','mike@gmail.com','123-321-4444','1981-03-15',NULL,NULL,2);

INSERT INTO COURSES (COURSE_ID,NAME,DESCRIPTION,START_DATE,END_DATE,TUTOR_ID) VALUES 
 (1,'Quickstart Core Java','Core Java Programming','2013-03-01','2013-04-15',1),
 (2,'Quickstart JavaEE6','Enterprise App Development using JavaEE6','2013-04-01','2013-08-30',1),
 (3,'MyBatis3 Premier','MyBatis 3 framework','2013-06-01','2013-07-15',2);

INSERT INTO COURSE_ENROLLMENT (COURSE_ID,STUD_ID) VALUES 
 (1,1),
 (1,2),
 (2,2);
 

 
 
select Stud_id, name, email, phone, dob from students where stud_id = 1;
select Stud_id, name, email, phone, dob from students;
 
select Stud_id, name, email, phone, dob, a.ADDR_ID, street, city, state, zip, country 
from students s left join addresses a on s.ADDR_ID=a.ADDR_ID where STUD_ID=1;

select t.tutor_id, t.name as tutor_name, email, c.course_id, c.name, description, start_date, end_date
from tutors t left outer join addresses a on t.ADDR_ID = a.ADDR_ID
	left outer join courses c on t.TUTOR_ID=c.tutor_id
where t.TUTOR_ID=1;


select *
from courses
where TUTOR_ID=1 
and NAME like '%java%' 
and START_DATE >= '2013-03-01'
and END_DATE <= '2013-09-01';


select * 
from courses
where TUTOR_ID=1;


select * from courses
where TUTOR_ID = 1 or TUTOR_ID =2;


select * from courses
where TUTOR_ID in (1, 2);


create table user_pics(
	id int(11) not null auto_increment,
	name varchar(50) default null,
	pic longblob,
	bio longtext,
	primary key(id)
);


select addr_id, street, city, state, zip, country 
from addresses 
where state='CA' and zip='92110';
