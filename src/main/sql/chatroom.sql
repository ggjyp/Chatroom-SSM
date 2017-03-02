create table account
(
	id int not null primary key auto_increment,
	name varchar(30) not null unique,
  password char(20) not null
)CHARACTER SET 'utf8'
COLLATE 'utf8_general_ci';