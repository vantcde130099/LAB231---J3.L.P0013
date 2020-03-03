create database J3LP0013
go
use J3LP0013
go
create table Menu(
	MenuID int identity(1,1) primary key,
	MenuName nvarchar(100) not null,
	MenuDetail ntext,
	Price money not null
)
go
create table Product(
	ProductID int identity(1,1) primary key,
	ProductName nvarchar(50) not null,
	ProductPicture text,
	ProductContent ntext
)
go
create table Product_In_Menu(
	ProductID int not null,
	MenuID int not null,
	CONSTRAINT PK_Product_In_Menu PRIMARY KEY (ProductID,MenuID),
	foreign key (ProductID) references Product(ProductID),
	foreign key (MenuID) references Menu(MenuID)
)
go
create table Contact(
	ContactID int identity(1,1) primary key,
	ContactName nvarchar(50) not null,
	ContactContent ntext not null,
	ContactDate date
)

