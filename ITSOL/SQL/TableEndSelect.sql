Table
_________________________________________________
CREATE database ITSOL
use itsol

create table itsol.Khachhang (
	MaKhachHang varchar(10) not null ,
    TenCongTy varchar(50) not null,
    TenGiaoDich varchar(50) not null,
    DiaChi varchar(50) default "Ha Noi",
    Email varchar(50) check (Email like '%@%'),
    DienThoai char(10),
    Fax varchar(50),
    constraint K1 primary key(MaKhachHang)
)
create table itsol.DonDatHang (
	SoDonHang varchar(10) not null,
    MaKhachHang varchar(10) not null,
    MaNhanVien varchar(10) not null,
    NgayDatHang datetime not null,
    NgayGiaoHang datetime,
    NgayChuyenHang datetime not null,
    NoiGiaoHang varchar(50) default "Ha Noi",
    constraint K2 primary key (SoDonhang,MaKhachHang,MaNhanVien)
)
create table itsol.NhanVien (
	MaNhanVien varchar(10) not null,
    Ho varchar(10) not null,
    Ten varchar(10) not null,
    NgaySinh datetime,
    NgayLamVien datetime not null,
    DiaChi varchar(50) default "Ha Noi",
    DienThoai char(10) not null,
    LuongCoBan int,
    PhuCap int,
    constraint K3 primary key (MaNhanVien)
)
create table itsol.NhaCungCap (
	MaCongTy varchar(10) not null,
    TenCongTy varchar(50) not null,
    TenGiaoDich varchar(50) not null,
    DiaChi varchar(30) default "Ha Noi",
    DienThoai char(10) not  null,
    Fax varchar(30),
    Email varchar(30) check (Email like '%@%'),
    constraint K4 primary key (MaCongTy)
)
create table itsol.ChieTietDatHang (
	SoHoaDon varchar(10) not null,
    MaHang varchar(10) not null,
    GiaBan int not null,
    SoLuong int not null,
    MucGiamGia float ,
    constraint K5 primary key (SoHoaDon,MaHang)
)
create table itsol.MatHang (
	MaHang varchar(10) not null,
    TenHang varchar(50) not null,
    MaCongTy varchar(10) not null,
    MaLoaiHang varchar(10) not null,
    SoLuong int,
    DonViTinh varchar(10),
    GiaHang int not null,
    constraint K6 primary key (MaHang, MaCongTy, MaLoaiHang)
)
create table itsol.LoaiHang (
	MaLoaiHang varchar(10) not null,
    TenLoaiHang varchar(50),
    constraint K7 primary key (MaLoaiHang)
)
______________________________________________
Select
1.	Hãy cho biết có những khách hàng nào lại chính là đối tác cung cấp hàng của công ty (tức là có cùng tên giao dịch). 
	select distinct KH.MaKhachHang, NCC.MaCongTy 
	from itsol.KhachHang as KH join itsol.NhaCungCap as NCC 
	where KH.TenGiaoDich = NCC.TenGiaoDich

2.	Những đơn đặt hàng nào yêu cầu giao hàng ngay tại cty đặt hàng và những đơn đó là của công ty nào? 
	select DDH.SoDonHang, KH.TenCongTy 
	from itsol.KhachHang as KH join itsol.DonDatHang as DDH 
	Where KH.DiaChi=DDH.NoiGiaoHang
 
 3.	Những mặt hàng nào chưa từng được khách hàng đặt mua?
	select distinct MH.*
	from itsol.MatHang as MH left join itsol.ChieTietDatHang as CTDH on MH.MaHang=CTDH.MaHang
	where CTDH.MaHang is null
 
 4.	Những nhân viên nào của công ty chưa từng lập bất kỳ một hoá đơn đặt hàng nào? 
	Select NV.*
	from itsol.NhanVien as NV left join itsol.DonDatHang as DDH on NV.MaNhanVien=DDH.MaNhanVien
	where DDH.MaNhanVien is null
 
 5.	Trong năm 2003, những mặt hàng nào chỉ được đặt mua đúng một lần
	select MH.MAHANG,MH.TENHANG FROM itsol.MATHANG as MH
	inner join itso.ChiTietDatHang as CTDH ON MH.MAHANG=CTDH.MAHANG
	inner joinitsol.DonDatHang as DDH ON CTDH.SOHOADON= DDH.SOHOADON
	where year (DDH.NGAYDATHANG)=2003
	group by MH.MAHANG,Mh.TENHANG
	having count (CTD.HMAHANG)=1

 6.	Hãy cho biết mỗi một khách hàng đã phải bỏ ra bao nhiêu tiền để đặt mua hàng của công ty? 
	select KH.MaKhachHang , sum(CTDH.GiaBan*CTDH.SoLuong*CTDH.MucGiamGia) as 'Tong Tien mua hang'
    from itsol.KhachHang as KH join itsol.DonDatHang as DDH join itsol.ChieTietDatHang as CTDH
    where (KH.MaKhachHang = DDH.MaKhachHang) and (DDH.SoDonHang = CTDH.SoHoaDon)
    group by KH.MaKhachHang
  
 7.	Mỗi một nhân viên của công ty đã lập bao nhiêu đơn đặt hàng (nếu nhân viên chưa hề lập một hoá đơn nào thì cho kết quả là 0) 
	Select NV.MaNhanVien, count(DDH.SoDonHang) as 'Tong so don ma nhan vien lap duoc'
    from itsol.NhanVien as NV  join itsol.DonDatHang as DDH 
    where NV.MaNhanVien = DDH.MaNhanvien
    group by DDH.MaNhanVien
    
 8.	Cho biết tổng số tiền hàng mà cửa hàng thu được trong mỗi tháng của năm 2003 (thời được gian tính theo ngày đặt hàng). 
	select month (DDH.NGAYDATHANG) AS thang,
	sum (SOLUONG*GIABAN-SOLUONG*GIABAN*MUCGIAMGIA/100)AS sotien
	from itsol.DONDATHANG as DDH INNER JOIN itsol.CHITIETDATHANG as CTDH
	on DDH.SOHOADON=CTDH.SOHOADON
	where year (DDH.NGAYDATHANG)=2003
	group by month (DDH.NGAYDATHANG) 
 9.	Hãy cho biết tổng số lượng hàng của mỗi mặt hàng mà cty đã có (tổng số lượng hàng hiện có và đã bán). 
 10.Nhân viên nào của cty bán được số lượng hàng nhiều nhất và số lượng hàng bán được của nhân viên này là bao nhiêu?
 11.Mỗi một đơn đặt hàng đặt mua những mặt hàng nào và tổng số tiền mà mỗi đơn đặt hàng phải trả là bao nhiêu?
 12.Hãy cho biết mỗi một loại hàng bao gồm những mặt hàng nào, tổng số lượng hàng của mỗi loại và tổng số lượng của tất cả các mặt hàng hiện có trong công ty là bao nhiêu? 
 13.Thống kê xem trong năm 2003, mỗi một mặt hàng trong mỗi tháng và trong cả năm bán được với số lượng bao nhiêu.
 14.Cập nhật lại giá trị NGAYCHUYENHANG của những bản ghi có giá trị NGAYCHUYENHANG chưa xác định (NULL) trong bảng DONDATHANG bằng với giá trị của trường NGAYDATHANG.
 15.Cập nhật giá trị của trường NOIGIAOHANG trong bảng DONDATHANG bằng địa chỉ của khách hàng đối với những đơn đặt hàng chưa xác định được nơi giao hàng (có giá trị trường NOIGIAOHANG bằng NULL)
 16.Cập nhật lại dữ liệu trong bảng KHACHHANG sao cho nếu tên công ty và tên giao dịch của khách hàng trùng với tên công ty và tên giao dịch của một nhà cung cấp nào đó thì địa chỉ, điện thoại, fax và email phải giống nhau.
 17.Tăng lương lên gấp rưỡi cho những nhân viên bán được số lượng hàng nhiều hơn 100 trong năm 2003 
 18.Tăng phụ cấp lên bằng 50% lương cho những nhân viên bán được hàng nhiều nhất.
 19.Giảm 25% lương của những nhân viên trong năm 2003 ko lập được bất kỳ đơn đặt hàng nào
 20.Giả sử trong bảng DONDATHANG có them trường SOTIEN cho biết số tiền mà khách hàng phải trả trong mỗi dơnđặt hàng. Hãy tính giá trị cho trường này.

