Data
___________________________________________________________________
//Khach Hang
insert into itsol.KhachHang values ('KH001','A','Mua','HN','A@123','1111111111','a1');
insert into itsol.KhachHang values ('KH002','B','Mua','HNam','B@123','1111111112','a2');
insert into itsol.KhachHang values ('KH003','C','Mua','HLong','C@123','1111111113','a3');
insert into itsol.KhachHang values ('KH004','D','Mua','HDuong','D@123','1111111114','a4');

//Nha Cung Cap
insert into itsol.NhaCungCap values ('CT001','ITSOl','Mua','HCM','2222222222','b1','1@abc');
insert into itsol.NhaCungCap values ('CT002','VietTel','Ban','QNinh','2222222223','b2','2@abc');
insert into itsol.NhaCungCap values ('CT003','FPT','Mua','PTho','2222222224','b3','3@abc');
insert into itsol.NhaCungCap values ('CT004','SamSung','Ban','CMAu','2222222225','b4','4@abc');

//Nhan Vien
insert into itsol.NhanVien values ('NV001','Nguyen','Hong',STR_TO_DATE('10/08/1980', '%d/%m/%Y'),STR_TO_DATE('10/08/2010', '%d/%m/%Y'),'HN','1111111111',4000000,200000);
insert into itsol.NhanVien values ('NV002','Tran','Hoa',STR_TO_DATE('11/08/1981', '%d/%m/%Y'),STR_TO_DATE('10/08/2011', '%d/%m/%Y'),'HLong','1111111122',5000000,100000);
insert into itsol.NhanVien values ('NV003','Mai','An',STR_TO_DATE('10/08/1982', '%d/%m/%Y'),STR_TO_DATE('10/08/2009', '%d/%m/%Y'),'HTay','1111111123',6000000,400000);
insert into itsol.NhanVien values ('NV004','Le','Loi',STR_TO_DATE('10/08/1983', '%d/%m/%Y'),STR_TO_DATE('10/08/2006', '%d/%m/%Y'),'HCm','1111111124',7000000,500000);

//Loai Hang
insert into itsol.LoaiHang values ('LH001','Giao Duc');
insert into itsol.LoaiHang values ('LH002','Bao Ho');
insert into itsol.LoaiHang values ('LH003','Y Te');
insert into itsol.LoaiHang values ('LH004','Van Phong');

//Mat Hang
insert into itsol.MatHang values ('MH001','But','CT003','LH001',300,'Chiec',3000);
insert into itsol.MatHang values ('MH002','Mu','CT001','LH002',100,'Chiec',17000);
insert into itsol.MatHang values ('MH003','Ban','CT004','LH003',500,'Chiec',45000);
insert into itsol.MatHang values ('MH004','Kim tiem','CT001','LH003',1000,'Chiec',1000);

//Don Dat Hang
insert into itsol.DonDatHang values ('HD001','KH002','NV004',STR_TO_DATE('10/08/2014', '%d/%m/%Y'),STR_TO_DATE('10/08/2016', '%d/%m/%Y'),STR_TO_DATE('10/08/2017', '%d/%m/%Y'),'Ha Noi');
insert into itsol.DonDatHang values ('HD002','KH003','NV001',STR_TO_DATE('10/08/2015', '%d/%m/%Y'),STR_TO_DATE('10/08/2016', '%d/%m/%Y'),STR_TO_DATE('10/08/2018', '%d/%m/%Y'),'Ha Noi');
insert into itsol.DonDatHang values ('HD003','KH001','NV002',STR_TO_DATE('10/08/2012', '%d/%m/%Y'),STR_TO_DATE('10/08/2014', '%d/%m/%Y'),STR_TO_DATE('10/08/2016', '%d/%m/%Y'),'Ha Noi');
insert into itsol.DonDatHang values ('HD004','KH002','NV003',STR_TO_DATE('10/08/2016', '%d/%m/%Y'),STR_TO_DATE('10/08/2017', '%d/%m/%Y'),STR_TO_DATE('10/08/2018', '%d/%m/%Y'),'Ha Noi');
insert into itsol.DonDatHang values ('HD005','KH002','NV003',STR_TO_DATE('10/08/2016', '%d/%m/%Y'),STR_TO_DATE('10/08/2017', '%d/%m/%Y'),STR_TO_DATE('10/08/2018', '%d/%m/%Y'),'HN');
insert into itsol.DonDatHang values ('HD006','KH002','NV003',STR_TO_DATE('10/08/2016', '%d/%m/%Y'),STR_TO_DATE('10/08/2017', '%d/%m/%Y'),STR_TO_DATE('10/08/2018', '%d/%m/%Y'),'HLong');


//Chi tiết đơn hàng
insert into itsol.ChieTietDatHang values ('HD002','MH003',1211,50,2.5);
insert into itsol.ChieTietDatHang values ('HD001','MH004',1980,100,2);
insert into itsol.ChieTietDatHang values ('HD003','MH002',2404,150,3.75);
insert into itsol.ChieTietDatHang values ('HD004','MH003',1998,200,12.5);
