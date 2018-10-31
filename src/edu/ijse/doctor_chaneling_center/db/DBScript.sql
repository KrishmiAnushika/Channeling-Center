drop database chanelling_center;
create database chanelling_center;
use chanelling_center;

create table speciality(
	speid varchar (100),
	spename varchar(100) not null,
	constraint primary key(speid)
	)engine=innodb;

create table doctor(
	docid varchar (100),	
	docname varchar (100) not null,	
	docaddress varchar (100) not null,
	doctele int not null,
	hospital varchar(100) not null,
	h_tele int not null,
	gender varchar (100) not null,
	patientlimit int not null,
        docCharge decimal(65),
	speid varchar (100) not null,
	constraint primary key(docid),
	constraint foreign key(speid) references speciality(speid)
	)engine=innodb;

create table day(
	dayid varchar (100),
	dayname varchar (100),
	constraint primary key(dayid)
	)engine=innodb;

create table shedule(
	room_no varchar (100),
	time varchar (100),
	docid varchar (100),
	dayid varchar (100),
        constraint primary key(docid,dayid),
	constraint foreign key(docid) references doctor(docid),
	constraint foreign key(dayid) references day(dayid)
	)engine=innodb;

create table patient(
	patId varchar (100) not null,
	patname varchar (100) not null,
        pataddress varchar (100) not null,
	pattele int not null,
	gender varchar (100) not null,
	age int not null,
	constraint primary key(patId)
	)engine=innodb;

	 
create table appointment(
	appid varchar (100),
	app_no int,
	appdate varchar (100),
        apptime varchar (100),
	bookingDate varchar (100),
        bookingTime varchar (100),
	docid varchar (100),
	patId varchar (100),
	constraint primary key(appid),
	constraint foreign key(docid) references doctor(docid),
        constraint foreign key(patId) references patient(patId)
	)engine=innodb;

create table payment(
	payid varchar (100),
	date varchar (100),
        time varchar (100),
	amount decimal (65),
	discount decimal (65),
	exra_charj decimal (65),
        appid varchar (100),
	constraint primary key(payid),
        constraint foreign key(appid) references appointment(appid)
	)engine=innodb;

Insert into day values('d001','sunday');
Insert into day values('d002','monday');
Insert into day values('d003','tuesday');		
Insert into day values('d004','wednesday');
Insert into day values('d005','thursday');
Insert into day values('d006','friday');
Insert into day values('d007','saturday');
