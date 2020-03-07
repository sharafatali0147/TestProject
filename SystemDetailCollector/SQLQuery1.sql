CREATE TABLE systemsInfo (
	ID int NOT NULL,
	Department varchar(50) DEFAULT NULL,
	EmpName varchar(50) DEFAULT NULL,
	SystemBrand varchar(10) DEFAULT NULL,
	Model varchar(50) DEFAULT NULL,
	CPU varchar(50) DEFAULT NULL,
	RAM varchar(30) DEFAULT NULL,
	HardDisk varchar(30) DEFAULT NULL,
	IP varchar(20) DEFAULT NULL,
	
	
	PRIMARY KEY (ID)
)

insert into systemsInfo(ID, Department, EmpName, SystemBrand, Model, CPU, RAM, HardDisk, IP)
	values('1', 'IT', 'Sharafat Ali', 'Dell', 'Optiplex 780', 'core 2 due 3.0GHZ', 
	'4GB', '500GB', '192.168.101.7'); 

select * from systemsInfo
