create database itsol2
use itsol2

create table itsol2.teacher (
	account varchar(10) not null,
    firstname varchar(10) not null,
    lastname varchar(10) not null,
    email varchar(50) check (email like '%@%'),
    constraint k1 primary key (account)
)

create table itsol2.student (
	account varchar(10) not null,
	id varchar(10) not null,
    name  varchar(50) not null,
    email varchar(50) check (email like '%@%') not null,
    phone int  not null,
    class varchar(10) not null,
    note varchar(50) ,
    constraint k2 primary key (account, id)
)


insert into itsol2.teacher values ('GV001','Nguyen','Hong','H@123');
insert into itsol2.teacher values ('GV002','Mai','Loi','L@123');

insert into itsol2.student  values ('GV001','SV001','Son','S@123',123,'13H','ngoan');
 
    