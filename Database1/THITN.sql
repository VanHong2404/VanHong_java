create database THITN
use THITN

create table THITN.STUDENT (
	id int primary key,
    name varchar(50) not null,
	email varchar(50) not null,
    pass varchar(50) not null
    );
    
create table THITN.DAPAN (
	id int primary key,
    content varchar(500),
    answer_a varchar(100),
    answer_b varchar(100),
    answer_c varchar(100),
    answer_d varchar(100),
    correct varchar(45)
    );

insert into THITN.STUDENT values ('001','Nguyen Van Hong','NVH@gmail.com', 'hong2404');
insert into THITN.STUDENT values ('002','Mai Van Loi','MVL@gmail.com', 'loi1211');
insert into THITN.STUDENT values ('003','Trung Son','TS@gmail.com', 'son123');

insert into THITN.DAPAN values ('1','Hong sinh nam bao nhieu?','A:2000','B:2001','C:1998','D:1999','C');
insert into THITN.DAPAN values ('2','Hong nang bao nhieu kg?','A:50','B:60','C:70','D:80','D');
insert into THITN.DAPAN values ('3','Hong co may nguoi yeu?','A:1','B:2','C:3','D:4','A');
insert into THITN.DAPAN values ('4','Loi que o dau?','A:Ha Noi','B:Bac Ninh','C:Ha Nam','D:Yen Bai','D');
insert into THITN.DAPAN values ('5','Loi di nuoc ngoai bao nhieu nam?','A:9','B:10','C:11','D:12','B');

    
    