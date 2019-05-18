create database QLYTHUVIEN
USE QLYTHUVIEN
create table SACH 
( 	Masach nvarchar(10) not null,
	Ten nvarchar(30) not null,
    Tacgia nvarchar(30),
    NXB nvarchar(30),
    Soluong int,
    constraint pk_SACH primary key (Masach)
)

create table DOCGIA
(	Sothe int not null,
	Ten nvarchar(30),
    Khoa nvarchar(10),
    Khoahoc int,
    Thoihanthe date,
    constraint pk_DOCGIA primary key (Sothe)
)
create table PHIEUMUON
(	Masach nvarchar(10) not null,
	Sothe int,
    Ngaymuon date,
    Ngaytra date,
    Ghichu nvarchar(30),
    constraint pk_PHIEUMUON primary key (Masach,Sothe)
)
//Sach//
Insert into SACH(Masach,Ten,Tacgia,NXB,Soluong)
Values ('S01','The Gioi Phang','Thomas L.Friedman','NXB TRe',3)
Insert into SACH(Masach,Ten,Tacgia,NXB,Soluong)
Values ('S02','Toi la Beto','Nguyen Nhat Anh','NXB Tre',2)
Insert into SACH(Masach,Ten,Tacgia,NXB,Soluong)
Values ('S03','Thep da toi the day','Nikolai A.Ostrovsky','NXB VanHoa',6)
Insert into SACH(Masach,Ten,Tacgia,NXB,Soluong)
Values ('S04','Truyen Kieu','Nguyen Du','NXB Giao Duc',2)
Insert into SACH(Masach,Ten,Tacgia,NXB,Soluong)
Values ('S05','Lap trinh can ban','Mai Van Loi','NXB Tri Thuc',5)
//DocGia//
Insert into DOCGIA(Sothe,Ten,Khoa,Khoahoc,Thoihanthe)
values (001,'Nguyen Van Hong','ATTT',13,1/1/2021)
Insert into DOCGIA(Sothe,Ten,Khoa,Khoahoc,Thoihanthe)
values (002,'Nguyen Trung Son','ATTT',14,3/2/2021)
Insert into DOCGIA(Sothe,Ten,Khoa,Khoahoc,Thoihanthe)
values (003,'Nguyen Thuy Trinh','CNTT',10,1/11/2020)
Insert into DOCGIA(Sothe,Ten,Khoa,Khoahoc,Thoihanthe)
values (004,'Mai Van Dao','DTVT',13,1/1/2021)
Insert into DOCGIA(Sothe,Ten,Khoa,Khoahoc,Thoihanthe)
values (005,'Hoang Thuy Linh','CNTT',16,1/8/2022)
//Phieumuon//
Insert into PHIEUMUON(Masach,Sothe,Ngaymuon,Ngaytra,Ghichu)
values ('S04',003,15/2/2017,27/6/2018,'Khong')
Insert into PHIEUMUON(Masach,Sothe,Ngaymuon,Ngaytra,Ghichu)
values ('S02',001,21/5/2017,17/3/2018,'Khong')
Insert into PHIEUMUON(Masach,Sothe,Ngaymuon,Ngaytra,Ghichu)
values ('S05',003,26/1/2016,26/5/2017,'Khong')
Insert into PHIEUMUON(Masach,Sothe,Ngaymuon,Ngaytra,Ghichu)
values ('S01',004,2/6/2011,2/7/2018,'Khong')
Insert into PHIEUMUON(Masach,Sothe,Ngaymuon,Ngaytra,Ghichu)
values ('S04',002,24/4/2017,12/11/2018,'Khong')

//6.Muon sach toan ngay 1/1/2018//
Select DOCGIA.Ten from (DOCGIA join PHIEUMUON on DOCGIA.Sothe=PHIEUMUON.Sothe) join SACH on SACH.Masach=PHIEUMUON.Masach
where (SACH.Ten='The gioi phang') and (PHIEUMUON.Ngaymuon=2/6/2011)

//5.Ten va khoa cua nhung docgia sap xep theo khoa//
Select Ten ,Khoa
from DOCGIA
order by khoa asc

//7.Ten, so the, ten sach cua nhung doc gia muong sach vao thang 4/2017//
Select dg.Ten as 'Ten doc gia', dg.Sothe as 'So the doc gia', s.Ten as ' Ten sach da muon'
from DOCGIA as dg,PHIEUMUON as pm,SACH as s
where pm.masach=s.masach and pm.sothe=dg.sothe and month(pm.ngaymuon)=4 and year(pm.ngaymuon)=2017

//8.Sach khong ai muon//
Select Ten
from SACH 
Except
Select s.ten
from SACH as s,PHIEUMUON as pm
where pm.Masach =  s.Masach

//9.Ban 'Dao' muon bao nhieu lan//
Select DOCGIA.ten as 'Doc gia' , count(PHIEUMUON.Sothe) as ' So lan muon'
from DOCGIA , PHIEUMUON
where DOCGIA.Ten ='Mai Van Dao' and DOCGIA.Sothe=PHIEUMUON.Sothe



